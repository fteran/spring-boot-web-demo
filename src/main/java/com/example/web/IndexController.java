package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Fernando Teran on 10/14/2016.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    @ResponseBody public String index(){
        return "Hello World";
    }
}
