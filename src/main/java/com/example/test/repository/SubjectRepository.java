package com.example.test.repository;

import com.example.test.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {
}
