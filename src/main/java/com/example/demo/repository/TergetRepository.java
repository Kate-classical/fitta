package com.example.demo.repository;

import com.example.demo.entity.Target;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TergetRepository extends JpaRepository<Target, UUID> {
}
