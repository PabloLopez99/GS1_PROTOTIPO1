/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gs1_prototipo1.control;

import com.mycompany.gs1_prototipo1.model.Mission;
import com.mycompany.gs1_prototipo1.view.pages.MissionPage;
import com.mycompany.gs1_prototipo1.model.User;
import com.mycompany.gs1_prototipo1.view.pages.Catalog;
import com.mycompany.gs1_prototipo1.view.pages.Register;
import com.mycompany.gs1_prototipo1.view.pages.Ladder;
import com.mycompany.gs1_prototipo1.view.MainFrame;
import com.mycompany.gs1_prototipo1.view.pages.PersonalProfile;
import com.mycompany.gs1_prototipo1.view.pages.PublicProfile;
import com.mycompany.gs1_prototipo1.view.pages.Login;
import com.mycompany.gs1_prototipo1.view.pages.Personalmission;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author pabloantoniolopezmartin
 */
public class UIController {
    private MainFrame mainFrame;
    private Catalog catalog;
    private Ladder ladder;
    private PersonalProfile personalProfile;
    private Register register;
    private MissionPage missionPage;
    private PublicProfile publicProfile;
    private Login welcome;
    private Personalmission personalMission;
    
    public UIController(User loggedUser){
 
        mainFrame= new MainFrame();
        catalog = new Catalog();
        ladder= new Ladder();
        register= new Register();
        welcome= new Login();
        
        personalProfile = new PersonalProfile(loggedUser);
        personalMission= new Personalmission(loggedUser);
        mainFrame.setVisible(true);
        //setPage("Welcome");
        //setPersonalProfile();
       // setPersonalMissions();
        setProfilePage(loggedUser);
    }
    
    public void setPage(String pageName){
        switch(pageName){
            case "PersonalProfile":
                display(personalProfile);
            case "Catalog":
                display(catalog);
            case "Ladder":
                display(ladder);
            case "Welcome":
                display(welcome);
            case "Register":
                display(register);
            
            case "PersonalMission":
                display(personalMission);    
            case "MissionPage":
                display(missionPage);    
        }
            
       
    }
    public void setMissionPage(Mission mission){
        missionPage= new MissionPage(mission);
        
    }
    public void setProfilePage(User user){
        publicProfile= new PublicProfile(user);
        mainFrame.setPage(publicProfile);
    }
     public void setPersonalMissions(){
        mainFrame.setPage(personalMission);
    }
    
    private void display(JPanel pane) {
        mainFrame.setPage(pane);
    }
    private void setPersonalProfile(){
    
        mainFrame.setPage(personalProfile);
    }
   
}
