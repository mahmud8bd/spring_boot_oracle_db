package com.sazzad.oracle.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sazzad.oracle.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
