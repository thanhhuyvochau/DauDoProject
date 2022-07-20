package com.example.SpringBoot_CapstoneSystem_SWP.CapstoneSystem.controller;


import com.example.SpringBoot_CapstoneSystem_SWP.CapstoneSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/home")
public class UserController {

@Autowired
private UserService userService ;

    @GetMapping("/hello")
    public String hello(ModelMap modelMap){
    return "Hello World" ;
    }

    @GetMapping(value = "/index")
    public String index(){
        Long numberOfUser = userService.coutUser();

        return numberOfUser.toString();
    }


}
