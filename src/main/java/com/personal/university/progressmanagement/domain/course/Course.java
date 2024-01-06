package com.personal.university.progressmanagement.domain.course;

import com.personal.university.progressmanagement.domain.subject.Subject;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class Course {
    private Long id;
    private String name;
    private Integer amountOfCreditsNeeded;
    private Integer amountOfExtraActivitiesHoursNeeded;
    private List<Subject> subjects = new ArrayList<>();

    public void addClass(Subject subject) {
        subjects.add(subject);
    }
}
