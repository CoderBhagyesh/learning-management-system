package com.lms.Library.Management.System.Entities;

import jakarta.persistence.*;
import lombok.*;

@Entity //This means it's a structure that will be reflected in Database
@Table(name = "student") //This class will have a table whose name is studentTable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId; //This will behave as the Primary Key

    private String name;

    private int age;

    @Column(name = "contactNo",unique = true,nullable = false)
    private String mobNo;

    private String emailId;

    private String bloodGroup;

    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    private LibraryCard libraryCard;

    //This should also have libraryCard Information

}
