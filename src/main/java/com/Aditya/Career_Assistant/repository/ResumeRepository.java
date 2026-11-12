package com.Aditya.Career_Assistant.repository;

import com.Aditya.Career_Assistant.entity.Resume;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResumeRepository extends JpaRepository<Resume,Long> {
}
