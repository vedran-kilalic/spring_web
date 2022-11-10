package com.example.demo.Controller;

import com.example.demo.Model.AirportModel;
import com.example.demo.Service.AirportService;


import java.util.List;

@RestController
@RequestMapping(path = "/airports")
public class AirportController {
    @Autowired
    private AirportService airportService;

    @GetMapping("/getAirports")
    public ResponseEntity<List<AirportModel>> getAirports(){

        return new ResponseEntity<>(airportService.getAirports(), HttpStatus.OK);
    }

}