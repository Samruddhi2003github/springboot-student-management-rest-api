package com.aurionpro.jparepo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.aurionpro.jparepo.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    
}
