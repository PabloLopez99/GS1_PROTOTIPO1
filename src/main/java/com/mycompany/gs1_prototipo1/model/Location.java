package com.mycompany.gs1_prototipo1.model;

import java.awt.Point;
import java.util.TimeZone;

public class Location {
    private Street street;
    private String city;
    private String state;
    private String country;
    private String postCode;
    private enum type{inPerson,nonInPerson};
    private Coordinate coordinates;
    private String offset;
    private Point point;

    public Location(Street street, String city, String state, String country, String postCode, Coordinate coordinates, String offset) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.postCode = postCode;
        this.coordinates = coordinates;
        this.offset = offset;
    }
    public Street getStreet() {
        return street;
    }
    public void setStreet(Street street) {
        this.street = street;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getPostCode() {
        return postCode;
    }
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
    public Coordinate getCoordinates() {
        return coordinates;
    }
    public void setCoordinates(Coordinate coordinates) {
        this.coordinates = coordinates;
    }
    public String getOffset() {
        return offset;
    }
    public void setOffset(String offset) {
        this.offset = offset;
    }
    public Point getPoint() {
        return point;
    }
    public void setPoint(Point point) {
        this.point = point;
    }
     public String toString(){
        return city;
    } 
}
