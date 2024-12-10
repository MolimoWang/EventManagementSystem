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

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Entity(name="events")
@TableName(value = "events")
public class Event {
    @Id
    @TableId(type = IdType.AUTO)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @TableField
    @Column
    private String name;

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

    @TableField("t1_exist")
    @Column(name = "t1_exist")
    private int t1Exist;

    @TableField("t2_exist")
    @Column(name = "t2_exist")
    private int t2Exist;


    @TableField("remain_num1")
    @Column(name="remain_num1")
    private int remainNum1;

    @TableField("remain_num2")
    @Column(name="remain_num2")
    private int remainNum2;


    @TableField
    @Column
    private String price1;

    @TableField
    @Column
    private String price2;


    /**
     * 时间对应的刻度
     */
    @TableField(exist = false)
    @Transient
    private int scale;

}
