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
import java.io.File;
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

    
    
    
    public UIController(){
 
        mainFrame= new MainFrame();
        catalog = new Catalog();
        ladder        = new Ladder();
        register= new Register();
        welcome= new Login();
        
        //personalProfile = new PersonalProfile(loggedUser);

        mainFrame.setVisible(true);
      
        mainFrame.setPage(welcome);
        //Control.getInstance().getLoggedUser().addFile(new File("/Users/pabloantoniolopezmartin/Documents/intellij_shortcuts.docx"));
        //setProfilePage(Control.getInstance().getLoggedUser());
    }
    
    public void setPage(String pageName){
       if(pageName.equals("PersonalProfile")){
            display(personalProfile);
       }else if(pageName.equals("Catalog")){
            display(catalog);
       }else if(pageName.equals("Ladder")){
            display(ladder);
       }else if(pageName.equals("Register")){
            display(register); 
       }else if(pageName.equals("PersonalMission")){
            display(personalMission);    
       }else if(pageName.equals("Welcome")){
            display(welcome);    
       }else if(pageName.equals("MissionPage")){
            display(missionPage);    
       }
   
    }
    public void setMissionPage(Mission mission){
        missionPage= new MissionPage(mission);
        mainFrame.setPage(missionPage);
        
    }
    public void setProfilePage(User user){
       
        publicProfile= new PublicProfile(user);
        mainFrame.setPage(publicProfile);
    }
     public void setPersonalMissions(User user){
        personalMission= new Personalmission(user);
        mainFrame.setPage(personalMission);
    }
    
    private void display(JPanel pane) {
        mainFrame.setPage(pane);
    }
    public void setPersonalProfile(User user){
        personalProfile = new PersonalProfile(user);
        mainFrame.setPage(personalProfile);
    }
    public MainFrame getMainFrame() {
        return mainFrame;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public Ladder getLadder() {
        return ladder;
    }

    public PersonalProfile getPersonalProfile() {
        return personalProfile;
    }

    public Register getRegister() {
        return register;
    }

      
    public MissionPage getMissionPage() {
        return missionPage;
    }

    public PublicProfile getPublicProfile() {
        return publicProfile;
    }

    public Login getWelcome() {
        return welcome;
    }

    public Personalmission getPersonalMission() {
        return personalMission;
    }
   
}
