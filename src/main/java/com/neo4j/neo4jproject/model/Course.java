package com.neo4j.neo4jproject.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Course {

    @Id
    @GeneratedValue
    private Long id;
    private String identifier;
    private  String teacher	;
    private String  title;
}
