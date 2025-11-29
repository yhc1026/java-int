package com.spring.bookmanage;


import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/user")
@RestController
public class UserController {

    List<BookInfo> bookList = new ArrayList<>();

    @RequestMapping("/login")
    public Boolean Login(String username, String password, HttpSession session){
        if(username==null||password==null){
            return false;
        }
        if("yhc".equals(username)&&"123456".equals(password)){
            session.setAttribute("username",username);
            return true;
        }
        return false;
    }
}
