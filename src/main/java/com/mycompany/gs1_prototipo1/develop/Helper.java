/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gs1_prototipo1.develop;

import com.mycompany.gs1_prototipo1.model.Coordinate;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;

/**
 *
 * @author pabloantoniolopezmartin
 */
public class Helper {
    public static BufferedImage getBufferedImage(String jpgLink){
         BufferedImage image = null;  
          try
          {  
              URL url = new URL(jpgLink);  
              image = ImageIO.read(url);

          } catch (IOException e) {  
              System.out.println("Unable to retrieve Image!!!");  
              e.printStackTrace();
          } 
          return image;
    }

    public static String getCurrentDate() {
        SimpleDateFormat formatter= new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date(System.currentTimeMillis());
        return formatter.format(date);
    }
}
