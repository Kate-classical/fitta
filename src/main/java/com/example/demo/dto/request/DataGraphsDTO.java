package com.example.demo.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DataGraphsDTO {

    private Integer dataWeightServer;
    private Integer dataChestServer;
    private Integer dataWaistServer;
    private Integer dataHipsServer;

    private Integer goalWeight;
    private Integer goalChest;
    private Integer goalWaist;
    private Integer goalHips;
}
