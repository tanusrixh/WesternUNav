/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

package com.mycompany.westernunav1;

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
public class RoomTest {
    
    public RoomTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getRoomCategory method, of class Room.
     */
    @Test
    public void testGetRoomCategory() {
        System.out.println("getRoomCategory");
        Room instance = new Room("29A", "Elevator", 2791, 1343, "accessibility");
        String expResult = "accessibility";
        String result = instance.getRoomCategory();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRoomCategory method, of class Room.
     */
    @Test
    public void testSetRoomCategory() {
        System.out.println("setRoomCategory");
        String roomCategory = "accessibility";
        Room instance = new Room("29A", "Elevator", 2791, 1343, "accessibility");
        instance.setRoomCategory(roomCategory);
    }

    /**
     * Test of getX_coord method, of class Room.
     */
    @Test
    public void testGetX_coord() {
        System.out.println("getX_coord");
        Room instance = new Room("29A", "Elevator", 2791, 1343, "accessibility");
        int expResult = 2791;
        int result = instance.getX_coord();
        assertEquals(expResult, result);
    }

    /**
     * Test of setX_coord method, of class Room.
     */
    @Test
    public void testSetX_coord() {
        System.out.println("setX_coord");
        int x_coord = 2791;
        Room instance = new Room("29A", "Elevator", 2791, 1343, "accessibility");
        instance.setX_coord(x_coord);
    }

    /**
     * Test of getY_coord method, of class Room.
     */
    @Test
    public void testGetY_coord() {
        System.out.println("getY_coord");
        Room instance = new Room("29A", "Elevator", 2791, 1343, "accessibility");
        int expResult = 1343;
        int result = instance.getY_coord();
        assertEquals(expResult, result);
    }

    /**
     * Test of setY_coord method, of class Room.
     */
    @Test
    public void testSetY_coord() {
        System.out.println("setY_coord");
        int y_coord = 1343;
        Room instance = new Room("29A", "Elevator", 2791, 1343, "accessibility");
        instance.setY_coord(y_coord);
    }

    /**
     * Test of getRoomNumber method, of class Room.
     */
    @Test
    public void testGetRoomNumber() {
        System.out.println("getRoomNumber");
        Room instance = new Room("29A", "Elevator", 2791, 1343, "accessibility");
        String expResult = "29A";
        String result = instance.getRoomNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDescription method, of class Room.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Room instance = new Room("29A", "Elevator", 2791, 1343, "accessibility");
        String expResult = "Elevator";
        String result = instance.getDescription();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRoomNumber method, of class Room.
     */
    @Test
    public void testSetRoomNumber() {
        System.out.println("setRoomNumber");
        String roomNumber = "29A";
        Room instance = new Room("29A", "Elevator", 2791, 1343, "accessibility");
        instance.setRoomNumber(roomNumber);
    }

    /**
     * Test of setDescription method, of class Room.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "Elevator";
        Room instance = new Room("29A", "Elevator", 2791, 1343, "accessibility");
        instance.setDescription(description);
    }
    
}
