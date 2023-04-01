/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileS    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
ystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.westernunav1;

import java.util.ArrayList;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.io.File;
import java.lang.Exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

/**
 *
 * @author tanusri
 */
public class User extends javax.swing.JFrame{

    private String name; //UserName of the person
    private String loginCredentials; //Password of the person
    private ArrayList<PointofInterest> savedPOI; //Saved POI's associated with the user info
    private ArrayList<PointofInterest> favePOI; //Saved favourite POI's associated with the user info
    private boolean isDeveloper; //True if user is developer and false otherwise

    public User(String name, String loginCredentials, ArrayList<PointofInterest> savedPOI, ArrayList<PointofInterest> favePOI, boolean isDeveloper) {
        this.name = name;
        this.loginCredentials = loginCredentials;
        this.savedPOI = savedPOI;
        this.favePOI = favePOI;
        this.isDeveloper = isDeveloper;
    }

    public void setFavePOI(ArrayList<PointofInterest> favePOI) {
        this.favePOI = favePOI;
    }

    public void setIsDeveloper(boolean isDeveloper) {
        this.isDeveloper = isDeveloper;
    }

    public ArrayList<PointofInterest> getFavePOI() {
        return favePOI;
    }

    public boolean getIsDeveloper() {
        return isDeveloper;
    }

    /**
     * Creates new form User
     */
    public User() {
        initComponents();
        
    }

    public User(String name, String loginCredentials, ArrayList<PointofInterest> savedPOI) {
        this.name = name;
        this.loginCredentials = loginCredentials;
        this.savedPOI = savedPOI;
    }

    public String getName() {
        return name;
    }

    public String getLoginCredentials() {
        return loginCredentials;
    }

