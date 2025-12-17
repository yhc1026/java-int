package com.spring.bookmanage.service;

import com.spring.bookmanage.dao.BookDao;
import com.spring.bookmanage.entity.BookInfo;
import com.spring.bookmanage.mapper.BookInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    BookDao bookDao;

    @Autowired
    BookInfoMapper bookInfoMapper;

        public List<BookInfo> getBookList(){
            List<BookInfo> bookList=bookDao.getMockBookList1();
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

        public String addBook(BookInfo bookInfo){
            try {
                bookInfoMapper.addBook(bookInfo);
                return "";
            }catch (Exception e){
                return e.getMessage();
            }
        }
}
