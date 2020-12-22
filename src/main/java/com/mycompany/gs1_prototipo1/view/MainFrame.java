
package com.mycompany.gs1_prototipo1.view;

import com.mycompany.gs1_prototipo1.control.Control;
import com.mycompany.gs1_prototipo1.view.pages.PersonalProfile;
import com.mycompany.gs1_prototipo1.view.pages.Login;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.UnsupportedLookAndFeelException;


public class MainFrame extends javax.swing.JFrame {

   
    private final Control control;

    public MainFrame() {
        initComponents();
        control = Control.getInstance();
        scrollPane.getVerticalScrollBar().setPreferredSize(new Dimension(0,0));
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    }
    public void setPage(JPanel pane){
        scrollPane.getVerticalScrollBar().setValue(0);
        displayPagePane.removeAll();
        displayPagePane.setLayout(new BoxLayout(displayPagePane, BoxLayout.PAGE_AXIS));
        Component[] components = buttonsPane.getComponents();
        if(pane instanceof Login) {
            for (Component component : components) {
                component.setVisible(false);
                
            }
            buttonsPane.setVisible(true);
        }else{
            for (Component component : components) {
                component.setVisible(true);
            }
        }
        displayPagePane.add(pane);
        displayPagePane.setPreferredSize(new Dimension(303, 1000));
        scrollPane.setVisible(true);
        displayPagePane.repaint();
        pack();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonsPane = new javax.swing.JPanel();
        homeIco = new javax.swing.JLabel();
        profileIco = new javax.swing.JLabel();
        ladderIco = new javax.swing.JLabel();
        scrollPane = new javax.swing.JScrollPane();
        displayPagePane = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(238, 237, 237));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        buttonsPane.setBackground(new java.awt.Color(255, 255, 204));
        buttonsPane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(231, 231, 179), 2, true));
        buttonsPane.setForeground(new java.awt.Color(255, 255, 204));
        buttonsPane.setMinimumSize(new java.awt.Dimension(229, 70));

        homeIco.setText("Home");
        homeIco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeIcoMouseClicked(evt);
            }
        });

        profileIco.setText("Profile");
        profileIco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileIcoMouseClicked(evt);
            }
        });

        ladderIco.setText("Ranking");

        javax.swing.GroupLayout buttonsPaneLayout = new javax.swing.GroupLayout(buttonsPane);
        buttonsPane.setLayout(buttonsPaneLayout);
        buttonsPaneLayout.setHorizontalGroup(
            buttonsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPaneLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(ladderIco)
                .addGap(66, 66, 66)
                .addComponent(homeIco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(profileIco)
                .addGap(49, 49, 49))
        );
        buttonsPaneLayout.setVerticalGroup(
            buttonsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeIco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ladderIco, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
            .addComponent(profileIco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        scrollPane.setPreferredSize(new java.awt.Dimension(303, 2500));

        displayPagePane.setPreferredSize(new java.awt.Dimension(303, 2500));

        javax.swing.GroupLayout displayPagePaneLayout = new javax.swing.GroupLayout(displayPagePane);
        displayPagePane.setLayout(displayPagePaneLayout);
        displayPagePaneLayout.setHorizontalGroup(
            displayPagePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 303, Short.MAX_VALUE)
        );
        displayPagePaneLayout.setVerticalGroup(
            displayPagePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2500, Short.MAX_VALUE)
        );

        scrollPane.setViewportView(displayPagePane);

        //scrollPane.setVerticalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonsPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonsPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void profileIcoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileIcoMouseClicked
        control.getUiController().setPersonalProfile(control.getLoggedUser());
        
    }//GEN-LAST:event_profileIcoMouseClicked

    private void homeIcoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeIcoMouseClicked
        control.getUiController().setPage("Catalog");
    }//GEN-LAST:event_homeIcoMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonsPane;
    private javax.swing.JPanel displayPagePane;
    private javax.swing.JLabel homeIco;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel ladderIco;
    private javax.swing.JLabel profileIco;
    private javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables
}
