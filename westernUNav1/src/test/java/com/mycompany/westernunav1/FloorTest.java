/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.westernunav1;

import java.util.ArrayList;
import java.util.LinkedList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Hala Abudaqqa
 */
public class FloorTest {
    private Floor instance;
    
    public FloorTest() {
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
     * Test of getFloorNumber method, of class Floor.
     */
    @Test
    public void testGetFloorNumber() {
        System.out.println("getFloorNumber");
        Floor instance = new Floor(1, "First floor", new ArrayList<Room>());
        int expResult = 1;
        int result = instance.getFloorNumber();
        assertEquals(expResult, result);

    }

    /**
     * Test of setFloorNumber method, of class Floor.
     */
    @Test
    public void testSetFloorNumber() {
        System.out.println("setFloorNumber");
        int floorNumber = 2;
        Floor instance = new Floor(1, "First floor", new ArrayList<Room>());
        instance.setFloorNumber(floorNumber);
        int expResult = 2;
        int result = instance.getFloorNumber();
        assertEquals(expResult, result);

    }

    /**
     * Test of getFloorName method, of class Floor.
     */
    @Test
    public void testGetFloorName() {
        System.out.println("getFloorName");
        Floor instance = new Floor(1, "First floor", new ArrayList<Room>());
        String expResult = "First floor";
        String result = instance.getFloorName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFloorName method, of class Floor.
     */
    @Test
    public void testSetFloorName() {
        System.out.println("setFloorName");
        String floorName = "New floor name";
        Floor instance = new Floor(1, "First floor", new ArrayList<Room>());
        instance.setFloorName(floorName);
        String expResult = "New floor name";
        String result = instance.getFloorName();
        assertEquals(expResult, result);        
    }

    /**
     * Test of getRoomList method, of class Floor.
     */
    @Test
    public void testGetRoomList() {
        System.out.println("getRoomList");
        Floor instance = new Floor(1, "First floor", new ArrayList<Room>());
        ArrayList<Room> expResult = new ArrayList<Room>();
        ArrayList<Room> result = instance.getRoomList();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRoomList method, of class Floor.
     */
    @Test
    public void testSetRoomList() {
        System.out.println("setRoomList");
        ArrayList<Room> rooms = null;
        Floor instance = new Floor(1, "First floor", new ArrayList<Room>());
        instance.setRoomList(rooms);
    }

    /**
     * Test of getRooms method, of class Floor.
     */
    @Test
    public void testGetRooms() {
        System.out.println("getRooms");
        ArrayList<Room> rooms = new ArrayList<>();
        Floor instance = new Floor(1, "First floor", new ArrayList<Room>());
        Room[] expResult = new Room[rooms.size()];
         for (int i = 0; i < expResult.length; i++) {
            expResult[i] = rooms.get(i);
        }
        Room[] result = instance.getRooms();
        assertArrayEquals(expResult, result);
       
    }

    /**
     * Test of addRoom method, of class Floor.
     */
    @Test
    public void testAddRoom() {
        System.out.println("addRoom");
        Room room = new Room("111", "Washroom", 300, 200, "Washrooms");
        Floor instance = new Floor(1, "First floor", new ArrayList<Room>());
        instance.addRoom(room);
        Room[] expResult = {room};
        Room[] result = instance.getRooms();
        assertArrayEquals(expResult, result);
        
    }

    /**
     * Test of removeRoom method, of class Floor.
     */
    @Test
    public void testRemoveRoom() {
        System.out.println("removeRoom");
        Room room = new Room("111", "Washroom", 300, 200, "Washrooms");
        Floor instance = new Floor(1, "First floor", new ArrayList<Room>());
        instance.removeRoom(room);
    }

    /**
     * Test of getPointsOfInterest method, of class Floor.
     */
    @Test
    public void testGetPointsOfInterest() {
        System.out.println("getPointsOfInterest");
        Floor instance = new Floor(1, "First floor", new ArrayList<Room>(), new LinkedList<PointofInterest>());
        LinkedList<PointofInterest> expResult = new LinkedList<PointofInterest>();
        LinkedList<PointofInterest> result = instance.getPointsOfInterest();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPOIs method, of class Floor.
     */
    @Test
    public void testSetPOIs() {
        System.out.println("setPOIs");
        LinkedList<PointofInterest> pois = new LinkedList<PointofInterest>();
        Floor instance = new Floor(1, "First floor", new ArrayList<Room>(), new LinkedList<PointofInterest>());
        instance.setPOIs(pois);
    }

    /**
     * Test of addPointOfInterest method, of class Floor.
     */
    @Test
    public void testAddPointOfInterest() {
        System.out.println("addPointOfInterest");
        PointofInterest poi = new PointofInterest("111", "classroom", "educational spaces", 300, 200);
        Floor instance = new Floor(1, "First floor", new ArrayList<Room>(), new LinkedList<PointofInterest>());
        instance.addPointOfInterest(poi);
    }

    /**
     * Test of removePointOfInterest method, of class Floor.
     */
    @Test
    public void testRemovePointOfInterest() {
        System.out.println("removePointOfInterest");
        PointofInterest poi = new PointofInterest("111", "washroom", "washrooms", 300, 200);
        Floor instance = new Floor(1, "First floor", new ArrayList<Room>(), new LinkedList<PointofInterest>());
        instance.addPointOfInterest(poi);
        instance.removePointOfInterest(poi);
    }
    
}
