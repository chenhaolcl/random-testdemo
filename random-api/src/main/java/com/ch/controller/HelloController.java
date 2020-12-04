package com.ch.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname HelloController
 * @Description TODO
 * @create 2020/10/19
 * @Author random
 */

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Object hello(){
        return "{\n" +
                "\"employee\":{ \"name\":\"Bill Gates\", \"age\":62, \"city\":\"Seattle\" }\n" +
                "}";
    }

}
