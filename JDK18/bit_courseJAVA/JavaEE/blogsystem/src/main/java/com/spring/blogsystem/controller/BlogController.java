package com.spring.blogsystem.controller;


import com.spring.blogsystem.pojo.response.BlogInfoResponse;
import com.spring.blogsystem.service.BlogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Slf4j
@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @RequestMapping("/getlist")
    public List<BlogInfoResponse> getList(){
        return blogService.getList();
    }

    @RequestMapping("/getBlogDetail")
    public BlogInfoResponse getBlogById(int blogId){
        return blogService.getBlogById(blogId);
    }
}
