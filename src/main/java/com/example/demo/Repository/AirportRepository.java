package com.example.demo.Repository;

import com.example.demo.Model.AirportModel;
import com.example.demo.Model.FlightModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AirportRepository extends JpaRepository<AirportModel,String> {
    @Query(
            nativeQuery = true,
            value = "SELECT * FROM \"airports\""
    )
    public List<AirportModel> getAirports();

    @Query(
            nativeQuery = true,
            value = "SELECT * FROM airports WHERE airport_iata = (:airport_iata)"
    )
    public AirportModel getAirportByIata(@Param("airport_iata") String airport_iata);
}