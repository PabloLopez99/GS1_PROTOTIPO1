/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gs1_prototipo1.develop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import org.json.JSONException;

/**
 *
 * @author pabloantoniolopezmartin
 */
public class ApiAdapter {
     public static String sendGet(String recurso) throws IOException, InterruptedException {
            String res="";
            //try{
                URL url = new URL(recurso);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                conn.setRequestProperty("Accept", "application/json");

                if (conn.getResponseCode() != 200) {
                        throw new RuntimeException("Failed : HTTP error code : "
                                        + conn.getResponseCode());
                }

                BufferedReader br = new BufferedReader(new InputStreamReader(
                                (conn.getInputStream())));

                String output;
             
               // System.out.println("Output from Server .... \n");
                while ((output = br.readLine()) != null) {
                       // System.out.println(output);
                        res+=output;
                      
                }

                conn.disconnect();

         //   }catch(MalformedURLException | ProtocolException | RuntimeException e){
             
             
                  //  Thread.sleep(2000);
                    //sendGet(recurso);
                
              
          //  }
     
            return res;
	}
}
