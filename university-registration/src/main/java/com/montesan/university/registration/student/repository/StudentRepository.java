package com.montesan.university.registration.student.repository;

import com.montesan.university.registration.student.dto.StudentDto;
import com.montesan.university.registration.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, String> {

    @Query("from Student e " +
            "where (:#{#studentDto.id} is null or e.id = :#{#studentDto.id}) " +
            "and (:#{#studentDto.name} is null or e.name = :#{#studentDto.name})")
    List<Student> listEnrollings(StudentDto studentDto);
}