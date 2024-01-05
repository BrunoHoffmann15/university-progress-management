package com.personal.universityprogressmanagement.models;

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
