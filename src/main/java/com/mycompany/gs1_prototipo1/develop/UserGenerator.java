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
import java.io.IOException;
import java.util.Date;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONObject;

/**
 *
 * @author pabloantoniolopezmartin
 */
public class UserGenerator {
      
     //It adds users to members
    private static int count;
    public static void generateUsers(int ammount) throws InterruptedException{
      
        Members members= Control.getInstance().getAllMembers();
       
        for (int i = 0; i < ammount; i++) {
            User user= genUser();
            
          
           if(user!=null){
                members.addMember(user);
                 System.out.println("USUARIO AUTOGEn N:"+i+"\n");
          
            System.out.println(user.getName());
            System.out.println("");
           }
           
            
        }
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
           
                                new Description("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris"), 
                                response.getString("gender"),
                                response.getString("phone"),
                                Helper.getBufferedImage(response.getJSONObject("picture").getString("large")),
                                Helper.getBufferedImage(response.getJSONObject("picture").getString("medium")),
                                Helper.getBufferedImage(response.getJSONObject("picture").getString("thumbnail")));
                                
                           
        } catch (Exception ex) {
            count++;
            if(count>30){ //Se pone umbral para que no entre en bucle infinito
                ex.printStackTrace();
            }else{
                return genUser(); //Debido a que en ocasiones, la api devuelve error 503 (api gratis) se usa recursividad
            }
           
        }
       return user;
    }
      
}
