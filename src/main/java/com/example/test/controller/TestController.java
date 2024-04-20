package com.example.test.controller;

import com.example.test.entity.Subject;
import com.example.test.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping
    public Map<String, String> getSampleData(){
        return testService.viewAllData();
    }

    @GetMapping("/subject")
    public List<Subject> getAllSubject(){
        return testService.getAllSubject();
    }
}
