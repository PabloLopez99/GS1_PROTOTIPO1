/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gs1_prototipo1.develop;

import com.mycompany.gs1_prototipo1.model.Coordinate;
import java.awt.Dimension;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
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
    
    public static BufferedImage checkSize(BufferedImage image, int h, int w){
        if(image.getWidth()>w || image.getHeight()>h ){
            double widthCoeficient= image.getWidth()/113.;
            double heightCoeficient= image.getHeight()/88;
            image= rescale(image, widthCoeficient, heightCoeficient);
        }
        return image;
       
    } 
    
    public static BufferedImage rescale(BufferedImage image, double widthCoeficient, double heightCoeficient){
        BufferedImage before = image;
        int w = before.getWidth();
        int h = before.getHeight();
        double coeficient;
        BufferedImage after = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        AffineTransform at = new AffineTransform();
        if(widthCoeficient>heightCoeficient){
           coeficient=widthCoeficient;
        }else{
           coeficient=heightCoeficient;
        }
        at.scale(1/coeficient, 1/coeficient);
        AffineTransformOp scaleOp = new AffineTransformOp(at, AffineTransformOp.TYPE_BILINEAR);
        after = scaleOp.filter(before, after);
        int newWidth = new Double(image.getWidth() * 1/coeficient).intValue();
        int newHeight = new Double(image.getHeight() * 1/coeficient).intValue();
        Dimension dim = new Dimension(newWidth,newHeight);
     
     
        return after;
    }
}
