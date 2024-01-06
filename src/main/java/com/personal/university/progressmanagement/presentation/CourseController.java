package com.personal.university.progressmanagement.presentation;

import com.personal.university.progressmanagement.presentation.request.CourseRequest;
import com.personal.university.progressmanagement.domain.course.CourseDomainService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.URI;
import java.net.URISyntaxException;

@Controller
@RequestMapping(value = "/courses")
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

    @PostMapping("/{id-course}/subjects/{id-subject}")
    public ResponseEntity<Void> addSubjectToCourse(@PathParam("id-course") Long idCourse, @PathParam("id-subject") Long idSubject) {
        return ResponseEntity.noContent().build();
    }

    private URI getUri(Object parameter) throws URISyntaxException {
        return new URI(BASE_URI + parameter);
    }
}
