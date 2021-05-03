package com.example.demo.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
//@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "data_graphs")
public class DataGraphs {

    @Id
    @Column(name = "id_graphs")
    private UUID id;

    @Column(name = "guid_client")
    private UUID guidClient;

    @Column(name = "date")
    private Date date;

    @Column(name = "weigh")
    private Integer weight;

    @Column(name = "chest")
    private Integer chest;

    @Column(name = "waist")
    private Integer waist;

    @Column(name = "hips")
    private Integer hips;
}
