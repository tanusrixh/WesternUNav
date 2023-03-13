/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.westernunav1;
import javax.swing.*;

/**
 *
 * @author Nosheen
 */
public class PointofInterest {
    
    private String poiname;
    private String poidescription;
    private Map poilocation;
    
    public String getName(){
        return poiname;
}
    public void setName(String name){
        poiname = name;
    }
    public String getDescription(){
        return poidescription;
}
    public void setDescription(String description){
        poidescription = description;
    }
    public Map getLocation(){
        return poilocation;
}
    public void setLocation(Map location){
        poilocation = location;
    }
}
