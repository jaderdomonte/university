package com.montesan.university.academic.student.repository;

import com.montesan.university.academic.student.dto.StudentDto;
import com.montesan.university.academic.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface StudentRepository extends JpaRepository<Student, UUID> {

    @Query("from Student e " +
            "where (:#{#studentDto.id} is null or e.id = :#{#studentDto.id}) " +
            "and (:#{#studentDto.name} is null or e.name = :#{#studentDto.name})")
    List<Student> listEnrollings(StudentDto studentDto);
}