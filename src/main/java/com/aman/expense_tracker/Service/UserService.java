package com.aman.expense_tracker.Service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String getServiceMessage()
    {
        return "Service is connected to Controller";
    }

    public String getHelloMessage()
    {
        return "Hello API is working";
    }

    public String getHelloMessage(String name)
    {
        return "Hello "+name+" API is working";
    }

    
    
}
