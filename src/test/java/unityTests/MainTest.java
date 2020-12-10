/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unityTests;

import com.mycompany.gs1_prototipo1.control.MissionFactory;
import static com.mycompany.gs1_prototipo1.develop.ApiAdapter.sendGet;
import com.mycompany.gs1_prototipo1.develop.UserGenerator;

import com.mycompany.gs1_prototipo1.model.User;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONObject;
import org.json.JSONArray;

/**
 *
 * @author pabloantoniolopezmartin
 */
public class MainTest {
    public static void main(String args[]) throws IOException, InterruptedException{
       //String name, int age, String descriptio
       
       
        String res= sendGet("https://randomuser.me/api/");
       // System.out.println(res);
        JSONObject obj = new JSONObject(res);
      //  System.out.println(obj.toString());
       // JSONArray obbj=obj.getJSONArray("results");
       // System.out.println(obj);
    //    System.out.println(obj.getJSONArray("results").getJSONObject(0).getJSONObject("name").getString("first"));
       // obj.get(res);
       // System.out.println(obj.getJSONObject("results"));
       // System.out.println(obj.getJSONArray("results").getJSONObject(1).getString("first"));
     //   User user1 = new User(obj.getJSONArray("results").getJSONObject(1).getString("first"),"Pérez","Cobo",21,"Hola me llamo Juán");    
     //   MissionFactory.NewMission(owner, description, startDate, endDate, Boolean.TRUE, location, labels);
        try {
            UserGenerator.generateUsers(19);
        } catch (InterruptedException ex) {
           Logger.getLogger(MainTest.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
}
