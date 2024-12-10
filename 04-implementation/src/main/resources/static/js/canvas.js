const NUM_TABLES = tableList.length;
const LEFT_MARGIN = 70;
const TOP_MARGIN = 50;
const SLOTS = 48;                    // Number of booking slots shown
const TZERO = 18;                    // 6pm
const startService = new Date(0, 0, 1, TZERO, 0);
let selectedBooking = null;
let currentX = 0;
let currentY = 0;
let firstX = 0;
let firstY = 0;
let PPM = 30;
let PPH = PPM * 60;
let height = 600;
let width = 1000;
let rowHeight = (height - TOP_MARGIN) / NUM_TABLES;
let colWidth = (width - LEFT_MARGIN) / SLOTS;
let mouseDown = false;

function timeToX(t) {
    let dateString = "1900-01-01T"+ t
    let bookStartTime = new Date(Date.parse(dateString));
    return LEFT_MARGIN + PPM * ((bookStartTime - startService)/1000/60);
}

function xToTime(x) {
    x -= LEFT_MARGIN;
    let h = parseInt(Math.max(0, (x / PPH) + TZERO));
    let m = parseInt(Math.max(0, (x % PPH) / PPM));
    return new Date(0, 0, 1, h, m);
}

function tableToY(table) {
    return TOP_MARGIN + (rowHeight * (table - 1));
}

function yToTable(y) {
    return parseInt(((y - TOP_MARGIN) / rowHeight) + 1);
}


function selectBooking(time, table) {
    selectedBooking = null;
    let cb = document.getElementById("cancelButton");
    cb.setAttribute( "onClick", "javascript: return false;" );
    cb.className="secondary";
    for (let i = 0; i < bookings.length; i++) {
        if (bookings[i].table.number == table) {
            let bookStartTime = new Date(Date.parse("1900-01-01T" + bookings[i].time));
            let timeDiff = ((time - bookStartTime) / 1000 / 60);
            if (timeDiff < 120 && timeDiff >= 0) {
                selectedBooking = bookings[i];
                let cb = document.getElementById("cancelButton");
                cb.setAttribute( "onClick", "javascript: toggleModal(event);" );
                cb.className="";
            }
        }
    }
    drawCanvas();
}

function drawBackground(canvas, ctx) {
    ctx.clearRect(0, 0, canvas.width, canvas.height);
    ctx.lineWidth = "3";
    ctx.strokeStyle = "black";
    ctx.moveTo(LEFT_MARGIN, 0);
    ctx.lineTo(LEFT_MARGIN, height);
    ctx.moveTo(0, TOP_MARGIN);
    ctx.lineTo(width, TOP_MARGIN);
    ctx.stroke();
}

function drawTableLines(canvas, ctx) {
    ctx.beginPath();
    ctx.lineWidth = "1";
    for (let i = 0; i < tableList.length; i++) {
        let y = TOP_MARGIN + (i + 1) * rowHeight;
        ctx.moveTo(LEFT_MARGIN, y);
        ctx.lineTo(width, y);
        ctx.fillStyle = "rgba(0, 0, 0, 1)";
        // ctx.fillText('Venue ' + (venueList[i].number) + ' (' + venueList[i].places + ')', 0, y - rowHeight / 3);
        if(allVenueList.length > i) {
            ctx.fillText( "   " + allVenueList[i].name, 0, y - rowHeight / 3);
        }
    }
    ctx.stroke();
}

function drawTimeSlots(canvas, ctx) {
    ctx.beginPath();
    let start = new Date(startService.getTime());
    for (let i = 0; i < SLOTS + 1; i++) {
        start = new Date(start.getTime() + 30 * 60000);

        let tmp = start.getHours() + ":" + (start.getMinutes() > 9 ? start.getMinutes() : "0" + start.getMinutes());
        let x = LEFT_MARGIN + i * colWidth;
        ctx.fillStyle = "rgba(0, 0, 0, 1)";
        ctx.fillText(tmp, x + colWidth - 15, 40);
        ctx.moveTo(x, TOP_MARGIN);
        ctx.lineTo(x, height);
    }
    ctx.stroke();
}

