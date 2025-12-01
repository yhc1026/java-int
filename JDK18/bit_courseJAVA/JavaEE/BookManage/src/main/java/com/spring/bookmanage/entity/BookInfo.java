package com.spring.bookmanage.entity;


import lombok.Data;

@Data
public class BookInfo {
    private Integer bookId;
    private String bookName;
    private String author;
    private Integer num;
    private float price;
    private String publish;
    private Integer status;
    private String statusCN;
}
