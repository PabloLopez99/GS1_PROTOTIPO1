/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gs1_prototipo1.view.pages;

import com.mycompany.gs1_prototipo1.model.Description;
import com.mycompany.gs1_prototipo1.model.Location;
import com.mycompany.gs1_prototipo1.model.Street;
import com.mycompany.gs1_prototipo1.model.User;
import com.mycompany.gs1_prototipo1.model.types.Label;
import com.mycompany.gs1_prototipo1.model.types.Weekday;
import com.mycompany.gs1_prototipo1.view.MainFrame;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author alberto
 */
public class PersonalProfile extends JPanel {
    private User user;
    private boolean editable;
      

    /**
     * Creates new form PersonalProfile
     */
    public PersonalProfile(User user) {
        this.user=user;
        initComponents();
        this.editable = false;
        
        System.out.println(user.getFirstName());
    }
       

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        profileImagePanel = new javax.swing.JPanel();
        imageLabel = new javax.swing.JLabel();
        changePhotoLabel = new javax.swing.JLabel();
        locationPanel = new javax.swing.JPanel();
        streetField = new javax.swing.JTextField();
        cityField = new javax.swing.JTextField();
        countryField = new javax.swing.JTextField();
        stateField = new javax.swing.JTextField();
        postCodeField = new javax.swing.JTextField();
        descriptionPanel = new javax.swing.JPanel();
        jScrollPane30 = new javax.swing.JScrollPane();
        availabilityList = new javax.swing.JList();
        jScrollPane31 = new javax.swing.JScrollPane();
        preferencesList = new javax.swing.JList();
        addDayLabel = new javax.swing.JLabel();
        removeDayLabel = new javax.swing.JLabel();
        addLabelLabel = new javax.swing.JLabel();
        removeLabelLabel = new javax.swing.JLabel();
        jScrollPane32 = new javax.swing.JScrollPane();
        availability = new javax.swing.JTextArea();
        jScrollPane33 = new javax.swing.JScrollPane();
        preference = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        aboutMe = new javax.swing.JTextArea();
        listsPanel = new javax.swing.JPanel();
        jScrollPane34 = new javax.swing.JScrollPane();
        filesList = new javax.swing.JList();
        jScrollPane35 = new javax.swing.JScrollPane();
        ownedMissions = new javax.swing.JList();
        jScrollPane36 = new javax.swing.JScrollPane();
        activeMissions = new javax.swing.JList();
        filesLabel = new javax.swing.JLabel();
        ownedMissionsLabel = new javax.swing.JLabel();
        activeMissionsLabel = new javax.swing.JLabel();
        removeFileLabel = new javax.swing.JLabel();
        addFileLabel = new javax.swing.JLabel();
        personalDataPanel = new javax.swing.JPanel();
        modifyLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        ageField = new javax.swing.JTextField();
        genderField = new javax.swing.JTextField();
        phoneField = new javax.swing.JTextField();

        profileImagePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        profileImagePanel.setForeground(new java.awt.Color(240, 240, 240));
        profileImagePanel.setMaximumSize(new java.awt.Dimension(107, 134));

        imageLabel.setIcon(new ImageIcon(user.getPictureMedium()));
        imageLabel.setMaximumSize(new java.awt.Dimension(107, 134));

