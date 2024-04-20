package com.example.test.service;

import com.example.test.entity.Subject;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface TestService {

    public Map<String, String> viewAllData();

    List<Subject> getAllSubject();

    Subject createSubject(Subject subject);
}
