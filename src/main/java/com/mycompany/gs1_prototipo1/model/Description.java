package com.mycompany.gs1_prototipo1.model;

import com.mycompany.gs1_prototipo1.model.types.Label;
import com.mycompany.gs1_prototipo1.model.types.Weekday;
import java.util.ArrayList;
import java.util.List;

class Description {
    private List<Weekday> availability;
    private List<Label> preferences;
    private String aboutMe;

    public Description(String aboutMe) {
        this.aboutMe = aboutMe;
        availability = new ArrayList<>();
        availability = new ArrayList<>();
    }

    public List<Weekday> getAvailability() {
        return availability;
    }

    public List<Label> getPreferences() {
        return preferences;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void addAvailability(Weekday weekday) {
        if(this.availability.contains(weekday)) return;
        this.availability.add(weekday);
    }

    public void addPreferences(Label label) {
        if(this.preferences.contains(label)) return;
        this.preferences.add(label);
    }
    
    public void removeAvailability(Weekday weekday) {
        this.availability.remove(weekday);
    }

    public void removePreferences(Label label) {
        this.preferences.remove(label);
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }
}
