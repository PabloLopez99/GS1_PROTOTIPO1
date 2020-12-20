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
         titles[0]= "Recogida de basura en las Canteras.";
         titles[1]= "Acompañamiento telefónico para persona mayor.";
         titles[2]= "Campaña recogida de alimentos.";
         titles[3]= "Compra a domicilio para persona dependiente.";
         titles[4]= "Compañía y ayuda a las personas sin techo de Mesa y López.";
         titles[5]= "Clases de matemáticas.";
         titles[6]= "Paseo nocturno de mascotas.";
         titles[7]= "Torneo benéfico.";
         titles[8]= "Charla sobre nuevas tecnologías para personas mayores.";
         titles[9]= "Clases de natación en mar abierto para niños.";
         descriptions= new String[10];
         descriptions[0]= "Recogida de basura en playa chica.";
         descriptions[1]= "Mantener una conversación telefónica con una persona mayor.";
         descriptions[2]= "Recogemos todo lo que no vayas a comerte.";
         descriptions[3]= "Ayuda para una persona que no puede hacer la compra por si sola.";
         descriptions[4]= "Recogemos todo tipo de ropa, alimentos, juguetes y demás cosas que no uses.";
         descriptions[5]= "Se ofrece apoyo para estudiantes de secundaria en matemáticas.";
         descriptions[6]= "Se solicita una persona para pasear a 3 perros grandes por la noche.";
         descriptions[7]= "Se celebra un torneo de fútbol, baloncesto y voleibol de carácter benéfico."
                 + " Todo lo recaudado será donado a UNICEF.";
         descriptions[8]= "Charla sobre ciberseguridad y otros aspectos importantes en esta era tecnológica.";
         descriptions[9]= "Se enseñará a los niños a aprender a flotar y a nadar por si solos.";
         locations = new Location[10];
         // public Location(Street street, String city, String state, String country, String postCode, Coordinate coordinates, String offset) {
         locations[0]= new Location(new Street(1,"Paseo de las Canteras"),"Las Palmas de Gran Canaria","Las Palmas","España","35007",new Coordinate(28.1400909,-15.4367679),"00:00");
         locations[1]= new Location(new Street(157,"Calle Leon y Castillo"),"Las Palmas de Gran Canaria","Las Palmas","España","35004",new Coordinate(28.1170621, -15.4231083),"00:00");
         locations[2]= new Location(new Street(14,"Calle José Miranda Guerra"),"Las Palmas de Gran Canaria","Las Palmas","España","35005",new Coordinate(28.1235699, -15.4289034),"00:00");
         locations[3]= new Location(new Street(6,"Calle Navarra"),"Telde","Las Palmas","España","35200",new Coordinate(27.9971900, -15.4157861),"00:00");
         locations[4]= new Location(new Street(38,"Calle Olof Palme"),"Las Palmas de Gran Canaria","Las Palmas","España","35010",new Coordinate(28.1335765, -15.4358688),"00:00");
         locations[5]= new Location(new Street(35,"Calle Tinoca"),"San Bartolomé de Tirajana","Las Palmas","España","35100",new Coordinate(27.7685839, -15.5844534),"00:00");
         locations[6]= new Location(new Street(9,"Calle Manuel de Ossuna"),"San Cristóbal de La Laguna","Santa Cruz de Tenerife","España","38202",new Coordinate(28.4881895, -16.3178500),"00:00");
         locations[7]= new Location(new Street(37,"Paseo de Tomás Morales"),"Las Palmas de Gran Canaria","Las Palmas","España","35003",new Coordinate(28.1108105, -15.4230446),"00:00");
         locations[8]= new Location(new Street(34,"Calle Pamochamoso"),"Las Palmas de Gran Canaria","Las Palmas","España","35004",new Coordinate(28.1151553, -15.4235799),"00:00");
         locations[9]= new Location(new Street(1,"Av. de Benito Pérez Armas"),"Santa Cruz de Tenerife","Santa Cruz de Tenerife","España","38007",new Coordinate(28.4585351, -16.2637202),"00:00");
         inPersons = new Boolean[10];
         inPersons[0]=true;
         inPersons[1]=false;
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
         a.add(Label.Educativo);
         labels[0]=a;
         
         a=  new LinkedList<Label>();
         a.add(Label.Social);
         a.add(Label.Cuidado_de_mayores);
         labels[1]=a;
         
         a=  new LinkedList<Label>();
         a.add(Label.Comunitario);
         a.add(Label.Apoyo_socio_sanitario);
         a.add(Label.Social);
         labels[2]=a;
         
         a=  new LinkedList<Label>();
         a.add(Label.Apoyo_socio_sanitario);
         a.add(Label.Social);
         a.add(Label.Cuidado_de_mayores);
         labels[3]=a;
         
         a=  new LinkedList<Label>();
         a.add(Label.Comunitario);
         a.add(Label.Apoyo_socio_sanitario);
         a.add(Label.Social);
         labels[4]=a;
         
         a=  new LinkedList<Label>();
         a.add(Label.Educativo);
         a.add(Label.Cuidado_de_menores);
         labels[5]=a;
         
         a=  new LinkedList<Label>();
         a.add(Label.Social);
         labels[6]=a;
         
         a=  new LinkedList<Label>();
         a.add(Label.Educativo);
         a.add(Label.Deportivo);
         a.add(Label.Social);
         labels[7]=a;
         
         a=  new LinkedList<Label>();
         a.add(Label.Social);
         a.add(Label.Cultural);
         a.add(Label.Educativo);
         a.add(Label.Cuidado_de_mayores);
         labels[8]=a;
         
         a=  new LinkedList<Label>();
         a.add(Label.Educativo);
         a.add(Label.Deportivo);
         a.add(Label.Cuidado_de_menores);
         labels[9]=a;
                  
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
