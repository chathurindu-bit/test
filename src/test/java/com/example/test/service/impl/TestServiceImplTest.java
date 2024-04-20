package com.example.test.service.impl;

import com.example.test.entity.Subject;
import com.example.test.repository.SubjectRepository;
import com.example.test.service.TestService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest
class TestServiceImplTest {

    @Autowired
    private TestServiceImpl testServiceImpl;
    @MockBean
    private SubjectRepository subjectRepository;

//    public void for

    @Test
    public void getAllSubjectTest(){
        // Arrange
        Subject subject = new Subject();
        subject.setId(1);
        subject.setName("Test Subject");
        subject.setCredit(4);

        List<Subject> subjectList = new ArrayList<>();
        subjectList.add(subject);

        when(subjectRepository.findAll()).thenReturn(subjectList);

        // Act
        List<Subject> subjectListFromServiceImpl = testServiceImpl.getAllSubject();

        // Assert
        verify(subjectRepository).findAll();
        assertEquals(1,subjectListFromServiceImpl.size());
    }

    @Test
    public void createSubjectTest(){

    }

    @Test
    public void simpleCalculatorTest(){
        TestServiceImpl imlp = new TestServiceImpl();
        assertEquals(4, imlp.simpleCalculator(2,2));
    }

    @Test
    public void simpleCalculatorTest2(){
        TestServiceImpl imlp = new TestServiceImpl();
        assertEquals(10, imlp.simpleCalculator(7,3));
    }

    @Test
    public void fiftyNineShouldReturnF(){
        var testService = new TestServiceImpl();
        assertEquals("F",testService.numberGrade(59));
    }

    @Test
    public void sixtyNineShouldReturnD(){
        var testService = new TestServiceImpl();
        assertEquals("D",testService.numberGrade(69));
    }

    @Test
    public void seventyNineShouldReturnC(){
        var testService = new TestServiceImpl();
        assertEquals("C",testService.numberGrade(79));
    }

    @Test
    public void eightyNineShouldReturnB(){
        var testService = new TestServiceImpl();
        assertEquals("B",testService.numberGrade(89));
    }

    @Test
    public void moreThanNinetyShouldReturnA(){
        var testService = new TestServiceImpl();
        assertEquals("A",testService.numberGrade(90));
    }

    @Test
    public void lessThanZeroShouldReturnException(){
        var testService = new TestServiceImpl();
        assertThrows(IllegalArgumentException.class,
                () -> testService.numberGrade(-1));
    }


}
