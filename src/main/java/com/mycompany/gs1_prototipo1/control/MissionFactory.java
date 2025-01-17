
package com.mycompany.gs1_prototipo1.control;

import com.mycompany.gs1_prototipo1.model.types.Label;
import com.mycompany.gs1_prototipo1.model.*;
import com.mycompany.gs1_prototipo1.model.types.Weekday;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;


public class MissionFactory {
    //LLAMARLO QUIZÁS MISSIONCONTRL EN LUGAR DE FACTORY?
    
    //CONSTRUCTORES
    public static void NewMission(String title,User owner,List<User> subscribedUsers,String description, Date startDate, Date endDate, Boolean inPerson, Location location, List<Label> labels){
       Mission newMission = new Mission(title,owner,subscribedUsers,description,startDate,endDate,labels,inPerson,location);
       owner.addMission(newMission);
       subscribeUsers(subscribedUsers,newMission); //Suscribe a los usuarios en la misión
       Control.getInstance().addMission(newMission);
    }
    //Without subscribedUsers List
    public static void NewMission(String title,User owner,String description, Date startDate, Date endDate, Boolean inPerson, Location location, List<Label> labels){
       Mission newMission = new Mission(title,owner,description,startDate,endDate,labels,inPerson,location);
       owner.addMission(newMission);
       Control.getInstance().addMission(newMission);
    }
    
    public static void NewMission(String title,User owner,String description, Date startDate, Date endDate, Boolean inPerson, Location location, List<Label> labels, List<Weekday> weekdays, int duration){
       LongMission newMission = new LongMission(duration, weekdays, title,owner,description,startDate,endDate,labels,inPerson,location);
       owner.addMission(newMission);
       Control.getInstance().addMission(newMission);
    }
    
 
    //MÉTODOS DE ALTO NIVEL PARA EL CRUD DE MISIÓN:
    
   
    public static void subscribeToMission(Mission mission, User user){
        user.subscribeTo(mission);
        mission.addSubscribedUser(user);
    }
    public static void unsubscribeToMission(Mission mission, User user){
        mission.removeSubscribedUser(user);
        user.unSubscribeMission(mission);
    }
    
    public static void removeMission(Mission mission){
        removeAllSubscribed(mission);
        mission.getOwner().removeMission(mission);
        //allMissions.remove(mission);
        Control.getInstance().removeMission(mission); 
       // removedMissions.add(mission);
     
    }
    private static void removeAllSubscribed(Mission mission){
        for (int i = 0; i < mission.getSubscribedUsers().size(); i++) {
            mission.getSubscribedUsers().get(i).unSubscribeMission(mission); 
        }
        //En este momento se tendría que generar una notificación para avisar al os usuarios de que la
        //misión a la que estabn suscritos ya no existe
    }
    
    private static void subscribeUsers(List<User>subscribedUsers,Mission newMission){
        for (int i = 0; i < subscribedUsers.size(); i++) {
           subscribedUsers.get(i).subscribeTo(newMission);
           
       }
    }
    
}

