package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    private final BookService bookService;
    public BookController(BookService bookService){
        this.bookService = bookService;
    }

//    @GetMapping()
    @GetMapping
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable int id)  {
        return bookService.getBookById(id);
    }

}
