package com.spring.springboot_demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RequestMapping("/request")
@RestController
public class RequestController {

    @RequestMapping("/r1")
    public String r1(String keyword){
        return "r1:"+keyword;
    }

    @RequestMapping("/r2")
    public String r2(@RequestParam("q") String keyword){
        return "r2:"+keyword;
    }

    @RequestMapping("/r3")
    public String r3(String[] arr){
        return Arrays.toString(arr);
    }
}
