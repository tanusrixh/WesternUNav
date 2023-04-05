/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.westernunav1;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.*;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

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
    
    private String floorName;
    
    /**The list of rooms on the floor that are built in POIs*/
    private ArrayList<Room> rooms;
    
    /**The list of points of interest on the floor for the user*/
    private LinkedList<PointofInterest> pointOfInterest;

    public Floor(int floorNumber, String floorName, ArrayList<Room> rooms) {
        this.floorNumber = floorNumber;
        this.floorName = floorName;
        this.rooms = rooms;
    }
    
    public Floor(int floorNumber, String floorName) {
        this.floorNumber = floorNumber;
        this.floorName = floorName;
        //this.rooms = rooms;
    }
    
    public Floor(int floorNumber, String floorName, ArrayList<Room> rooms, LinkedList<PointofInterest> pointofInterest) {
        this.floorNumber = floorNumber;
        this.floorName = floorName;
        this.rooms = rooms;
        this.pointOfInterest = pointofInterest;
    }

    public Floor(int floorNumber, String floorName, LinkedList<PointofInterest> pointofInterest) {
        this.floorNumber = floorNumber;
        this.floorName = floorName;
        this.pointOfInterest = pointofInterest;
    }
    
    
    /**
     * Constructs a new floor with the given floor number.
     * 
     * @param floorNumber the floor number of the new floor.
     */
    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
        this.rooms = new ArrayList<Room>();
        this.pointOfInterest = new LinkedList<PointofInterest>();
    }


    
    /**
     * Returns the floor number of the floor.
     * 
     * @return the floor number of the floor.
     */
  

    public int getFloorNumber() {
        return floorNumber;
    }
    
    
    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }
    
    public String getFloorName() {
        return floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }
    
    public ArrayList<Room> getRoomList(){
        return this.rooms;
    }
    
    public void setRoomList(ArrayList<Room> rooms){
        this.rooms = rooms;
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
        return this.pointOfInterest;
    }
    
    public void setPOIs(LinkedList<PointofInterest> pois){
        this.pointOfInterest = pois;
    }

    
    /**
     * Adds a point of interest to the floor.
     *
     * @param poi the point of interest to add
     */
    public void addPointOfInterest(PointofInterest poi){
        this.pointOfInterest.add(poi);
    }
    
    /**
     * Removes a point of interest from the floor.
     *
     * @param poi the point of interest to remove
     */
    public void removePointOfInterest(PointofInterest poi){
        this.pointOfInterest.remove(poi);
    }
}