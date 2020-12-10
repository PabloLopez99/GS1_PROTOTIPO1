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
   
    
        String res= sendGet("https://randomuser.me/api/");
     
        JSONObject obj = new JSONObject(res);

        try {
            UserGenerator.generateUsers(100);
        } catch (InterruptedException ex) {
           Logger.getLogger(MainTest.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("pepese");
        }
    }
}
