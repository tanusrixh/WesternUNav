/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.westernunav1;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import org.apache.commons.lang3.StringUtils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;


/**
 * MapSelector is a class for creating a graphical user interface that allows the user to select a building and its floors and view POIs.
 * It also enables developers to add, edit, and remove buildings.
 * 
 * @author tanusri
 */
public class MapSelector extends javax.swing.JFrame {
    
    private ArrayList<Building> buildings;
    private User currUser;
    private int numBuildingFloors;
    private HashMap<String, Integer> buildingsInfo;
    private HashMap<String, String> buildingsFileInfo;

    /**
     * Sets the ArrayList of Building objects to the specified value
     * 
     * @param buildings the ArrayList of Building objects
     */
    public void setBuildings(ArrayList<Building> buildings) {
        this.buildings = buildings;
    }
    
    /**
     * Removes a building from the ArrayList of Building objects
     * 
     * @param buildings the ArrayList of Building objects
     */
    public void removeBuilding(ArrayList<Building> buildings) {
        this.buildings = buildings;
    }

    /**
     * Returns the ArrayList of Building objects
     * 
     * @return the ArrayList of Building objects
     */
    public ArrayList<Building> getBuildings() {
        return buildings;
    }
    
    /**
     * Returns the Building object at the specified index of the ArrayList of Building objects.
     * 
     * @param buildings the ArrayList of Building objects
     * @param index the index of the Building object to be returned
     * @return the Building object at the specified index
     */
    public Building getBuilding(ArrayList<Building> buildings, int index) {
        return buildings.get(index);
    }

