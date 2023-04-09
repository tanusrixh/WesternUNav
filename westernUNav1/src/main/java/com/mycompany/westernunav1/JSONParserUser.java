/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.westernunav1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/**
 *
 * @author tanusri
 */
public class JSONParserUser {
    
    private User user;
    
    private String buildingName;
    
    private ArrayList<Floor> userFloors;
    
    private ArrayList<Floor> favFloors;
    
    private LinkedList<PointofInterest> userPOI;
    
    private LinkedList<PointofInterest> favPOI;
    
    private HashMap<String, ArrayList<Floor>> buildingFloorsUser; //Used to store the arraylist of userFloors for each building
    
    
    public JSONParserUser(User user, String buildingName) {
        this.user = user;
        this.buildingName = buildingName;
        
        try {

            FileReader openLogin;
            openLogin = new FileReader(this.user.getName() + ".json");
            System.out.println("success again.\n"); // to test that the JSON file opened successfully
            JSONTokener tok = new JSONTokener(openLogin);
            JSONObject jsonobj = new JSONObject(tok); // get the username and password stored at index 0 in the login JSON file

            if(this.user.getIsDeveloper() == false){
                JSONArray poi = jsonobj.getJSONArray(this.buildingName + " poi");
                userFloors = new ArrayList<>();
                favFloors = new ArrayList<>();
                for(int i = 0; i < poi.length(); i++){
                    JSONObject floorInfo = poi.getJSONObject(i);
                    int floorNumber = (Integer)floorInfo.get("Floor Number");
                    String floorName = (String)floorInfo.get("Floor Name");
                    JSONArray poiArray = floorInfo.getJSONArray("POI");
                
                    userPOI = new LinkedList<>();
                
                    
                
                    for(int j = 0; j < poiArray.length(); j++){
                        JSONObject room = poiArray.getJSONObject(j);
                        String cat = (String)room.get("category");
                        String roomNum = (String)room.get("roomNumber");
                        String desc = (String)room.get("description");
                        int roomX = (Integer)room.get("x");
                        int roomY = (Integer)room.get("y");
                    
                        PointofInterest addUserPOI = new PointofInterest(roomNum, desc, cat, roomX, roomY);
                    
                        userPOI.add(addUserPOI);
                    }
                
                    Floor userFloorObj = new Floor(floorNumber, floorName, userPOI);
                    userFloors.add(userFloorObj);
                }
                
                JSONArray fav = jsonobj.getJSONArray(this.buildingName + " favourites");
                for(int i = 0; i < poi.length(); i++){
                    JSONObject floorInfo = fav.getJSONObject(i);
                    int floorNumber = (Integer)floorInfo.get("Floor Number");
                    String floorName = (String)floorInfo.get("Floor Name");
                    JSONArray poiFavArray = floorInfo.getJSONArray("POI");
                
                    favPOI = new LinkedList<>();
                
                    
                
                    for(int j = 0; j < poiFavArray.length(); j++){
                        JSONObject room = poiFavArray.getJSONObject(j);
                        String cat = (String)room.get("category");
                        String roomNum = (String)room.get("roomNumber");
                        String desc = (String)room.get("description");
                        int roomX = (Integer)room.get("x");
                        int roomY = (Integer)room.get("y");
                    
                        PointofInterest addFavPOI = new PointofInterest(roomNum, desc, cat, roomX, roomY);
                    
                        favPOI.add(addFavPOI);
                    }
                
                    Floor favFloorObj = new Floor(floorNumber, floorName, favPOI);
                    favFloors.add(favFloorObj);
                }
                
                
            }
            openLogin.close();
        }catch (FileNotFoundException ae) {
            

            System.out.println("FileNotFound\n");

        } catch (IOException se) {

            System.out.println("ErrorClosingFile\n");

        } catch(JSONException jsonerror){
            System.out.println("ErrorParsingJSONFileUser2\n");
        }
        
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public ArrayList<Floor> getUserFloors() {
        return userFloors;
    }

    public void setUserFloors(ArrayList<Floor> userFloors) {
        this.userFloors = userFloors;
    }

    public LinkedList<PointofInterest> getUserPOI() {
        return userPOI;
    }

    public void setUserPOI(LinkedList<PointofInterest> userPOI) {
        this.userPOI = userPOI;
    }

    public LinkedList<PointofInterest> getFavPOI() {
        return favPOI;
    }

    public void setFavPOI(LinkedList<PointofInterest> favPOI) {
        this.favPOI = favPOI;
    }

    public HashMap<String, ArrayList<Floor>> getBuildingFloorsUser() {
        return buildingFloorsUser;
    }

    public void setBuildingFloorsUser(HashMap<String, ArrayList<Floor>> buildingFloorsUser) {
        this.buildingFloorsUser = buildingFloorsUser;
    }

    public ArrayList<Floor> getFavFloors() {
        return favFloors;
    }

    public void setFavFloors(ArrayList<Floor> favFloors) {
        this.favFloors = favFloors;
    }
    
}
