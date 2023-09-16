package com.codingdojo.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class humanController {
    @RequestMapping("/")
    public String index(@RequestParam(value = "name") String name){
        if (name.equals("")){
            return "Hello Human";
        }
        else return "Hello " + name;
    }
}
