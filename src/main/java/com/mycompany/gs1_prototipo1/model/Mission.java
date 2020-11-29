package com.mycompany.gs1_prototipo1.model;

import com.mycompany.gs1_prototipo1.model.types.Label;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class Mission {
    private User owner;
    private List<User> subscribedUsers; 
    private final UUID missionId;
    private String description;
    private Date startDate;
    private Date endDate;
    private List<Label> labels;
    private Boolean inPerson; //No me gusta, directamente que lo tenga location?? (location tenga un tipo enum, según sea o no presencial)
    private Location location;
    
    //Constructor with all params
    public Mission(User owner, List<User> subscribedUsers, String description, Date startDate, Date endDate, List<Label> labels, Boolean inPerson, Location location) {
        this.owner = owner;
        this.subscribedUsers = subscribedUsers;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.labels = labels;
        this.inPerson = inPerson;
        this.location = location;
        subscribedUsers= new LinkedList<>();
        labels= new LinkedList<>();
        missionId=UUID.randomUUID();
    }
     //Constructor without subscribedUsers
    public Mission(User owner, String description, Date startDate, Date endDate, List<Label> labels, Boolean inPerson, Location location) {
        this.owner = owner;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.labels = labels;
        this.inPerson = inPerson;
        this.location = location;
        missionId=UUID.randomUUID();
        subscribedUsers= new LinkedList<>();
        labels= new LinkedList<>();
    }
    //Constructor just with owner
    public Mission(User owner){
        this.owner=owner;
        missionId=UUID.randomUUID();
        subscribedUsers= new LinkedList<>();
        labels= new LinkedList<>();
    }
    
    //Add-Remove Subscribed User
    public void addSubscribedUser(User user){
        subscribedUsers.add(user);
    }
    public void removeSubscribedUser(User user){
        subscribedUsers.remove(user);
    }
    
    //Add-Get Owner
    public void setOwner(User owner) {
        this.owner = owner;
    }
    public User getOwner() {
        return owner;
    }

  
    
    public void setSubscribedUsers(List<User> subscribedUsers) {
        this.subscribedUsers = subscribedUsers;
    }
    public List<User> getSubscribedUsers() {
        return subscribedUsers;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<Label> getLabels() {
        return labels;
    }

    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    public Boolean getInPerson() {
        return inPerson;
    }

    public void setInPerson(Boolean inPerson) {
        this.inPerson = inPerson;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
