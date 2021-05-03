package com.example.demo.service;

import com.example.demo.entity.DataGraphs;
import com.example.demo.repository.DataGraphsRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Slf4j
@RequiredArgsConstructor
public class DataGraphServiceImpl implements DataGraphService{

    private final DataGraphsRepository dataGraphsRepository;

    @Override
    public Page<DataGraphs> getDataGraphs(Date from, Date to, Pageable pageable) {
        return dataGraphsRepository.findAllByDateGreaterThanAndDateLessThan(from, to, pageable);
    }
}
