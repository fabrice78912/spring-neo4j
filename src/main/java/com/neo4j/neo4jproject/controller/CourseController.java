package com.neo4j.neo4jproject.controller;


import com.neo4j.neo4jproject.model.Course;
import com.neo4j.neo4jproject.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/courses")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;


    @GetMapping("/")
    public ResponseEntity<List<Course>> getAllCourse(){
        return new ResponseEntity<>(courseService.getAllCourse(), HttpStatus.OK);
    }
}
