/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.westernunav1;


import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONTokener;
import org.json.JSONObject;


/**
 *
 * @author tanusri
 */
public class Map extends javax.swing.JFrame {
    
    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    
    private User currUser;
    private String buildingName;
    private Building buildingInfo;
    private String filePathName;
    private ArrayList<Room> roomsList;
    private ArrayList<Floor> floorList;
    private LinkedList<PointofInterest> userSavedPOI;
    private LinkedList<PointofInterest> userFavPOI;
    private ArrayList<Floor> userPOIFloorList;
    private ArrayList<Floor> userFavFloorList;
    private HashMap<String, LinkedList> userPOICategory;
    private HashMap<String, LinkedList> userFavPOICategory;
    private String floorName;
    private int floorNumber;
    private int numFloors;
    private HashMap<String, ArrayList> floorBiPois;
    private HashMap<String, ArrayList> categories;
    
    
    public Map(User currUser, Building building) {
        initComponents();
        
        
        
        floorBiPois = new HashMap<>();
        
        this.currUser = currUser;
        
        
        
        this.buildingInfo = building;
        
        boolean isDev = currUser.getIsDeveloper();
        
        this.numFloors = buildingInfo.getNumFloors();

        
        this.filePathName = buildingInfo.getFileName();
        this.buildingName = buildingInfo.getName();
        this.floorList = buildingInfo.getFloors();
        
        for(int i = 0; i < floorList.size(); i++){
            this.floorNumber = floorList.get(i).getFloorNumber();
            this.floorName = floorList.get(i).getFloorName();
            this.roomsList = floorList.get(i).getRoomList();
            floorBiPois.put(floorName, roomsList); //HashMap to store the built-in POIs for each floor
            floorSelector.addItem(Integer.toString(floorNumber));
        }
        
        setBuildingName.setText(buildingName);
        
        if(isDev == true){ // if the user is a developer the user POI and favourite POI tabs will not be displayed
            poiLists.remove(userPOI);
            poiLists.remove(favPOI);
            myPOIBox.setVisible(false);
            myFavPOIs.setVisible(false);
        }
        
        /*try {

            FileReader openLogin;
            openLogin = new FileReader(this.currUser.getName() + ".json");
            System.out.println("success\n"); // to test that the JSON file opened successfully
            JSONTokener tok = new JSONTokener(openLogin);
            JSONObject jsonobj = new JSONObject(tok); // get the username and password stored at index 0 in the login JSON file
            
            this.currUser.setIsDeveloper((boolean)jsonobj.get("isDeveloper"));
            
            if(this.currUser.getIsDeveloper() == false){
                JSONArray poi = jsonobj.getJSONArray("poi");
                
                for(int a = 0; a < poi.length(); a++){
                    JSONObject getBuildingPoi = poi.getJSONObject(a);
                    if(getBuildingPoi.has(buildingName)){
                        JSONArray currPOIBuilding = getBuildingPoi.getJSONArray(buildingName);
                        userPOIFloorList = new ArrayList<>();
                        for(int b = 0; b < currPOIBuilding.length(); b++){
                            JSONObject getFloorsPOI = currPOIBuilding.getJSONObject(b);
                            String poiFloorName = (String) getFloorsPOI.get("Floor Name");
                            int poiFloorNumber = (Integer) getFloorsPOI.get("Floor Number");
                            JSONArray eachFloorPOI = getFloorsPOI.getJSONArray("POI");
                            if(!eachFloorPOI.isEmpty()){
                                userSavedPOI = new LinkedList<>();
                                for(int c = 0; c < eachFloorPOI.length(); c++){
                                    JSONObject getThisPOI = eachFloorPOI.getJSONObject(c);
                                    String poiCategory = (String)getThisPOI.get("category");
                                    String poiDesc = (String)getThisPOI.get("description");
                                    String poiRoomNumber = (String)getThisPOI.get("roomNumber");
                                    int poiX = (Integer)getThisPOI.get("x");
                                    int poiY = (Integer)getThisPOI.getInt("y");
                                    PointofInterest addThisPOI = new PointofInterest(poiRoomNumber, poiDesc, poiCategory, poiX, poiY);
                                    userSavedPOI.add(addThisPOI);
                                }
                            }
                            else{
                                userSavedPOI = new LinkedList<>();
                            }
                            Floor newPOIFloor = new Floor(poiFloorNumber, poiFloorName, userSavedPOI);
                            userPOIFloorList.add(newPOIFloor);
                        }
                    }
                }
                
                
                JSONArray favs = jsonobj.getJSONArray("favourites");
                
                for(int j = 0; j < favs.length(); j++){
                    JSONObject getFavPois = favs.getJSONObject(j);
                    if(getFavPois.has(buildingName)){
                        JSONArray currBuilding = getFavPois.getJSONArray(buildingName);
                        userFavFloorList = new ArrayList<>();
                        for(int k = 0; k < currBuilding.length(); k++){
                            JSONObject getFloorFavsPOI = currBuilding.getJSONObject(k);
                            String poiFloorName = (String) getFloorFavsPOI.get("Floor Name");
                            int poiFloorNumber = (Integer) getFloorFavsPOI.get("Floor Number");
                            JSONArray eachFloorFavPOI = getFloorFavsPOI.getJSONArray("POI");
                            if(!eachFloorFavPOI.isEmpty()){
                                userFavPOI = new LinkedList<>();
                                for(int l = 0; l < eachFloorFavPOI.length(); l++){
                                    JSONObject getThisFavPOI = eachFloorFavPOI.getJSONObject(l);
                                    String poiCategory = (String)getThisFavPOI.get("category");
                                    String poiDesc = (String)getThisFavPOI.get("description");
                                    String poiRoomNumber = (String)getThisFavPOI.get("roomNumber");
                                    int poiX = (Integer)getThisFavPOI.get("x");
                                    int poiY = (Integer)getThisFavPOI.getInt("y");
                                    PointofInterest addFavPOI = new PointofInterest(poiRoomNumber, poiDesc, poiCategory, poiX, poiY);
                                    userFavPOI.add(addFavPOI);
                                }
                            }else{
                                userFavPOI = new LinkedList<>();
                            }
                            Floor addFloor = new Floor(poiFloorNumber, poiFloorName, userFavPOI);
                            userFavFloorList.add(addFloor);
                        }
                    }
                }
            }
            
            
            openLogin.close();
        }catch (FileNotFoundException ae) {
            

            System.out.println("FileNotFound\n");

        } catch (IOException se) {

            System.out.println("ErrorClosingFile\n");

        } catch(JSONException jsonerror){
            System.out.println("ErrorParsingJSONFileUser2\n");
        }*/
        
        
    }
       
       
    
