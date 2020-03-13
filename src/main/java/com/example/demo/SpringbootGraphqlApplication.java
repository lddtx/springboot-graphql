package com.example.demo;

import org.springframework.boot.Banner.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringbootGraphqlApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringbootGraphqlApplication.class)
                .bannerMode(Mode.OFF)
                .run(args);
    }
}
