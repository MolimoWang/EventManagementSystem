package org.work1.eventmanagement.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name = "ticket")
@Entity
@TableName(value = "ticket")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Ticket {
    @Id
    @TableId(type = IdType.AUTO)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "event_id")
    @TableField("event_id")
    private String eventId;

    @Column(name= "event_name")
    @TableField("event_name")
    private String eventName;


    @TableField
    @Column
    private String description;

    @TableField
    @Column
    private String date;


    @TableField
    @Column
    private String time;

    @TableField
    @Column
    private String picture;

    @Column(name = "organizer_id")
    @TableField("organizer_id")
    private String organizerId;

    @Column(name = "venue_id")
    @TableField("venue_id")
    private String venueId;


    @TableField
    @Column
    private String organiser;

    @TableField
    @Column
    private String venue;

    @TableField( "ticket_type_name1")
    @Column(name = "ticket_type_name1")
    private String ticketTypeName1;

    @TableField( "ticket_type_name2")
    @Column(name = "ticket_type_name2")
    private String ticketTypeName2;

    @TableField( "available_number1")
    @Column(name = "available_number1")
    private String availableNumber1;

    @TableField( "available_number2")
    @Column(name = "available_number2")
    private String availableNumber2;


    @TableField
    @Column
    private String price;

    @TableField("customer_id")
    @Column(name="customer_id")
    private String customerId;

    @TableField("customer_name")
    @Column(name="customer_name")
    private String customerName;


    @TableField( "ticket_type_name")
    @Column(name = "ticket_type_name")
    private String ticketTypeName;

}
