package com.personal.university.progressmanagement.domain.semester;

import com.personal.university.progressmanagement.domain.aclass.Class;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Semester {
    private Date semesterOfYear;
    private List<Class> classes;
    private Integer semesterCount;
}
