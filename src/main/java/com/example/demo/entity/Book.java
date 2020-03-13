package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("all")
public class Book {
    @Id
    private String isn;
    private String title;
    private String publisher;
    private String publishedDate;
    private String[] author;
}
