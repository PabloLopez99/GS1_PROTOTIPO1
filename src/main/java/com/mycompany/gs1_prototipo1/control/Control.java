/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gs1_prototipo1.control;

import com.mycompany.gs1_prototipo1.develop.MissionGenerator;
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
    private  Members members;
    private  List<Mission> catalogo;
    private   List<Mission> removedMissions; //
    private static Control instance =null;
    private  UIController uiController;
    private User loggedUser;
    
    public Control(){
        this.members= new Members(); 
        this.catalogo = new LinkedList<>();
        this.removedMissions= new LinkedList<>();
        
    }

    public List<Mission> getCatalogo() {
        return catalogo;
    }
    
    public void run() throws InterruptedException { //OJO TIENEN Q GENERARSE MINIMO LA MISMA CANTIDAD DE USUARIOS QUE DE MISIONES
       
        loadTestUsers();
        loadTestMissions();

         uiController= new UIController();
    }
    public  UIController getUiController(){ 
        return uiController;
    }
    public Boolean setLoggedUser(User user){
      
        if(members.containsUser(user)){
             loggedUser=user;
             
             return true;
        }
        return false;  
    }
    public User getLoggedUser(){
        return loggedUser;
    }
    
    public  void addMission(Mission mission){
        catalogo.add(mission);
    }
    public  void removeMission(Mission mission){
        catalogo.remove(mission);
       removedMissions.add(mission);
    }
    public  Members getAllMembers(){
        return members;
    }
    public static Control getInstance(){
        if(instance==null){
            instance=new Control();
        }
        return instance;
    }

    public  List getAllMissions(){
        return catalogo;
    }
   

    private void loadTestUsers() throws InterruptedException {
         UserGenerator.generateUsers(5);
         //loggedUser=members.getActiveMembers().get(0);
    }
    private void loadTestMissions(){
        MissionGenerator.generateMissions(5);
    }
   
}
