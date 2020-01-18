package com.springboot.jokesapplication.controllers;

import com.springboot.jokesapplication.service.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.atomic.AtomicInteger;

@Controller
public class JokeController {

    private JokesService jokesService;

    private AtomicInteger atomicInteger;

    @Autowired
    public JokeController(JokesService jokesService) {
        this.jokesService = jokesService;
        atomicInteger = new AtomicInteger();
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model) {
        System.out.println("Get Request called for " + atomicInteger.addAndGet(1) + " times.");
        model.addAttribute("joke", jokesService.getJoke());
        return "chucknorris";
    }
}
