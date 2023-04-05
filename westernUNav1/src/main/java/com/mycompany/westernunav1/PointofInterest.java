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
    
    
    private String poiRoomNumber;
    private String poiDescription;
    private Building poilocation;
    
    private String category;
    
    private int poiX;
    private int poiY;

    public PointofInterest(String poiroomname, String poidescription, String category, int poiX, int poiY) {
        this.poiRoomNumber = poiroomname;
        this.poiDescription = poidescription;
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
    public String getPoiRoomNumber() {
        return poiRoomNumber;
    }

    /*set point of interest name*/
    public void setPoiRoomNumber(String poiRoomNumber) {
        this.poiRoomNumber = poiRoomNumber;
    }
    
    /*get point of interest description*/
    public String getPoiDescription() {
        return poiDescription;
    }

    /*set point of interest description*/
    public void setPoiDescription(String poiDescription) {
        this.poiDescription = poiDescription;
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