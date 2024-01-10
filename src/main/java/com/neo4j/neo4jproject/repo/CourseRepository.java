package com.neo4j.neo4jproject.repo;

import com.neo4j.neo4jproject.model.Course;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CourseRepository extends Neo4jRepository<Course, Long> {

}
