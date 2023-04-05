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
    
    private String buildingName;
    private String floorName;
    
    
    private String poiroomname;
    private String poidescription;
    private Building poilocation;
    
    private String category;
    
    private int poiX;
    private int poiY;

    public PointofInterest(String poiroomname, String poidescription, String category, int poiX, int poiY) {
        this.poiroomname = poiroomname;
        this.poidescription = poidescription;
        this.category = category;
        this.poiX = poiX;
        this.poiY = poiY;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getFloorName() {
        return floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    



    public int getPoiX() {
        return poiX;
    }

    public void setPoiX(int poiX) {
        this.poiX = poiX;
    }

    public int getPoiY() {
        return poiY;
    }

    public void setPoiY(int poiY) {
        this.poiY = poiY;
    }
    /*get point of interest name*/
    public String getPoiroomname() {
        return poiroomname;
    }

    /*set point of interest name*/
    public void setPoiroomname(String poiroomname) {
        this.poiroomname = poiroomname;
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
    public Building getPoilocation() {
        return poilocation;
    }

    /*set point of interest location*/
    public void setPoilocation(Building poilocation) {
        this.poilocation = poilocation;
    }
}