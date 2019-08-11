package com.spring.arvind.Spring5webapp.repositories;

import com.spring.arvind.Spring5webapp.model.Author;

import org.springframework.data.repository.CrudRepository;

/**
 * AuthorRepository
 */
public interface AuthorRepository extends CrudRepository<Author, Long>{

    
}