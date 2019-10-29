package com.merlin.bicycle.bicycleMerlin.controller;

import com.merlin.bicycle.bicycleMerlin.model.entities.Bicycle;
import com.merlin.bicycle.bicycleMerlin.model.web.BicycleCreateRequest;
import com.merlin.bicycle.bicycleMerlin.service.BicycleService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/bicycle")
@RequiredArgsConstructor
public class BicycleController {

    @Autowired
    public BicycleService bicycleService;

    @PostMapping
    public ResponseEntity createBicycle(@RequestBody BicycleCreateRequest bicycleCreateRequest) {

        try{
            return ResponseEntity.status(HttpStatus.CREATED).body(bicycleService.createBicycle(bicycleCreateRequest));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error creating a bicycle");
        }
    }

    @GetMapping("/{id})")
    public ResponseEntity findBicycleById(@PathVariable Long id) {

        try{
            Optional<Bicycle> product = bicycleService.findBicycle(id);
            return product.map(ResponseEntity::ok)
                    .orElseGet(()-> ResponseEntity.status(HttpStatus.NOT_FOUND).body(new Bicycle()));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error finding a bicycle");
        }
    }
}
