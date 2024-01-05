package com.personal.university.progressmanagement.presentation;

import com.personal.university.progressmanagement.presentation.request.CourseRequest;
import com.personal.university.progressmanagement.domain.course.CourseDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.net.URI;
import java.net.URISyntaxException;

@Controller("/courses")
public class CourseController {
    private final String BASE_URI = "/courses";

    @Autowired
    public CourseDomainService courseDomainService;

    @PostMapping
    public ResponseEntity<Void> createCourse(@RequestBody CourseRequest request) throws URISyntaxException {
        Long id = courseDomainService.addCourse(request.translateToDomain());

        if (id == null)
            return ResponseEntity.badRequest().build();

        return ResponseEntity.created(getUri(id)).build();
    }

    private URI getUri(Object parameter) throws URISyntaxException {
        return new URI(BASE_URI + parameter);
    }
}
