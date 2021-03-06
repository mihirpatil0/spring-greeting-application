package com.example.greetingapplication.services;

import com.example.greetingapplication.entities.Greeting;
import com.example.greetingapplication.entities.User;

import java.util.List;

public interface IGreetingService {
    Greeting addGreeting(User user);
    Greeting getGreetingById(Long id);
    List<Greeting> getAllGreetings();
    void deleteGreeting(Long id);
}
