package com.personal.university.progressmanagement.infrastructure.adapter;

import com.personal.university.progressmanagement.domain.course.Course;
import com.personal.university.progressmanagement.domain.course.CourseRepositoryAdapter;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CourseRepositoryAdapterImp implements CourseRepositoryAdapter {

    public Long id = 0l;
    private static Map<Long, Course> courseList = new HashMap<>();

    @Override
    public Long addCourse(Course course) {
        id ++;

        course.setId(id);
        courseList.put(id, course);

        return id;
    }

    @Override
    public Course getCourse(Long id) {
        return courseList.get(id);
    }

    @Override
    public void save(Course oldCourse) {

    }
}
