package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@Table(name = "target")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Target {

    @Id
    @Column(name = "id_target")
    private UUID id;

    @Column(name = "guid_client")
    private UUID guidClient;

    @Column(name = "target")
    private Integer target;

    @Column(name = "type")
    private String type;

    @Column(name = "date_from")
    private LocalDate dateFrom;

    @Column(name = "date_to")
    private LocalDate dateTo;
}
