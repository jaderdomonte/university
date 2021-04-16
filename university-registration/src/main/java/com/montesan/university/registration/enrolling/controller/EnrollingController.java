package com.montesan.university.registration.enrolling.controller;

import com.montesan.university.registration.enrolling.dto.EnrollingDto;
import com.montesan.university.registration.enrolling.service.EnrollingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/enrolling")
@RequiredArgsConstructor
public class EnrollingController {

    private final EnrollingService service;

    @PostMapping(value = "/enroll")
    public ResponseEntity<EnrollingDto> send(@RequestBody EnrollingDto enrollingDto){
       EnrollingDto response = service.enroll(enrollingDto);

       return ResponseEntity.ok(response);
    }

    @GetMapping(value = "/enroll")
    public ResponseEntity<List<EnrollingDto>> listEnrollings(EnrollingDto enrollingDto){
        List<EnrollingDto> response = service.listEnrollings(enrollingDto);

        return ResponseEntity.ok(response);
    }
}