package com.example.repository;

import com.example.entity.Student;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentPagingRepository extends PagingAndSortingRepository<Student, Long> {
}