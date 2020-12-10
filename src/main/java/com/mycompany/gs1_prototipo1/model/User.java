package com.mycompany.gs1_prototipo1.model;


import java.awt.image.BufferedImage;
import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class User {


    private String firstName;
    private String lastName;
    private Login login;
    private String email;
    private String dateBorn;
    private String registeredDate;
    
    private String phone;
    private BufferedImage pictureLarge;
    private BufferedImage pictureMedium;
    private BufferedImage pictureThumbnail;
    private Location location;
  
  
    private Rating rating; //Sacaría una clase
    private Description description; 
    private List<File> files;//Xd en ningún momento hemos añadido en las historias el tema de las bases de datos
    
  
    private String gender;

    public User( String firstName, String lastName, Login login,String email, Location location, String dateBorn, String registeredDate, Description description, String gender, String phone, BufferedImage pictureLarge, BufferedImage pictureMedium, BufferedImage pictureThumbnail) {
       
        this.dateBorn=dateBorn;
        this.registeredDate=registeredDate;
        this.email=email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.location = location;
        this.rating=null;
        this.phone=phone;
       // this.rating Aquí se llama a metodo para utogenerar el rating en la  instanciación
        this.description = description;
        this.pictureMedium=pictureMedium;
        this.pictureLarge=pictureLarge;
        this.pictureThumbnail=pictureThumbnail;
        this.gender = gender;
        missions= new LinkedList<>();
        subscribedMissions= new LinkedList<>();
    }
    
    private List<Mission> missions;
    private List<Mission> subscribedMissions;
    
    public User(String name, String firstName, String lastName, Date age) {
 
        this.firstName=firstName;
        this.lastName=lastName;

        missions= new LinkedList<>();
        subscribedMissions= new LinkedList<>();
        
    }
    /*
     private static class Dob {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String date; 
        public Dob(String date) {
            this.date = date;
        }
    }

*/
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

    public String getName() {
      return firstName;
    }

    
    
}
