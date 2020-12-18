/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gs1_prototipo1.model;
import com.mycompany.gs1_prototipo1.model.types.Label;
import com.mycompany.gs1_prototipo1.model.types.Weekday;



import java.util.Date;
import java.util.List;

/**
 *
 * @author pabloantoniolopezmartin
 */
public class LongMission extends Mission {

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Weekday getDays() {
        return days;
    }

    public void setDays(Weekday days) {
        this.days = days;
    }
    private int duration;
    private Weekday days;
    public LongMission(int duration, Weekday days, User owner) {
        super(owner);
        this.duration = duration;
        this.days = days;
    }

    public LongMission(int duration, Weekday days, String title, User owner, String description, Date startDate, Date endDate, List<Label> labels, Boolean inPerson, Location location) {
        super(title,owner, description, startDate, endDate, labels, inPerson, location);
        this.duration = duration;
        this.days = days;
    }

    public LongMission(int duration, Weekday days, String title,User owner, List<User> subscribedUsers, String description, Date startDate, Date endDate, List<Label> labels, Boolean inPerson, Location location) {
        super(title,owner, subscribedUsers, description, startDate, endDate, labels, inPerson, location);
        this.duration = duration;
        this.days = days;
    }
   
}
