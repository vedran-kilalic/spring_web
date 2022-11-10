package com.example.demo.Model;

import javax.persistence.*;

@Entity
@Table(name = "airports")
public class AirportModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int scheduled_departure;
    private int scheduled_arrival;
    private   int real_departure;
    private int real_arrival;
    private int estimated_departure;
    private int estimated_arrival;
    private String id_flight;
    private String airport_iata;
    private int timeStamp;
    private char status_check;

    public AirportModel(){

    }

    public AirportModel(int id, int scheduled_departure, int scheduled_arrival, int real_departure, int real_arrival, int estimated_departure, int estimated_arrival, String id_flight, String airport_iata, int timeStamp, char status_check) {
        this.id = id;
        this.scheduled_departure = scheduled_departure;
        this.scheduled_arrival = scheduled_arrival;
        this.real_departure = real_departure;
        this.real_arrival = real_arrival;
        this.estimated_departure = estimated_departure;
        this.estimated_arrival = estimated_arrival;
        this.id_flight = id_flight;
        this.airport_iata = airport_iata;
        this.timeStamp = timeStamp;
        this.status_check = status_check;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScheduled_deperture() {
        return scheduled_departure;
    }

    public void setScheduled_deperture(int scheduled_deperture) {
        this.scheduled_departure = scheduled_deperture;
    }

    public int getScheduled_arrival() {
        return scheduled_arrival;
    }

    public void setScheduled_arrival(int scheduled_arrival) {
        this.scheduled_arrival = scheduled_arrival;
    }

    public int getReal_departure() {
        return real_departure;
    }

    public void setReal_departure(int real_departure) {
        this.real_departure = real_departure;
    }

    public int getReal_arrival() {
        return real_arrival;
    }

    public void setReal_arrival(int real_arrival) {
        this.real_arrival = real_arrival;
    }

    public int getEstimated_departure() {
        return estimated_departure;
    }

    public void setEstimated_departure(int estimated_departure) {
        this.estimated_departure = estimated_departure;
    }

    public int getEstimated_arrival() {
        return estimated_arrival;
    }

    public void setEstimated_arrival(int estimated_arrival) {
        this.estimated_arrival = estimated_arrival;
    }

    public String getId_flight() {
        return id_flight;
    }

    public void setId_flight(String id_flight) {
        this.id_flight = id_flight;
    }

    public String getAirport_iata() {
        return airport_iata;
    }

    public void setAirport_iata(String airport_iata) {
        this.airport_iata = airport_iata;
    }

    public int getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(int timeStamp) {
        this.timeStamp = timeStamp;
    }

    public char getStatus_check() {
        return status_check;
    }

    public void setStatus_check(char status_check) {
        this.status_check = status_check;
    }
}