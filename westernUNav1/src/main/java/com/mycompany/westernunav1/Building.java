/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.westernunav1;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONTokener;
import org.json.JSONObject;

/**
 * Represents a building in a navigation system. It stores info about the buildings's
 * name, fil name, array of floors, and number of floors.
 * 
 * @author nour
 */
public class Building {
    
    /** The building's name*/
    private String name;
    
    /**The building's file name*/
    private String fileName;
    
    /** The building's array of floors*/
    private ArrayList<Floor> floors;
    
    /** The building's number of floors*/
    private int numFloors;
    
    /** The building's array of rooms*/
    private ArrayList<Room> rooms;

    /**
     * Constructs a Building object with a given name, file code and number of floors
     * 
     * @param name  the name of the building
     * @param fileCode the file name of the building
     * @param numFloors the number of floors in the building
     */
    public Building(String name, String fileCode, int numFloors) {
        this.name = name;
        this.numFloors = numFloors;
        this.fileName = fileCode;
        
        floors = new ArrayList<>();
        
        
        try{
            
            FileReader getBuilding = new FileReader("./"+ fileName +"floors.json");
            JSONTokener buildingToken = new JSONTokener(getBuilding);
            JSONObject buildingObj = new JSONObject(buildingToken);
            
            JSONArray buildingArray = buildingObj.getJSONArray(fileName +"floors");
            
            for(int i = 0; i < buildingArray.length(); i++){
                JSONObject floorInfo = buildingArray.getJSONObject(i);
                int floorNumber = (Integer)floorInfo.get("Floor Number");
                String floorName = (String)floorInfo.get("Floor Name");
                JSONArray roomsArray = floorInfo.getJSONArray("Rooms");
                
                rooms = new ArrayList<>();
                
                // to check if no. of built in POIs on each floor is correct
                //System.out.println(roomsArray.length()+"\n"); 
                
                for(int j = 0; j < roomsArray.length(); j++){
                    JSONObject room = roomsArray.getJSONObject(j);
                    String cat = (String)room.get("category");
                    String roomNum = (String)room.get("roomNumber");
                    String desc = (String)room.get("description");
                    int roomX = (Integer)room.get("x");
                    int roomY = (Integer)room.get("y");
                    
                    Room addRoom = new Room(roomNum, desc, roomX, roomY, cat);
                    
                    rooms.add(addRoom);
                }
                
                Floor floorObj = new Floor(floorNumber, floorName, rooms);
                floors.add(floorObj);
            }
            
            getBuilding.close();
            
        }catch(FileNotFoundException fileError){
            System.out.println("FileNotFound\n");
            newJSON(fileName, numFloors); // add to developer class if needed later on
            
        }catch(IOException ioerror){
            System.out.println("ErrorClosingFile\n");
            
        }catch(JSONException jsonerror){
            System.out.println("ErrorParsingJSONFile\n");
        }
        
    }
    
    /**
     * Creates a new JSON file if the file does not exist and a valis building code 
     * was given in the constructor. This means that a new building was added to the 
     * buildings.json file but a new file for that building was not created
     * add to developer class if needed later on
     * 
     * @param code the code of the building
     * @param floors the number of floors in the building
    */
    public void newJSON(String code, int floors){
        JSONObject newBuilding = new JSONObject();
        JSONArray newFloorsArray = new JSONArray();
        
        for(int i = 0; i < floors; i++){
            JSONObject floorInfo = new JSONObject();
            //JSONObject floorName = new JSONObject();
            //JSONObject rooms = new JSONObject();
            
            floorInfo.put("Floor Number", i + 1);
            floorInfo.put("Floor Name:", "");
            
            JSONArray roomsArray = new JSONArray();
            floorInfo.put("Rooms", roomsArray);
            
            newFloorsArray.put(floorInfo);
        }
        
        newBuilding.put(code + "floors", newFloorsArray);
        try{
            FileOutputStream outputNewBuilding = new FileOutputStream("./"+ code +"floors.json"); 
            byte[] strToBytes = newBuilding.toString().getBytes(); 
            outputNewBuilding.write(strToBytes); 
            outputNewBuilding.close();
        }catch(IOException e){
            System.out.println("Unable to write JSON to file\n");
        }
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
    
    /**
    * Returns the name of the file associated with this object.
    * @return the file name
    */
    public String getFileName() {
        return fileName;
    }
    
    /**
     * Sets the name of the file associated with this object.
     * @param fileName the new file name 
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Returns an ArrayList of Room objects associated with this object.
     * 
     * @return the list of rooms 
     */
    public ArrayList<Room> getRooms() {
        return rooms;
    }

    /**
     * Sets the list of Room objects associated with this object.
     * @param rooms the new list of rooms
     */
    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }
}
