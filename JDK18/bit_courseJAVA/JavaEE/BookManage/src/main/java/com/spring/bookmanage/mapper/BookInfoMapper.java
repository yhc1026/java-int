package com.spring.bookmanage.mapper;


import com.spring.bookmanage.entity.BookInfo;
import com.spring.bookmanage.entity.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.awt.print.Book;

@Mapper
public interface BookInfoMapper {

    @Insert("insert into book_info(book_name, author, count, price, publish) values(#{bookName}, #{author}, #{count}, #{price}, #{publish})")
    Integer addBook(BookInfo bookInfo);
}
