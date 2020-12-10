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
  

    public Login(String uid, String username, String passwd, String salt, String md5, String shal, String sha256) {
        this.uid = uid;
        this.username = username;
        this.passwd = passwd;
        this.salt = salt;
        this.md5 = md5;
        this.shal = shal;
        this.sha256 = sha256;
       
    }

   
  
}
