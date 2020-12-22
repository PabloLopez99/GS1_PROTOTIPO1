/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gs1_prototipo1.develop;

import com.mycompany.gs1_prototipo1.control.Control;
import com.mycompany.gs1_prototipo1.control.Members;
import static com.mycompany.gs1_prototipo1.develop.ApiAdapter.sendGet;
import com.mycompany.gs1_prototipo1.model.Coordinate;
import com.mycompany.gs1_prototipo1.model.Location;
import com.mycompany.gs1_prototipo1.model.Login;
import com.mycompany.gs1_prototipo1.model.Street;
import com.mycompany.gs1_prototipo1.model.User;
import com.mycompany.gs1_prototipo1.model.Description;
import com.mycompany.gs1_prototipo1.model.types.Label;
import com.mycompany.gs1_prototipo1.model.types.Weekday;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONObject;


public class UserGenerator {
    private static int count;
    private static final Description[] descriptions;
    //TEMPLATES
    static{
        descriptions= new Description[10];
        
        List preferences= new LinkedList<Label>();
        List preferences1= new LinkedList<Label>();
        List preferences2= new LinkedList<Label>();
        List preferences3= new LinkedList<Label>();
        List preferences4= new LinkedList<Label>();
        List preferences5= new LinkedList<Label>();
        List preferences6= new LinkedList<Label>();
        
        preferences.add(Label.Ambiental);
        preferences.add(Label.Comunitario);
        
        preferences1.add(Label.Educativo);
        preferences1.add(Label.Deportivo);
        preferences1.add(Label.Social);
        
        preferences2.add(Label.Cultural);
        preferences2.add(Label.Social);
        preferences2.add(Label.Educativo);
        
        preferences3.add(Label.Ambiental);
        
        preferences4.add(Label.Cuidado_de_mayores);
        preferences4.add(Label.Cuidado_de_menores);
        
        preferences5.add(Label.Comunitario);
        preferences5.add(Label.Apoyo_socio_sanitario);
        preferences5.add(Label.Cultural);
        
        preferences6.add(Label.Apoyo_socio_sanitario);
        preferences6.add(Label.Cuidado_de_mayores);
        preferences6.add(Label.Comunitario);
        preferences6.add(Label.Social);
        
        List availability= new LinkedList<Weekday>();
        List availability1= new LinkedList<Weekday>();
        List availability2= new LinkedList<Weekday>();
        List availability3= new LinkedList<Weekday>();
        List availability4= new LinkedList<Weekday>();
        List availability5= new LinkedList<Weekday>();
        List availability6= new LinkedList<Weekday>();
        
        availability.add(Weekday.Jueves);
        availability.add(Weekday.Miercoles);
        
        availability1.add(Weekday.Viernes);
        availability1.add(Weekday.Sabado);
        availability1.add(Weekday.Domingo);
        
        availability2.add(Weekday.Lunes);
        availability2.add(Weekday.Martes);
        availability2.add(Weekday.Miercoles);
        availability2.add(Weekday.Jueves);
        availability2.add(Weekday.Viernes);
        availability2.add(Weekday.Sabado);
        availability2.add(Weekday.Domingo);
        
        availability3.add(Weekday.Lunes);
        
        availability4.add(Weekday.Martes);
        availability4.add(Weekday.Jueves);
        
        availability5.add(Weekday.Lunes);
        availability5.add(Weekday.Miercoles);
        availability5.add(Weekday.Viernes);
        
        availability6.add(Weekday.Lunes);
        availability6.add(Weekday.Martes);
        availability6.add(Weekday.Miercoles);
        availability6.add(Weekday.Jueves);
        availability6.add(Weekday.Viernes);
        
        descriptions[0]=new Description("Soy una persona muy amable y atenta, me encanta ayudar a los demás",preferences4,availability);
        descriptions[1]=new Description("Estoy disponible siempre!",preferences1,availability2);
        descriptions[2]=new Description("Soy una persona dispuesta a ayudar en cualquier circunstancia",new LinkedList<Label>(),availability2);
        descriptions[3]=new Description("Sin medio de transporte, solo misiones cercanas",preferences2,availability1);
        descriptions[4]=new Description("Soy una persona tranquila y trabajadora",preferences6,availability4);
        descriptions[5]=new Description("Simplemente me aburro y las misiones me mantienen entretenido",preferences6,availability6);
        descriptions[6]=new Description("Solo disponible por las tardes",preferences5,availability5);
        descriptions[7]=new Description("Atentos a mi perfil. Publico una misión semanalmente!",preferences3,availability3);
        descriptions[8]=new Description("Salvemos el planeta!! Aún no es demasiado tarde!!",preferences,availability4);
        descriptions[9]=new Description("Listo para ayudar",preferences5,availability6);
    }
    public static void generateUsers(int ammount) throws InterruptedException{
        Members members= Control.getInstance().getAllMembers();
        for (int i = 0; i < ammount; i++) {
            User user= genUser();
            if(user!=null){
                members.addMember(user);
                System.out.println("USUARIO AUTOGENERADO N:"+i);
                System.out.println("NOMBRE: "+user.getFirstName());
                System.out.println("USERNAME: "+user.getLogin().getUsername());
                System.out.println("PASSWORD: "+user.getLogin().getPasswd()+"\n");
           } 
        }
        genPersonalInfo();
    }
    public static User genUser() throws InterruptedException{
        User user=null;
        try {
            JSONObject response = new JSONObject(sendGet("https://randomuser.me/api/")).getJSONArray("results").getJSONObject(0);
            JSONObject login = response.getJSONObject("login");
            JSONObject location = response.getJSONObject("location");
            user = new User(
                            response.getJSONObject("name").getString("first"),
                            response.getJSONObject("name").getString("last"), 
                            new Login(login.getString("uuid"), 
                                      login.getString("username"), 
                                      login.getString("password"), 
                                      login.getString("salt"), 
                                      login.getString("md5"), 
                                      login.getString("sha1"), 
                                      login.getString("sha256")), 
                            response.getString("email"),
                            new Location(new Street(location.getJSONObject("street").getInt("number"),
                                                    location.getJSONObject("street").getString("name")),
                                         location.getString("city"),
                                         location.getString("state"),
                                         location.getString("country"),
                                         location.get("postcode").toString(),
                                         new Coordinate(Float.parseFloat(location.getJSONObject("coordinates").getString("latitude")),
                                                        Float.parseFloat(location.getJSONObject("coordinates").getString("longitude"))),
                                         location.getJSONObject("timezone").getString("offset")),
                            response.getJSONObject("dob").getString("date").substring(0, response.getJSONObject("dob").getString("date").indexOf('T')-1),
                            response.getJSONObject("registered").getString("date").substring(0, response.getJSONObject("dob").getString("date").indexOf('T')-1),           
                            descriptions[(int) (Math.random() * 9)], 
                            response.getString("gender"),
                            response.getString("phone"),
                            Helper.getBufferedImage(response.getJSONObject("picture").getString("large")),
                            Helper.getBufferedImage(response.getJSONObject("picture").getString("medium")),
                            Helper.getBufferedImage(response.getJSONObject("picture").getString("thumbnail")));
        } catch (Exception ex) {
            count++;
            if(count>30){
                ex.printStackTrace();
            }else{
                return genUser(); 
            }
        }
       return user;
    }

    private static void genPersonalInfo() {
        for (int i = 0; i <  Control.getInstance().getAllMembers().getActiveMembers().size(); i++) {
            Control.getInstance().getAllMembers().getActiveMembers().get(i).setDescription(descriptions[i%descriptions.length]);
        }
    }     
}