    public ArrayList<PointofInterest> getSavedPOI() {
        return savedPOI;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLoginCredentials(String loginCredentials) {
        this.loginCredentials = loginCredentials;
    }

    public void setSavedPOI(ArrayList<PointofInterest> savedPOI) {
        this.savedPOI = savedPOI;
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
        AppLayers = new javax.swing.JLayeredPane();
        loginPage = new javax.swing.JPanel();
        loginUserID = new javax.swing.JTextField();
        loginPass = new javax.swing.JTextField();
        buttonLogin = new javax.swing.JButton();
        try{
            BufferedImage image = ImageIO.read(new File("./logoImage.jpg"));
            Image logoimage = image.getScaledInstance(screenSize.width/3, screenSize.height/7, Image.SCALE_DEFAULT);
            logo = new JLabel(new ImageIcon(logoimage));
        }catch(IOException exc){
            System.out.println("error.");
        }
        useridLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        forgotPass = new javax.swing.JButton();
        helpButton = new javax.swing.JButton();
        forgotPassPage = new javax.swing.JPanel();
        forgotPassLabel = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        fNameLabel = new javax.swing.JLabel();
        currUserID = new javax.swing.JTextField();
        newPassLabel = new javax.swing.JLabel();
        currFirstName = new javax.swing.JTextField();
        newPass = new javax.swing.JTextField();
        changePassButton = new javax.swing.JButton();
        noChangeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        AppLayers.setBackground(new java.awt.Color(255, 255, 255));
        AppLayers.setLayout(new java.awt.CardLayout());

        loginPage.setBackground(new java.awt.Color(255, 255, 255));
        loginPage.setMaximumSize(new java.awt.Dimension(1920, 1080));
        loginPage.setPreferredSize(new java.awt.Dimension(1920, 1080));

        loginUserID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginUserIDActionPerformed(evt);
            }
        });

        this.setSize(screenSize.width, screenSize.height);
        loginPage.setSize(screenSize.width, screenSize.height);

        buttonLogin.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        buttonLogin.setText("Login");
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });

        logo.setText(null);

        useridLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        useridLabel.setText("Username:");

        passwordLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        passwordLabel.setText("Password:");

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jLabel1.setText("Login Page");

        forgotPass.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        forgotPass.setText("Forgot Password?");
        forgotPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotPassActionPerformed(evt);
            }
        });

        helpButton.setText("Help");
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPageLayout = new javax.swing.GroupLayout(loginPage);
        loginPage.setLayout(loginPageLayout);
        loginPageLayout.setHorizontalGroup(
            loginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPageLayout.createSequentialGroup()
                .addGroup(loginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPageLayout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel1))
                    .addGroup(loginPageLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(loginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(loginPageLayout.createSequentialGroup()
                                .addComponent(useridLabel)
                                .addGap(18, 18, 18)
                                .addComponent(loginUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(loginPageLayout.createSequentialGroup()
                                .addComponent(passwordLabel)
                                .addGap(20, 20, 20)
                                .addGroup(loginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(loginPass, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(loginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(forgotPass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                .addGap(282, 282, 282)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPageLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(helpButton)
                .addGap(58, 58, 58))
        );
        loginPageLayout.setVerticalGroup(
            loginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPageLayout.createSequentialGroup()
                .addGroup(loginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(loginPageLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)
                        .addGap(44, 44, 44)
                        .addGroup(loginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loginUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(useridLabel)))
                    .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(80, 80, 80)
                .addGroup(loginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addGap(70, 70, 70)
                .addComponent(forgotPass)
                .addGap(44, 44, 44)
                .addComponent(buttonLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 332, Short.MAX_VALUE)
                .addComponent(helpButton)
                .addGap(59, 59, 59))
        );

        AppLayers.add(loginPage, "card2");

        forgotPassPage.setBackground(new java.awt.Color(255, 255, 255));

        forgotPassLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        forgotPassLabel.setText("Forgot Password?");

        userNameLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        userNameLabel.setText("Username:");

        fNameLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        fNameLabel.setText("First Name:");

        newPassLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        newPassLabel.setText("New Password:");

        changePassButton.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        changePassButton.setText("Change Password");
        changePassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePassButtonActionPerformed(evt);
            }
        });

        noChangeButton.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        noChangeButton.setText("Back Home");
        noChangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noChangeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout forgotPassPageLayout = new javax.swing.GroupLayout(forgotPassPage);
        forgotPassPage.setLayout(forgotPassPageLayout);
        forgotPassPageLayout.setHorizontalGroup(
            forgotPassPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(forgotPassPageLayout.createSequentialGroup()
                .addContainerGap(469, Short.MAX_VALUE)
                .addGroup(forgotPassPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, forgotPassPageLayout.createSequentialGroup()
                        .addGroup(forgotPassPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(forgotPassPageLayout.createSequentialGroup()
                                .addGroup(forgotPassPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(newPassLabel)
                                    .addComponent(fNameLabel)
                                    .addComponent(userNameLabel))
                                .addGap(18, 18, 18)
                                .addGroup(forgotPassPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(forgotPassLabel)
                                    .addComponent(currUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(currFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(newPass, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(forgotPassPageLayout.createSequentialGroup()
                                .addComponent(changePassButton)
                                .addGap(12, 12, 12)))
                        .addGap(565, 565, 565))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, forgotPassPageLayout.createSequentialGroup()
                        .addComponent(noChangeButton)
                        .addGap(613, 613, 613))))
        );
        forgotPassPageLayout.setVerticalGroup(
            forgotPassPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(forgotPassPageLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(forgotPassLabel)
                .addGap(72, 72, 72)
                .addGroup(forgotPassPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userNameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(forgotPassPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fNameLabel)
                    .addComponent(currFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(forgotPassPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPassLabel)
                    .addComponent(newPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(changePassButton)
                .addGap(35, 35, 35)
                .addComponent(noChangeButton)
                .addContainerGap(480, Short.MAX_VALUE))
        );

        AppLayers.add(forgotPassPage, "card5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AppLayers, javax.swing.GroupLayout.DEFAULT_SIZE, 1420, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AppLayers, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 879, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
    Method for the login button, when the user enters the correct login 
    credentials, the JFrame will switch from the login panel to the Buildings 
    Panel where the user can choose the building they would like to save POI's
    for.
     */
    
    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        // TODO add your handling code here:
        User newUser = new User();
        buildingList = new ArrayList<Building>();
        ArrayList<PointofInterest> userPOI = new ArrayList<PointofInterest>();
        ArrayList<PointofInterest> favUserPOI = new ArrayList<PointofInterest>();

        try {
            String userID = loginUserID.getText();
            String pass = loginPass.getText();

            FileReader openLogin;
            openLogin = new FileReader(userID + ".json");
            System.out.println("success\n"); // to test that the JSON file opened successfully
            JSONTokener tok = new JSONTokener(openLogin);
            JSONObject jsonobj = new JSONObject(tok); // get the username and password stored at index 0 in the login JSON file
            JSONArray poiArr = jsonobj.getJSONArray("poi");
            JSONArray favPoiArr = jsonobj.getJSONArray("favourites");
            

            if (userID.equals(jsonobj.get("name")) == true && pass.equals(jsonobj.get("loginCredentials")) == true) {
                newUser.setName(userID);
                newUser.setIsDeveloper((boolean)jsonobj.get("isDeveloper"));
                
                for(int i = 0; i < poiArr.length(); i++){
                    PointofInterest poi = (PointofInterest)poiArr.get(i);
                    userPOI.add(i, poi);
                }
                
                for(int i = 0; i < favPoiArr.length(); i++){
                    PointofInterest favpoi = (PointofInterest)favPoiArr.get(i);
                    favUserPOI.add(i, favpoi);
                }
                
                
                newUser.setSavedPOI(userPOI);
                newUser.setFavePOI(favUserPOI);
               
                MapSelector displayMaps = new MapSelector(newUser);
                displayMaps.show();
                this.dispose();
               
                JOptionPane.showMessageDialog(null, "Access Granted. Welcome " + userID);
                newUser.setName(userID);
                newUser.setLoginCredentials(pass);

            } else {
                JOptionPane.showMessageDialog(null, "Incorrect Password!\nPlease try again.");

            }

            openLogin.close();

        } catch (FileNotFoundException ae) {
            JOptionPane.showMessageDialog(null, "Incorrect Username!\nPlease try again.");

            System.out.println("FileNotFound\n");

        } catch (IOException se) {

            System.out.println("ErrorClosingFile\n");

        } 
    }//GEN-LAST:event_buttonLoginActionPerformed

    private void loginUserIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginUserIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginUserIDActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentResized

    private void forgotPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotPassActionPerformed
        // TODO add your handling code here:
        loginUserID.setText("");
        loginPass.setText("");
        switchPanels(forgotPassPage);
    }//GEN-LAST:event_forgotPassActionPerformed

    private void changePassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePassButtonActionPerformed
        // TODO add your handling code here:
        

        try {
            String userID = currUserID.getText();
            FileReader openLogin;
            openLogin = new FileReader(userID + ".json");
            System.out.println("success\n"); // to test that the JSON file opened successfully
            JSONTokener tok = new JSONTokener(openLogin);
            JSONObject currJsonObj = new JSONObject(tok); // get the username and password stored at index 0 in the login JSON file

            
            String firstName = currFirstName.getText();
            String changePass = newPass.getText();

            if (userID.equals(currJsonObj.get("name")) == true && firstName.equals(currJsonObj.get("firstName")) == true) {
                switchPanels(loginPage);
                currJsonObj.put("loginCredentials", changePass);
                JOptionPane.showMessageDialog(null, "Password Successfully Changed.\nPlease log in again. ");
                
                FileOutputStream outputStream = new FileOutputStream(userID + ".json"); 
                byte[] strToBytes = currJsonObj.toString().getBytes(); 
                outputStream.write(strToBytes); 
                outputStream.close();
                
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect First Name!\nPlease try again.");

            }
            currUserID.setText("");
            currFirstName.setText("");
            newPass.setText("");
            openLogin.close();

        } catch (FileNotFoundException ae) {
            JOptionPane.showMessageDialog(null, "Incorrect Username!\nPlease try again.");
            System.out.println("FileNotFound\n");

        } catch (IOException se) {

            System.out.println("ErrorClosingFile\n");

        } 
    }//GEN-LAST:event_changePassButtonActionPerformed

    private void noChangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noChangeButtonActionPerformed
        // TODO add your handling code here:
        int input = JOptionPane.showOptionDialog(null, "Going back will not reset password.\nContinue?","Warning", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);

        if(input == JOptionPane.OK_OPTION)
        {
            switchPanels(loginPage);
        }
    }//GEN-LAST:event_noChangeButtonActionPerformed

    /*
    Method to display the UWO Logo on login page
    */
    public void displayLogo() {
        loginPage.add(logo);

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
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);
            }
        });
    }

    /*
    switchPanels method will switch between panels provided the user enters the 
    appropriate input. (i.e. for the login page, if the user enters the correct
    login credentials they will be redirected to the buildings page).
     */
    public void switchPanels(JPanel panel) {
        AppLayers.removeAll();
        AppLayers.add(panel);
        AppLayers.repaint();
        AppLayers.revalidate();
    }
    
     private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        new Help().setVisible(true);        // TODO add your handling code here:
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane AppLayers;
    private javax.swing.JButton buttonLogin;
    private javax.swing.JButton changePassButton;
    private javax.swing.JTextField currFirstName;
    private javax.swing.JTextField currUserID;
    private javax.swing.JLabel fNameLabel;
    private javax.swing.JButton forgotPass;
    private javax.swing.JLabel forgotPassLabel;
    private javax.swing.JPanel forgotPassPage;
    private javax.swing.JButton helpButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel loginPage;
    private javax.swing.JTextField loginPass;
    private javax.swing.JTextField loginUserID;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField newPass;
    private javax.swing.JLabel newPassLabel;
    private javax.swing.JButton noChangeButton;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JLabel useridLabel;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Building> buildingList;
}
