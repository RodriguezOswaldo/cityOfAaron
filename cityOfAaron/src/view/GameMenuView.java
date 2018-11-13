/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.util.Scanner;
/**
 *
 * @author swagner
 */
public class GameMenuView {
    
    Scanner keyboard = new Scanner(System.in);
    // private String theMenu;
    private String theGameMenu;
    private int max;
    
        //  Constructor
     public GameMenuView() {
        this.theGameMenu = theGameMenu;
        //this.theMenu = theMenu;
        this.max = max;
     }
    public void displayGameMenuView() 
    {
        
   /*displayGameMenu method
    *purpose: display the game menu, get user input and perform selected action.
    *parameters: none
    *returns: none
    *Created by: Sam Wagner
    */
	
    theGameMenu =   "\n" +
                    "****************************\n" +
                    "  CITY OF AARON: Game Menu \n" +
                    "****************************\n" +
                    " 1 - View the Map\n" +
                    " 2 - View the List\n" +
                    " 3 - Move to a New Location\n" +
                    " 4 - Manage your Crop " +
                    "provisions and tools in the city storehouse?\n" +
                    " 5 - Back to main menu\n";
    
                max = 5;   
    
                int gameMenuOption;
                do 
                {
                //1 display  the menu
                    System.out.println(theGameMenu);
                //2 prompt user and get user input
                    gameMenuOption = getGameMenuOption();
                //3 perform desired action
                    doAction(gameMenuOption);
                //4 determine the next display
                } while(gameMenuOption != max);
            }
    
    // The getGameMenuOption method
    // Purpose: gets the user's input
    // Parameters: none
    // Returns: integer - the option selected
    // ===================================    
    
    public int getGameMenuOption()
    {        
        //declare a variable to hold user's input
            int userInput;
        //begin loop
            do
            {
            // get user input from the keyboard
                userInput = keyboard.nextInt();
            //if it is not a valid value, output an error message
            //loop back to the top of the loop if input was not valid 
            //end loop
            }
            
            while (userInput < 1 || userInput > max);
            return userInput;
    }
    
    //The doAction method 
    //purpose: Does the action
    //Parameter: none
    //Returns: none
    //===========================================
    public void doAction(int option)
    {
        switch(option)
        {
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
               break;
            case 5:
               System.out.println(theGameMenu);
               break;
        }
    }
    
    // The viewMap method
    // Purpose: displays the Map
    // Parameters: none
    // Returns: none
    // ===================================     
    
    public void viewMap(){
        //display the Map
        
        System.out.println("\nYour Map");
    }
    
    // The viewList method
    // Purpose: displays your list
    // Parameters: none
    // Returns: none
    // ===================================   
    
    public void viewList()
    {
        System.out.println("\nHere's your list.");
        ListMenuView lmv = new ListMenuView();
        lmv.displayListMenuView();
    }
    
    // The moveToNewLocation method
    // Purpose: display the move of location options.
    // Parameters: none
    // Returns: none
    // ===================================  
    
    public void moveToNewLocation()
    {
        System.out.println("\n");
    }
    
    // The moveToNewLocation method
    // Purpose: display the move of location options.
    // Parameters: none
    // Returns: none
    // ===================================  
    
    public void manageCrops()
    {
        System.out.println("\n");
    }
    
    
}
