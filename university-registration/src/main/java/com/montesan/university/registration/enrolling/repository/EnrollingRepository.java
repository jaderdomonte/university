package com.montesan.university.registration.enrolling.repository;

import com.montesan.university.registration.enrolling.dto.EnrollingDto;
import com.montesan.university.registration.enrolling.entity.Enrolling;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EnrollingRepository extends JpaRepository<Enrolling, String> {

    @Query("from Enrolling e " +
            "where (:#{#enrollingDto.id} is null or e.id = :#{#enrollingDto.id}) " +
            "and (:#{#enrollingDto.name} is null or e.name = :#{#enrollingDto.name})")
    List<Enrolling> listEnrollings(EnrollingDto enrollingDto);
}