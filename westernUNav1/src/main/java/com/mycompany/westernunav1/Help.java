/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.westernunav1;

/**
 *
 * @author nourfayadh
 */
public class Help extends javax.swing.JFrame{
    
    // constructor method to call the initComponents method where all of the GUI components are created
    public Help(){
        initComponents();
    }
    
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
        EditBuildingPanel = new javax.swing.JScrollPane();
        EditBuildingText = new javax.swing.JTextArea();
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
        AddPOIPanel_2 = new javax.swing.JScrollPane();
        AddPOIText_2 = new javax.swing.JTextArea();
        EditPOIPanel_2 = new javax.swing.JScrollPane();
        EditPOIText_2 = new javax.swing.JTextArea();
        RemovePOIPanel = new javax.swing.JScrollPane();
        RemovePOIText = new javax.swing.JTextArea();
        
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
        LogoutText.setText("");
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

        ViewPOIText.setEditable(false);
        ViewPOIText.setBackground(new java.awt.Color(255, 255, 255));
        ViewPOIText.setColumns(20);
        ViewPOIText.setLineWrap(true);
        ViewPOIText.setRows(5);
        ViewPOIText.setText("To view built-in POIs, turn on one of the subsections, by clicking on the box beside them, for built-in POI to choose which ones to look at. To view the user added POI's, turn on the section to view user POIs.");
        ViewPOIText.setWrapStyleWord(true);
        ViewPOIPanel.setViewportView(ViewPOIText);

        POITabMenu.addTab("View POIs", ViewPOIPanel);

        AddPOIText.setEditable(false);
        AddPOIText.setBackground(new java.awt.Color(255, 255, 255));
        AddPOIText.setColumns(20);
        AddPOIText.setLineWrap(true);
        AddPOIText.setRows(5);
        AddPOIText.setText("To add a user POI, click on the plus sign on the right panel, and then enter the POI's information in the pop-up window to add it.");
        AddPOIText.setWrapStyleWord(true);
        AddPOIPanel.setViewportView(AddPOIText);

        POITabMenu.addTab("Adding POIs", AddPOIPanel);

        EditPOIText.setEditable(false);
        EditPOIText.setBackground(new java.awt.Color(255, 255, 255));
        EditPOIText.setColumns(20);
        EditPOIText.setLineWrap(true);
        EditPOIText.setRows(5);
        EditPOIText.setText("To edit the user POI, click on it, and a pop-up window would show where you can edit it.");
        EditPOIText.setWrapStyleWord(true);
        EditPOIPanel.setViewportView(EditPOIText);

        POITabMenu.addTab("Editing User's POI", EditPOIPanel);

        FirstTabMenu.addTab("POI", POITabMenu);

        LayerText.setEditable(false);
        LayerText.setBackground(new java.awt.Color(255, 255, 255));
        LayerText.setColumns(20);
        LayerText.setLineWrap(true);
        LayerText.setRows(5);
        LayerText.setText("To turn on a layer on a floor, check the box beside the layer's name to display it, to turn it off, chech the box again.");
        LayerText.setWrapStyleWord(true);
        LayerPanel.setViewportView(LayerText);

        MapsTabMenu.addTab("Layer Toggling", LayerPanel);

        ReturnText.setEditable(false);
        ReturnText.setBackground(new java.awt.Color(255, 255, 255));
        ReturnText.setColumns(20);
        ReturnText.setLineWrap(true);
        ReturnText.setRows(5);
        ReturnText.setText("");
        ReturnText.setWrapStyleWord(true);
        ReturnPanel.setViewportView(ReturnText);

        MapsTabMenu.addTab("Return to Main Page", ReturnPanel);

        FirstTabMenu.addTab("Maps", MapsTabMenu);

        AddBuildingText.setEditable(false);
        AddBuildingText.setBackground(new java.awt.Color(255, 255, 255));
        AddBuildingText.setColumns(20);
        AddBuildingText.setLineWrap(true);
        AddBuildingText.setRows(5);
        AddBuildingText.setText("");
        AddBuildingText.setWrapStyleWord(true);
        AddBuildingPanel.setViewportView(AddBuildingText);

        BuildingTabMenu.addTab("Add", AddBuildingPanel);

        EditBuildingText.setEditable(false);
        EditBuildingText.setBackground(new java.awt.Color(255, 255, 255));
        EditBuildingText.setColumns(20);
        EditBuildingText.setLineWrap(true);
        EditBuildingText.setRows(5);
        EditBuildingText.setText("");
        EditBuildingText.setWrapStyleWord(true);
        EditBuildingPanel.setViewportView(EditBuildingText);

        BuildingTabMenu.addTab("Edit", EditBuildingPanel);

        RemoveBuildingText.setEditable(false);
        RemoveBuildingText.setBackground(new java.awt.Color(255, 255, 255));
        RemoveBuildingText.setColumns(20);
        RemoveBuildingText.setLineWrap(true);
        RemoveBuildingText.setRows(5);
        RemoveBuildingText.setText("");
        RemoveBuildingText.setWrapStyleWord(true);
        RemoveBuildingPanel.setViewportView(RemoveBuildingText);

