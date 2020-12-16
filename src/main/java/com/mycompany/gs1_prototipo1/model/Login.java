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
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public String getShal() {
        return shal;
    }

    public void setShal(String shal) {
        this.shal = shal;
    }

    public String getSha256() {
        return sha256;
    }

    public void setSha256(String sha256) {
        this.sha256 = sha256;
    }
   

   
  
}
