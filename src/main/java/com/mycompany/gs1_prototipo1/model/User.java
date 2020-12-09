package com.mycompany.gs1_prototipo1.model;

import com.mycompany.gs1_prototipo1.model.types.Gender;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class User {
    private String name;
    private String passwd;
    private String firstName;
    private String lastName;
    private Login login;
    private Location location;
    private Date age; //Lo cambiaría por fecha de nacimiento
    private Rating rating; //Sacaría una clase
    private Description description; 
    private List<File> files;//Xd en ningún momento hemos añadido en las historias el tema de las bases de datos
    private BufferedImage profileImage; //Lo añadí
    private Gender gender;

    private List<Mission> missions;
    private List<Mission> subscribedMissions;
    
    public User(String name, String firstName, String lastName, Date age) {
        this.name = name;
        this.firstName=firstName;
        this.lastName=lastName;
        this.age = age;
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
    
    public void setProfileImage(BufferedImage profileImage) {
        this.profileImage = profileImage;
    }
    
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getAge() {
        return age;
    }

    public void setAge(Date age) {
        this.age = age;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = new Description(description);
    }

    public List<File> getFiles() {
        return files;
    }
    
    public void addFile(File file){
        files.add(file);
    }
    
    public void removeFile(File file){
        files.remove(file);
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
