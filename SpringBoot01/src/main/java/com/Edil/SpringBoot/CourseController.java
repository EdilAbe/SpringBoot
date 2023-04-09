package com.Edil.SpringBoot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
        new Course(1, "Learn AWS", "Udemy"),
        new Course(2, "Learn Devops", "Udemy"),
                new Course(4, "Spring Framework", "Udemy")


        );
    }

}
