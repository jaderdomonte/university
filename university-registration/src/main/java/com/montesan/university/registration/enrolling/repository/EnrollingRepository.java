package com.montesan.university.registration.enrolling.repository;

import com.montesan.university.registration.enrolling.entity.Enrolling;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollingRepository extends JpaRepository<Enrolling, String> {
}
