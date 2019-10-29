package com.merlin.bicycle.bicycleMerlin.mapper;

import com.merlin.bicycle.bicycleMerlin.model.entities.Bicycle;
import com.merlin.bicycle.bicycleMerlin.model.web.BicycleCreateRequest;
import org.springframework.stereotype.Component;

@Component
public class BicycleCreateRequestMapper {

    public Bicycle convertToBicycleEntity(BicycleCreateRequest bicycleCreateRequest){

        Bicycle bicycle = new Bicycle();
        bicycle.setModel(bicycleCreateRequest.getModel());
        bicycle.setPrice(bicycleCreateRequest.getPrice());
        bicycle.setRin(bicycleCreateRequest.getRin());
        bicycle.setSize(bicycleCreateRequest.getSize());
        bicycle.setType(bicycleCreateRequest.getType());
        return bicycle;
    }
}
