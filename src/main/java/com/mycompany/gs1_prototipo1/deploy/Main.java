/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gs1_prototipo1.deploy;

import com.mycompany.gs1_prototipo1.control.Control;
import com.mycompany.gs1_prototipo1.develop.UserGenerator;
import com.mycompany.gs1_prototipo1.model.User;
import com.mycompany.gs1_prototipo1.view.pages.PersonalProfile;
import javax.swing.JFrame;

/**
 *
 * @author pabloantoniolopezmartin
 */
public class Main {
    public static void main(String args[]) throws InterruptedException{
        Control control = Control.getInstance();
        control.run();
        /*User genUser = UserGenerator.genUser();
        PersonalProfile personalProfile = new PersonalProfile(genUser);
        JFrame jFrame = new JFrame();
        jFrame.add(personalProfile);
        jFrame.setVisible(true);*/
    }
}
