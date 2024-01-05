package com.personal.university.progressmanagement.domain.course;

import com.personal.university.progressmanagement.domain.subject.Subject;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class Course {
    private String name;
    private List<Subject> subjects = new ArrayList<>();

    public void addClass(Subject subject) {
        subjects.add(subject);
    }
}
