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
    /*private variables*/
    private String poiname;
    private String poidescription;
    private String poilocation;
    
    /*get point of interest name*/
    public String getPoiname() {
        return poiname;
    }

    /*set point of interest name*/
    public void setPoiname(String poiname) {
        this.poiname = poiname;
    }
    
    /*get point of interest description*/
    public String getPoidescription() {
        return poidescription;
    }

    /*set point of interest description*/
    public void setPoidescription(String poidescription) {
        this.poidescription = poidescription;
    }
    
    /*get point of interest location*/
    public String getPoilocation() {
        return poilocation;
    }

    /*set point of interest location*/
    public void setPoilocation(String poilocation) {
        this.poilocation = poilocation;
    }
}
