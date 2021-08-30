package com.example.greetingapplication.services;

import com.example.greetingapplication.entities.Greeting;
import com.example.greetingapplication.entities.User;

public interface IGreetingService {
    Greeting addGreeting(User user);
    Greeting getGreetingById(long id);
}
