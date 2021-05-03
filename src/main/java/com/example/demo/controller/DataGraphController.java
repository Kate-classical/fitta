package com.example.demo.controller;

import com.example.demo.entity.DataGraphs;
import com.example.demo.service.DataGraphService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/data")
@Slf4j
@RequiredArgsConstructor
public class DataGraphController {

    private final DataGraphService dataGraphService;

    @PostMapping(value = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getData(@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
                                     @RequestParam(required = false) Date from,
                                     @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
                                     @RequestParam(required = false) Date to,
                                     @RequestParam(required = false) Integer pageSize,
                                     @RequestParam(required = false) Integer pageNumber) {
        log.info("GET data");
        Page<DataGraphs> dataGraphs = dataGraphService.getDataGraphs(from, to , PageRequest.of(pageNumber, pageSize));
        return ResponseEntity.ok(dataGraphs);
    }
}
