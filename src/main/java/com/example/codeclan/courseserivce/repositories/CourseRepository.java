package com.example.codeclan.courseserivce.repositories;

import com.example.codeclan.courseserivce.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}