    /**
     * Creates new form MapSelector object with User object
     * @param user the User object
     */
    public MapSelector(User user) {
        
        initComponents();
        
        this.currUser = user;
        
        //if user is not a developer hide the add, edit, and delete building buttons
        if(currUser.getIsDeveloper() == false){
            addBuildingButton.setVisible(false); //hide add button
            //editBuildingButton.setVisible(false); //hide edit button
            removeBuildingButton.setVisible(false); //hide delete button
        }
        
        try{
            
            FileReader openBuildings = new FileReader("./buildings.json");
            JSONTokener buildingsToken = new JSONTokener(openBuildings);
            JSONObject buildingsObj = new JSONObject(buildingsToken);
            JSONArray fileBuildings = buildingsObj.getJSONArray("buildings");
            
            buildingsInfo = new HashMap<>();
            buildingsFileInfo = new HashMap<>();
            
            dropDownMenu.addItem("---Select a building---");
            
            for(int i = 0; i < fileBuildings.length(); i++){
                JSONObject getBuildingStuff = fileBuildings.getJSONObject(i);
                String buildingName = (String)getBuildingStuff.get("Name");
                int number = (int)getBuildingStuff.get("Number of floors");
                String fileCode = (String)getBuildingStuff.get("File Extension");
                
                
                buildingsInfo.put(buildingName,number);
                buildingsFileInfo.put(buildingName,fileCode);
                
                dropDownMenu.addItem(buildingName);
            }
            
            
            openBuildings.close();
            
        }catch(FileNotFoundException fileError){
            System.out.println("FileNotFound\n");
            
        }catch(IOException ioerror){
            System.out.println("ErrorClosingFile\n");
            
        }catch(JSONException jsonerror){
            System.out.println("ErrorParsingJSONFile\n");
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Buildings = new javax.swing.JPanel();
        dropDownMenu = new javax.swing.JComboBox<>();
        try{
            BufferedImage image2 = ImageIO.read(new File("./logoImage.jpg"));
            Image logoimage2 = image2.getScaledInstance(screenSize.width/2, screenSize.height/6, Image.SCALE_DEFAULT);
            logo2 = new JLabel(new ImageIcon(logoimage2));
        }catch(IOException excep_two){
            System.out.println("error.2");
        }
        try{
            BufferedImage image3 = ImageIO.read(new File("./AR_image.jpg"));
            Image arimage = image3.getScaledInstance(screenSize.width/3, screenSize.height/3, Image.SCALE_DEFAULT);
            ARImage = new JLabel(new ImageIcon(arimage));
        }catch(IOException except3){
            System.out.println("error.3");
        }
        try{
            BufferedImage image4 = ImageIO.read(new File("./AH_image.jpg"));
            Image ahimage = image4.getScaledInstance(screenSize.width/3, screenSize.height/3, Image.SCALE_DEFAULT);
            AHImage = new JLabel(new ImageIcon(ahimage));
        }catch(IOException except4){
            System.out.println("error.4");
        }
        try{
            BufferedImage image5 = ImageIO.read(new File("./MC_image.jpg"));
            Image mcimage = image5.getScaledInstance(screenSize.width/3, screenSize.height/3, Image.SCALE_DEFAULT);
            MCImage = new JLabel(new ImageIcon(mcimage));
        }catch(IOException except5){
            System.out.println("error.5");
        }
        addBuildingButton = new javax.swing.JButton();
        removeBuildingButton = new javax.swing.JButton();
        helpButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        Buildings.setBackground(new java.awt.Color(255, 255, 255));
        Buildings.setFocusTraversalPolicyProvider(true);
        Buildings.setMaximumSize(new java.awt.Dimension(1920, 1080));
        Buildings.setPreferredSize(new java.awt.Dimension(1920, 1080));
        this.setSize(screenSize.width, screenSize.height);

        Buildings.setSize(screenSize.width, screenSize.height);

        dropDownMenu.setLocation(new java.awt.Point(screenSize.width/3, screenSize.height/2));
        dropDownMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropDownMenuActionPerformed(evt);
            }
        });

        logo2.setText(null);

        ARImage.setText(null);

        AHImage.setText(null);

        MCImage.setText(null);

        addBuildingButton.setText("Add");
        addBuildingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBuildingButtonActionPerformed(evt);
            }
        });

        removeBuildingButton.setText("Remove");
        removeBuildingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBuildingButtonActionPerformed(evt);
            }
        });

        helpButton.setText("Help");
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BuildingsLayout = new javax.swing.GroupLayout(Buildings);
        Buildings.setLayout(BuildingsLayout);
        BuildingsLayout.setHorizontalGroup(
            BuildingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuildingsLayout.createSequentialGroup()
                .addComponent(AHImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MCImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ARImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(235, 235, 235))
            .addGroup(BuildingsLayout.createSequentialGroup()
                .addComponent(logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BuildingsLayout.createSequentialGroup()
                .addContainerGap(263, Short.MAX_VALUE)
                .addComponent(dropDownMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addBuildingButton)
                .addGap(18, 18, 18)
                .addComponent(removeBuildingButton)
                .addGap(18, 18, 18)
                .addComponent(helpButton)
                .addGap(18, 18, 18)
                .addComponent(logoutButton)
                .addGap(278, 278, 278))
        );
        BuildingsLayout.setVerticalGroup(
            BuildingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuildingsLayout.createSequentialGroup()
                .addComponent(logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191)
                .addGroup(BuildingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dropDownMenu)
                    .addComponent(addBuildingButton)
                    .addComponent(removeBuildingButton)
                    .addComponent(helpButton)
                    .addComponent(logoutButton))
                .addGap(27, 27, 27)
                .addGroup(BuildingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AHImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MCImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ARImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(431, 431, 431))
        );

        getContentPane().add(Buildings, "card3");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Called when the use selects an item from the drop down menu
     * Creates a new Building object and displays it using a Map object
     * 
     * @param evt
     */
    private void dropDownMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropDownMenuActionPerformed
        // TODO add your handling code here:
        if(!dropDownMenu.getItemAt(dropDownMenu.getSelectedIndex()).equals("---Select a building---")){
            String selected = dropDownMenu.getItemAt(dropDownMenu.getSelectedIndex());
            
            //check if output is correct
            //System.out.println(buildingsFileInfo.get(selected)); 
            //System.out.println(buildingsInfo.get(selected));
            
            
            Building newBuilding = new Building(selected, buildingsFileInfo.get(selected), buildingsInfo.get(selected));
            Map newBuildingFrame = new Map(currUser, newBuilding);
            newBuildingFrame.show();
            this.dispose();
        }

    }//GEN-LAST:event_dropDownMenuActionPerformed

    
    /**
     * Function that adds a new building if the user is a developer and if the 
     * developer clicks the add building button
     * 
     * @param evt
    */
    private void addBuildingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBuildingButtonActionPerformed
        // TODO add your handling code here:
        JTextField buildingName = new JTextField();
        JTextField buildingCode = new JTextField();
        
        //Spinner model that allows developer to add anywhere from 1 to 100 floors
        SpinnerNumberModel numbers = new SpinnerNumberModel(1,1,100,1);
        
        JSpinner buildingFloors = new JSpinner(numbers);
        
       
        
        Object[] addBuilding = {
            "Building Name:", buildingName,
            "Building Code:", buildingCode,
            "Number of Floors:", buildingFloors
        };

        int option = JOptionPane.showConfirmDialog(null, addBuilding, "Add Building", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            if (buildingName.getText().equals("") || buildingCode.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill in all the information.\nPlease do not leave any empty spaces.");
            } 
            
            else if(!buildingName.getText().equals("") || buildingCode.getText().equals("")){
                for(String a : buildingsFileInfo.keySet()){
                    String temp = StringUtils.deleteWhitespace(a);
                    if(buildingsFileInfo.get(a).equals((String)buildingCode.getText())){
                        JOptionPane.showMessageDialog(null, "This building code already exists.\nPlease enter another building code.\nBuilding was not added.");
                    }
                    else if(temp.equals((String)buildingName.getText())){
                        JOptionPane.showMessageDialog(null, "This building already exists.\nPlease enter another building name.\nBuilding was not added."); 
                    }
                    else if(a.equals((String)buildingName.getText())){
                        JOptionPane.showMessageDialog(null, "This building already exists.\nPlease enter another building name.\nBuilding was not added."); 
                    }
                    else{
                        System.out.println("No errors found.\n");
                    }
                }
               
            }
            
                buildingsInfo.put(buildingName.getText(), (Integer)buildingFloors.getValue());
                buildingsFileInfo.put(buildingName.getText(), buildingCode.getText());
                
                //updates the dropdown menu in the building selection option to display the newly added building
                dropDownMenu.addItem(buildingName.getText());
                dropDownMenu.repaint();
                dropDownMenu.revalidate();
                
                //creates a new building file for the building that was just added
                new Building((String)buildingName.getText(), (String)buildingCode.getText(), (Integer)buildingFloors.getValue()); 
                
                updateJSON();
            
        } else {
            System.out.println("Add building cancelled");
        }
    }//GEN-LAST:event_addBuildingButtonActionPerformed
    
    
    /**
     * Function to delete a building if the user is a developer and if the user presses
     * the delete button. Also deletes the json file containing the built-in POI's 
     * associated with the building being deleted
     * 
     * @param evt
    */
    private void removeBuildingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBuildingButtonActionPerformed
        // TODO add your handling code here:
        JComboBox<String> deleteBox = new JComboBox<>();
        
        for(String a : buildingsInfo.keySet()){
            deleteBox.addItem(a);
        }
        
        int option = JOptionPane.showConfirmDialog(null, deleteBox, "Delete Building", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            String selected = deleteBox.getItemAt(deleteBox.getSelectedIndex());
        
        
            File deleteFile = new File("./"+buildingsFileInfo.get(selected)+"floors.json");
            deleteFile.delete();
            
            //updates the dropdown menu in the building selection option to display the dropdown without the removed building
            dropDownMenu.removeItem(selected);
            dropDownMenu.repaint();
            dropDownMenu.revalidate();
        
            buildingsInfo.remove(selected);
            buildingsFileInfo.remove(selected);
            updateJSON();
        }else {
            System.out.println("Delete building cancelled");
        }
    }//GEN-LAST:event_removeBuildingButtonActionPerformed

    /**
     * Display the help window
     * 
     * @param evt 
     */
    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
        // TODO add your handling code here:
        new Help().setVisible(true);
    }//GEN-LAST:event_helpButtonActionPerformed

    /**
     * Logs out the user and display the login window
     * 
     * @param evt 
     */
    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        User newUser = new User();
        newUser.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed
    
    /**
     * Display the logo images
     */
    public void displayLogo(){
        Buildings.add(logo2);
        Buildings.add(ARImage);
        Buildings.add(AHImage);
        Buildings.add(MCImage);
    }
    
    
    /**
     * Updates the buildings.json file depending on if the developer has added,
     * edited, or removed a building.
    */
    private void updateJSON(){
        JSONObject updatedObject = new JSONObject();
        JSONArray updatedArray = new JSONArray();
        
        for(String a : buildingsInfo.keySet()){
            //Check if the correct building names are in the hashmaps
            //System.out.println(a+"\n");
            
            
            int floorNumber = buildingsInfo.get(a);
            String fileCode = buildingsFileInfo.get(a);
            
            JSONObject building = new JSONObject();
            building.put("Name", a);
            building.put("Number of floors", floorNumber);
            building.put("File Extension", fileCode);
            
            updatedArray.put(building);
        }
        
        updatedObject.put("buildings", updatedArray);
        
        try{
            FileOutputStream outputUpdate = new FileOutputStream("./buildings.json"); 
            byte[] strToBytes = updatedObject.toString().getBytes(); 
            outputUpdate.write(strToBytes); 
            outputUpdate.close();
        }catch(IOException e){
            System.out.println("Unable to write JSON to file\n");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Mac OS X look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Mac OS X".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MapSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MapSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MapSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MapSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                //new MapSelector().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AHImage;
    private javax.swing.JLabel ARImage;
    private javax.swing.JPanel Buildings;
    private javax.swing.JLabel MCImage;
    private javax.swing.JButton addBuildingButton;
    private javax.swing.JComboBox<String> dropDownMenu;
    private javax.swing.JButton helpButton;
    private javax.swing.JLabel logo2;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton removeBuildingButton;
    // End of variables declaration//GEN-END:variables
}
