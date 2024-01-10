package com.neo4j.neo4jproject.repo;

import com.neo4j.neo4jproject.model.Lesson;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LessonRepository extends Neo4jRepository<Lesson , Long> {
}
