package com.example.demo.Model;


import javax.persistence.*;

@Entity
@Table(name = "flights")
public class FlightModel {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String aircraft_code;
    private String airline_iata;
    private String airline_icao;
    private String airplane_model;
    private int altitude;
    private String callsign;
    private String destination_airport_iata;
    private int ground_speed;
    private int heading;
    private String icao_24bit;
    private String id_flight;
    private double latitude;
    private double longitude;
    private int number;
    private int on_ground;
    private String origin_airport_iata;
    private String registration;
    private String squawk;
    private int time;
    private int vertical_speed;

    public FlightModel(){

    }
    public FlightModel(int id, String aircraft_code, String airline_iata, String airline_icao, String airplane_model, int altitude, String callsign, String destination_airport_iata, int ground_speed, int heading, String icao_24bit, String id_flight, double latitude, double longitude, int number, int on_ground, String origin_airport_iata, String registration, String squawk, int time, int vertical_speed) {
        this.id = id;
        this.aircraft_code = aircraft_code;
        this.airline_iata = airline_iata;
        this.airline_icao = airline_icao;
        this.airplane_model = airplane_model;
        this.altitude = altitude;
        this.callsign = callsign;
        this.destination_airport_iata = destination_airport_iata;
        this.ground_speed = ground_speed;
        this.heading = heading;
        this.icao_24bit = icao_24bit;
        this.id_flight = id_flight;
        this.latitude = latitude;
        this.longitude = longitude;
        this.number = number;
        this.on_ground = on_ground;
        this.origin_airport_iata = origin_airport_iata;
        this.registration = registration;
        this.squawk = squawk;
        this.time = time;
        this.vertical_speed = vertical_speed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAircraft_code() {
        return aircraft_code;
    }

    public void setAircraft_code(String aircraft_code) {
        this.aircraft_code = aircraft_code;
    }

    public String getAirline_iata() {
        return airline_iata;
    }

    public void setAirline_iata(String airline_iata) {
        this.airline_iata = airline_iata;
    }

    public String getAirline_icao() {
        return airline_icao;
    }

    public void setAirline_icao(String airline_icao) {
        this.airline_icao = airline_icao;
    }

    public String getAirplane_model() {
        return airplane_model;
    }

    public void setAirplane_model(String airplane_model) {
        this.airplane_model = airplane_model;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public String getCallsign() {
        return callsign;
    }

    public void setCallsign(String callsign) {
        this.callsign = callsign;
    }

    public String getDestination_airport_iata() {
        return destination_airport_iata;
    }

    public void setDestination_airport_iata(String destination_airport_iata) {
        this.destination_airport_iata = destination_airport_iata;
    }

    public int getGround_speed() {
        return ground_speed;
    }

    public void setGround_speed(int ground_speed) {
        this.ground_speed = ground_speed;
    }

    public int getHeading() {
        return heading;
    }

    public void setHeading(int heading) {
        this.heading = heading;
    }

    public String getIcao_24bit() {
        return icao_24bit;
    }

    public void setIcao_24bit(String icao_24bit) {
        this.icao_24bit = icao_24bit;
    }

    public String getId_flight() {
        return id_flight;
    }

    public void setId_flight(String id_flight) {
        this.id_flight = id_flight;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getOn_ground() {
        return on_ground;
    }

    public void setOn_ground(int on_ground) {
        this.on_ground = on_ground;
    }

    public String getOrigin_airport_iata() {
        return origin_airport_iata;
    }

    public void setOrigin_airport_iata(String origin_airport_iata) {
        this.origin_airport_iata = origin_airport_iata;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getSquawk() {
        return squawk;
    }

    public void setSquawk(String squawk) {
        this.squawk = squawk;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getVertical_speed() {
        return vertical_speed;
    }

    public void setVertical_speed(int vertical_speed) {
        this.vertical_speed = vertical_speed;
    }
}
