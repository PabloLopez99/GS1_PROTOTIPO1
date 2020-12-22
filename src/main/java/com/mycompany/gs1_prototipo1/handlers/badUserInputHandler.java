package com.mycompany.gs1_prototipo1.handlers;

import com.mycompany.gs1_prototipo1.control.Control;

public class badUserInputHandler {
    public static void noUsername(){
        displayLoginWarning("Usuario no encontrado");
    }
    public static void badPassword(){
        displayLoginWarning("Contraseña incorrecta");
    }
    public static void differentInputPasswords(){
       displayRegisterWarning("Las contraseñas no coinciden");
    }
    public static void userWithThisEmailExists(){
       displayRegisterWarning("Este correo ya está registrado");
    }
    public static void userWithThisUserNameExists(){
        displayRegisterWarning("Este usuario ya está registrado");
    }
    public static void weakPassword(){
        displayRegisterWarning("Contraseña débil");
    }
    public static void noValidEmail(){
        displayRegisterWarning("Email inválido");
    }
    public static void invalidDateBorn(){
        displayRegisterWarning("Fecha de nacimiento inválida");
    }
    public static void invalidPhone(){
        displayRegisterWarning("Teléfono inválido");
    }
    public static void invalidName(){
        displayRegisterWarning("Nombre inválido");
    }
    public static void invalidLast(){
        displayRegisterWarning("Apellido inválido");
    }
    public static void invalidUsername() {
        displayRegisterWarning("Usuario inválido"); 
    }
    static void displayRegisterWarning(String text){
        Control.getInstance().getUiController().getRegister().setWarningLabel(text); 
    }
    static void displayLoginWarning(String text){
        Control.getInstance().getUiController().getWelcome().setWarningLabel(text); 
    }
}
