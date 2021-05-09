package com.montesan.university.academic.subject.service;

import com.montesan.university.academic.infra.kafka.producer.subject.SubjectProducer;
import com.montesan.university.academic.subject.dto.SubjectDto;
import com.montesan.university.academic.subject.entity.Subject;
import com.montesan.university.academic.subject.repository.SubjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class SubjectService {

    private final SubjectProducer subjectProducer;
    private final SubjectRepository repository;

    public SubjectDto save(SubjectDto subjectDto){
        subjectDto.setId(UUID.randomUUID().toString());

        Subject subjectSaved = repository.save(subjectDto.toEntity());
        subjectProducer.send(subjectDto);

        return subjectSaved.toDto();
    }

    public List<Subject> getSubjects(){
        return repository.findAll();
    }
}