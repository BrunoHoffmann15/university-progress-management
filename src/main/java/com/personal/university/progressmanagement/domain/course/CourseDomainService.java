package com.personal.university.progressmanagement.domain.course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseDomainService {
    @Autowired
    private CourseRepositoryAdapter courseRepositoryAdapter;

    public Long addCourse(Course course) {
        return courseRepositoryAdapter.addCourse(course);
    }

    public void changeCourse(Long id, Course course) {
        Course oldCourse = courseRepositoryAdapter.getCourse(id);
        oldCourse.setName(course.getName());

        courseRepositoryAdapter.save(oldCourse);
    }

    public Course getCourse(Long id) {
        return courseRepositoryAdapter.getCourse(id);
    }
}
