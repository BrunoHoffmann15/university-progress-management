package com.personal.university.progressmanagement.infrastructure.adapter;

import com.personal.university.progressmanagement.domain.course.Course;
import com.personal.university.progressmanagement.domain.course.CourseRepositoryAdapter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseRepositoryAdapterImp implements CourseRepositoryAdapter {

    private Long id = 0l;
    private static List<Course> courseList;

    @Override
    public Long addCourse(Course course) {
        id ++;

        course.setId(id);
        courseList.add(course);

        return id;
    }

    @Override
    public Course getCourse(Long id) {
        return null;
    }

    @Override
    public void save(Course oldCourse) {

    }
}
