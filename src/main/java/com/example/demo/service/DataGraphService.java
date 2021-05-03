package com.example.demo.service;

import com.example.demo.entity.DataGraphs;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Date;

public interface DataGraphService {

    Page<DataGraphs> getDataGraphs(Date from, Date to, Pageable pageable);
}
