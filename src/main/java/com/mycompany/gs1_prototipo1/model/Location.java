/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gs1_prototipo1.model;

/**
 *
 * @author pabloantoniolopezmartin
 */
public class Location {
    private String country;
    private String zipCode;
    private String city;
    private String street;
    private int number;
    private enum type{inPerson,nonInPerson};
    public Location(String country, String zipCode, String city, String street, int number) {
        this.country = country;
        this.zipCode = zipCode;
        this.city = city;
        this.street = street;
        this.number = number;
    }
    
    
    
}
