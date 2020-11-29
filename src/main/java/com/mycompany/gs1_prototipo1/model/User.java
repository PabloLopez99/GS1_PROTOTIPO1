package com.mycompany.gs1_prototipo1.model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class User {
    private String name;
    private String firstName;
    private String lastName;
    private int age; //Lo cambiaría por fecha de nacimiento
    private double rating; //Sacaría una clase
    private String description; //Sacaría description a una clase, poder darle un formato mas concreto a las descipciones
    private File[] files;//Xd en ningún momento hemos añadido en las historias el tema de las bases de datos
    private BufferedImage profileImage; //Lo añadí
    
    private List<Mission> missions;
    private List<Mission> subscribedMissions;
    
    public User(String name, String firstName, String lastName, int age, String description) {
        this.name = name;
        this.firstName=firstName;
        this.lastName=lastName;
        this.age = age;
        this.description = description;
        missions= new LinkedList<>();
        subscribedMissions= new LinkedList<>();
    }


    public boolean addMission(Mission newMission) {
        if(!missions.contains(newMission)){
            missions.add(newMission);
            return true;
        }else{
            return false;
        }   
    }

    public boolean subscribeTo(Mission newMission) {
        if(!subscribedMissions.contains(newMission)){
            subscribedMissions.add(newMission);
            return true;
        }else{
            return false;
        }  
    }
    
    public boolean removeMission(Mission mission){
        if(missions.contains(mission)){
            missions.remove(mission);
            return true;
        }else{
            return false;
        }   
    }
    public boolean unSubscribeMission(Mission mission){
        if(subscribedMissions.contains(mission)){
            subscribedMissions.remove(mission);
            return true;
        }else{
            return false;
        }
        
    }
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public File[] getFiles() {
        return files;
    }

    public void setFiles(File[] files) {
        this.files = files;
    }

    public List<Mission> getMissions() {
        return missions;
    }

    public void setMissions(List<Mission> missions) {
        this.missions = missions;
    }

    public List<Mission> getSubscribedMissions() {
        return subscribedMissions;
    }

    public void setSubscribedMissions(List<Mission> subscribedMissions) {
        this.subscribedMissions = subscribedMissions;
    }

    
    
}
