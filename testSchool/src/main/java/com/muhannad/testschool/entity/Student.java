package com.muhannad.testschool.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "studentId")

  private   int studentId;

    @Column(name = "studentName")
    private String studentName;

    @Column(name = "studentAge")
    private String studentAge;
    @ManyToOne()
    @JoinColumn(name = "teacherId",insertable = false,updatable = false)
    private Teacher students;


    @ManyToOne
    @JoinColumn(name = "classId")
    private Classes stud;
}
