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

    
    
}
