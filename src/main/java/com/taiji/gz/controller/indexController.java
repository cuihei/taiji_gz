package com.taiji.gz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class indexController {






//    @RequestMapping(value = "/toLogin", method = RequestMethod.GET)
    @RequestMapping({"", "login"})
    public String toLogin(HttpSession session) {
        session.invalidate();

        return "login";
    }






    @RequestMapping("/index")
    public String toIndex() {
        return "index";
    }




}
