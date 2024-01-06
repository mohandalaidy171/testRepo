package com.muhannad.testschool.repository;

import com.muhannad.testschool.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
