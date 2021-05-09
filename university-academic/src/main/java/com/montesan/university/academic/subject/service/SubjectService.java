package com.montesan.university.academic.subject.service;

import com.montesan.university.academic.subject.entity.Subject;
import com.montesan.university.academic.subject.repository.SubjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SubjectService {

    private final SubjectRepository repository;

    public List<Subject> getSubjects(){
        return repository.findAll();
    }
}