package com.skywhalelab.demo.main.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class MainController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value="/")
    public String main(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {

        logger.debug("main start");

        return "main";
    }
}
