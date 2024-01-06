package com.personal.university.progressmanagement.presentation;

import com.personal.university.progressmanagement.domain.course.Course;
import com.personal.university.progressmanagement.presentation.request.CourseRequest;
import com.personal.university.progressmanagement.domain.course.CourseDomainService;
import jakarta.websocket.server.PathParam;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

@Controller
@RequestMapping(value = "/courses")
public class CourseController {
    private final String BASE_URI = "/courses/";
    private final CourseDomainService courseDomainService;

    public CourseController(CourseDomainService courseDomainService) {
        this.courseDomainService = courseDomainService;
    }

    @PostMapping
    public ResponseEntity<Void> createCourse(@RequestBody CourseRequest request) throws URISyntaxException {
        Long id = courseDomainService.addCourse(request.translateToDomain());

        if (id == null)
            return ResponseEntity.badRequest().build();

        return ResponseEntity.created(getUri(id)).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Course> getCourse(@PathVariable("id") Long id) {
        Course course = courseDomainService.getCourse(id);

        if (course == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(course);
    }

    @PostMapping("/{id-course}/subjects/{id-subject}")
    public ResponseEntity<Void> addSubjectToCourse(@PathVariable("id-course") Long idCourse, @PathVariable("id-subject") Long idSubject) {
        return ResponseEntity.noContent().build();
    }

    private URI getUri(Object parameter) throws URISyntaxException {
        return new URI(BASE_URI + parameter);
    }
}
