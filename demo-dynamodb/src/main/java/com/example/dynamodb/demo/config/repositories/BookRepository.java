package com.example.dynamodb.demo.config.repositories;

import com.example.dynamodb.demo.config.entity.Book;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.socialsignin.spring.data.dynamodb.repository.EnableScanCount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Copyright (c) 2021 All Rights Reserved
 * Created by Kalana Weerarathne on 11/03/2021 7:48 AM.
 */
//annotation enables the scan operations
@EnableScan
//spring annotation
@Repository
public interface BookRepository extends CrudRepository<Book, String> {
    @EnableScanCount
    long countByGenre(String genre);

    List<Book> findAllByGenre(String genre);
}
