package com.spring.arvind.Spring5webapp.repositories;

import com.spring.arvind.Spring5webapp.model.Book;

import org.springframework.data.repository.CrudRepository;

/**
 * BookRepository
 */
public interface BookRepository extends CrudRepository<Book, Long>{

    
}