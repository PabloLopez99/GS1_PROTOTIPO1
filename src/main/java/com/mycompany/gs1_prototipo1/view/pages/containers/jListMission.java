/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gs1_prototipo1.view.pages.containers;

import com.mycompany.gs1_prototipo1.control.*;
import com.mycompany.gs1_prototipo1.model.Mission;
import com.mycompany.gs1_prototipo1.view.MainFrame;
import com.mycompany.gs1_prototipo1.view.pages.MissionPage;
import com.mycompany.gs1_prototipo1.view.pages.Personalmission;
import java.util.LinkedList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ListSelectionModel;

/**
 *
 * @author AZAEL
 */
public class jListMission extends javax.swing.JPanel {

    private List<Mission> list;
    private final DefaultListModel<Mission> jListModel;


    /**
     * Creates new form jListMission
     */
    public jListMission() {
        //this.list=new LinkedList<Mission>();
        this.list=Control.getInstance().getAllMissions();
        jListModel=new DefaultListModel<>();
        for (Mission mission : list) {
            jListModel.addElement(mission);
        }
        initComponents();
        jList1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.setSize(this.getWidth(),125*jListModel.getSize());
    }
    public void setMissionList(LinkedList<Mission> customList){
        this.list=customList;
        jListModel.removeAllElements();
        for (Mission mission : list) {
            jListModel.addElement(mission);
        }
        this.updateUI();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setMaximumSize(getPreferredSize());
        setMinimumSize(getPreferredSize());
        setPreferredSize(new java.awt.Dimension(250, 300));

        jList1.setCellRenderer(new misionCellRender());
        jList1.setModel(jListModel);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        int selectedIndex = jList1.getSelectedIndex();
        Control.getInstance().getUiController().setMissionPage((jListModel.getElementAt(selectedIndex)));
      
    }//GEN-LAST:event_jList1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<Mission> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