        changePhotoLabel.setText("Cambiar foto");
        changePhotoLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changePhotoLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout profileImagePanelLayout = new javax.swing.GroupLayout(profileImagePanel);
        profileImagePanel.setLayout(profileImagePanelLayout);
        profileImagePanelLayout.setHorizontalGroup(
            profileImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileImagePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(changePhotoLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(profileImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(profileImagePanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(imageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        profileImagePanelLayout.setVerticalGroup(
            profileImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profileImagePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(changePhotoLabel))
            .addGroup(profileImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(profileImagePanelLayout.createSequentialGroup()
                    .addGap(0, 66, Short.MAX_VALUE)
                    .addComponent(imageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 66, Short.MAX_VALUE)))
        );

        streetField.setEditable(false);
        streetField.setText(user.getLocation().getStreet().getName()+", "+ user.getLocation().getStreet().getNumber());

        cityField.setEditable(false);
        cityField.setText(user.getLocation().getCity());

        countryField.setEditable(false);
        countryField.setText(user.getLocation().getCountry());

        stateField.setEditable(false);
        stateField.setText(user.getLocation().getState());

        postCodeField.setEditable(false);
        postCodeField.setText(user.getLocation().getPostCode());

        javax.swing.GroupLayout locationPanelLayout = new javax.swing.GroupLayout(locationPanel);
        locationPanel.setLayout(locationPanelLayout);
        locationPanelLayout.setHorizontalGroup(
            locationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locationPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(locationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(streetField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(locationPanelLayout.createSequentialGroup()
                        .addGroup(locationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cityField, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(countryField))
                        .addGap(18, 18, 18)
                        .addGroup(locationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stateField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(postCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33))
        );
        locationPanelLayout.setVerticalGroup(
            locationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locationPanelLayout.createSequentialGroup()
                .addComponent(streetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(locationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(locationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(postCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        availabilityList.setModel(new javax.swing.AbstractListModel() {
            Weekday[] weekdays = {Weekday.Lunes,Weekday.Martes, Weekday.Miercoles,
                Weekday.Jueves, Weekday.Viernes, Weekday.Sabado, Weekday.Domingo};
            public int getSize() { return weekdays.length; }
            public Object getElementAt(int i) { return weekdays[i]; }
        });
        jScrollPane30.setViewportView(availabilityList);

        preferencesList.setModel(new javax.swing.AbstractListModel() {
            Label[] labels = {Label.Ambiental, Label.Apoyo_socio_sanitario,
                Label.Comunitario, Label.Cuidado_de_mayores, Label.Cuidado_de_menores,
                Label.Cultural, Label.Deportivo, Label.Educativo, Label.Social};
            public int getSize() { return labels.length; }
            public Object getElementAt(int i) { return labels[i]; }
        });
        jScrollPane31.setViewportView(preferencesList);

        addDayLabel.setText("Añadir día");
        addDayLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addDayLabelMouseClicked(evt);
            }
        });

        removeDayLabel.setText("Quitar día");
        removeDayLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeDayLabelMouseClicked(evt);
            }
        });

        addLabelLabel.setText("Añadir etiqueta");
        addLabelLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addLabelLabelMouseClicked(evt);
            }
        });

        removeLabelLabel.setText("Quitar etiqueta");
        removeLabelLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeLabelLabelMouseClicked(evt);
            }
        });

        availability.setEditable(false);
        availability.setColumns(20);
        availability.setLineWrap(true);
        availability.setRows(5);
        availability.setWrapStyleWord(true);
        jScrollPane32.setViewportView(availability);
        availability.setText(user.getDescription().availabilityToString());

        preference.setEditable(false);
        preference.setColumns(20);
        preference.setLineWrap(true);
        preference.setRows(5);
        preference.setWrapStyleWord(true);
        jScrollPane33.setViewportView(preference);
        preference.setText(user.getDescription().preferencesToString());

        aboutMe.setEditable(false);
        aboutMe.setColumns(20);
        aboutMe.setLineWrap(true);
        aboutMe.setRows(5);
        aboutMe.setWrapStyleWord(true);
        jScrollPane1.setViewportView(aboutMe);
        aboutMe.setText(user.getDescription().getAboutMe());

        filesList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = user.getFilesName();
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane34.setViewportView(filesList);

