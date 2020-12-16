/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gs1_prototipo1.handlers;

import com.mycompany.gs1_prototipo1.control.Control;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author pabloantoniolopezmartin
 */
public class RegisterHandler {
    private static Pattern emailPattern=Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    

   
    public boolean registerUser(String username,String email, String password, String password2 ){
        
        if(Control.getInstance().getAllMembers().containsUsername(username)){
            badUserInputHandler.userWithThisUserNameExists();
            return false;
        }
        if(Control.getInstance().getAllMembers().containsMail(email)){
             badUserInputHandler.userWithThisUserNameExists();
             return false;
        }
        if(checkPass(password)){
            badUserInputHandler.weakPassword();
            return false;
        }
        if(!password.equals(password2)){
            badUserInputHandler.differentInputPasswords();
            return false;
        }
        
        
        
        
        return true;
    }
    
    private boolean checkPass(String pass){
        //if weak return false
        return true;
    }
    private boolean checkEmail(String email){
        Matcher matcher =emailPattern.matcher(email);
        return matcher.find();
       
    }
    
}
