package com.personal.universityprogressmanagement.domain.course;

import com.personal.universityprogressmanagement.domain.subject.Subject;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Course {
    private String name;
    private List<Subject> subjects = new ArrayList<>();

    public void addClass(Subject subject) {
        subjects.add(subject);
    }
}
