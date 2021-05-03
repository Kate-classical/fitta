package com.example.demo.controller;

import com.example.demo.dto.request.DataGraphsDTO;
import com.example.demo.entity.DataGraphs;
import com.example.demo.service.DataGraphService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping("data")
@Slf4j
@RequiredArgsConstructor
public class DataGraphController {

    private final DataGraphService dataGraphService;

    @GetMapping(value = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getData(@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
                                     @RequestParam(required = false) Date from,
                                     @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
                                     @RequestParam(required = false) Date to) {
        log.info("GET data");
        Map<Date, DataGraphsDTO> dataGraphsMap = dataGraphService.getDataGraphs(from, to);
        return ResponseEntity.ok(dataGraphsMap);
    }

    @GetMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getYes() {
        log.info("GET data");
        return ResponseEntity.ok("yes");
    }
}
