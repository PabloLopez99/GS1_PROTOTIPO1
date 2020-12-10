package com.mycompany.gs1_prototipo1.control;

import com.mycompany.gs1_prototipo1.model.User;
import java.util.ArrayList;
import java.util.List;

public class Members {
    private final List<User> active;
    private final List<User> total;

    public Members() {
        active = new ArrayList<>();
        total = new ArrayList<>();
    }
    
    public void addMember(User user){
        if (!total.contains(user)){
            total.add(user);
            active.add(user);
        }
    }
    
    public void deleteMember(User user){
        total.remove(user);
        active.remove(user);
    }
    
    public void hideUser(User user){
        active.remove(user);
    }
    
    public void displayUser(User user){
        if(!active.contains(user) && total.contains(user)){
            active.add(user);
        }
    }
    
}
