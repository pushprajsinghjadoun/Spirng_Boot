package com.pushpraj.learnspringboot.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> returnAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn AWS", "Pushpraj"),
                new Course(2, "Learn DevOps", "Pushpraj"),
                new Course(3, "Learn Kubernetes", "Pushpraj")
        );
    }
}
