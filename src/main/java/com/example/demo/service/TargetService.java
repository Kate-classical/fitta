package com.example.demo.service;

import com.example.demo.dto.request.TargetDTO;
import com.example.demo.entity.Target;
import com.example.demo.repository.TergetRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class TargetService {

    private final TergetRepository tergetRepository;

    public void saveTarget(String type, TargetDTO targetDTO) {
        tergetRepository.save(Target.builder().type(type)
                .dateTo(targetDTO.getDateTo())
                .guidClient(targetDTO.getGuidClient())
                .target(targetDTO.getTarget())
                .build());
    }

    public List<Target> getTargets(){
        return tergetRepository.findAll();
    }
}
