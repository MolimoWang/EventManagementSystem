function loadAccountData(role) {

    document.getElementById('role-title').innerText = role.charAt(0).toUpperCase() + role.slice(1) + " Accounts";


    fetch(`/api/accounts/${role}`)
        .then(response => response.json())
        .then(data => {
            const tableBody = document.querySelector('#account-table tbody');
            tableBody.innerHTML = '';

            data.forEach(account => {
                const row = document.createElement('tr');
                row.innerHTML = `
          <td>${account.username}</td>
          <td>${account.email}</td>
          <td><a href="#" onclick="deleteAccount('${role}', ${account.id})">Delete</a></td>
        `;
                tableBody.appendChild(row);
            });
        })
        .catch(error => console.error('Error loading account data:', error));
}

function deleteAccount(role, accountId) {
    console.log('Deleting account with ID:', accountId);
    accountId = Number(accountId);
    if (accountId === undefined || accountId === null || isNaN(accountId)) {
        alert("Invalid account ID.");
        return;
    }


    if (confirm(`Are you sure you want to delete this ${role}?`)) {

        fetch(`/api/accounts/${role}/${accountId}`, {
            method: 'DELETE'
        })
            .then(response => {
                if (response.ok) {
                    fetchAccounts(role);
                } else {
                    alert('Failed to delete account');
                }
            })
            .catch(error => console.error('Error deleting account:', error));
    }
}
