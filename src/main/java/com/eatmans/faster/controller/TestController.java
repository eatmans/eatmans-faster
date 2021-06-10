package com.eatmans.faster.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/6/9
 */
@RestController
public class TestController {

    @GetMapping("test")
    public String test() {
        return "test";
    }


}
