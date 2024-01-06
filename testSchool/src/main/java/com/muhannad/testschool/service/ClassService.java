package com.muhannad.testschool.service;

import org.springframework.stereotype.Service;

@Service
public class ClassService {

private final ClassService classService;

    public ClassService(ClassService classService) {
        this.classService = classService;
    }
}
