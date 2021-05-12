package com.montesan.university.academic.subject.service;

import com.montesan.university.academic.infra.kafka.producer.subject.SubjectServiceProducer;
import com.montesan.university.academic.subject.dto.SubjectDto;
import com.montesan.university.academic.subject.entity.Subject;
import com.montesan.university.academic.subject.repository.SubjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SubjectService {

    private final SubjectRepository repository;
    private final SubjectServiceProducer producer;

    public SubjectDto save(SubjectDto subjectDto){
        Subject subjectSaved = repository.save(subjectDto.toEntity());

        producer.send(subjectSaved.toDto());

        return subjectSaved.toDto();
    }

    public List<Subject> getSubjects(){
        return repository.findAll();
    }
}