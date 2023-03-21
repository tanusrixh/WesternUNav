/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.westernunav1;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Hala Abudaqqa
 */
public class Floor {
    
   
    // two instance variables
    private int floorNumber;
    private ArrayList<Room> rooms;  // arraylist of Room objects
    
    // constructor
    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
        this.rooms = new ArrayList<Room>();
    }
    
    public int getNumber(){
        return this.floorNumber;
    }
    
    public Room[] getRooms(){
        // Create a new Room array with the same length as the rooms ArrayList
        Room[] roomsArray = new Room[this.rooms.size()];
        
        // Iterate over the ArrayList and assign each Room object to the corresponding index in the new array
        for (int i = 0; i < roomsArray.length; i++) {
            roomsArray[i] = this.rooms.get(i);
        }
        return roomsArray;
    }
    
    public void addRoom(Room room){
        this.rooms.add(room);
    }
    
    public void removeRoom(Room room){
        this.rooms.remove(room);
    }
}