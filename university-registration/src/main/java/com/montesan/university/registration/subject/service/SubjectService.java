package com.montesan.university.registration.subject.service;

import com.montesan.university.registration.subject.dto.SubjectDto;
import com.montesan.university.registration.subject.entity.Subject;
import com.montesan.university.registration.subject.repository.SubjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SubjectService {

    private final SubjectRepository repository;

    public SubjectDto save(SubjectDto subjectDto) {
        Subject subjectSaved = repository.save(subjectDto.toEntity());
        return subjectSaved.toDto();
    }

    public List<Subject> getSubjects() {
        return repository.findAll();
    }
}