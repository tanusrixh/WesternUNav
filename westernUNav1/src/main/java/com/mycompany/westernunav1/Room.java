/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.westernunav1;
import javax.swing.*;
import java.util.ArrayList;

/**
 *
 * @author Sara Mehravar
 */
public class Room {
    //using three private variables for this class 
    //one String, one integer and one array list
    // room numbers
    private String roomNumber;

    //variable for accesibility features
    private String description;
    
    private int x_coord;
    private int y_coord;
    
    private String roomCategory;

    public Room(String roomNumber, String accesibiltyFeature, int x_coord, int y_coord, String roomCategory) {
        this.roomNumber = roomNumber;
        this.description = accesibiltyFeature;
        this.x_coord = x_coord;
        this.y_coord = y_coord;
        this.roomCategory = roomCategory;
    }

    public String getRoomCategory() {
        return roomCategory;
    }

    public void setRoomCategory(String roomCategory) {
        this.roomCategory = roomCategory;
    }

    public int getX_coord() {
        return x_coord;
    }

    public void setX_coord(int x_coord) {
        this.x_coord = x_coord;
    }

    public int getY_coord() {
        return y_coord;
    }

    public void setY_coord(int y_coord) {
        this.y_coord = y_coord;
    }

    /*building constrcutor
    * @param number of rooms
    * @param accesibility features 
    * @param POI
    */

    
    //a getter method to get the number of rooms
     public String getRoomNumber() {
        return roomNumber;
    }
     
    //a getter method that returns the accesibility feature
    public String getDescription() {
        return description;
    }

    
    //a setter method to set the bumber of rooms
    /*public void setRoomNumber(String roomNumber){
        this.roomNumber = Integer.parseInt(roomNumber);
    }*/

    /*the add method for adding a point of interest to the 
    * point of interest array list
    */

    /* the remove method for removing a point of interest 
    * of a point of interest array list
    */

    
}