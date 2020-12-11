/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gs1_prototipo1.deploy;

import com.mycompany.gs1_prototipo1.control.Control;

/**
 *
 * @author pabloantoniolopezmartin
 */
public class Main {
    public static void main(String args[]) throws InterruptedException{
        Control control = Control.getInstance();
        control.run();
    }
}
