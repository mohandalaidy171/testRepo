package com.muhannad.testschool.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "teachers")


public class Teacher {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teacherId")

  private int teacherId;

    @Column(name = "teacherName")
    private String teacherName;

    @Column(name = "Subject")
    private String Subject;



    @OneToMany(cascade = CascadeType.REMOVE
            , fetch = FetchType.LAZY,mappedBy = "students")
   @JsonManagedReference
    private List<Student> student;

    @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonBackReference
    private List<Classes> teach = new ArrayList<>();
}
