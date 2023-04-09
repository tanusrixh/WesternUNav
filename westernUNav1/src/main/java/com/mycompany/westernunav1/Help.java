/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.westernunav1;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

/**
 * The Help class contains the GUI components for the help menu in the application.
 * 
 * @author nourfayadh
 */
public class Help extends javax.swing.JFrame{
    
    /**
     * The constructor method creates an instance of the Help class and calls the initComponents method to create all of the GUI components.
     * 
     */
    public Help(){
        initComponents();
    }
    
    /**
     * The initComponents method creates and initializes all of the GUI components for the help menu.
     * 
     */
    private void initComponents() {
        
        FirstTabMenu = new javax.swing.JTabbedPane();
        LoginPanel = new javax.swing.JScrollPane();
        LoginPageText = new javax.swing.JTextArea();
        POITabMenu = new javax.swing.JTabbedPane();
        ViewPOIPanel = new javax.swing.JScrollPane();
        ViewPOIText = new javax.swing.JTextArea();
        AddPOIPanel = new javax.swing.JScrollPane();
        AddPOIText = new javax.swing.JTextArea();
        EditPOIPanel = new javax.swing.JScrollPane();
        EditPOIText = new javax.swing.JTextArea();
        MainPageTabMenu = new javax.swing.JTabbedPane();
        LogoutPanel = new javax.swing.JScrollPane();
        LogoutText = new javax.swing.JTextArea();
        BuildingPanel = new javax.swing.JScrollPane();
        BuildingText = new javax.swing.JTextArea();
        MapsTabMenu = new javax.swing.JTabbedPane();
        LayerPanel = new javax.swing.JScrollPane();
        LayerText = new javax.swing.JTextArea();
        ReturnPanel = new javax.swing.JScrollPane();
        ReturnText = new javax.swing.JTextArea();
        DeveloperTabMenu = new javax.swing.JTabbedPane();
        BuildingTabMenu = new javax.swing.JTabbedPane();
        AddBuildingPanel = new javax.swing.JScrollPane();
        AddBuildingText = new javax.swing.JTextArea();
        RemoveBuildingPanel = new javax.swing.JScrollPane();
        RemoveBuildingText = new javax.swing.JTextArea();
        FloorTabMenu = new javax.swing.JTabbedPane();
        AddFloorPanel = new javax.swing.JScrollPane();
        AddFloorText = new javax.swing.JTextArea();
        EditFloorPanel = new javax.swing.JScrollPane();
        EditFloorText = new javax.swing.JTextArea();
        RemoveFloorPanel = new javax.swing.JScrollPane();
        RemoveFloorText = new javax.swing.JTextArea();
        POITabMenu_2 = new javax.swing.JTabbedPane();
        EditPOIPanel_2 = new javax.swing.JScrollPane();
        EditPOIText_2 = new javax.swing.JTextArea();
        RemovePOIPanel = new javax.swing.JScrollPane();
        RemovePOIText = new javax.swing.JTextArea();
        contactUsButton = new javax.swing.JButton();
        
        
        aboutTextArea = new javax.swing.JTextArea();
        aboutTextArea.setEditable(false);
        aboutTextArea.setBackground(new java.awt.Color(255, 255, 255));
        aboutTextArea.setColumns(20);
        aboutTextArea.setLineWrap(true);
        aboutTextArea.setRows(5);
        aboutTextArea.setWrapStyleWord(true);
        aboutTextArea.setText("Application Name: WesternU Navigator\n\nVersion: 1.0\n\nDevelopers: Hala Abudaqqa, Nour Fayadh, Tanusri Harish, Sara Mehravar, Nosheen Sobhani\n\nRelease Date: April 5, 2023");
        
        FirstTabMenu.addTab("About", aboutTextArea);
        
        JPanel contactUsPanel = new JPanel();
        contactUsPanel.add(contactUsButton);
        FirstTabMenu.addTab("Contact Us", contactUsPanel);
        contactUsButton.setText("Contact Us");
        
        contactUsPanel.setLayout(new GridLayout(0, 1));
        JLabel emailDescriptionLabel = new JLabel("For any questions, please email:");
        contactUsPanel.add(emailDescriptionLabel);
        JLabel teamMember1EmailLabel = new JLabel("habudaqq@uwo.ca");
        contactUsPanel.add(teamMember1EmailLabel);
        JLabel teamMember2EmailLabel = new JLabel("nfayadh@uwo.ca");
        contactUsPanel.add(teamMember2EmailLabel);
        JLabel teamMember3EmailLabel = new JLabel("tharish@uwo.ca");
        contactUsPanel.add(teamMember3EmailLabel);
        JLabel teamMember4EmailLabel = new JLabel("smehrava@uwo.ca");
        contactUsPanel.add(teamMember4EmailLabel);
        JLabel teamMember5EmailLabel = new JLabel("nsobhan@uwo.ca");
        contactUsPanel.add(teamMember5EmailLabel);

        
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        LoginPageText.setEditable(false);
        LoginPageText.setBackground(new java.awt.Color(255, 255, 255));
        LoginPageText.setColumns(20);
        LoginPageText.setLineWrap(true);
        LoginPageText.setRows(5);
        LoginPageText.setText("Enter username and password, and then click \"Login\" button. In case, password is forgotten, use the forgot password button to make a new password.");
        LoginPageText.setWrapStyleWord(true);
        LoginPanel.setViewportView(LoginPageText);

        FirstTabMenu.addTab("Login", LoginPanel);
        
        
        LogoutText.setEditable(false);
        LogoutText.setBackground(new java.awt.Color(255, 255, 255));
        LogoutText.setColumns(20);
        LogoutText.setLineWrap(true);
        LogoutText.setRows(5);
        LogoutText.setText("Click on the logout button next to the help page in order to be able to logout of your account.");
        LogoutText.setWrapStyleWord(true);
        LogoutPanel.setViewportView(LogoutText);

        MainPageTabMenu.addTab("Logout", LogoutPanel);

        BuildingText.setEditable(false);
        BuildingText.setBackground(new java.awt.Color(255, 255, 255));
        BuildingText.setColumns(20);
        BuildingText.setLineWrap(true);
        BuildingText.setRows(5);
        BuildingText.setText("Click on the drop down menu, and make a selection of the building you want to browse.");
        BuildingText.setWrapStyleWord(true);
        BuildingPanel.setViewportView(BuildingText);

        MainPageTabMenu.addTab("Building Selection", BuildingPanel);

        FirstTabMenu.addTab("Main Page", MainPageTabMenu);
        
        JTextArea searchTextArea = new javax.swing.JTextArea();
        searchTextArea.setEditable(false);
        searchTextArea.setBackground(new java.awt.Color(255, 255, 255));
        searchTextArea.setColumns(20);
        searchTextArea.setLineWrap(true);
        searchTextArea.setRows(5);
        searchTextArea.setWrapStyleWord(true);
        searchTextArea.setText("To search for floors, the user can select the floor from a dropdown and enter a room number");

        JScrollPane searchPanel = new javax.swing.JScrollPane();
        searchPanel.setViewportView(searchTextArea);
        
        JTabbedPane searchTabMenu = new javax.swing.JTabbedPane();
        searchTabMenu.addTab("Search", searchPanel);
        
        FirstTabMenu.addTab("Search", searchTabMenu);

        ViewPOIText.setEditable(false);
        ViewPOIText.setBackground(new java.awt.Color(255, 255, 255));
        ViewPOIText.setColumns(20);
        ViewPOIText.setLineWrap(true);
        ViewPOIText.setRows(5);
        ViewPOIText.setText("Built-in POIs are displayed automatically when you start browing the maps, to hide it, just check the box with layer label. Same thing applies for user added POIs.");
        ViewPOIText.setWrapStyleWord(true);
        ViewPOIPanel.setViewportView(ViewPOIText);

        POITabMenu.addTab("View POIs", ViewPOIPanel);

        AddPOIText.setEditable(false);
        AddPOIText.setBackground(new java.awt.Color(255, 255, 255));
        AddPOIText.setColumns(20);
        AddPOIText.setLineWrap(true);
        AddPOIText.setRows(5);
        AddPOIText.setText("To add a user POI, user can click on the add button to add their own points of interest.");
        AddPOIText.setWrapStyleWord(true);
        AddPOIPanel.setViewportView(AddPOIText);

        POITabMenu.addTab("Adding POIs", AddPOIPanel);
        
        JTextArea favouritePOIText = new JTextArea();
        favouritePOIText.setEditable(false);
        favouritePOIText.setBackground(new java.awt.Color(255, 255, 255));
        favouritePOIText.setColumns(20);
        favouritePOIText.setLineWrap(true);
        favouritePOIText.setRows(5);
        favouritePOIText.setText("To add favourites, users can click on existing pois and add them to their favourites");
        favouritePOIText.setWrapStyleWord(true);
        JScrollPane favouritePOIPanel = new JScrollPane();
        favouritePOIPanel.setViewportView(favouritePOIText);
        
        POITabMenu.addTab("Favourite POIs", favouritePOIPanel);

        POITabMenu.setSelectedIndex(0); // Display the first tab by default
        POITabMenu.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        
                EditPOIText.setEditable(false);
        EditPOIText.setBackground(new java.awt.Color(255, 255, 255));
        EditPOIText.setColumns(20);
        EditPOIText.setLineWrap(true);
        EditPOIText.setRows(5);
        EditPOIText.setText("To edit the user's favourite POI, users can edit and delete favourite pois by clicking the poi they would like to edit/delete.");
        EditPOIText.setWrapStyleWord(true);
        EditPOIPanel.setViewportView(EditPOIText);

        POITabMenu.addTab("Editing/Deleting Favourite POIs", EditPOIPanel);

        FirstTabMenu.addTab("POI", POITabMenu);

        LayerText.setEditable(false);
        LayerText.setBackground(new java.awt.Color(255, 255, 255));
        LayerText.setColumns(20);
        LayerText.setLineWrap(true);
        LayerText.setRows(5);
        LayerText.setText("To turn off a layer on a floor, check the box beside the layer's name to display it, to turn it on, uncheck the box again.");
        LayerText.setWrapStyleWord(true);
        LayerPanel.setViewportView(LayerText);

        MapsTabMenu.addTab("Layer Toggling", LayerPanel);

        ReturnText.setEditable(false);
        ReturnText.setBackground(new java.awt.Color(255, 255, 255));
        ReturnText.setColumns(20);
        ReturnText.setLineWrap(true);
        ReturnText.setRows(5);
        ReturnText.setText("Click on the button to return to the main page, if the data is not saved, a warning would pop-up to ask you to save it.");
        ReturnText.setWrapStyleWord(true);
        ReturnPanel.setViewportView(ReturnText);

        MapsTabMenu.addTab("Return to Main Page", ReturnPanel);

        FirstTabMenu.addTab("Maps", MapsTabMenu);

        
        AddFloorText.setEditable(false);
        AddFloorText.setBackground(new java.awt.Color(255, 255, 255));
        AddFloorText.setColumns(20);
        AddFloorText.setLineWrap(true);
        AddFloorText.setRows(5);
        AddFloorText.setText("Once entered in the developer mode, click on the add button beside the drop down menu of the floor to add it, a pop-up window will show where you will add the floors information.");
        AddFloorText.setWrapStyleWord(true);
        AddFloorPanel.setViewportView(AddFloorText);

        FloorTabMenu.addTab("Add", AddFloorPanel);

        EditFloorText.setEditable(false);
        EditFloorText.setBackground(new java.awt.Color(255, 255, 255));
        EditFloorText.setColumns(20);
        EditFloorText.setLineWrap(true);
        EditFloorText.setRows(5);
        EditFloorText.setText("Click on the edit button beside the drop down menu and pick a floor to edit.");
        EditFloorText.setWrapStyleWord(true);
        EditFloorPanel.setViewportView(EditFloorText);

        FloorTabMenu.addTab("Edit", EditFloorPanel);

        RemoveFloorText.setEditable(false);
        RemoveFloorText.setBackground(new java.awt.Color(255, 255, 255));
        RemoveFloorText.setColumns(20);
        RemoveFloorText.setLineWrap(true);
        RemoveFloorText.setRows(5);
        RemoveFloorText.setText("Click on the remove button beside the drop down menu and pick a floor to remove.");
        RemoveFloorText.setWrapStyleWord(true);
        RemoveFloorPanel.setViewportView(RemoveFloorText);

        FloorTabMenu.addTab("Remove", RemoveFloorPanel);
        
        DeveloperTabMenu.addTab("Floors", FloorTabMenu);

        EditPOIText_2.setEditable(false);
        EditPOIText_2.setBackground(new java.awt.Color(255, 255, 255));
        EditPOIText_2.setColumns(20);
        EditPOIText_2.setLineWrap(true);
        EditPOIText_2.setRows(5);
        EditPOIText_2.setText("To add the user POI, developers can click on the add button to add a built in poi.");
        EditPOIText_2.setWrapStyleWord(true);
        EditPOIPanel_2.setViewportView(EditPOIText_2);

        POITabMenu_2.addTab("Add", EditPOIPanel_2);

        RemovePOIText.setEditable(false);
        RemovePOIText.setBackground(new java.awt.Color(255, 255, 255));
        RemovePOIText.setColumns(20);
        RemovePOIText.setLineWrap(true);
        RemovePOIText.setRows(5);
        RemovePOIText.setText("To edit/remove a POI, developers can clidd on existing POIs to remove or edit them.");
        RemovePOIText.setWrapStyleWord(true);
        RemovePOIPanel.setViewportView(RemovePOIText);

        POITabMenu_2.addTab("Edit/Remove", RemovePOIPanel);

        DeveloperTabMenu.addTab("Built-in POI", POITabMenu_2);

        FirstTabMenu.addTab("Developer Mode", DeveloperTabMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FirstTabMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FirstTabMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
        );

        pack();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Help().setVisible(true);
            }
        });
    }

    /**
     * Variables declaration 
     */
    private javax.swing.JScrollPane LayerPanel;
    private javax.swing.JScrollPane ReturnPanel;
    private javax.swing.JScrollPane LoginPanel;
    private javax.swing.JScrollPane RemoveBuildingPanel;
    private javax.swing.JScrollPane AddFloorPanel;
    private javax.swing.JScrollPane EditFloorPanel;
    private javax.swing.JScrollPane AddBuildingPanel;
    private javax.swing.JScrollPane RemoveFloorPanel;
    private javax.swing.JScrollPane ViewPOIPanel;
    private javax.swing.JScrollPane EditPOIPanel_2;
    private javax.swing.JScrollPane RemovePOIPanel;
    private javax.swing.JScrollPane AddPOIPanel;
    private javax.swing.JScrollPane EditPOIPanel;
    private javax.swing.JScrollPane LogoutPanel;
    private javax.swing.JScrollPane BuildingPanel;
    
    private javax.swing.JTabbedPane FirstTabMenu;
    private javax.swing.JTabbedPane POITabMenu;
    private javax.swing.JTabbedPane MainPageTabMenu;
    private javax.swing.JTabbedPane MapsTabMenu;
    private javax.swing.JTabbedPane DeveloperTabMenu;
    private javax.swing.JTabbedPane BuildingTabMenu;
    private javax.swing.JTabbedPane FloorTabMenu;
    private javax.swing.JTabbedPane POITabMenu_2;
    
    private javax.swing.JTextArea LayerText;
    private javax.swing.JTextArea ReturnText;
    private javax.swing.JTextArea LoginPageText;
    private javax.swing.JTextArea RemoveBuildingText;
    private javax.swing.JTextArea AddFloorText;
    private javax.swing.JTextArea EditFloorText;
    private javax.swing.JTextArea AddBuildingText;
    private javax.swing.JTextArea RemoveFloorText;
    private javax.swing.JTextArea ViewPOIText;
    private javax.swing.JTextArea EditPOIText_2;
    private javax.swing.JTextArea RemovePOIText;
    private javax.swing.JTextArea AddPOIText;
    private javax.swing.JTextArea EditPOIText;
    private javax.swing.JTextArea LogoutText;
    private javax.swing.JTextArea BuildingText;
    private javax.swing.JButton contactUsButton;
    private javax.swing.JTextArea aboutTextArea;
}
