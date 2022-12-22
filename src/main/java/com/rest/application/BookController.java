package com.rest.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/book")
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @GetMapping
    public List<Book> getAllBookRecords(){
        return bookRepository.findAll();
    }

    @GetMapping(value = "bookId")
    public Book getBookById(@PathVariable(value="bookId") Long bookId){
        System.out.println("In getBookById");
        return bookRepository.findById(bookId).get();
    }

    @PostMapping
    public Book createBookRecord(@RequestBody Book bookRecord) {
        System.out.println("In save");
        return bookRepository.save(bookRecord);
    }
}
