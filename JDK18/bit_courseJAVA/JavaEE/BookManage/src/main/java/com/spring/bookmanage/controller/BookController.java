package com.spring.bookmanage.controller;

import com.spring.bookmanage.entity.BookInfo;
import com.spring.bookmanage.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RequestMapping("/book")
@RestController
public class BookController {

    @Autowired
    private  BookService bookService;


    @RequestMapping("/getlist")
    public List<BookInfo> getBookList(){
        return bookService.getBookList();
    }


}
