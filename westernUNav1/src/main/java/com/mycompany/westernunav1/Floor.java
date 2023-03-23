/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.westernunav1;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.*;

/**
 *
 * @author Hala Abudaqqa
 * 
 * A floor has a floor number and contains rooms and points of interest.
 * Rooms and points of interest can be added or removed from the floor.
 */
public class Floor {
    
    /**The floor number of the floor*/
    private int floorNumber;
    
    /**The list of rooms on the floor*/
    private ArrayList<Room> rooms;
    
    /**The list of points of interest on the floor*/
    private LinkedList<PointofInterest> pointofInterest;
    
    /**
     * Constructs a new floor with the given floor number.
     * 
     * @param floorNumber the floor number of the new floor.
     */
    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
        this.rooms = new ArrayList<Room>();
        this.pointofInterest = new LinkedList<PointofInterest>();
    }
    
    /**
     * Returns the floor number of the floor.
     * 
     * @return the floor number of the floor.
     */
    public int getNumber(){
        return this.floorNumber;
    }
    
    /**
     * Returns an array of all the rooms on the floor.
     * 
     * @return an array of all the rooms on the floor.
     */
    public Room[] getRooms(){
        // Create a new Room array with the same length as the rooms ArrayList
        Room[] roomsArray = new Room[this.rooms.size()];
        
        // Iterate over the ArrayList and assign each Room object to the corresponding index in the new array
        for (int i = 0; i < roomsArray.length; i++) {
            roomsArray[i] = this.rooms.get(i);
        }
        return roomsArray;
    }
    
    /**
     * Adds a room to the floor.
     * 
     * @param room the room to add to the floor.
     */
    public void addRoom(Room room){
        this.rooms.add(room);
    }
    
    /**
     * Removes a room from the floor.
     * 
     * @param room the room to remove from the floor.
     */
    public void removeRoom(Room room){
        this.rooms.remove(room);
    }
    
    /**
     * Gets a list of points of interest on the floor.
     *
     * @return a list of points of interest on the floor
     */
    public LinkedList<PointofInterest> getPointsOfInterest(){
        return this.pointofInterest;
    }
    
    /**
     * Adds a point of interest to the floor.
     *
     * @param poi the point of interest to add
     */
    public void addPointOfInterest(PointofInterest poi){
        this.pointofInterest.add(poi);
    }
    
    /**
     * Removes a point of interest from the floor.
     *
     * @param poi the point of interest to remove
     */
    public void removePointOfInterest(PointofInterest poi){
        this.pointofInterest.remove(poi);
    }
}