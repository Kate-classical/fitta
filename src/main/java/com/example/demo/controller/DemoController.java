package com.example.demo.controller;

import com.example.demo.dto.request.TargetDTO;
import com.example.demo.service.TargetService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("target")
@Slf4j
@RequiredArgsConstructor
public class DemoController {

    private final TargetService targetService;

    @PostMapping(value = "/save/{type}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> saveData(@PathVariable String type,
                                      @RequestBody TargetDTO targetDTO) {
        log.info("save");
        targetService.saveTarget(type, targetDTO);
        return ResponseEntity.ok("save");
    }

    @PostMapping(value = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getData() {
        log.info("save");
        return ResponseEntity.ok(targetService.getTargets());
    }
}
