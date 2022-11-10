package com.example.demo.Repository;

import com.example.demo.Model.FlightModel;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FlightRepository extends JpaRepository<FlightModel,String> {
    @Query(
            nativeQuery = true,
            value = "SELECT * FROM \"flights\""
    )
    public List<FlightModel> getFlights();
    @Query(
            nativeQuery = true,
            value = "SELECT * FROM \"flights\" WHERE \"Id\"=(:Id)"
    )
    public FlightModel GetFlightsById(@Param("Id") Integer Id);

    @Query(
            nativeQuery = true,
            value = "SELECT * FROM flights WHERE id_flight = (:id_flight) order by time desc limit 1"
    )
    public List<FlightModel> getFlightsId(@Param("id_flight") String id_flight);

    @Query(
            nativeQuery = true,
            value = "SELECT * FROM flights number = (:number) ORDER BY time DESC LIMIT 1"
    )
    public FlightModel getFlightNumber(@Param("number") String number);

    @Query(
            nativeQuery = true,
            value = "SELECT * FROM flights WHERE number = (:number) ORDER BY time DESC LIMIT 1"
    )
    public MyRepository getLastCord(@Param("number") String number);

    @Query(
            nativeQuery = true,
            value = "SELECT * FROM flights WHERE number = (:id_flight) ORDER BY time DESC "
    )
    public List<FlightModel> getFlightCoordOfAirports(@Param("id_flight") String id_flight);
}
