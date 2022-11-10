package com.example.demo.Controller;
import com.example.demo.Model.FlightModel;
import com.example.demo.Repository.MyRepository;
import com.example.demo.Service.AirportService;
import com.example.demo.Service.FlightService;

import java.util.List;


@RestC
@RequestMapping(path = "/flights")
public class FlightController {
    @Autowired
    private FlightService flightService;
    private AirportService airportService;
    //Get endpoint for retrieving all flights


    @GetMapping("/getFlights" )
    public Page<FlightModel> getFlights(@RequestParam int pageSize, @RequestParam int pageNumber) {
        return flightService.getFlights(pageNumber, pageSize);
    }


    //Get endpoint for returning flights by flightId
    @GetMapping("/getFlightsId/{id_flight}" )
    public ResponseEntity <List<FlightModel>> getFlightsId(@PathVariable(value = "id_flight" ) String id_flight) {
        return new ResponseEntity<>(flightService.getFlightsId(id_flight), HttpStatus.OK);
    }

    @GetMapping("/getFlightNumber/{callsign}" )
    public ResponseEntity<FlightModel> getFlightNumber(@PathVariable(value = "callsign" ) String callsign) {
        return new ResponseEntity<>(flightService.getFlightNumber(callsign), HttpStatus.OK);
    }

    @GetMapping("/getLastCord/{callsign}" )
    public ResponseEntity<MyRepository> getLastCord(@PathVariable(value = "callsign" ) String callsign) {
        return new ResponseEntity<>(flightService.getLastCord(callsign), HttpStatus.OK);
    }



}