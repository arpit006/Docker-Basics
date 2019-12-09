package com.springboot.dockerexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href = "mailto: iarpitsrivastava06@gmail.com"> Arpit Srivastava</a>
 */
@RestController
@RequestMapping(value = "/rest")
public class BaseController {

    @GetMapping(value = "")
    public String greet() {
        return "Hello User!. Wish u a very beautiful Good Morning.....";
    }
}
