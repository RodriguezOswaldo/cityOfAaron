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
    
    
    //Variable
    Game theGame; 
    
    //  Constructor   
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
        
        //
        theGame = CityOfAaron.getGame();
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
        System.out.println("Something 1");
        
        //Setting new coordinates in the Player object.
        thePlayer.setRow(x);
        System.out.println("Something 2");
        thePlayer.setColumn(y);
        System.out.println("Something 3");
        //Bringing the player to the game
        theGame.setPlayer(thePlayer);
        System.out.println("Something 4");
        //Updating the game
        CityOfAaron.setGame(theGame);
       System.out.println("Something 5");
       
        
        Map theMap = theGame.getMap();
        System.out.println("Something 6");
        Location theLocation = theMap.getLocation(y, y);
        System.out.println("Something 7");
        String theDescription = theLocation.getDescription();
        System.out.println("Something 8");
        //Display the description 
        System.out.println(theGame.getMap().getLocation(x, y).getDescription());
        System.out.println("Something 9");
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
