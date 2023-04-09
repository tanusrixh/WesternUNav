/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.westernunav1;
import javax.swing.*;
import java.util.ArrayList;

/**
 * This class represents a room in a building.
 * It contains private variable for the room number, accessibility features, coordinates, and room category
 * 
 * @author Sara Mehravar
 */
public class Room {
    
    /** The number of the room */
    private String roomNumber;

    /** The accessibility feature of the room */
    private String description;
    
    /** The x-coordinate of the room */
    private int x_coord;
    
    /** The y-coordinate of the room */
    private int y_coord;
    
    /** The category of the room */
    private String roomCategory;

    /**
     * Contructs a new Room object with the given parameters
     * 
     * @param roomNumber the room number of the room
     * @param accesibiltyFeature the accessibility features of the room
     * @param x_coord the x-coordinate of the room
     * @param y_coord the y-coordinate of the room
     * @param roomCategory the category of the room
     */
    public Room(String roomNumber, String accesibiltyFeature, int x_coord, int y_coord, String roomCategory) {
        this.roomNumber = roomNumber;
        this.description = accesibiltyFeature;
        this.x_coord = x_coord;
        this.y_coord = y_coord;
        this.roomCategory = roomCategory;
    }

    /**
     * Returns the category of the room
     * 
     * @return the category of the room
     */
    public String getRoomCategory() {
        return roomCategory;
    }

    /**
     * Sets the category of the room
     * 
     * @param roomCategory the new category of the room
     */
    public void setRoomCategory(String roomCategory) {
        this.roomCategory = roomCategory;
    }

    /**
     * Returns the x-coordinate of the room
     * 
     * @return the x-coordinate of the room
     */
    public int getX_coord() {
        return x_coord;
    }

    /**
     * Sets the x-coordinate of the room
     * 
     * @param x_coord the new x-coordinate of the room
     */
    public void setX_coord(int x_coord) {
        this.x_coord = x_coord;
    }

    /**
     * Returns the y-coordinate of the room
     * 
     * @return the y-coordinate of the room
     */
    public int getY_coord() {
        return y_coord;
    }

    /**
     * Sets the y-coordinate of the room
     * 
     * @param y_coord the new x-coordinate of the room
     */
    public void setY_coord(int y_coord) {
        this.y_coord = y_coord;
    }

    /**
     * Returns the number of the room
     * 
     * @return 
     */
     public String getRoomNumber() {
        return roomNumber;
    }
     
    /**
     * Returns the accessibility features of the room
     * @return 
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the number of the room
     * @param roomNumber the new room number for the room
     */
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    /**
     * Sets the accessibility features of this room
     * 
     * @param description the new accessibility features for the room
     */
    public void setDescription(String description) {
        this.description = description;
    }
}