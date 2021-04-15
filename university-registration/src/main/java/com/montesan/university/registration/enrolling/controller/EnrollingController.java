package com.montesan.university.registration.enrolling.controller;

import com.montesan.university.registration.enrolling.dto.EnrollingDto;
import com.montesan.university.registration.enrolling.service.EnrollingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enrolling")
@RequiredArgsConstructor
public class EnrollingController {

    private final EnrollingService service;

    @PostMapping(value = "/enroll")
    public void send(@RequestBody EnrollingDto enrollingDto){
        service.enroll(enrollingDto);
    }
}