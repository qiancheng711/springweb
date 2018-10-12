package com.eleme.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

   @RequestMapping("/getUser")
    public  String getUserName(){

        return "张三";
    }
}
