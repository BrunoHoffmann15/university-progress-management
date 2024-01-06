package com.personal.university.progressmanagement.presentation.request;

import com.personal.university.progressmanagement.domain.course.Course;
import lombok.Builder;

@Builder
public class CourseRequest implements Request<Course> {
    private String name;
    private Integer amountOfCreditsNeeded;
    private Integer amountOfExtraActivitiesHoursNeeded;

    public Course translateToDomain() {
        return Course
                .builder()
                .name(name)
                .amountOfCreditsNeeded(amountOfCreditsNeeded)
                .amountOfExtraActivitiesHoursNeeded(amountOfExtraActivitiesHoursNeeded)
                .build();
    }
}
