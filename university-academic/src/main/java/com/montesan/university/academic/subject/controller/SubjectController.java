package com.montesan.university.academic.subject.controller;

import com.montesan.university.academic.subject.dto.SubjectDto;
import com.montesan.university.academic.subject.service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subject")
@RequiredArgsConstructor
public class SubjectController {

    private final SubjectService service;

    @PostMapping
    public ResponseEntity<?> createSubject(@RequestBody SubjectDto subjectDto){
        return ResponseEntity.ok(service.save(subjectDto));
    }

    @GetMapping
    public ResponseEntity<?> getSubjects(){
        return ResponseEntity.ok(service.getSubjects());
    }
}