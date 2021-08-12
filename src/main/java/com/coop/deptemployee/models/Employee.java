package com.coop.deptemployee.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "EMPLOYEE")
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "NAME",nullable = false)
    private String name;
    @Column(name = "ADDRESS",nullable = false)
    private String address;
    @Column(name = "DOB",nullable = false)
    private Date dob;

    @ManyToOne                                                       //Relationship map
    @JoinColumn(name = "DEPARTMENT_ID", referencedColumnName = "id") //Column reference
    private Department department;                                   //Call the class

}
