package com.muhannad.testschool.repository;

import com.muhannad.testschool.entity.Student;
import com.muhannad.testschool.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,Integer> {
}
