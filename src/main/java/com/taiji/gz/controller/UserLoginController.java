package com.taiji.gz.controller;

import com.taiji.gz.entity.userLogin;
import com.taiji.gz.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;

@Controller
@RequestMapping("/user")
public class UserLoginController {


    @Autowired
    private userService userService;


    @ResponseBody
    @PostMapping("/login")
    public String login(@RequestParam("loginName") String userloginname, @RequestParam("password") String password,
                        HttpServletRequest request) throws ParseException, UnsupportedEncodingException, NoSuchAlgorithmException {


        System.out.println(userloginname);
        System.out.println(password);

        userLogin userLogin= userService.login(userloginname,password);
        if(userLogin!=null){
            return "success";
        }


        return "";
    }






    @RequestMapping("/index")
    public String toIndex() {
        return "index";
    }




}
