package com.example.greetingapplication.controller;

import com.example.greetingapplication.entities.Greeting;
import com.example.greetingapplication.entities.User;
import com.example.greetingapplication.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    private IGreetingService greetingService;

    @GetMapping(value = {"","/","/home"})
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "world") String name)
    {
        User user = new User();
        user.setFirstName(name);
        return greetingService.addGreeting(user);
    }

    @GetMapping("/greetingid")
    public Greeting getGreetingById(@RequestParam(value = "id") Long id)
    {
        return greetingService.getGreetingById(id);
    }

    @GetMapping("/allgreetings")
    public List<Greeting> getAllGreetings()
    {
        return greetingService.getAllGreetings();
    }

    @DeleteMapping("/delete")
    public void deleteGreeting(@RequestParam(value = "id") Long id)
    {
        greetingService.deleteGreeting(id);
    }
}
