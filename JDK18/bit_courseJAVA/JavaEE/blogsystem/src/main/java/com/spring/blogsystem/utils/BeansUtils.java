package com.spring.blogsystem.utils;

import com.spring.blogsystem.pojo.dataobject.BlogInfo;
import com.spring.blogsystem.pojo.response.BlogInfoResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;


@Component
public class BeansUtils {

    public BlogInfoResponse trans(BlogInfo blogInfo){
        if(blogInfo == null){
            return null;
        }
        BlogInfoResponse blogInfoResponse = new BlogInfoResponse();
        BeanUtils.copyProperties(blogInfo,blogInfoResponse);
        return blogInfoResponse;
    }
}
