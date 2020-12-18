package com.mycompany.gs1_prototipo1.model;

import com.mycompany.gs1_prototipo1.model.types.Label;
import com.mycompany.gs1_prototipo1.model.types.Weekday;
import java.util.ArrayList;
import java.util.List;

public class Description {
    private List<Weekday> availability;
    private List<Label> preferences;
    private String aboutMe;

    public Description(String aboutMe, List<Label>preferences, List<Weekday>availability) {
        this.aboutMe = aboutMe;
        this.availability = availability;
        this.preferences = preferences;
    }
    public Description(String aboutMe) {
        this.aboutMe = aboutMe;
        availability = new ArrayList<>();
        preferences = new ArrayList<>();
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
    public String preferencesToString(){
        String res = "Preferencias\n";
        if(preferences.size() > 0){
            for (int i = 0; i < preferences.size(); i++){
               res += preferences.get(i) + " ";
            }
        }else{
            res += "No especificado";
        }
        return res;
    }
    
    public String availabilityToString(){
        String res = "Disponibilidad\n";
        if(availability.size() > 0){
            for (int i = 0; i < availability.size(); i++){
               res += availability.get(i) + " ";
            }
        }else{
            res += "No especificado";
        } 
        return res;
    }
    @Override
    public String toString(){
        String res = "Disponibilidad\n";
        if(availability.size() > 0){
            for (int i = 0; i < availability.size(); i++){
               res += availability.get(i) + " ";
            }
        }else{
            res += "No especificado";
        }
        res += "\nPreferencias\n";
        if(preferences.size() > 0){
            for (int i = 0; i < preferences.size(); i++){
               res += preferences.get(i) + " ";
            }
        }else{
            res += "No especificado";
        }
        res += "\nSobre mi\n";
        res += aboutMe;
        return res;
    }
}
