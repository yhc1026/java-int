package com.spring.bookmanage.controller;

import com.spring.bookmanage.entity.BookInfo;
import com.spring.bookmanage.entity.PageRequest;
import com.spring.bookmanage.entity.ResponseResult;
import com.spring.bookmanage.enums.BookStatusEnum;
import com.spring.bookmanage.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RequestMapping("/book")
@RestController
public class BookController {

    @Autowired
    private  BookService bookService;

    @RequestMapping("/addBook")
    public String addBook(BookInfo bookInfo){
        log.info("add book"+bookInfo);
        if(!StringUtils.hasLength(bookInfo.getBookName())
                ||bookInfo.getCount()==null
                ||bookInfo.getPrice()==null
                ||!StringUtils.hasLength(bookInfo.getPublish())
                ||bookInfo.getStatus()==null
        ){
            log.error("bad parameter, "+bookInfo);
            return "parameter error";
        }
        try {
            String i=bookService.addBook(bookInfo);
            System.out.println("\n"+i+"\n");
            return i;
        }catch (Exception e){
            log.error("error,"+e);
            return e.getMessage();
        }
    }


    @RequestMapping("/getListByPage")
    public ResponseResult<BookInfo> getListByPage(PageRequest  pageRequest) {
        return bookService.getListByPage(pageRequest);
    }

    @RequestMapping("/queryBookById")
    public BookInfo getBookById(String id){
        log.info("queryBookById: "+id);
        return bookService.getBookById(id);
    }

    @RequestMapping("/updateBook")
    public String updateBook(BookInfo bookInfo){
        log.info("updateBook: "+bookInfo);
        if(!StringUtils.hasLength(bookInfo.getBookName())
        ||bookInfo.getCount()==null
        ||bookInfo.getPrice()==null
        ||!StringUtils.hasLength(bookInfo.getPublish())
        ||bookInfo.getStatus()==null){
            log.error("bad parameter, "+bookInfo);
        }
        try {
            int i=bookService.updateBook(bookInfo);
            log.info("updateBook: "+i);
            if(i>0){
                return "";
            }else{
                return "update error";
            }

        }catch (Exception e){
            log.error("error,"+e);
            return e.getMessage();
        }
    }

    @RequestMapping("/deleteBook")
    public String deleteBookById(int id){
        log.info("deleteBookById: "+id);
       try {
           BookInfo bookInfo = new BookInfo();
           bookInfo.setId(id);
           bookInfo.setStatus(BookStatusEnum.DELETE.getCode());
           log.info("book info: "+bookInfo);
           bookService.updateBook(bookInfo);
           return"";
       }catch (Exception e){
           log.error("error,"+e);
           return e.getMessage();
       }
    }
}
