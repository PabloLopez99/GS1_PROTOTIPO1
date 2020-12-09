package com.mycompany.gs1_prototipo1.model;

import java.awt.image.BufferedImage;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Login {
    private String uid;
    private String username;
    private String passwd;
    private String salt;
    private String md5;
    private String shal;
    private String sha256;
    private Dob age;
    private Dob registered;
    private String phone;
    private BufferedImage pictureLarge;
    private BufferedImage pictureMedium;
    private BufferedImage pictureThumbnail;

    public Login(String uid, String username, String passwd, String salt, String md5, String shal, String sha256, Dob age, Dob registered, String phone, BufferedImage pictureLarge, BufferedImage pictureMedium, BufferedImage pictureThumbnail) {
        this.uid = uid;
        this.username = username;
        this.passwd = passwd;
        this.salt = salt;
        this.md5 = md5;
        this.shal = shal;
        this.sha256 = sha256;
        this.age = age;
        this.registered = registered;
        this.phone = phone;
        this.pictureLarge = pictureLarge;
        this.pictureMedium = pictureMedium;
        this.pictureThumbnail = pictureThumbnail;
    }

    private static class Dob {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String date; 
        public Dob(String date) {
            this.date = date;
        }
    }
  
}
