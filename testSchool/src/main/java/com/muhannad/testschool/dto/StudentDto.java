package com.muhannad.testschool.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class StudentDto {

  private   int  StudentId;
  private   int teacherId;

    private String studentName;

    private String studentAge;

}
