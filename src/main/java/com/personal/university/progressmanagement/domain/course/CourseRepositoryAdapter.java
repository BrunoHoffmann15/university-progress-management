package com.personal.university.progressmanagement.domain.course;

public interface CourseRepositoryAdapter {
    Long addCourse(Course course);

    Course getCourse(Long id);

    void save(Course oldCourse);
}
