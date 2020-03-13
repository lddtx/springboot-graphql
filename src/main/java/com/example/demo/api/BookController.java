package com.example.demo.api;

import com.example.demo.entity.Query;
import com.example.demo.service.GraphQLService;
import graphql.ExecutionResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@SuppressWarnings("all")
public class BookController {

    @Autowired
    private GraphQLService graphQLService;

    @PostMapping("/books")
    public ResponseEntity<Object> getAllBooks(@RequestBody Query query){
        log.info("Entering getAllBooks@BookController");
        ExecutionResult execute = graphQLService.getGraphQL().execute(query.getQuery());
        return new ResponseEntity<>(execute, HttpStatus.OK);
    }
}
