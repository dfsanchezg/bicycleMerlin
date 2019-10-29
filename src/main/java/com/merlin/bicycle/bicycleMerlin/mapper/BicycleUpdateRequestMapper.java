package com.merlin.bicycle.bicycleMerlin.mapper;

import com.merlin.bicycle.bicycleMerlin.model.entities.Bicycle;
import com.merlin.bicycle.bicycleMerlin.model.web.BicycleUpdateRequest;
import org.springframework.stereotype.Component;

@Component
public class BicycleUpdateRequestMapper {

    public Bicycle convertToBicycleEntity(BicycleUpdateRequest bicycleUpdateRequest){

        Bicycle bicycle = new Bicycle();
        bicycle.setId(bicycleUpdateRequest.getId());
        bicycle.setModel(bicycleUpdateRequest.getModel());
        bicycle.setRin(bicycleUpdateRequest.getRin());
        bicycle.setPrice(bicycle.getPrice());
        bicycle.setSize(bicycle.getSize());
        return bicycle;
    }
}
