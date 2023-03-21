/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.westernunav1;
import javax.swing.*;//import required package



/**
 *
 * @author tanusri
 */
import javax.swing.*;//import required package
import java.util.ArrayList;
import java.util.Scanner;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


/**
 *
 * @author tanusri
 */
public class User {
    
    String name; //UserName of the person
    String loginCredentials; //Password of the person
    ArrayList<PointofInterest> savedPOI; //Saved POI's associated with the user info

    public User() {
    
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

    public void savedPOI(ArrayList<PointofInterest> savedPOI) {
        this.savedPOI = savedPOI;
    }
    
    public void unsavedPOI(ArrayList<PointofInterest> savedPOI) {
        this.savedPOI = savedPOI;
    }
    
    public static void main (String args[]){
        
        JSONParser userInfo = new JSONParser();
        
        User newUser = new User();
        
        try{
            
            FileReader openLogin;
            openLogin = new FileReader("loginInfo.json");
            System.out.println("success\n");
            Object obj =  userInfo.parse(openLogin);
            JSONArray arr = (JSONArray)obj;
            JSONObject jsonobj = (JSONObject)arr.get(0);
            
            Scanner userCred = new Scanner(System.in);
            System.out.println("Enter Username: ");
            
            String getUserName = userCred.nextLine();
            
            while(getUserName.equals(jsonobj.get("name")) == false){
                if(getUserName.equals(jsonobj.get("name")) == true){
                    break;
                }
                System.out.println("Invalid. Enter Valid Username: ");
                getUserName = userCred.nextLine();
            }
            
            System.out.println("Enter Password: ");
            String getPassword = userCred.nextLine();
            
            while(getPassword.equals(jsonobj.get("loginCredentials")) == false){
                if(getPassword.equals(jsonobj.get("loginCredentials")) == true){
                    
                    break;
                }
                System.out.println("Invalid. Enter Valid Password: ");
                getPassword = userCred.nextLine();
            }
            
            newUser.setName(getUserName);
            newUser.setLoginCredentials(getPassword);
            
            
            System.out.println("Access Granted.");
            System.out.println("Welcome: " + newUser.getName());
            
            
            openLogin.close();
            
        }catch (FileNotFoundException e){
            
            System.out.println("FileNotFound\n");
            
        }catch(IOException e){
            
           System.out.println("ErrorClosingFile\n");
           
        }catch(ParseException e){
            
           System.out.println("ErrorParsing\n");
           
        }
        
    }
    
}

