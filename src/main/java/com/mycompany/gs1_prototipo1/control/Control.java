/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gs1_prototipo1.control;

import com.mycompany.gs1_prototipo1.develop.UserGenerator;
import com.mycompany.gs1_prototipo1.model.Mission;
import com.mycompany.gs1_prototipo1.model.User;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author pabloantoniolopezmartin
 */
public class Control {
    private static Members members;
    private static List<Mission> catalogo;
    private  static List<Mission> removedMissions; //
    private static Control instance =null;

   
    
    public Control(){
        this.members= new Members();
  
        this.catalogo = new LinkedList<>();
        this.removedMissions= new LinkedList<>();
    }
    
    public void run() throws InterruptedException {
       UIController uiController= new UIController();
       loadTestUsers();
    }
    
    public static void addMission(Mission mission){
        catalogo.add(mission);
    }
    public static void removeMission(Mission mission){
        catalogo.remove(mission);
       removedMissions.add(mission);
    }
    public static Members getAllMembers(){
        return members;
    }
    public static Control getInstance(){
        if(instance==null){
            instance=new Control();
        }
        return instance;
    }

   

    private void loadTestUsers() throws InterruptedException {
         UserGenerator.generateUsers(100);
    }

  
}
