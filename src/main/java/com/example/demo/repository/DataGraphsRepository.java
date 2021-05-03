package com.example.demo.repository;

import com.example.demo.entity.DataGraphs;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public interface DataGraphsRepository extends JpaRepository<DataGraphs, UUID> {

    List<DataGraphs> findAllByDateGreaterThanAndDateLessThan(Date date, Date date2);
}
