package com.example.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class APIController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String defaultResources() {
        return "These are default resources";
    }

    @PreAuthorize("hasRole('ROLE_USER')")
    @RequestMapping(value = "userResource", method = RequestMethod.GET)
    public String userResource() {
        return "These are user's resources";
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @RequestMapping(value = "adminResource", method = RequestMethod.GET)
    public String adminResource() {
        return "These are admin resources";
    }
}
