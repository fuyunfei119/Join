package com.example.mysql.Controller;

import com.example.mysql.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/")
    public List<LinkedHashMap<String,Object>> FindSet() {
        return testService.FindSet();
    }

}
