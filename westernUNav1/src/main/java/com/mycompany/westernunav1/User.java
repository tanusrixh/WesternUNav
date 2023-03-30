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

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author tanusri
 */
public class User extends javax.swing.JFrame{

    private String name; //UserName of the person
    private String loginCredentials; //Password of the person
    private ArrayList<PointofInterest> savedPOI; //Saved POI's associated with the user info

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
        LoginPage = new javax.swing.JPanel();
        UserID = new javax.swing.JTextField();
        Pass = new javax.swing.JTextField();
        Login = new javax.swing.JButton();
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
        jButton1 = new javax.swing.JButton();
        forgotPassPage = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        currUserID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        currFirstName = new javax.swing.JTextField();
        newPass = new javax.swing.JTextField();
        changePassButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        AppLayers.setBackground(new java.awt.Color(255, 255, 255));
        AppLayers.setLayout(new java.awt.CardLayout());

        LoginPage.setBackground(new java.awt.Color(255, 255, 255));
        LoginPage.setMaximumSize(new java.awt.Dimension(1920, 1080));
        LoginPage.setPreferredSize(new java.awt.Dimension(1920, 1080));

        UserID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserIDActionPerformed(evt);
            }
        });

        this.setSize(screenSize.width, screenSize.height);
        LoginPage.setSize(screenSize.width, screenSize.height);

        Login.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
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

        jButton1.setText("Help_Button");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginPageLayout = new javax.swing.GroupLayout(LoginPage);
        LoginPage.setLayout(LoginPageLayout);
        LoginPageLayout.setHorizontalGroup(
            LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPageLayout.createSequentialGroup()
                .addGroup(LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPageLayout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel1))
                    .addGroup(LoginPageLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(LoginPageLayout.createSequentialGroup()
                                .addComponent(useridLabel)
                                .addGap(18, 18, 18)
                                .addComponent(UserID, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(LoginPageLayout.createSequentialGroup()
                                .addComponent(passwordLabel)
                                .addGap(20, 20, 20)
                                .addGroup(LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(forgotPass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Login, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                .addGap(282, 282, 282)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPageLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(58, 58, 58))
        );
        LoginPageLayout.setVerticalGroup(
            LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPageLayout.createSequentialGroup()
                .addGroup(LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(LoginPageLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)
                        .addGap(44, 44, 44)
                        .addGroup(LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(useridLabel)))
                    .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(80, 80, 80)
                .addGroup(LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addGap(70, 70, 70)
                .addComponent(forgotPass)
                .addGap(44, 44, 44)
                .addComponent(Login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 332, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(59, 59, 59))
        );

        AppLayers.add(LoginPage, "card2");

        forgotPassPage.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel2.setText("Forgot Password?");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel3.setText("Username:");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel4.setText("First Name:");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel5.setText("New Password:");

        changePassButton.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        changePassButton.setText("Enter");
        changePassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePassButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout forgotPassPageLayout = new javax.swing.GroupLayout(forgotPassPage);
        forgotPassPage.setLayout(forgotPassPageLayout);
        forgotPassPageLayout.setHorizontalGroup(
            forgotPassPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, forgotPassPageLayout.createSequentialGroup()
                .addContainerGap(497, Short.MAX_VALUE)
                .addGroup(forgotPassPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(forgotPassPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(changePassButton)
                    .addComponent(jLabel2)
                    .addComponent(currUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newPass, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(537, 537, 537))
        );
        forgotPassPageLayout.setVerticalGroup(
            forgotPassPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(forgotPassPageLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addGap(72, 72, 72)
                .addGroup(forgotPassPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(forgotPassPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(currFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(forgotPassPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(newPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(changePassButton)
                .addContainerGap(543, Short.MAX_VALUE))
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
    
    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
        User newUser = new User();
        JSONParser userInfo = new JSONParser();
        JSONParser buildingsParser = new JSONParser();
        buildingList = new ArrayList<Building>();

        try {

            FileReader openLogin;
            openLogin = new FileReader("loginInfo.json");
            System.out.println("success\n"); // to test that the JSON file opened successfully
            Object obj = userInfo.parse(openLogin);
            JSONObject jsonobj = (JSONObject) obj; // get the username and password stored at index 0 in the login JSON file

            String userID = UserID.getText();
            String pass = Pass.getText();

            if (userID.equals(jsonobj.get("name")) == true && pass.equals(jsonobj.get("loginCredentials")) == true) {

              
                Map displayMaps = new Map();
                displayMaps.show();
                dispose();
               
                JOptionPane.showMessageDialog(null, "Access Granted. Welcome " + userID);
                newUser.setName(userID);
                newUser.setLoginCredentials(pass);

            } else {
                JOptionPane.showMessageDialog(null, "Incorrect Username or Password!\n Please try again.");

            }

            openLogin.close();

        } catch (FileNotFoundException ae) {

            System.out.println("FileNotFound\n");

        } catch (IOException se) {

            System.out.println("ErrorClosingFile\n");

        } catch (ParseException de) {

            System.out.println("ErrorParsing\n");

        }
    }//GEN-LAST:event_LoginActionPerformed

    private void UserIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserIDActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentResized

    private void forgotPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotPassActionPerformed
        // TODO add your handling code here:
        switchPanels(forgotPassPage);
    }//GEN-LAST:event_forgotPassActionPerformed

    private void changePassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePassButtonActionPerformed
        // TODO add your handling code here:
        JSONParser changeUserInfo = new JSONParser();

        try {

            FileReader openLogin;
            openLogin = new FileReader("loginInfo.json");
            System.out.println("success\n"); // to test that the JSON file opened successfully
            JSONObject currJsonObj = (JSONObject) changeUserInfo.parse(openLogin); // get the username and password stored at index 0 in the login JSON file

            String userID = currUserID.getText();
            String firstName = currFirstName.getText();
            String changePass = newPass.getText();

            if (userID.equals(currJsonObj.get("name")) == true && firstName.equals(currJsonObj.get("firstName")) == true) {
                switchPanels(LoginPage);
                currJsonObj.put("loginCredentials", changePass);
                JOptionPane.showMessageDialog(null, "Password Successfully Changed.\nPlease log in again. ");
                FileOutputStream outputStream = new FileOutputStream("loginInfo.json"); 
                byte[] strToBytes = currJsonObj.toString().getBytes(); 
                outputStream.write(strToBytes); 
                outputStream.close();
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect Username or Password!\n Please try again.");

            }

            openLogin.close();

        } catch (FileNotFoundException ae) {

            System.out.println("FileNotFound\n");

        } catch (IOException se) {

            System.out.println("ErrorClosingFile\n");

        } catch (ParseException de) {

            System.out.println("ErrorParsing\n");

        }
    }//GEN-LAST:event_changePassButtonActionPerformed

    public void displayLogo() {
        LoginPage.add(logo);

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
    
     private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Help().setVisible(true);        // TODO add your handling code here:
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane AppLayers;
    private javax.swing.JButton Login;
    private javax.swing.JPanel LoginPage;
    private javax.swing.JTextField Pass;
    private javax.swing.JTextField UserID;
    private javax.swing.JButton changePassButton;
    private javax.swing.JTextField currFirstName;
    private javax.swing.JTextField currUserID;
    private javax.swing.JButton forgotPass;
    private javax.swing.JPanel forgotPassPage;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField newPass;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel useridLabel;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Building> buildingList;
}
