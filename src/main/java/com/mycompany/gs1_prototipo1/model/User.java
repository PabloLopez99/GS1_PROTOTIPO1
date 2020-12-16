package com.mycompany.gs1_prototipo1.model;


import com.mycompany.gs1_prototipo1.model.types.Label;
import com.mycompany.gs1_prototipo1.model.types.Weekday;
import java.awt.image.BufferedImage;
import java.io.File;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
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
    
  
    private List<Rating> ratings;
    private Description description; 
    private List<File> files;
    private List<Mission> missions;
    private List<Mission> subscribedMissions;
  
    private String gender;

    public User( String firstName, String lastName, Login login,String email, Location location, String dateBorn, String registeredDate, Description description, String gender, String phone, BufferedImage pictureLarge, BufferedImage pictureMedium, BufferedImage pictureThumbnail) {
       
        this.dateBorn=dateBorn;
        this.registeredDate=registeredDate;
        this.email=email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.location = location;
       // this.ratings=null;
        this.ratings=new LinkedList<Rating>();
        this.phone=phone;
       // this.rating Aquí se llama a metodo para utogenerar el rating en la  instanciación
        this.description = description;
        this.pictureMedium=pictureMedium;
        this.pictureLarge=pictureLarge;
        this.pictureThumbnail=pictureThumbnail;
        this.gender = gender;
        missions= new LinkedList<>();
        subscribedMissions= new LinkedList<>();
        files= new LinkedList<>();
    }
    
  
    
    public User(String firstName, String lastName, Date age) {
 
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
    
  
    
   
  


    public String getName() {
        return firstName;
    }
     public String getLastName() {
        return lastName;
    }

    
    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    
    public List<Rating> getRating() {
        return ratings;
    }
    public void addRating(Rating rating) {
        this.ratings.add(rating);
    }
    public int getMeanRating() {
       if(ratings.size() > 0){
           int meanRating = 0;
            for(int i = 0; i < ratings.size(); i++){
                meanRating += ratings.get(i).getPoints();
            }
            return meanRating/ratings.size(); 
        }
        return 0;
    }

   
    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
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

     public String getFirstName() {
      return firstName;
    }

    
    public Login getLogin(){
        return login;
    }
    public String getAge(){
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse(dateBorn, fmt);
        LocalDate ahora = LocalDate.now();

        Period periodo = Period.between(fechaNac, ahora);
        return String.valueOf(periodo.getYears());
    }

    public String getPhone() {
        return phone;
    }

    public BufferedImage getPictureLarge() {
        return pictureLarge;
    }

    public BufferedImage getPictureMedium() {
        return pictureMedium;
    }

    public BufferedImage getPictureThumbnail() {
        return pictureThumbnail;
    }
    public String getEmail(){
        return email;
    }
    public String[] getFilesName(){
        String[] fileNames;
        if(files.size() > 0){
            fileNames = new String[files.size()];
            for(int i = 0; i < files.size(); i++){
                fileNames[i] = files.get(i).getName();
            }  
        }else{
            fileNames = new String[1];
            fileNames[0] = "No se han subido archivos";
        }
        return fileNames;
    }
    
     public String[] getMissionName(){
        String[] missionNames;
        if(missions.size() > 0){
           missionNames = new String[missions.size()];
            for(int i = 0; i < missions.size(); i++){
                missionNames[i] = missions.get(i).getDescription();
            } 
        }else{
            missionNames = new String[1];
            missionNames[0] = "El usuario no ha creado ninguna mission";
        }
        return missionNames;
    }
    
    public String[] getSubscribedMissionName(){
        String[] missionNames = new String[subscribedMissions.size()];
        for(int i = 0; i < subscribedMissions.size(); i++){
            missionNames[i] = subscribedMissions.get(i).getDescription();
        }
        return missionNames;
    }
    public void addAvailability(Weekday weekday){
        description.addAvailability(weekday);
    }
    
    public void removeAvailability(Weekday weekday){
        description.removeAvailability(weekday);
    }
    
    public void addPreference(Label label){
        description.addPreferences(label);
    }
    
    public void removeAvailability(Label label){
        description.removePreferences(label);
    }


   
   

    public String getDateBorn() {
        return dateBorn;
    }
    
    
}
