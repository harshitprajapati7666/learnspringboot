package com.harshitprajapati.springboot.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(new Course(1, "Learn AWS", "HP"),
                new Course(2, "Learn DevOps", "HP"),
                new Course(3, "Learn Azure","HP"),
                new Course(4, "Learn GCP","HP"));
    }
}
