/*
 * GameMenuView Class
 * Displays the GameMenu
 * Nov 2018
 */
package view;
import cityofaaron.*;
import control.*;
import model.*;
import java.util.Scanner;

/**
 *
 * @author Sam Wagner
 */
public class GameMenuView extends MenuView {

    private static Scanner keyboard = new Scanner(System.in);
    //  Constructor
    
    //Variable
    Game theGame = CityOfAaron.getGame();
            
    public GameMenuView() {
        /*the DisplayGameMenu method
		purpose: display the game menu, get user input and perform selected action.
		parameters: none
		returns: none.
		Created by: Sam Wagner */

        super("\n"
                + "****************************\n"
                + "  CITY OF AARON: Game Menu \n"
                + "****************************\n"
                + " 1 - View the map\n"
                + " 2 - View your list\n"
                + " 3 - Move to a new location\n"
                + " 4 - Manage your crops\n"
                + " 5 - Back to the main menu\n",
                5);

    }

    //The doAction method 
    //purpose: Does the action
    //Parameter: none
    //Returns: none
    //===========================================
    @Override
    public void doAction(int option) {
        switch (option) {
            case 1://View the map
                viewMap();
                break;
            case 2://View the list
                viewList();
                break;
            case 3://Move to a new location
                moveToNewLocation();
            case 4://Manage your crops
                manageCrops();
                CropView.runCropView();
                break;
            case 5:
                System.out.println(menu);
                break;
        }
    }

    // The viewMap method
    // Purpose: displays the Map
    // Parameters: none
    // Returns: none
    // ===================================     
    public void viewMap() {
        //display the Map
        System.out.println("\nHere's your map.");
    }

    // The viewList method
    // Purpose: displays your list
    // Parameters: none
    // Returns: none
    // ===================================   
    public void viewList() {
        ListMenuView lmv = new ListMenuView();
        lmv.displayMenu();
    }

    // The moveToNewLocation method
    // Purpose: display the move to new location options.
    // Parameters: none
    // Returns: none
    // ===================================  
    public void moveToNewLocation() {
        
        
        Player thePlayer = theGame.getPlayer(); 
        int x;
        int y;
        System.out.println("Enter the coordinates of the location you want to move to\n "
                + "Enter the x-coordinate:\n ");
        x = keyboard.nextInt();
        
        System.out.println("Enter the y-coordinate:\n ");
        y = keyboard.nextInt();
        
        //Setting new coordinates in the Player object.
        thePlayer.setRow(x);
        
        thePlayer.setColumn(y);
        
        //Create Map Object
        Map theMap = new Map(x, y);
        
        //getLocation
        theMap.getLocation(x, y);
        //Display the coordinates of the location. 
        System.out.println(theMap.getLocation(x, y));
        
    }

    // The manageCrops method
    // Purpose: displays the optioon to manage your crops
    // Parameters: none
    // Returns: none
    // ===================================  
    public void manageCrops() {
        CropView.runCropView();
    }
}
