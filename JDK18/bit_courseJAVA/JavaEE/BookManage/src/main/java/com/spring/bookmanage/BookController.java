package com.spring.bookmanage;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;


@RequestMapping("/book")
@RestController
public class BookController {


    @RequestMapping("/getlist")
    public List<BookInfo> getBookList(){
        List<BookInfo> bookList=getMockBookList1();
        for (BookInfo bookInfo:bookList){
            if(bookInfo.getStatus()==0){
                bookInfo.setStatusCN("no");
            }
            else{
                bookInfo.setStatusCN("yes");
            }
        }
        return bookList;
    }

    public List<BookInfo> getMockBookList1(){
        List<BookInfo> bookList=new ArrayList<>();
        for(int i=0;i<15;i++){
            BookInfo bookInfo=new BookInfo();
            bookInfo.setBookId(i);
            bookInfo.setBookName("book1");
            bookInfo.setAuthor("author1");
            bookInfo.setPrice(1);
            bookInfo.setPublish("publish1");
            bookInfo.setNum(1);
            bookInfo.setStatus(i%5==0?0:1);
            bookList.add(bookInfo);
        }
        return bookList;
    }
}
