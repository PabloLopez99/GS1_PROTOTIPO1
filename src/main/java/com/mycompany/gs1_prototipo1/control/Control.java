/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gs1_prototipo1.control;

import com.mycompany.gs1_prototipo1.model.Mission;
import com.mycompany.gs1_prototipo1.model.User;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author pabloantoniolopezmartin
 */
public class Control {
    private static List<User> users;
    private static List<Mission> catalogo;
    private static List<Mission> removedMissions; //
    
    {
        this.users= new LinkedList<>();
        this.catalogo = new LinkedList<>();
        this.removedMissions= new LinkedList<>();
    }
    
    public static void addMission(Mission mission){
        catalogo.add(mission);
    }
    public static void removeMission(Mission mission){
        catalogo.remove(mission);
       removedMissions.add(mission);
    }
}
