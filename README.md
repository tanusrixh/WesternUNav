# WesternU Navigator App

Navigating through the interior spaces of a university can be a challenging task. Although the floor plans of Western's buildings are available to the public, they are in PDF format without any metadata that makes them easily searchable. Furthermore, there are opportunities to add more points of interest to these maps to make them more useful.

To address these challenges, we have created WesternU Navigator - an application that allows users to search and explore the interior spaces of Western University's buildings. This application enables users to search for rooms, locate points of interest, browse through maps, and create and save their own personal points of interest.

## Features

### Browsing maps
Users can access a directory of different buildings on the Western campus, and the corresponding maps are provided for each floor. Users may switch between buildings and floors seamlessly, zooming in and out, as well as scrolling as needed.

### Scrolling Maps
If the size of a map in your application is too large to fit within the display, you should provide a method for users to scroll the map, such as using scroll bars. This feature should work seamlessly with any points of interest or map layers that are currently being displayed. It is necessary for at least one map in your application to be large enough to require scrolling.

### Displaying Layers
Your application's maps must allow users to display and hide layers. Layers refer to groups of POIs, such as classrooms, labs, restaurants, or washrooms, that share a common category. Hiding a layer should hide all POIs within that layer, while displaying a layer should show all POIs within that layer. You can choose how to implement this functionality, such as using toggle buttons, a menu, or a pop-up screen.

Your application must have, at a minimum, an accessibility layer (which is already built into the PDFs) and a washroom layer (also built into the PDFs). You should also have a layer for each type of POI, including user-defined points of interest and favorited points of interest. However, please note that accessibility and washroom information cannot be turned off unless the maps are edited as described in Section 3. In such a case, users should not be able to toggle the information on and off.

You may also add additional layers that provide more information than POIs, such as a layer that shows or hides the map legend, a layer that adds text to the map, or a layer that color codes different rooms in the building. As long as the required functionality is provided, the design of the interface for displaying and hiding layers is up to you. 

### Searching Maps
A search menu is available for use with both user-made and built-in POIs at hand.

### POI Discovery

Your application should provide users with the ability to locate available POIs on a map along with the text-based search functionality. The POI discovery feature should display a list of all the POIs available on the currently displayed map, arranged by category or any other method that makes it easy to locate each POI on the map, including user-defined POIs.

When a user clicks on a POI in this list, the POI should be displayed on the current map, highlighted, and the map should be scrolled to its location if necessary. Furthermore, a brief description of the POI, including its name, room number, and a short description, should be displayed.

It is important to consider how this discovery feature will interact with the Displaying Layers requirement. For instance, selecting a POI from the list may hide other layers or force the layer the POI is on to be shown. Additionally, when a POI is highlighted, it is necessary to determine what happens when a layer is hidden or displayed.

### Built-In Points of Interest (POI)
Building floor maps have predefined points of interest that users can overlay onto the map while browsing or searching within the floor. These points of interest may include classrooms, washrooms, computer labs, eateries, and even common stairways or elevators that can be either displayed or hidden from the map.

### Clicking on POIs
When a user clicks on a POI shown on a map, the application should highlight the selected POI to show that it has been chosen and present information about it. This information should include the POI's name/title, room number, and a brief description, which can either be displayed somewhere in the interface or as a popup. Additionally, the option to favorite the selected POI should be provided. If the user deselects or unhighlights the POI, the information about it should disappear.

### Favourites
Users can favourite and unfavourite POIs as needed. Access to these favourite POIs may be found in the favourites menu.

### User-Created Points of Interest (POI)
Users can create their own custom POIs as well. Simply drag and drop a button representing a new POI, enter the corresponding information, and have your custom POI readily visible on the map.

### Exit/Close and Navigation
The application must provide a clean exit option from any window or state without losing or corrupting any data. If the user is in the middle of an unfinished or unsaved task, such as data entry, the application should display a warning message to prevent the user from losing their work. The user should be able to navigate between different screens or windows easily, with a "back" or "cancel" button always available to return to the previous screen.

### User Help
Users must have access to a help feature in case they need assistance using the application, such as a help menu with a user guide. The user guide must be comprehensive enough to cover all aspects of the application and provide clear instructions on how to perform all possible tasks. The method by which the guide is made available to the user is up to you; it could be integrated into the application or accessed as a separate PDF or HTML page that the application opens. However, it should not require an internet connection, meaning that the user guide must be stored locally.

Additionally, the application must have an "About" screen that displays the name of the application, its version, release date, and the names of the team members. It should also provide a way for users to contact the team with any questions they may have, such as a valid email address for one or more team members.

### Editing Tool/Mode
You need to provide a special mode or tool that allows developers to edit the metadata for the built-in POI in a graphical manner. This functionality should be designed in a way that enables you to produce the data you need, rather than creating it manually. You can decide how developers can access this functionality. It could be a separate tool that edits the metadata file, a special account accessible through a password-protected menu in the application, or perhaps developers can run the application with a specific command line option (e.g. "-edit") to access this mode. Regardless of the method, it should prevent normal users from accidentally accessing this functionality.

In this editing mode, you should be able to add, edit, and remove points of interest by placing them graphically on a map. Additionally, you must be able to specify other metadata for the POI, including the name, room number, description, and category. This allows it to be toggled on and off with the right layer.

You can design the interface for your editing mode in any way you see fit, as long as it provides the necessary functionality, is accessible, and easy to use for developers.

### Multi-user System
Western Maps supports multiple users, both of base and admin permissions. Base users will not have access to admin-specific features but are still able to enjoy full functionality of the application.

### Edit Buildings and Floors
To add an extra feature to your editing tool (as described in Section 4.1.1.13), you must now include functionality for adding, editing, and removing buildings and floors. It is important to consider how the deletion of a building or floor will affect any associated POIs.

Furthermore, your editing tool should allow developers to select images for use as floor maps from the file system. While you may limit this feature to a predetermined list of maps from a specific folder, it must update dynamically if new map files are added to the folder.

## Technologies and Tools

The following technologies and tools were used to develop Western Maps:

* Java - for programming the back-end of the application and creating Controller classes for GUI-specific components.

* JavaFX - for creating the user interface using both FXML files for UI markup and Controller classes written in Java to add user functionality.

* Maven - as the build automation tool for this project.

## Installation and Set Up for Developers

To run Western Maps, follow these steps:

Clone the repository to your local system.

Make sure you have all the proper dependencies and libraries installed and/or resolved, such as:

* JDK 19

* Maven, including:
    - org.json
    - org.simple.json
    - JavaFX
    - JUnit

Navigate to the WesternMaps class and run WesternMaps.main() to view and use the application.

## Conclusion
Western Maps is a powerful tool for navigating the interior spaces of Western University's buildings. With its comprehensive features, easy-to-use interface, and powerful functionality, it is an essential application for anyone navigating the Western campus.

**By: Hala TA Abudaqqa, Nour Fayadh, Tanusri Harish, Sara Mehravar, and Nosheen Sobhani**
