package com.example.demo.CoordinatesModel;


public class CoordinatesModel {

    private double origin_longitude;
    private double origin_latitude;
    private double destination_longitude;
    private double destination_latitude;


    public CoordinatesModel(){

    }

    public CoordinatesModel( double origin_longitude, double origin_latitude, double destination_longitude, double destination_latitude) {

        this.origin_longitude = origin_longitude;
        this.origin_latitude = origin_latitude;
        this.destination_longitude = destination_longitude;
        this.destination_latitude = destination_latitude;

    }





    public double getOrigin_longitude() {
        return origin_longitude;
    }

    public void setOrigin_longitude(double origin_longitude) {
        this.origin_longitude = origin_longitude;
    }

    public double getOrigin_latitude() {
        return origin_latitude;
    }

    public void setOrigin_latitude(double origin_latitude) {
        this.origin_latitude = origin_latitude;
    }

    public double getDestination_longitude() {
        return destination_longitude;
    }

    public void setDestination_longitude(double destination_longitude) {
        this.destination_longitude = destination_longitude;
    }

    public double getDestination_latitude() {
        return destination_latitude;
    }

    public void setDestination_latitude(double destination_latitude) {
        this.destination_latitude = destination_latitude;
    }


}