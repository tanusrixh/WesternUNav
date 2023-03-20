/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.westernunav1;
import javax.swing.*;

/**
 *
 * @author tanusri
 */
public class Building {
    
    
    /** The building's name*/
    private String name;
    
    /** The building's number of floors*/
    private int floors;
    
    /** An array of the building's rooms*/
    private Room[] rooms;
    
    
    /** Building constructor, creates a new Building object
     * @param name the building's name
     * @param floors the number of floors
     * @param rooms an array of the building's rooms
     */
    public Building(String name, int floors, Room[] rooms){
        
        this.name = name;
        this.floors = floors;
        this.rooms = rooms;
    }
    
    
    /** A getter method to get the name of the building
     * @return the building's name
     */
    public String getName(){
        return name;
    }
    
    /** A setter method to set the name of the building
     * @param name the building's name
     */
    public void setName(String name){
        
        this.name = name;
    }
    
    /** A getter method to get the number of floors in the building
     * @return the number of floors in the building
     */
    public int getFloors(){
        return floors;
    }
    
    /** A setter method to set the number of floors in the building
     * @param floors the building's number of floors
     */
    public void setFloors(int floors){
        this.floors = floors;
    }
    
    /** A getter method to get the rooms in the building
     * @return the rooms in the building
     */
    public Room[] getRooms(){
        return rooms;
    }
    
    /** A setter method to set the rooms in the building
     * @param rooms the building's rooms
     */
    public void setRooms(Room[] rooms){
        this.rooms = rooms;
    }
    
}
