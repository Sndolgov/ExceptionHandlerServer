package com.starter.controller;

import com.starter.service.PSRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("psr/")
public class Controller
{
    @Autowired
    private PSRService psrService;

    @GetMapping("do/test")
    public boolean doTest(){
        return psrService.isPositive();
    }
}
