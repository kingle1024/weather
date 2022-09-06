package com.gworld.weather.controller;

import com.gworld.weather.service.DiagryService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class DiagryController {
    private final DiagryService diagryService;

    public DiagryController(DiagryService diagryService) {
        this.diagryService = diagryService;
    }

    @PostMapping("/create/diary")
    void createDiagry(
            @RequestParam @DateTimeFormat(iso=DateTimeFormat.ISO.DATE) LocalDate date,
            @RequestBody String text){
            diagryService.createDiagry(date, text);
    }
}
