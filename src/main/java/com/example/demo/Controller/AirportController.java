package com.example.demo.Controller;

import com.example.demo.Model.AirportModel;
import com.example.demo.Service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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