package org.work1.eventmanagement.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Time;
import java.util.Date;
import java.util.List;
@Entity // Specify this as a JPA entity class
@Table(name = "venues") // Specify the table name
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Venue {
    @Id // Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Automatically generate ID
    private Long id;

    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date date;

    private Time time;

    @Column(nullable = false) // Specify that this field is non-null
    private String name;

    @Column(nullable = false)
    private String address;

    private String contactName;

    private String contactPhoneNumber;

    private String contactEmail;

    private String ticketTypeName1;
    private String ticketTypeName2;
    private String availableNumber1;
    private String availableNumber2;

    @ManyToOne
    @JoinColumn(name = "organiser_id", nullable = false) // Specify a non-null relationship with the organizer
    private Organizer organiser;

    @TableField(exist = false)
    @Transient
    private List<Event> eventList; // This field is not mapped to the database
}
