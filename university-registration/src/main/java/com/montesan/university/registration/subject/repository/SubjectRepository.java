package com.montesan.university.registration.subject.repository;

import com.montesan.university.registration.subject.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SubjectRepository extends JpaRepository<Subject, UUID> {
}
