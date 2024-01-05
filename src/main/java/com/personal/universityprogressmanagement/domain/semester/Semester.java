package com.personal.universityprogressmanagement.domain.semester;

import com.personal.universityprogressmanagement.domain.aclass.Class;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Semester {
    private Date semesterOfYear;
    private List<Class> classes;
    private Integer semesterCount;
}
