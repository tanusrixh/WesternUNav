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
 *
 * @author nour
 */
public class Building {
    
    /** The building's name*/
    private String name;
    private String fileName;
    
    /** The building's array of floors*/
    private ArrayList<Floor> floors;
    
        /** The building's number of floors*/
    private int numFloors;
    
    public Building(String name, String fileCode, int numFloors) {
        this.name = name;
        this.numFloors = numFloors;
        this.fileName = fileCode;
        
        try{
            
            FileReader getBuilding = new FileReader("./"+ fileName +"floors.json");
            JSONTokener buildingToken = new JSONTokener(getBuilding);
            JSONObject buildingObj = new JSONObject(buildingToken);
            
            
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
    
    /*
    Creates a new JSON file if the file does not exist and a valis building code 
    was given in the constructor. This means that a new building was added to the 
    buildings.json file but a new file for that building was not created
    -add to developer class if needed later on
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
    

    
}
