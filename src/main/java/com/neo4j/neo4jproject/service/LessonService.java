package com.neo4j.neo4jproject.service;

import com.neo4j.neo4jproject.model.Lesson;

import java.util.List;

public interface LessonService {

    List<Lesson> getAllLessonByCourseIdentifier(String courseIdentifier);
}
