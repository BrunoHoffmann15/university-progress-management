package com.personal.universityprogressmanagement.domain.subject;

import com.personal.universityprogressmanagement.domain.aclass.Class;
import lombok.Data;

import java.util.List;

@Data
public class Subject {
    private List<Class> classes;
    private List<Subject> requiredSubjectsBefore;
    private Integer recommendedSemester;
}
