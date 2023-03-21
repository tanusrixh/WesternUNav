/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.westernunav1;
import javax.swing.*;
import java.util.ArrayList;

/**
 *
 * @author tanusri
 */
public class Map {
    
    ArrayList<Building> buildings;


    public Map(ArrayList<Building> buildings) {
        this.buildings = buildings;
    }
    
    public void setBuildings(ArrayList<Building> buildings) {
        this.buildings = buildings;
    }
    
    public void removeBuilding(ArrayList<Building> buildings) {
        this.buildings = buildings;
    }

    public ArrayList<Building> getBuildings() {
        return buildings;
    }
    
    public Building getBuilding(ArrayList<Building> buildings, int index) {
        return buildings.get(index);
    }



    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}