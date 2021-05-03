package com.example.demo.service;

import com.example.demo.dto.request.DataGraphsDTO;

import java.util.Date;
import java.util.Map;

public interface DataGraphService {

    Map<Date, DataGraphsDTO> getDataGraphs(Date from, Date to);
}
