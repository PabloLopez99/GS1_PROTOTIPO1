/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gs1_prototipo1.develop;

import com.mycompany.gs1_prototipo1.control.Control;

import com.mycompany.gs1_prototipo1.control.MissionFactory;
import com.mycompany.gs1_prototipo1.model.Coordinate;
import com.mycompany.gs1_prototipo1.model.Location;

import com.mycompany.gs1_prototipo1.model.Street;
import com.mycompany.gs1_prototipo1.model.User;
import com.mycompany.gs1_prototipo1.model.types.Label;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author pabloantoniolopezmartin
 */
public class MissionGenerator {
     private static String[] titles;
     private static String[] descriptions;
     private static Location[] locations;
     private static Boolean[] inPersons;
     private static List<Label>[] labels;
     private static List<User> members;
     private static int ammount;
     
     //Aquí se crean las 10 plantillas
     static{
         titles= new String[10];
         titles[0]="Recogida de basura en las Canteras";
         titles[1]="Acompañamiento telefónico para persona mayor";
         titles[2]="Campaña recogida de alimentos";
         titles[3]="Compra a domicilio para persona dependiente";
         titles[4]="Compañía y ayuda a las personas sin techo de mesa y lópez";
         titles[5]="Clases de matemáticas para m";
         titles[6]="";
         titles[7]="";
         titles[8]="";
         titles[9]="";
         descriptions= new String[10];
         descriptions[0]="Recogida de basura en playa chica";
         descriptions[1]="";
         descriptions[2]="";
         descriptions[3]="";
         descriptions[4]="";
         descriptions[5]="";
         descriptions[6]="";
         descriptions[7]="";
         descriptions[8]="";
         descriptions[9]="";
         locations = new Location[10];
         // public Location(Street street, String city, String state, String country, String postCode, Coordinate coordinates, String offset) {
         locations[0]= new Location(new Street(1,"Paseo de las Canteras"),"Las Palmas de Gran Canaria","Las Palmas","España","35007",new Coordinate(28.1400909,-15.4367679),"00:00");
         locations[1]= new Location(new Street(1,"a"),"","","","",new Coordinate(10,20),"a");
         locations[2]= new Location(new Street(1,"a"),"","","","",new Coordinate(10,20),"a");
         locations[3]= new Location(new Street(1,"a"),"","","","",new Coordinate(10,20),"a");
         locations[4]= new Location(new Street(1,"a"),"","","","",new Coordinate(10,20),"a");
         locations[5]= new Location(new Street(1,"a"),"","","","",new Coordinate(10,20),"a");
         locations[6]= new Location(new Street(1,"a"),"","","","",new Coordinate(10,20),"a");
         locations[7]= new Location(new Street(1,"a"),"","","","",new Coordinate(10,20),"a");
         locations[8]= new Location(new Street(1,"a"),"","","","",new Coordinate(10,20),"a");
         locations[9]= new Location(new Street(1,"a"),"","","","",new Coordinate(10,20),"a");
         inPersons = new Boolean[10];
         inPersons[0]=true;
         inPersons[1]=true;
         inPersons[2]=true;
         inPersons[3]=true;
         inPersons[4]=true;
         inPersons[5]=true;
         inPersons[6]=true;
         inPersons[7]=true;
         inPersons[8]=true;
         inPersons[9]=true;
         labels= new List[10];
       
         List a=  new LinkedList<Label>();
         a.add(Label.Ambiental);
         a.add(Label.Cuidado_de_mayores);
         labels[0]=a;
         a=  new LinkedList<Label>();
         a.add(Label.Ambiental);
         a.add(Label.Cuidado_de_mayores);
         labels[1]=a;
         a=  new LinkedList<Label>();
         a.add(Label.Ambiental);
         a.add(Label.Cuidado_de_mayores);
         labels[2]=a;
         a=  new LinkedList<Label>();
         a.add(Label.Ambiental);
         a.add(Label.Cuidado_de_mayores);
         labels[3]=a;
         a=  new LinkedList<Label>();
         a.add(Label.Ambiental);
         a.add(Label.Cuidado_de_mayores);
         labels[4]=a;
         a=  new LinkedList<Label>();
         a.add(Label.Ambiental);
         a.add(Label.Cuidado_de_mayores);
         labels[5]=a;
         a=  new LinkedList<Label>();
         a.add(Label.Ambiental);
         a.add(Label.Cuidado_de_mayores);
         labels[6]=a;
         a=  new LinkedList<Label>();
         a.add(Label.Ambiental);
         a.add(Label.Cuidado_de_mayores);
         labels[7]=a;
         a=  new LinkedList<Label>();
         a.add(Label.Ambiental);
         a.add(Label.Cuidado_de_mayores);
         labels[8]=a;
         a=  new LinkedList<Label>();
         a.add(Label.Ambiental);
         a.add(Label.Cuidado_de_mayores);
         labels[9]=a;
         a=  new LinkedList<Label>();
         a.add(Label.Ambiental);
         a.add(Label.Cuidado_de_mayores);
         
     }
     public static void generateMissions(int a){ 
         MissionGenerator.ammount=a;
         members= Control.getInstance().getAllMembers().getActiveMembers();
         for (int i = 0; i < ammount; i++) {
             Date startDate= genStartDate(i);
             MissionFactory.NewMission(getTitle(i),members.get(i), genSuscribedUsers(members.get(i)), genDescription(i), startDate,  genEndDate(startDate), genInPerson(i), genLocation(i), genLabels(i));
         }
         
     }
     
     
     
     
     private static List<User> genSuscribedUsers(User owner){
         List<User> users= new LinkedList<User>();
         int randomNum = ThreadLocalRandom.current().nextInt(1, 4 + 1); //Cantidad de usuarios suscritos que va a tener la misión, le summo la cantidad de misiones que se han generado para
         for (int i = 0; i < randomNum; i++) { 
             Random rand = new Random();
             User user =members.get(rand.nextInt(members.size()));
             
             if(!user.equals(owner)){ //Aquí se comprueba de que el usuario seleccionado no sea el dueño de la misión (no puede suscribirse a su propia misión)
                users.add(user);
             }    
         }
     
         return users;
         
     }
     private static String genDescription(int i){
         return descriptions[i%descriptions.length];
     }
     private static Date genStartDate(int i){
         return new Date();
     }
     private static Date genEndDate(Date startDate){
         return new Date();
     }
     private static Boolean genInPerson(int i){
         return inPersons[i%inPersons.length];
     }
     private static Location genLocation(int i){
         return locations[i%locations.length];
     }
     private static List<Label> genLabels(int i){
         return labels[i%labels.length];
     }

    private static String getTitle(int i) {
        return titles[i%titles.length];
    }
}
