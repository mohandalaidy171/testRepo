package com.muhannad.testschool.service;

import com.muhannad.testschool.repository.TeacherRepository;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }
}
