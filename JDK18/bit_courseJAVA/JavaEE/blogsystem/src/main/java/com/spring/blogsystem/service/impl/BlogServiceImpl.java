package com.spring.blogsystem.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.spring.blogsystem.mapper.BlogInfoMapper;
import com.spring.blogsystem.pojo.dataobject.BlogInfo;
import com.spring.blogsystem.pojo.request.AddBlogRequest;
import com.spring.blogsystem.pojo.response.BlogInfoResponse;
import com.spring.blogsystem.service.BlogService;
import com.spring.blogsystem.utils.BeansTransUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class BlogServiceImpl implements BlogService {


    @Autowired
    private BlogInfoMapper blogInfoMapper;

    @Autowired
    private BeansTransUtils beansTransUtils;

    @Override
    public List<BlogInfoResponse> getList() {

        QueryWrapper<BlogInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(BlogInfo::getDeleteFlag, 0);
        List<BlogInfo> list = blogInfoMapper.selectList(queryWrapper);

        List<BlogInfoResponse> blogInfoResponse = list.stream().map(blogInfo->{
            BlogInfoResponse response = beansTransUtils.transBlog(blogInfo);
            return response;
        }).collect(Collectors.toList());

        return blogInfoResponse;
    }

    @Override
    public BlogInfoResponse getBlogById(int id) {
        QueryWrapper<BlogInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(BlogInfo::getDeleteFlag, 0).eq(BlogInfo::getId, id);
        BlogInfo blogInfo = blogInfoMapper.selectOne(queryWrapper);

        BlogInfoResponse blogInfoResponse = beansTransUtils.transBlog(blogInfo);
        return blogInfoResponse;
    }

    @Override
    public boolean addBlog(AddBlogRequest addBlogRequest) {
        BlogInfo blogInfo = new BlogInfo();
        BeanUtils.copyProperties(addBlogRequest, blogInfo);
        Integer cnt = blogInfoMapper.insert(blogInfo);
        if(cnt==1){
            return true;
        }
        return false;
    }

}
