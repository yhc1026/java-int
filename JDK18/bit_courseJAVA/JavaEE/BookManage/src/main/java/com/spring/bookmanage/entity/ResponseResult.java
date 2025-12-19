package com.spring.bookmanage.entity;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.awt.print.Book;
import java.util.List;


@Data
@JsonPropertyOrder({"total", "records"})
public class ResponseResult<T> {

    private Integer total;
    private List<T> records;
}
