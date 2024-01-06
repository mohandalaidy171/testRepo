package com.muhannad.testschool.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data

public class TeacherDto {
    private int teacherId;

    private String teacherName;

    private String Subject;

}
