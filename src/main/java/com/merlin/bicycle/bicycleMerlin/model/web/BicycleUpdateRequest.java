package com.merlin.bicycle.bicycleMerlin.model.web;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class BicycleUpdateRequest {

    private long id;

    private String model;

    private String rin;

    private String size;

    private Long price;

}
