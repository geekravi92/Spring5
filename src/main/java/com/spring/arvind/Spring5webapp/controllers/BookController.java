package com.spring.arvind.Spring5webapp.controllers;

import com.spring.arvind.Spring5webapp.repositories.BookRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * BookController
 */
@Controller
public class BookController {
    
    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }    

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    private String getBooks(Model model) {
        model.addAttribute("books", bookRepository.findAll());
        return "books";
    }
}