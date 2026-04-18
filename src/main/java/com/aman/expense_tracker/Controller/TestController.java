package com.aman.expense_tracker.Controller;


import org.springframework.web.bind.annotation.RestController;

import com.aman.expense_tracker.Service.UserService;

import Model.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;








@RestController
public class TestController {

    private final UserService userService;

    public TestController(UserService userService)
    {
        this.userService = userService;
    }

    @GetMapping("/hello")
    public String Test()
    {
        return userService.getHelloMessage();
    }

    @GetMapping("/service")
    public String ServiceMethod() {
        return userService.getServiceMessage();
    }

    @GetMapping("/hello/{name}")
    public String getMethodName(@PathVariable String name) {
        return userService.getHelloMessage(name);
    }

    @PostMapping("/postService")
    public User createUser(@RequestBody User entity) {
        //TODO: process POST request
        
        return entity;
    }


    @PostMapping("/postServiceData")
    public String postMethodName(@RequestBody User entity) {
        //TODO: process POST request
        
        return "Name is "+entity.getName()+" Age is "+entity.getAge();
    }
    
    @GetMapping("/greet")
    public String greetingMe(@RequestParam String param) {
        return "Hello "+param;
    }
    
    @GetMapping("/greet/{param}")
    public String greet(@PathVariable String param) {
        return "Hello Path Variable "+param;
    }
    
    
    
    
}
