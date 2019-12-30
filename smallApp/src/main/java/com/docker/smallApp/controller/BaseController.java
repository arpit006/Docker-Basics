package com.docker.smallApp.controller;

import com.docker.smallApp.entity.BaseEntity;
import com.docker.smallApp.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href = "mailto: iarpitsrivastava06@gmail.com"> Arpit Srivastava</a>
 */
@RestController
@RequestMapping("/smallapp")
public class BaseController {

    @Autowired
    private BaseService baseService;

    @PostMapping(value = "")
    public BaseEntity post(@RequestBody BaseEntity baseEntity) {
        return baseService.post(baseEntity);
    }

    @GetMapping(value = "/{id}")
    public BaseEntity getById(@PathVariable int id) {
        BaseEntity be = baseService.findById(id);
        if(be == null) {
            throw new RuntimeException("No record found");
        }
        return be;
    }

}
