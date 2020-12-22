/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gs1_prototipo1.handlers;

import com.mycompany.gs1_prototipo1.control.Control;
import com.mycompany.gs1_prototipo1.develop.Helper;
import com.mycompany.gs1_prototipo1.model.User;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterHandler {
    private static Pattern emailPattern=Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
  

    public static User registerUser(String username,String name, String lastName, String dateBorn,String email, String password, String password2 ){

        if(Control.getInstance().getAllMembers().containsUsername(username)){
            badUserInputHandler.userWithThisUserNameExists();
            return null;
        }
      
        if(username.equals("")){
            badUserInputHandler.invalidUsername();
            return null;
        }
        if(name.equals("")){
            badUserInputHandler.invalidName();
            return null;
        }
        if(lastName.equals("")){
           badUserInputHandler.invalidLast();
           return null; 
        }
      
       
        if(Control.getInstance().getAllMembers().containsMail(email)){
             badUserInputHandler.userWithThisUserNameExists();
             return null;
        }
        if(checkPass(password)){
            badUserInputHandler.weakPassword();
            return null;
        }
        
        if(!password.equals(password2)){
            badUserInputHandler.differentInputPasswords();
            return null;
        }
       
        if(!checkEmail(email)){
            badUserInputHandler.noValidEmail();
            return null;
        }
        if(!checkDateBorn(dateBorn)){
           badUserInputHandler.invalidDateBorn();
           return null;
        }
        
        User user= new User(username.trim(),name.trim(),lastName.trim(),dateBorn,email.trim(),password,Helper.getCurrentDate());
        return user;
    }
    
    private static boolean checkPass(String pass){
        if(pass.isEmpty()){
            return true;
        }
        return false;
    }
    private static boolean checkEmail(String email){
        Matcher matcher =emailPattern.matcher(email);
        return matcher.find();
       
    }
    private static boolean checkDateBorn(String date){
        return true;
    }
    
}
