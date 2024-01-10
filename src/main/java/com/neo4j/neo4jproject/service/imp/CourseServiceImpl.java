package com.neo4j.neo4jproject.service.imp;

import com.neo4j.neo4jproject.model.Course;
import com.neo4j.neo4jproject.repo.CourseRepository;
import com.neo4j.neo4jproject.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    @Override
    public List<Course> getAllCourse() {
        return courseRepository.findAll();
    }
}
