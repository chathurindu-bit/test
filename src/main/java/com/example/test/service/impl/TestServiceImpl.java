package com.example.test.service.impl;

import com.example.test.entity.Subject;
import com.example.test.repository.SubjectRepository;
import com.example.test.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    public Map<String, String> viewAllData() {
        Map<String, String> map = new HashMap<>();
        map.put("name","CJ");
        map.put("age","35");

        return map;
    }

    public int simpleCalculator(int num1, int num2){
        return num1 + num2;
    }

    public String numberGrade(int number){
        if (number < 0){
            throw new IllegalArgumentException("Number not valid");
        }
        else if (number < 60){
            return "F";
        }
        else if (number < 70){
            return "D";
        }
        else if (number < 80){
            return "C";
        }
        else if (number < 90){
            return "B";
        }
        else return "A";
    }

    @Override
    public List<Subject> getAllSubject(){
        return subjectRepository.findAll();
    }

    @Override
    public Subject createSubject(Subject subject){
        return subjectRepository.save(subject);
    }
}
