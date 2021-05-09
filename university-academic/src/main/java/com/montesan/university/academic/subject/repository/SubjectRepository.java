package com.montesan.university.academic.subject.repository;

import com.montesan.university.academic.subject.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
