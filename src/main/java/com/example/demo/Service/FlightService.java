package com.example.demo.Service;
import com.example.demo.Model.FlightModel;
import com.example.demo.Repository.FlightRepository;
import com.example.demo.Repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService{

    @Autowired
    FlightRepository flightRepository;

    public Page<FlightModel> getFlights(int pageNumber, int pageSize) {
        return flightRepository.findAll(PageRequest.of(pageNumber,pageSize));
    }
    public List<FlightModel> getFlightsId(String id_flight){

        return flightRepository.getFlightsId(id_flight);
    }
    public FlightModel getFlightNumber(String callsign){
        return flightRepository.getFlightNumber(callsign);
    }
    public MyRepository getLastCord(String callsign){
        return flightRepository.getLastCord(callsign);
    }
    public List<FlightModel> getFlightCoordOfAirports(String id_flight){
        return flightRepository.getFlightCoordOfAirports(id_flight);
    }
}
