/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gs1_prototipo1.handlers;

import com.mycompany.gs1_prototipo1.control.Control;
import com.mycompany.gs1_prototipo1.model.User;

/**
 *
 * @author pabloantoniolopezmartin
 */
public class AuthHandler {
    
    
    
    
    public static User checkUser(String input, String password){
        
        User user= Control.getInstance().getAllMembers().getUserByMailAndUsername(input);
        if(user==null){
            badUserInputHandler.noUsername();
            return null;
        }
        if(user.getLogin().getPasswd().equals(password)){
            return user;
        }
        badUserInputHandler.badPassword();
        return null;
       
    }
}
