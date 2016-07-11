package de.deelthor.pipeline.controller;

import de.deelthor.pipeline.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/{userName}")
    public String root(@PathVariable String userName) {
        return userService.getUser(userName);
    }
}
