/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gs1_prototipo1.view.pages.containers;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

/**
 *
 * @author AZAEL
 */
public class misionCellRender extends DefaultListCellRenderer{
    private Font font = new Font("helvitica", Font.BOLD, 24);  //controll.getFont();
    
    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        Color bgColor=Color.WHITE;
        if(index%2==0) bgColor=Color.CYAN;
        Component comp=new MissionCell(value, bgColor);
        return comp;
    }
    
    
}
