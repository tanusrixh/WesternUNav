/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.westernunav1;

import java.util.ArrayList;
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
        // TODO review the generated test code and remove the default call to fail.
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
        // TODO review the generated test code and remove the default call to fail.
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
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getFloors method, of class Building.
     */
    @Test
    public void testGetFloors() {
        System.out.println("getFloors");
        Building instance = new Building("Middlesex College", "mc", 5);;
        ArrayList<Floor> expResult = null;
        ArrayList<Floor> result = instance.getFloors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
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
        // TODO review the generated test code and remove the default call to fail.
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
        // TODO review the generated test code and remove the default call to fail.
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
        // TODO review the generated test code and remove the default call to fail.
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
        // TODO review the generated test code and remove the default call to fail.
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
        // TODO review the generated test code and remove the default call to fail.
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
        // TODO review the generated test code and remove the default call to fail.
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
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
