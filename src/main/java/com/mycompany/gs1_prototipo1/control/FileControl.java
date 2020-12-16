package com.mycompany.gs1_prototipo1.control;

import java.awt.Desktop;
import java.io.*;

public class FileControl {
    
    public static void open(File file){
        try{
            if(!Desktop.isDesktopSupported()){
                System.out.println("Not supported");
                return;
            }
            Desktop desktop = Desktop.getDesktop();
            desktop.open(file);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
