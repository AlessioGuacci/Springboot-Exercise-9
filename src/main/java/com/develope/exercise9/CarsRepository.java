package com.develope.exercise9;

import com.develope.exercise9.Model.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarsRepository extends JpaRepository <Cars, Long> {
}