     public Building getBuildingInfo() {
        return buildingInfo;
    }

     
    public void setBuildingInfo(Building buildingInfo) {
        this.buildingInfo = buildingInfo;
    }
    

    public void setCurrUser(User currUser) {
        this.currUser = currUser;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public User getCurrUser() {
        return currUser;
    }

    public String getBuildingName() {
        return buildingName;
    }



    /**
     * Creates new form Map
     */
    public Map() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backWithoutSaving = new javax.swing.JButton();
        saveBack = new javax.swing.JButton();
        setBuildingName = new javax.swing.JLabel();
        setFloorName = new javax.swing.JLabel();
        helpButton = new javax.swing.JButton();
        poiLists = new javax.swing.JTabbedPane();
        biPOI = new javax.swing.JPanel();
        listPOI = new javax.swing.JScrollPane();
        userPOI = new javax.swing.JPanel();
        listUserPOI = new javax.swing.JScrollPane();
        userPOIList = new javax.swing.JLayeredPane();
        favPOI = new javax.swing.JPanel();
        listFavPOI = new javax.swing.JScrollPane();
        favPOILayer = new javax.swing.JLayeredPane();
        floorSelector = new javax.swing.JComboBox<>();
        floorNumberLabel = new javax.swing.JLabel();
        washroomToggle = new javax.swing.JCheckBox();
        accessibilityToggle = new javax.swing.JCheckBox();
        educationToggle = new javax.swing.JCheckBox();
        viewMaps = new javax.swing.JScrollPane();
        mapLayers = new javax.swing.JLayeredPane();
        diningToggle = new javax.swing.JCheckBox();
        mechToggle = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        addPOI = new javax.swing.JButton();
        editPOI = new javax.swing.JButton();
        deletePOI = new javax.swing.JButton();
        myPOIBox = new javax.swing.JCheckBox();
        myFavPOIs = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(this.buildingName);

        backWithoutSaving.setText("Back without saving");
        backWithoutSaving.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backWithoutSavingActionPerformed(evt);
            }
        });

        saveBack.setText("Save and Back");

        setBuildingName.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        setBuildingName.setText("Building Name");

        setFloorName.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
        setFloorName.setText("Floor Name");

        helpButton.setText("Help");
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout biPOILayout = new javax.swing.GroupLayout(biPOI);
        biPOI.setLayout(biPOILayout);
        biPOILayout.setHorizontalGroup(
            biPOILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
            .addGroup(biPOILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(biPOILayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(listPOI, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        biPOILayout.setVerticalGroup(
            biPOILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 319, Short.MAX_VALUE)
            .addGroup(biPOILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(biPOILayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(listPOI, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        poiLists.addTab("Built-in POIs", biPOI);

        javax.swing.GroupLayout userPOIListLayout = new javax.swing.GroupLayout(userPOIList);
        userPOIList.setLayout(userPOIListLayout);
        userPOIListLayout.setHorizontalGroup(
            userPOIListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );
        userPOIListLayout.setVerticalGroup(
            userPOIListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 317, Short.MAX_VALUE)
        );

        listUserPOI.setViewportView(userPOIList);

        javax.swing.GroupLayout userPOILayout = new javax.swing.GroupLayout(userPOI);
        userPOI.setLayout(userPOILayout);
        userPOILayout.setHorizontalGroup(
            userPOILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
            .addGroup(userPOILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(listUserPOI, javax.swing.GroupLayout.Alignment.TRAILING))
        );
        userPOILayout.setVerticalGroup(
            userPOILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 319, Short.MAX_VALUE)
            .addGroup(userPOILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(listUserPOI))
        );

        poiLists.addTab("My POIs", userPOI);

        javax.swing.GroupLayout favPOILayerLayout = new javax.swing.GroupLayout(favPOILayer);
        favPOILayer.setLayout(favPOILayerLayout);
        favPOILayerLayout.setHorizontalGroup(
            favPOILayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );
        favPOILayerLayout.setVerticalGroup(
            favPOILayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 317, Short.MAX_VALUE)
        );

        listFavPOI.setViewportView(favPOILayer);

        javax.swing.GroupLayout favPOILayout = new javax.swing.GroupLayout(favPOI);
        favPOI.setLayout(favPOILayout);
        favPOILayout.setHorizontalGroup(
            favPOILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
            .addGroup(favPOILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(listFavPOI))
        );
        favPOILayout.setVerticalGroup(
            favPOILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 319, Short.MAX_VALUE)
            .addGroup(favPOILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(listFavPOI, javax.swing.GroupLayout.Alignment.TRAILING))
        );

        poiLists.addTab("My Favourites", favPOI);

        floorSelector.setModel(new javax.swing.DefaultComboBoxModel<>());
        floorSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floorSelectorActionPerformed(evt);
            }
        });

        floorNumberLabel.setText("Floor Number:");

        washroomToggle.setText("Washroom");

        accessibilityToggle.setText("Accessibility");
        accessibilityToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accessibilityToggleActionPerformed(evt);
            }
        });

        educationToggle.setText("Educational Spaces");

        javax.swing.GroupLayout mapLayersLayout = new javax.swing.GroupLayout(mapLayers);
        mapLayers.setLayout(mapLayersLayout);
        mapLayersLayout.setHorizontalGroup(
            mapLayersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1438, Short.MAX_VALUE)
        );
        mapLayersLayout.setVerticalGroup(
            mapLayersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 785, Short.MAX_VALUE)
        );

        viewMaps.setViewportView(mapLayers);

        diningToggle.setText("Dining Spaces");

        mechToggle.setText("Mechanical and Electrical Spaces");

        jLabel1.setText("Click on checkboxes to toggle categories");

        addPOI.setText("Add");
        addPOI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPOIActionPerformed(evt);
            }
        });

        editPOI.setText("Edit");

        deletePOI.setText("Delete");
        deletePOI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePOIActionPerformed(evt);
            }
        });

        myPOIBox.setText("My POIs");

        myFavPOIs.setText("My Favourites");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewMaps)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(educationToggle)
                    .addComponent(accessibilityToggle)
                    .addComponent(washroomToggle)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(setBuildingName)
                            .addGap(72, 72, 72))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(poiLists, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(floorNumberLabel)
                                    .addGap(38, 38, 38)
                                    .addComponent(floorSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(setFloorName))
                            .addGap(98, 98, 98)))
                    .addComponent(diningToggle)
                    .addComponent(mechToggle)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backWithoutSaving)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(saveBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(helpButton))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(myPOIBox)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(editPOI)
                                    .addGap(18, 18, 18)
                                    .addComponent(addPOI))
                                .addComponent(myFavPOIs)))
                        .addGap(31, 31, 31))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(deletePOI)
                        .addComponent(jLabel1))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewMaps)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(setBuildingName)
                        .addGap(18, 18, 18)
                        .addComponent(setFloorName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(floorSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(floorNumberLabel))
                        .addGap(15, 15, 15)
                        .addComponent(poiLists, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(educationToggle)
                            .addComponent(myPOIBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(diningToggle)
                            .addComponent(myFavPOIs))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mechToggle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(washroomToggle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(accessibilityToggle)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addPOI)
                            .addComponent(editPOI)
                            .addComponent(deletePOI))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backWithoutSaving)
                            .addComponent(saveBack)
                            .addComponent(helpButton))))
                .addContainerGap(287, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backWithoutSavingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backWithoutSavingActionPerformed
        // TODO add your handling code here:
        int option = JOptionPane.showConfirmDialog(null, "Going back will not save your current changes.\nContinue?", "Add Building", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            MapSelector newSelection = new MapSelector(currUser);
            newSelection.setVisible(true);
            this.dispose();
        }
        else{
            System.out.println("Choose Building Canelled\n");
        }
        
    }//GEN-LAST:event_backWithoutSavingActionPerformed

    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
        // TODO add your handling code here:
        new Help().setVisible(true);
    }//GEN-LAST:event_helpButtonActionPerformed
    
    
    /*public void displayUserPOIs(PointofInterest poiInfo, JLayeredPane layer){
        JLabel poiLabel = new JLabel(new ImageIcon("./catIcons/" + poiInfo.getCategory() + ".png"));
        poiLabel.setBounds(poiInfo.getPoiX(), poiInfo.getPoiY(), 25, 25);
        layer.add(poiLabel);
        layer.setComponentZOrder(poiLabel, 0);
        
        myPOIBox.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e){
                if(poiInfo.getCategory().equals("myPOI") && myPOIBox.isSelected()){
                    poiLabel.setVisible(false);
            //this.repaint();
                }
                else{
                    poiLabel.setVisible(true);
                }
            }
        });
        
        myFavPOIs.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e){
                if(poiInfo.getCategory().equals("favPOI") && myFavPOIs.isSelected()){
                    poiLabel.setVisible(false);
            //this.repaint();
                }
                else{
                    poiLabel.setVisible(true);
                }
            }
        });
    }*/
    
    
    public void displayRoomPOI(Room roomInfo, JLayeredPane layer){
        JLabel roomPOI = new JLabel(new ImageIcon("./catIcons/" + roomInfo.getRoomCategory() + ".png"));
        roomPOI.setBounds(roomInfo.getX_coord(), roomInfo.getY_coord(), 25, 25);
        layer.add(roomPOI);
        layer.setComponentZOrder(roomPOI, 0);
        
        accessibilityToggle.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e){
                
                if(roomInfo.getRoomCategory().equals("accessibility") && accessibilityToggle.isSelected()){
                    
                    roomPOI.setVisible(false);
                }
                else{
                    roomPOI.setVisible(true);
                }
            }
        });
        
        
        washroomToggle.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e){
                if(roomInfo.getRoomCategory().equals("washroom") && washroomToggle.isSelected()){
                    
                    roomPOI.setVisible(false);
            //this.repaint();
                }
                else{
                    roomPOI.setVisible(true);
                }
            }
        });
                
        educationToggle.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e){
                if(roomInfo.getRoomCategory().equals("educational spaces") && educationToggle.isSelected()){
                    roomPOI.setVisible(false);
            //this.repaint();
                }
                else{
                    roomPOI.setVisible(true);
                }
            }
        });
        
        
        mechToggle.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e){
                if(roomInfo.getRoomCategory().equals("electrical and mechanical spaces") && mechToggle.isSelected()){
                    roomPOI.setVisible(false);
            //this.repaint();
                }
                else{
                    roomPOI.setVisible(true);
                }
            }
        });
        
        diningToggle.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e){
                if(roomInfo.getRoomCategory().equals("dining spaces") && diningToggle.isSelected()){
                    roomPOI.setVisible(false);
            //this.repaint();
                }
                else{
                    roomPOI.setVisible(true);
                }
            }
        });
        
        roomPOI.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                JLabel roomNumber = new JLabel();
                JLabel roomCategory = new JLabel();
                JLabel roomDesc = new JLabel();
                
                JButton deletePOI = new JButton();
                JButton editPOI = new JButton();
                
                deletePOI.setText("Delete this POI");
                editPOI.setText("Edit this POI");
                
                
                
                roomNumber.setText(roomInfo.getRoomNumber());
                roomCategory.setText(roomInfo.getRoomCategory());
                roomDesc.setText(roomInfo.getDescription());
                

            Object[] roomStuff = {
                    "Room Number:", roomNumber,
                    "Room Category:", roomCategory,
                    "Room Description:", roomDesc,
                    
                };
            Object[] buttons = {deletePOI, editPOI};
            
                int option = JOptionPane.showConfirmDialog(null, roomStuff, "Room Information", JOptionPane.OK_CANCEL_OPTION);
        
            }
        });
    }
    
    
    /*
    Displays the floor name and image file associated with the floor depending on
    the option the user selects
    */
    private void floorSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floorSelectorActionPerformed
        // TODO add your handling code here:
        int selectedInt = Integer.parseInt(floorSelector.getItemAt(floorSelector.getSelectedIndex()));
        setFloorName.setText(floorList.get(floorSelector.getSelectedIndex()).getFloorName());
        setFloorName.repaint();
        setFloorName.revalidate();
        
        int floorNumber = floorList.get(floorSelector.getSelectedIndex()).getFloorNumber();
        
        ArrayList <Room> roomPOI = floorList.get(floorSelector.getSelectedIndex()).getRoomList();
        //LinkedList <PointofInterest> getUserPOIs = userPOIFloorList.get(floorSelector.getSelectedIndex()).getPointsOfInterest();
        //LinkedList <PointofInterest> getFavPOIs = userFavFloorList.get(floorSelector.getSelectedIndex()).getPointsOfInterest();
        
        categories = new HashMap<>();
        //userPOICategory = new HashMap<>();
        //userFavPOICategory = new HashMap<>();
        
        mapLayers.setLayout(null);
        
        for(Room room : roomPOI){
            categories.put(room.getRoomCategory(), roomPOI);
        }
        
        /*for(PointofInterest thisPOI : getUserPOIs){
            userPOICategory.put(thisPOI.getCategory(), getUserPOIs);
        }
        
        for(PointofInterest thisFavPOI : getFavPOIs){
            userFavPOICategory.put(thisFavPOI.getCategory(), getFavPOIs);
        }*/
        
        JLabel mapImage = new JLabel();
        ImageIcon image = new ImageIcon("./maps/"+filePathName+"_lv"+floorNumber+".jpg");
        mapImage.setIcon(image);
        mapLayers.add(mapImage);
        
        mapLayers.setComponentZOrder(mapImage, 0); // sets the current map being displayed as the lowest layer of the scroll panel
        
        mapImage.setBounds(0, 0, 3400, 2200);// need to set image bounds otherwise images don't show up
        mapLayers.setPreferredSize(new Dimension(3400, 2200));// need to set layer panel bounds otherwise images don't show up
        
        ArrayList<String> roomString = new ArrayList<>();
        //ArrayList<String> userPOIString = new ArrayList<>();
        //ArrayList<String> userFavString = new ArrayList<>();
        
        for(String cat : categories.keySet()){
            ArrayList<Room> addRoomPOIs = categories.get(cat);
            for(int i = 0; i < addRoomPOIs.size(); i++){
                displayRoomPOI(addRoomPOIs.get(i), mapLayers);

            }
        }
        
        
        /*for(String poiCat : userPOICategory.keySet()){
            LinkedList<PointofInterest> addUserPOIs = userPOICategory.get(poiCat);
            for(int i = 0; i < addUserPOIs.size(); i++){
                displayUserPOIs(addUserPOIs.get(i), mapLayers);
            }
        }
        
        for(String favCat : userFavPOICategory.keySet()){
            LinkedList<PointofInterest> addFavPOIs = userFavPOICategory.get(favCat);
            for(int i = 0; i < addFavPOIs.size(); i++){
                displayUserPOIs(addFavPOIs.get(i), mapLayers);
            }
        }*/
        
        
        for(int i = 0; i < roomPOI.size(); i++){
            roomString.add(roomPOI.get(i).getRoomNumber());
        }
        
        
        
        
        
        
        JList biPoiList = new JList(roomString.toArray());
        biPoiList.setVisibleRowCount(roomString.size());
        biPoiList.repaint();
        biPoiList.revalidate();
        listPOI.add(biPoiList);
        biPoiList.setOpaque(true);
        biPoiList.setSize(biPOI.getWidth(), biPOI.getHeight());
        biPoiList.setVisible(true);
        biPoiList.requestFocus();
        biPoiList.addMouseListener(new MouseAdapter()  
            {  
                public void mouseClicked(MouseEvent e)  
                {  
                     
                    String s = (String)biPoiList.getSelectedValue();
                    JLabel label = new JLabel();
                    for(Room r : roomPOI){
                        if(r.getRoomNumber().equals(s)){
                            System.out.println(r.getDescription()+" sucessfully found the room\n");
                            
                            Dimension scrollPaneSize = viewMaps.getViewport().getSize();
                            
                            Dimension mapSize = mapImage.getPreferredSize();
                            
                            viewMaps.getViewport().setViewPosition(new Point(r.getX_coord() - (scrollPaneSize.width/2), r.getY_coord() - (scrollPaneSize.height/2)));
                            
                            JLabel roomNumber = new JLabel();
                            JLabel roomCategory = new JLabel();
                            JLabel roomDesc = new JLabel();
                
                            roomNumber.setText(r.getRoomNumber());
                            roomCategory.setText(r.getRoomCategory());
                            roomDesc.setText(r.getDescription());
                
                            Object[] roomStuff = {
                                "Room Number:", roomNumber,
                                "Room Category:", roomCategory,
                                "Room Description:", roomDesc
                            };

                            int option = JOptionPane.showConfirmDialog(null, roomStuff, "Room Information", JOptionPane.OK_CANCEL_OPTION);
                        }
                    }
                    
                }  
            }); 
        
        
        
    }//GEN-LAST:event_floorSelectorActionPerformed

    private void deletePOIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePOIActionPerformed
        // TODO add your handling code here:
        if(this.currUser.getIsDeveloper() == true){
            JOptionPane.showMessageDialog(null, "Click on the Built-in POI that you would like to delete in the map.");
            
        }
    }//GEN-LAST:event_deletePOIActionPerformed

    private void addPOIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPOIActionPerformed
        // TODO add your handling code here:

        int floorIndex = floorSelector.getSelectedIndex();
        mapLayers.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                int x = e.getX();
                int y = e.getY();
                
                if(x < 0) x = 0;
                if(y < 0) y = 0;
                
                JTextField roomNumber = new JTextField();
                JComboBox<String> roomCategory = new JComboBox();
                JTextField roomDesc = new JTextField();
                
                
                String[]categories = {"washroom", "accessibility", "electrical and mechanical spaces", "dining spaces", "educational spaces"};
                
                roomCategory.setModel(new DefaultComboBoxModel<>(categories));
                
                Object[] roomStuffDeveloper = {
                    "Room Number:", roomNumber,
                    "Room Category:", roomCategory,
                    "Room Description:", roomDesc
                };
                
                 Object[] roomStuffUser = {
                    "Room Number:", roomNumber,
                    "Room Description:", roomDesc
                };
                 
                
                
                if(currUser.getIsDeveloper() == true){
                    Room addRoom = new Room(null, null, x, y, null);
                    int option = JOptionPane.showConfirmDialog(null, roomStuffDeveloper, "Room Information", JOptionPane.OK_CANCEL_OPTION);
                    if(option == JOptionPane.OK_OPTION){
                        addRoom.setRoomCategory(roomCategory.getItemAt(roomCategory.getSelectedIndex()));
                        addRoom.setDescription(roomDesc.getText());
                        addRoom.setRoomNumber(roomNumber.getText());
                        floorList.get(floorIndex).getRoomList().add(addRoom);
                        validate();
                    }  
                    
                    
                }
                else{
                    
                    PointofInterest newPOI = new PointofInterest(null, null, "myPOI",x, y);
                    int option = JOptionPane.showConfirmDialog(null, roomStuffUser, "Room Information", JOptionPane.OK_CANCEL_OPTION);
                    if(option == JOptionPane.OK_OPTION){
                    newPOI.setCategory("myPOI");
                    newPOI.setPoiRoomNumber(roomNumber.getText());
                    newPOI.setPoiDescription(roomDesc.getText());
                    userSavedPOI.add(newPOI);
                }
                }
            }
        });
        
    }//GEN-LAST:event_addPOIActionPerformed

    private void accessibilityToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accessibilityToggleActionPerformed
        // TODO add your handling code here:
            
    }//GEN-LAST:event_accessibilityToggleActionPerformed

    
    /*
    Not updated yet - write to json method for each building json
    */
    public void updateBIJSON(ArrayList<Floor> floor){
        
        JSONObject updatedObject = new JSONObject ();        
        /*
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
        */
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
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Map().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox accessibilityToggle;
    private javax.swing.JButton addPOI;
    private javax.swing.JButton backWithoutSaving;
    private javax.swing.JPanel biPOI;
    private javax.swing.JButton deletePOI;
    private javax.swing.JCheckBox diningToggle;
    private javax.swing.JButton editPOI;
    private javax.swing.JCheckBox educationToggle;
    private javax.swing.JPanel favPOI;
    private javax.swing.JLayeredPane favPOILayer;
    private javax.swing.JLabel floorNumberLabel;
    private javax.swing.JComboBox<String> floorSelector;
    private javax.swing.JButton helpButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane listFavPOI;
    private javax.swing.JScrollPane listPOI;
    private javax.swing.JScrollPane listUserPOI;
    private javax.swing.JLayeredPane mapLayers;
    private javax.swing.JCheckBox mechToggle;
    private javax.swing.JCheckBox myFavPOIs;
    private javax.swing.JCheckBox myPOIBox;
    private javax.swing.JTabbedPane poiLists;
    private javax.swing.JButton saveBack;
    private javax.swing.JLabel setBuildingName;
    private javax.swing.JLabel setFloorName;
    private javax.swing.JPanel userPOI;
    private javax.swing.JLayeredPane userPOIList;
    private javax.swing.JScrollPane viewMaps;
    private javax.swing.JCheckBox washroomToggle;
    // End of variables declaration//GEN-END:variables
}
