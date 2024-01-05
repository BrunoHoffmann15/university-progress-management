package com.personal.universityprogressmanagement.models;

import org.assertj.core.api.Assertions;
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
