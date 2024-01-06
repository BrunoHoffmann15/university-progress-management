package com.personal.university.progressmanagement.presentation;

import com.personal.university.progressmanagement.domain.course.Course;
import com.personal.university.progressmanagement.infrastructure.adapter.CourseRepositoryAdapterImp;
import com.personal.university.progressmanagement.presentation.request.CourseRequest;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class CourseControllerTests {
    @Autowired CourseController courseController;
    @Autowired
    CourseRepositoryAdapterImp courseRepository;

    @Test
    @SneakyThrows
    void validateCourseCreation() {
        CourseRequest course = CourseRequest.builder()
                .name("Ciência da Computação")
                .amountOfCreditsNeeded(200)
                .amountOfExtraActivitiesHoursNeeded(120)
                .build();

        ResponseEntity<Void> response = courseController.createCourse(course);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.CREATED);
        assertThat(response.getHeaders().get("Location")).contains("/courses/" + courseRepository.id);
    }

    @Test
    @SneakyThrows
    void validateGetCourseHavingValidCourse() {
        CourseRequest course = CourseRequest.builder()
                .name("Ciência da Computação")
                .amountOfCreditsNeeded(200)
                .amountOfExtraActivitiesHoursNeeded(120)
                .build();

        courseController.createCourse(course);
        ResponseEntity<Course> response = courseController.getCourse(1L);

        assertThat(response.getBody()).isNotNull();
    }

    @Test
    @SneakyThrows
    void validateGetCourseHavingInvalidCourse() {
        CourseRequest course = CourseRequest.builder()
                .name("Ciência da Computação")
                .amountOfCreditsNeeded(200)
                .amountOfExtraActivitiesHoursNeeded(120)
                .build();

        courseController.createCourse(course);
        ResponseEntity<Course> response = courseController.getCourse(Long.MAX_VALUE);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
        assertThat(response.getBody()).isNull();
    }

}
