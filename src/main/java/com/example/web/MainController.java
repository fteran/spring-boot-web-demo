package com.example.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Fernando Teran on 10/14/2016.
 */
@Controller
public class MainController {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/")
    @ResponseBody public String root(){
        log.info("Root Application context request");
        return "Hello World";
    }
}
