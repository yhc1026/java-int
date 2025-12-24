package com.spring.blogsystem.utils;

import com.spring.blogsystem.pojo.dataobject.BlogInfo;
import com.spring.blogsystem.pojo.dataobject.UserInfo;
import com.spring.blogsystem.pojo.response.BlogInfoResponse;
import com.spring.blogsystem.pojo.response.UserLoginResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;


@Component
public class BeansTransUtils {

    public BlogInfoResponse transBlog(BlogInfo blogInfo){
        if(blogInfo == null){
            return null;
        }
        BlogInfoResponse blogInfoResponse = new BlogInfoResponse();
        BeanUtils.copyProperties(blogInfo,blogInfoResponse);
        return blogInfoResponse;
    }

    public UserLoginResponse transUser(UserInfo userInfo){
        if(userInfo == null){
            return null;
        }
        UserLoginResponse userInfoResponse = new UserLoginResponse(null, null, null);
        BeanUtils.copyProperties(userInfo,userInfoResponse);
        return userInfoResponse;
    }
}