function drawBookings(canvas, ctx) {

    for (let i = 0; i < bookings.length; i++) {
        ctx.beginPath();
        ctx.lineWidth = "3";
        if (selectedBooking !== null && bookings[i].id == selectedBooking.id) {
            ctx.strokeStyle = "red";
        } else {
            ctx.strokeStyle = "green";
        }
        let minX = timeToX(bookings[i].time)
        let tableNum = bookings[i].table.number;
        let minY = tableToY(tableNum)
        ctx.fillStyle = "rgba(0, 0, 0, 0.4)";
        ctx.fillRect(minX, minY, colWidth * 4, rowHeight);
        ctx.fillStyle = "rgba(255, 255, 255, 1)";
        ctx.rect(minX, minY, colWidth * 4, rowHeight);
        ctx.fillText(bookings[i].details, minX + 5, minY + rowHeight / 3);
        ctx.stroke();
    }


    ctx.beginPath();
    let b = selectedBooking;
    if (mouseDown && b != null) {
        let x = timeToX(b.time) + currentX - firstX;
        let y = tableToY(b.table.number) + currentY - firstY;
        ctx.strokeStyle = "red";
        ctx.rect(x, y, 4 * colWidth, rowHeight);
    }
    ctx.stroke();
}

function drawCanvas() {
    let canvas = document.getElementById('myCanvas');
    let ctx = canvas.getContext("2d");

    height = canvas.height;
    width = canvas.width;
    rowHeight = (height - TOP_MARGIN) / NUM_TABLES;
    colWidth = (width - LEFT_MARGIN) / SLOTS;
    PPM = colWidth / 30; // Pixels per minute
    PPH = 60 * PPM; // Pixels per hours

    drawBackground(canvas, ctx);
    drawTableLines(canvas, ctx);
    drawTimeSlots(canvas, ctx);
    drawBookings(canvas, ctx);
}

function handleDown(canvas, event) {
    const rect = canvas.getBoundingClientRect()
    currentX = firstX = event.clientX - rect.left;
    currentY = firstY = event.clientY - rect.top;
    if (event.button == 0){
        mouseDown = true;
        selectBooking(xToTime(currentX),yToTable(currentY));
    }
}

function handleMove(canvas, event) {
    const rect = canvas.getBoundingClientRect()
    currentX = event.clientX - rect.left;
    currentY = event.clientY - rect.top;
    drawCanvas();
}

function handleUp(canvas, event) {
    mouseDown = false;
    const changeForm = document.getElementById('changeForm');
    const rect = canvas.getBoundingClientRect()
    let b = selectedBooking;
    if (b != null) {
        currentX = event.clientX - rect.left;
        currentY = event.clientY - rect.top;
        let newTime = xToTime(timeToX(b.time) + currentX - firstX);
        let newTable = yToTable(currentY);
        if (currentX != firstX || yToTable(currentY) != b.table.number) {
            let tab = document.getElementById("changeFormTable");
            let tim = document.getElementById("changeFormTime");
            let dat = document.getElementById("changeFormDate");
            let id = document.getElementById("changeFormId");
            let over = document.getElementById("changeFormOver");
            tab.setAttribute('value', String(newTable));
            tim.setAttribute('value', String(newTime.toLocaleTimeString('it-IT')));
            dat.setAttribute('value', String(selectedBooking.date));
            id.setAttribute('value', String(selectedBooking.id));
            over.setAttribute('value', "false");
            changeForm.submit();
        }
    }
}

(function() {
    const canvas = document.getElementById('myCanvas');
    canvas.addEventListener('mousedown', function(e) {
        handleDown(canvas, e)
    })
    canvas.addEventListener('mouseup', function(e) {
        handleUp(canvas, e)
    })
    canvas.addEventListener('mousemove', function(e) {
        handleMove(canvas, e)
    })
    const context = canvas.getContext('2d');

    // resize the canvas to fill browser window dynamically
    window.addEventListener('resize', resizeCanvas, false);

    function resizeCanvas() {
        canvas.width = window.innerWidth;
        canvas.height = 600;

        /**
         * Your drawings need to be inside this function otherwise they will be reset when
         * you resize the browser window and the canvas goes will be cleared.
         */
        drawCanvas();
    }

    resizeCanvas();


})();
