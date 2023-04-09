/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.westernunav1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author NOSHEEN
 */
public class BuildingTest {
    
    public BuildingTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        System.out.println("setUpClass()");
    }
    
    @AfterAll
    public static void tearDownClass() {
        System.out.println("tearDownClass()");
    }
    
    @BeforeEach
    public void setUp() {
        System.out.println("setUp()");
    }
    
    @AfterEach
    public void tearDown() {
        System.out.println("tearDown()");
    }

    /**
     * Test of newJSON method, of class Building.
     */
    @Test
    public void testNewJSON() {
        System.out.println("newJSON");
        String code = "mc";
        int floors = 5;
        Building instance = new Building("Middlesex College", "mc", 5);;
        instance.newJSON(code, floors);
      
    }

    /**
     * Test of getName method, of class Building.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Building instance = new Building("Middlesex College", "mc", 5);
        String expResult = "Middlesex College";
        String result = instance.getName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setName method, of class Building.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Middlesex College";
        Building instance = new Building("Middlesex College", "mc", 5);;
        instance.setName(name);
        
    }

    /**
     * Test of getFloors method, of class Building.
     */
    @Test
    public void testGetFloors() throws FileNotFoundException {
        System.out.println("getFloors");
        Building instance = new Building("Middlesex College", "mc", 5);
        ArrayList<Floor> expResult = new ArrayList<>();
        ArrayList<Room> rooms = null;
        
        try{
            
            FileReader getBuilding = new FileReader("./mcfloors.json");
            JSONTokener buildingToken = new JSONTokener(getBuilding);
            JSONObject buildingObj = new JSONObject(buildingToken);
            
            JSONArray buildingArray = buildingObj.getJSONArray("mcfloors");
            
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
                expResult.add(floorObj);
            }
            
            getBuilding.close();
            
             }catch(FileNotFoundException fileError){
            System.out.println("FileNotFound\n");
            
            }catch(IOException ioerror){
                System.out.println("ErrorClosingFile\n");

            }catch(JSONException jsonerror){
                System.out.println("ErrorParsingJSONFile\n");
            }
        ArrayList<Floor> result = instance.getFloors();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setFloors method, of class Building.
     */
    @Test
    public void testSetFloors() {
        System.out.println("setFloors");
        ArrayList<Floor> floors = null;
        Building instance = new Building("Middlesex College", "mc", 5);;
        instance.setFloors(floors);
        
    }

    /**
     * Test of getNumFloors method, of class Building.
     */
    @Test
    public void testGetNumFloors() {
        System.out.println("getNumFloors");
        Building instance = new Building("Middlesex College", "mc", 5);;
        int expResult = 5;
        int result = instance.getNumFloors();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNumFloors method, of class Building.
     */
    @Test
    public void testSetNumFloors() {
        System.out.println("setNumFloors");
        int numFloors = 5;
        Building instance = new Building("Middlesex College", "mc", 5);;
        instance.setNumFloors(numFloors);
      
    }

    /**
     * Test of getFileName method, of class Building.
     */
    @Test
    public void testGetFileName() {
        System.out.println("getFileName");
        Building instance = new Building("Middlesex College", "mc", 5);;
        String expResult = "mc";
        String result = instance.getFileName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setFileName method, of class Building.
     */
    @Test
    public void testSetFileName() {
        System.out.println("setFileName");
        String fileName = "mc";
        Building instance = new Building("Middlesex College", "mc", 5);;
        instance.setFileName(fileName);
        
    }

    /**
     * Test of getRooms method, of class Building.
     */
    @Test
    public void testGetRooms() {
        System.out.println("getRooms");
        Building instance = new Building("Middlesex College", "mc", 5);;
        ArrayList<Room> expResult = null;
        ArrayList<Room> result = instance.getRooms();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setRooms method, of class Building.
     */
    @Test
    public void testSetRooms() {
        System.out.println("setRooms");
        ArrayList<Room> rooms = null;
        Building instance = new Building("Middlesex College", "mc", 5);;
        instance.setRooms(rooms);
        
    }
    
}
