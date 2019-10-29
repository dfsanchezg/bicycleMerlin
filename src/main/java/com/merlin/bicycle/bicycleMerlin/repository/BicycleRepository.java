package com.merlin.bicycle.bicycleMerlin.repository;

import com.merlin.bicycle.bicycleMerlin.model.entities.Bicycle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BicycleRepository extends JpaRepository<Bicycle, Long> {
}
