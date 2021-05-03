package com.example.demo.repository;

import com.example.demo.entity.DataGraphs;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

public interface DataGraphsRepository extends JpaRepository<DataGraphs, UUID> {

    Page<DataGraphs> findAllByDateGreaterThanAndDateLessThan(Date date, Date date2, Pageable pageable);
}
