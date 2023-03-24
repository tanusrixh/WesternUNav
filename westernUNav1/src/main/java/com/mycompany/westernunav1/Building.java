/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.westernunav1;
import javax.swing.*;
import java.util.ArrayList;

/**
 *
 * @author nour
 */
public class Building {
    
    /** The building's name*/
    private String name;
    
    /** The building's array of floors*/
    private ArrayList<Floor> floors;
    
    /** The building's number of floors*/
    private int numFloors;
    
    /** An array of the building's rooms*/
    private ArrayList<Room> rooms;
    
    
    /** Building constructor, creates a new Building object
     * @param name the building's name
     * @param floors an array of the building's floors
     * @param numFloors the number of floors in a building
     * @param rooms an array of the building's rooms
     */
    public Building(String name, ArrayList<Floor> floors, int numFloors, ArrayList<Room> rooms){
        
        this.name = name;
        this.floors = floors;
        this.numFloors = numFloors;
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
    
    /** A getter method to get the array of floors in the building
     * @return the array of floors in the building
     */
    public ArrayList<Floor> getFloors(){
        return floors;
    }
    
    /** A setter method to set the array of floors in the building
     * @param floors an array of the buildings floor
     */
    public void setFloors(ArrayList<Floor> floors){
        this.floors = floors;
    }
    
    /** A getter method to get the number of floors in the building
     * @return the number of floors in the building
     */
    public int getNumFloors(){
        return numFloors;
    }
    
    /** A setter method to set the number of floors in the building
     * @param numFloors the building's number of floors
     */
    public void setNumFloors(int numFloors){
        this.numFloors = numFloors;
    }
    
    /** A getter method to get the rooms in the building
     * @return the rooms in the building
     */
    public ArrayList<Room> getRooms(){
        return rooms;
    }
    
    /** A setter method to set the rooms in the building
     * @param rooms the building's rooms
     */
    public void setRooms(ArrayList<Room> rooms){
        this.rooms = rooms;
    }
    
}