        BuildingTabMenu.addTab("Remove", RemoveBuildingPanel);

        DeveloperTabMenu.addTab("Buildings", BuildingTabMenu);

        AddFloorText.setEditable(false);
        AddFloorText.setBackground(new java.awt.Color(255, 255, 255));
        AddFloorText.setColumns(20);
        AddFloorText.setLineWrap(true);
        AddFloorText.setRows(5);
        AddFloorText.setText("");
        AddFloorText.setWrapStyleWord(true);
        AddFloorPanel.setViewportView(AddFloorText);

        FloorTabMenu.addTab("Add", AddFloorPanel);

        EditFloorText.setEditable(false);
        EditFloorText.setBackground(new java.awt.Color(255, 255, 255));
        EditFloorText.setColumns(20);
        EditFloorText.setLineWrap(true);
        EditFloorText.setRows(5);
        EditFloorText.setText("");
        EditFloorText.setWrapStyleWord(true);
        EditFloorPanel.setViewportView(EditFloorText);

        FloorTabMenu.addTab("Edit", EditFloorPanel);

        RemoveFloorText.setEditable(false);
        RemoveFloorText.setBackground(new java.awt.Color(255, 255, 255));
        RemoveFloorText.setColumns(20);
        RemoveFloorText.setLineWrap(true);
        RemoveFloorText.setRows(5);
        RemoveFloorText.setText("");
        RemoveFloorText.setWrapStyleWord(true);
        RemoveFloorPanel.setViewportView(RemoveFloorText);

        FloorTabMenu.addTab("Remove", RemoveFloorPanel);

        DeveloperTabMenu.addTab("Floors", FloorTabMenu);

        AddPOIText_2.setEditable(false);
        AddPOIText_2.setBackground(new java.awt.Color(255, 255, 255));
        AddPOIText_2.setColumns(20);
        AddPOIText_2.setLineWrap(true);
        AddPOIText_2.setRows(5);
        AddPOIText_2.setText("");
        AddPOIText_2.setWrapStyleWord(true);
        AddPOIPanel_2.setViewportView(AddPOIText_2);

        POITabMenu_2.addTab("Add", AddPOIPanel_2);

        EditPOIText_2.setEditable(false);
        EditPOIText_2.setBackground(new java.awt.Color(255, 255, 255));
        EditPOIText_2.setColumns(20);
        EditPOIText_2.setLineWrap(true);
        EditPOIText_2.setRows(5);
        EditPOIText_2.setText("");
        EditPOIText_2.setWrapStyleWord(true);
        EditPOIPanel_2.setViewportView(EditPOIText_2);

        POITabMenu_2.addTab("Edit", EditPOIPanel_2);

        RemovePOIText.setEditable(false);
        RemovePOIText.setBackground(new java.awt.Color(255, 255, 255));
        RemovePOIText.setColumns(20);
        RemovePOIText.setLineWrap(true);
        RemovePOIText.setRows(5);
        RemovePOIText.setText("");
        RemovePOIText.setWrapStyleWord(true);
        RemovePOIPanel.setViewportView(RemovePOIText);

        POITabMenu_2.addTab("Remove", RemovePOIPanel);

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

    // Variables declaration 
    private javax.swing.JScrollPane EditBuildingPanel;
    private javax.swing.JScrollPane LayerPanel;
    private javax.swing.JScrollPane ReturnPanel;
    private javax.swing.JScrollPane LoginPanel;
    private javax.swing.JScrollPane RemoveBuildingPanel;
    private javax.swing.JScrollPane AddFloorPanel;
    private javax.swing.JScrollPane EditFloorPanel;
    private javax.swing.JScrollPane AddBuildingPanel;
    private javax.swing.JScrollPane RemoveFloorPanel;
    private javax.swing.JScrollPane ViewPOIPanel;
    private javax.swing.JScrollPane AddPOIPanel_2;
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
    
    private javax.swing.JTextArea EditBuildingText;
    private javax.swing.JTextArea LayerText;
    private javax.swing.JTextArea ReturnText;
    private javax.swing.JTextArea LoginPageText;
    private javax.swing.JTextArea RemoveBuildingText;
    private javax.swing.JTextArea AddFloorText;
    private javax.swing.JTextArea EditFloorText;
    private javax.swing.JTextArea AddBuildingText;
    private javax.swing.JTextArea RemoveFloorText;
    private javax.swing.JTextArea ViewPOIText;
    private javax.swing.JTextArea AddPOIText_2;
    private javax.swing.JTextArea EditPOIText_2;
    private javax.swing.JTextArea RemovePOIText;
    private javax.swing.JTextArea AddPOIText;
    private javax.swing.JTextArea EditPOIText;
    private javax.swing.JTextArea LogoutText;
    private javax.swing.JTextArea BuildingText;
}
