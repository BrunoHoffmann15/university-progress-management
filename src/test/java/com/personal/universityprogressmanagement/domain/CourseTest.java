package com.personal.universityprogressmanagement.domain;

import com.personal.universityprogressmanagement.domain.course.Course;
import com.personal.universityprogressmanagement.domain.subject.Subject;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CourseTest {

    @Test
    @DisplayName("Validate adding a new subject to Class")
    void validateAddNewSubject() {
        Course course = new Course();
        Subject subject = new Subject();

        course.addClass(subject);

        assertThat(course.getSubjects().get(0))
                .isEqualTo(subject);
    }
}
