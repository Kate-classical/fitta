package com.example.demo.service;

import com.example.demo.dto.request.DataGraphsDTO;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
@RequiredArgsConstructor
public class DataGraphServiceImpl implements DataGraphService{

    private final DataGraphsRepository dataGraphsRepository;

    @Override
    public Map<Date, DataGraphsDTO> getDataGraphs(Date from, Date to) {
        Map<Date, DataGraphsDTO> dataGraphsMap = new HashMap<>();
        List<DataGraphs> dataGraphs = dataGraphsRepository.findAllByDateGreaterThanAndDateLessThan(from, to);

        dataGraphs.forEach(dataGraph -> {
            dataGraphsMap.put(dataGraph.getDate(), DataGraphsDTO.builder()
                    .dataChestServer(dataGraph.getChest())
                    .dataHipsServer(dataGraph.getHips())
                    .dataWaistServer(dataGraph.getWaist())
                    .dataWeightServer(dataGraph.getWeight())
                    .build());
        });

        return dataGraphsMap;
    }
}
