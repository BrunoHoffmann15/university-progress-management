package com.personal.university.progressmanagement.domain.subject;

import com.personal.university.progressmanagement.domain.aclass.Class;
import lombok.Data;

import java.util.List;

@Data
public class Subject {
    private List<Class> classes;
    private List<Subject> requiredSubjectsBefore;
    private Integer recommendedSemester;
}
