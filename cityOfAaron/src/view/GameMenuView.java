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
    // Author: Sam
    // ===================================     
    public void viewMap() {
        //display the Map
        Game game = new Game();
        Map theMap = new Map();
        Location loc = new Location();
        
        System.out.println("***Your Map***");
 
        int matrix[][] = new int[5][5];
        
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix.length; j++)
            {
               matrix[i][j] = 5;
            }
        }
        
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix.length; j++)
            {
               System.out.print (matrix[i][j] + "");
            }
            System.out.println();
        }
        
        System.out.println("Key \n"
                + "~~~  = river \n"
                + "!!!  = farmland \n"
                + "___  = desert \n"
                + "<><> = village \n");
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
    // Author: Oswaldo Rodriguez
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
        
        //Bringing the player to the game
        theGame.setPlayer(thePlayer);
        System.out.println("something 1 ");
        
        //Updating the game with the new position of the player.
        CityOfAaron.setGame(theGame);
            System.out.println("Something 2");
       
        //getting the map from th game 
        Map theMap = theGame.getMap();
        System.out.println("Something 3");
        
        //getting theLocation from theMap
        Location theLocation = theMap.getLocation(x, y);
        
        System.out.println("Something 4");
        
        //gettind theDescription of the location.
        String theDescription = theLocation.getDescription();
        System.out.println("Something 5");
        
        //theGame.getMap().getLocation(x, y).getDescription()
        
        //Display the description 
        System.out.println(theDescription);
        
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
