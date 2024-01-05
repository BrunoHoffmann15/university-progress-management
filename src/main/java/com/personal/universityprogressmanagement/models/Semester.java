package com.personal.universityprogressmanagement.models;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Semester {
    private Date semesterOfYear;
    private List<Class> classes;
}
