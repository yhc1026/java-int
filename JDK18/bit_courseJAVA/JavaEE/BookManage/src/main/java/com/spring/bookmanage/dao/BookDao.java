package com.spring.bookmanage.dao;

import com.spring.bookmanage.entity.BookInfo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class BookDao {

    public List<BookInfo> getMockBookList1(){
        List<BookInfo> bookList=new ArrayList<>();
        for(int i=0;i<15;i++){
            BookInfo bookInfo=new BookInfo();
            bookInfo.setId(i);
            bookInfo.setBookName("book1");
            bookInfo.setAuthor("author1");
            bookInfo.setPrice(1);
            bookInfo.setPublish("publish1");
            bookInfo.setCount(new Random().nextInt(100));
            bookInfo.setStatus(i%5==0?0:1);
            bookList.add(bookInfo);
        }
        return bookList;
    }

}