        ownedMissions.setModel(new javax.swing.AbstractListModel() {
            String[] strings = user.getMissionName();
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane35.setViewportView(ownedMissions);

        activeMissions.setModel(new javax.swing.AbstractListModel() {
            String[] strings = user.getSubscribedMissionName();
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane36.setViewportView(activeMissions);

        filesLabel.setText("Files");

        ownedMissionsLabel.setText("Owned Missions");

        activeMissionsLabel.setText("Active Missions");

        removeFileLabel.setText("Quitar archivo");
        removeFileLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeFileLabelMouseClicked(evt);
            }
        });

        addFileLabel.setText("Añadir archivo");
        addFileLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addFileLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout listsPanelLayout = new javax.swing.GroupLayout(listsPanel);
        listsPanel.setLayout(listsPanelLayout);
        listsPanelLayout.setHorizontalGroup(
            listsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listsPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(addFileLabel)
                .addGap(18, 18, 18)
                .addComponent(removeFileLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(listsPanelLayout.createSequentialGroup()
                .addGroup(listsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listsPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(filesLabel))
                    .addGroup(listsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(listsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listsPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(listsPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(ownedMissionsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(activeMissionsLabel)))
                .addContainerGap())
        );
        listsPanelLayout.setVerticalGroup(
            listsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeFileLabel)
                    .addComponent(addFileLabel))
                .addGap(18, 18, 18)
                .addGroup(listsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filesLabel)
                    .addComponent(ownedMissionsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(activeMissionsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(listsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout descriptionPanelLayout = new javax.swing.GroupLayout(descriptionPanel);
        descriptionPanel.setLayout(descriptionPanelLayout);
        descriptionPanelLayout.setHorizontalGroup(
            descriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(descriptionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(descriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(descriptionPanelLayout.createSequentialGroup()
                        .addGroup(descriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(descriptionPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(descriptionPanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(descriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addLabelLabel)
                            .addComponent(removeLabelLabel)
                            .addComponent(addDayLabel)
                            .addComponent(removeDayLabel))
                        .addGap(32, 32, 32))
                    .addGroup(descriptionPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, descriptionPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(listsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        descriptionPanelLayout.setVerticalGroup(
            descriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(descriptionPanelLayout.createSequentialGroup()
                .addGroup(descriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(descriptionPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(addDayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(removeDayLabel))
                    .addGroup(descriptionPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(descriptionPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane32, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)))
                .addGroup(descriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(descriptionPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(addLabelLabel)
                        .addGap(18, 18, 18)
                        .addComponent(removeLabelLabel))
                    .addGroup(descriptionPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(descriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane33, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(listsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        modifyLabel.setText("Modificar perfil");
        modifyLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modifyLabelMouseClicked(evt);
            }
        });

        nameField.setEditable(false);
        nameField.setText(user.getName()+ " "+ user.getLastName());

        emailField.setEditable(false);
        emailField.setText(user.getEmail());

        ageField.setEditable(false);
        ageField.setText(user.getDateBorn());

        genderField.setEditable(false);
        genderField.setText(user.getGender());

        phoneField.setEditable(false);
        phoneField.setText(user.getPhone());

        javax.swing.GroupLayout personalDataPanelLayout = new javax.swing.GroupLayout(personalDataPanel);
        personalDataPanel.setLayout(personalDataPanelLayout);
        personalDataPanelLayout.setHorizontalGroup(
            personalDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personalDataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(personalDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modifyLabel)
                    .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        personalDataPanelLayout.setVerticalGroup(
            personalDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personalDataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(genderField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(modifyLabel))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(locationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(profileImagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(personalDataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(descriptionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(personalDataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profileImagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(locationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descriptionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(433, 433, 433))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void modifyLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifyLabelMouseClicked
        if(editable){
            setEditable(false);
            saveChanges(user);
        }else{
            setEditable(true);
        }
    }//GEN-LAST:event_modifyLabelMouseClicked

    private void addDayLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDayLabelMouseClicked
        if (editable){
            user.getDescription().addAvailability((Weekday) availabilityList.getSelectedValue());
            availability.setText(user.getDescription().availabilityToString());
        }
    }//GEN-LAST:event_addDayLabelMouseClicked

    private void removeDayLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeDayLabelMouseClicked
        if (editable){
            user.getDescription().removeAvailability((Weekday) availabilityList.getSelectedValue());
            availability.setText(user.getDescription().availabilityToString());
        }
    }//GEN-LAST:event_removeDayLabelMouseClicked

    private void addLabelLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addLabelLabelMouseClicked
        if (editable){
            user.getDescription().addPreferences((Label) preferencesList.getSelectedValue());
            preference.setText(user.getDescription().preferencesToString());
        }
    }//GEN-LAST:event_addLabelLabelMouseClicked

    private void removeLabelLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeLabelLabelMouseClicked
        if (editable){
            user.getDescription().removePreferences((Label) preferencesList.getSelectedValue());
            preference.setText(user.getDescription().preferencesToString());
        }
    }//GEN-LAST:event_removeLabelLabelMouseClicked

    private void removeFileLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeFileLabelMouseClicked
        for (File file : user.getFiles()) {
            if(file.getName().equals(filesList.getSelectedValue())) user.removeFile(file);
        }
        filesList.setListData(user.getFilesName());
    }//GEN-LAST:event_removeFileLabelMouseClicked

    private void addFileLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addFileLabelMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(this);
        user.addFile(fileChooser.getSelectedFile());
        filesList.setListData(user.getFilesName());
    }//GEN-LAST:event_addFileLabelMouseClicked

    private void changePhotoLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePhotoLabelMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(this);
        try {
            user.setPictureMedium(fileToBuffered(fileChooser.getSelectedFile()));
        } catch (IOException ex) {
            Logger.getLogger(PersonalProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
        imageLabel.setIcon(new ImageIcon(user.getPictureMedium()));
    }//GEN-LAST:event_changePhotoLabelMouseClicked

    private void setEditable(boolean editable){
        this.editable = editable;
        nameField.setEditable(editable);
        ageField.setEditable(editable);
        genderField.setEditable(editable);
        emailField.setEditable(editable);
        phoneField.setEditable(editable);
        
        streetField.setEditable(editable);
        cityField.setEditable(editable);
        stateField.setEditable(editable);      
        countryField.setEditable(editable);
        postCodeField.setEditable(editable);
        
        aboutMe.setEditable(editable);
        availability.setEditable(editable);
        preference.setEditable(editable);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea aboutMe;
    private javax.swing.JList activeMissions;
    private javax.swing.JLabel activeMissionsLabel;
    private javax.swing.JLabel addDayLabel;
    private javax.swing.JLabel addFileLabel;
    private javax.swing.JLabel addLabelLabel;
    private javax.swing.JTextField ageField;
    private javax.swing.JTextArea availability;
    private javax.swing.JList availabilityList;
    private javax.swing.JLabel changePhotoLabel;
    private javax.swing.JTextField cityField;
    private javax.swing.JTextField countryField;
    private javax.swing.JPanel descriptionPanel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel filesLabel;
    private javax.swing.JList filesList;
    private javax.swing.JTextField genderField;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JPanel listsPanel;
    private javax.swing.JPanel locationPanel;
    private javax.swing.JLabel modifyLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JList ownedMissions;
    private javax.swing.JLabel ownedMissionsLabel;
    private javax.swing.JPanel personalDataPanel;
    private javax.swing.JTextField phoneField;
    private javax.swing.JTextField postCodeField;
    private javax.swing.JTextArea preference;
    private javax.swing.JList preferencesList;
    private javax.swing.JPanel profileImagePanel;
    private javax.swing.JLabel removeDayLabel;
    private javax.swing.JLabel removeFileLabel;
    private javax.swing.JLabel removeLabelLabel;
    private javax.swing.JTextField stateField;
    private javax.swing.JTextField streetField;
    // End of variables declaration//GEN-END:variables

    private void saveChanges(User user) {
        user.setFirstName(nameField.getText().substring(0, nameField.getText().indexOf(" ")));
        user.setLastName(nameField.getText().substring(nameField.getText().indexOf(" ")));
        System.out.println(user.getName()+ " " + user.getLastName());
        user.setDateBorn(ageField.getText());
        System.out.println(user.getAge());
        user.setEmail(emailField.getText());
        System.out.println(user.getEmail());
        user.setGender(genderField.getText());
        System.out.println(user.getGender());
        user.setPhone(phoneField.getText());
        System.out.println(user.getPhone());
        user.setLocation(new Location(new Street(Integer.parseInt(streetField.getText().substring(streetField.getText().indexOf(",")+2)),
                streetField.getText().substring(0, streetField.getText().indexOf(","))),
                cityField.getText(), stateField.getText(), countryField.getText(),
                postCodeField.getText(),user.getLocation().getCoordinates(), user.getLocation().getOffset()));
        System.out.println(user.getLocation().getStreet());
        System.out.println(user.getLocation().getCity());
        System.out.println(user.getLocation().getState());
        System.out.println(user.getLocation().getCountry());
        System.out.println(user.getLocation().getPostCode());
        user.setDescription(new Description(aboutMe.getText(),user.getDescription().getPreferences(),
                user.getDescription().getAvailability()));
        System.out.println(user.getDescription().getAboutMe());
        System.out.println(user.getDescription().availabilityToString());
        System.out.println(user.getDescription().preferencesToString());
    }

    private BufferedImage fileToBuffered(File selectedFile) throws IOException {
        if (isCorrect(selectedFile)){
            BufferedImage image = ImageIO.read(selectedFile);
            return image;
        } else{
            return user.getPictureMedium();
        }
    }

    private static final String [] imageExtensions = new String[]{".jpg",".png"};
    private boolean isCorrect(File selectedFile) {
        for (String imageExtension : imageExtensions) {
            if (selectedFile.getAbsolutePath().endsWith(imageExtension))return true;
        }
        return false;
    }   
}
