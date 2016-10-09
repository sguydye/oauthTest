package com.example.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    @RequestMapping("/")
    public String entry(){
        return "Hello world";
    }

    @PreAuthorize("hasRole('ROLE_USER')")
    @RequestMapping(value = "user", method = RequestMethod.GET)
    public String userPage() {
        return "Hello user";
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @RequestMapping(value = "admin", method = RequestMethod.GET)
    public String adminPage() {
        return "Hello admin";
    }
}
