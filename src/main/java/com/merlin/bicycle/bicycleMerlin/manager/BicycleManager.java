package com.merlin.bicycle.bicycleMerlin.manager;

import com.merlin.bicycle.bicycleMerlin.mapper.BicycleCreateRequestMapper;
import com.merlin.bicycle.bicycleMerlin.mapper.BicycleUpdateRequestMapper;
import com.merlin.bicycle.bicycleMerlin.model.entities.Bicycle;
import com.merlin.bicycle.bicycleMerlin.model.web.BicycleCreateRequest;
import com.merlin.bicycle.bicycleMerlin.model.web.BicycleUpdateRequest;
import com.merlin.bicycle.bicycleMerlin.repository.BicycleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class BicycleManager {

    @Autowired
    private BicycleRepository bicycleRepository;

    @Autowired
    private BicycleCreateRequestMapper bicycleCreateRequestMapper;

    @Autowired
    private BicycleUpdateRequestMapper bicycleUpdateRequestMapper;

    public Optional<Bicycle> findBicycleById(Long id){
        return bicycleRepository.findById(id);
    }

    public Bicycle createBicycle(BicycleCreateRequest bicycleCreateRequest){

        Bicycle bicycleToCreate = bicycleCreateRequestMapper.convertToBicycleEntity(bicycleCreateRequest);
       return bicycleRepository.save(bicycleToCreate);
    }

    public Optional<Bicycle> updateBicycle(BicycleUpdateRequest bicycleUpdateRequest){

        Bicycle bicycleToUpdate = bicycleUpdateRequestMapper.convertToBicycleEntity(bicycleUpdateRequest);
        return bicycleRepository.findById(bicycleUpdateRequest.getId());
    }

    public void deleteBicycle(Long id) {

        Optional<Bicycle> bicycle = findBicycleById(id);
        bicycleRepository.delete(bicycle.get());
    }
}
