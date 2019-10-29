package com.merlin.bicycle.bicycleMerlin.model.web;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class BicycleCreateRequest {

    private String model;

    private String rin;

    private String size;

    private String type;

    private Long price;

}
