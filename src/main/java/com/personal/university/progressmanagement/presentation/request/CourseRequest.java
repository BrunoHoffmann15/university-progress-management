package com.personal.university.progressmanagement.presentation.request;

import com.personal.university.progressmanagement.domain.course.Course;

public class CourseRequest implements Request<Course> {
    public String name;

    public Course translateToDomain() {
        return Course
                .builder()
                .name(name)
                .build();
    }
}
