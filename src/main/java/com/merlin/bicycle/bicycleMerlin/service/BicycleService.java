package com.merlin.bicycle.bicycleMerlin.service;

import com.merlin.bicycle.bicycleMerlin.manager.BicycleManager;
import com.merlin.bicycle.bicycleMerlin.model.entities.Bicycle;
import com.merlin.bicycle.bicycleMerlin.model.web.BicycleCreateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BicycleService {

    @Autowired
    public BicycleManager bicycleManager;

    public Optional<Bicycle> findBicycle(long id) {

        return bicycleManager.findBicycleById(id);
    }

    public Bicycle createBicycle(BicycleCreateRequest bicycleCreateRequest) {

        return bicycleManager.createBicycle(bicycleCreateRequest);
    }

}
