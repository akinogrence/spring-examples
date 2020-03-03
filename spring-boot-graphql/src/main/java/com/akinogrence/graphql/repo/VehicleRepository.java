package com.akinogrence.graphql.repo;

import com.akinogrence.graphql.entity.Vehicle;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

    List<Vehicle> getByTypeLike(String type);

}
