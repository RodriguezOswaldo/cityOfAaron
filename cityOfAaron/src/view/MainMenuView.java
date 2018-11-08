// The MainMenuView class - part of the view layer
// Object of this class manages the main menu
// Author: Gabriel Gonzalez, Sam Wagner, Oswaldo Rodrgiguez
// Date last modified: October 31, 2018
//-------------------------------------------------------------

package view;

/**
 *
 * @author team
 */
import java.util.Scanner;
import cityofaaron.CityOfAaron;
import control.GameControl;
import view.*;

public class MainMenuView
{
    Scanner keyboard = new Scanner(System.in);
    private String theMenu;
   // private String theHelpMenu;
    private int max;
    
        //  Constructor
     public MainMenuView() {
        //this.theHelpMenu = theHelpMenu;
        this.theMenu = theMenu;
        this.max = max;
    }
    
    public void displayMenuView() 
    {
        
         /* the displayMenuView method
    purpose: display the menu, get user input and perform selected action
    parameters: none
    returns: none
    */
    
    theMenu = "\n" +
            "****************************\n" +
            "  CITY OF AARON: Main Menu \n" +
            "****************************\n" +
            " 1 - Start a new game\n" +
            " 2 - Continue a saved game\n" +
            " 3 - How to play\n" +
            " 4 - Save game\n" +
            " 5 - Quit\n";
    max = 5;   
        int menuOption;
        do
        {
        //  1 Display the menu
        System.out.println(theMenu);
        
        //  2 prompt user and get user input
        menuOption = getMenuOption();
        
        //  3 perform desired action
        doAction(menuOption);
        
        //  4 determine the next display
        } while (menuOption !=max);
        
}
        
    // The getMenuOption method
    // Purpose: gets the user's input
    // Parameters: none
    // Returns: integer - the option selected
    // ===================================       
    public int getMenuOption()
    {
           // declare a variable to hold user’s input
            int userInput;


            // begin loop
            do
            {
                     // get user input from the keyboard
                     userInput = keyboard.nextInt();
                     // if it is not a valid value, output an error message
                    // loop back to the top of the loop if input was not valid
            // end loop
            } while (userInput < 1 || userInput > max);
            return userInput;
    }
    
    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // ===================================       
    public void doAction(int option)
    {
        switch(option)
        {
            case 1: // create and start a new game
                startNewGame();
                break;
            case 2: // get and start a saved game
                startSavedGame();
                break;
            case 3: // get help menu
                //runs the help menu
                HelpMenuView hmv = new HelpMenuView();
                hmv.displayHelpMenuView();
                break;
            case 4: // save game
                displaySaveGameView();
                break;
            case 5:
                System.out.println("Thanks for playing ... goodbye.");
            default: // Fix Invalid Value.  
        }
    }
    // The startNewGame method
    // Purpose: creates game object and starts the game
    // Parameters: none
    // Returns: none
    // ===================================     
    public void startNewGame()
    {
        // Display the Banner Page.
    
        System.out.println("\nWelcome to the city of Aaron.");
        
        // Prompt for and get the user’s name.
        String name;
        System.out.println("\nPlease type in your first name: ");
        name = keyboard.next();

    // Call the createNewGame() method in the GameControl class
    
        GameControl.createNewGame();

    // Display a welcome message
        System.out.println("Welcome " + name + " have fun!!!");

    // Display the Game menu 
        //Go Back!!!!!!!
        //I came back here, Oswaldo.
        //GameMenuView gmv = new GameMenuView();
        //gmv.displayMenuView();
    }
    
    // The startSavedGame method
    // Purpose: starts the saved game
    // Parameters: none
    // Returns: none
    // ===================================     
    public void startSavedGame()
    {
        System.out.println("\nStart saved game option selected.");
    }

    // The displayHelpMenuView method
    // Purpose: Displays the help menu view
    // Parameters: none
    // Returns: none
    // ===================================     
    public void displayHelpMenuView()
    {
        System.out.println("\nHelp menu selected.");
    }
    
    // The displaySaveGameView method
    // Purpose: Display the save game view
    // Parameters: none
    // Returns: none
    // ===================================     
    public void displaySaveGameView()
    {
        System.out.println("\nSave Game View selected.");
    }
    
    /*
    //Here I started writing my method. Oswaldo Rodríguez
    public void displayHelpMenu() 
    {
        
		/*the displayHelpMenu method
		purpose: display the help menu, get user input and perform selected action.
		parameters: none
		returns: none.
		Created by: Oswaldo Rodríguez
		
	
    theHelpMenu =   "\n" +
                    "****************************\n" +
                    "  CITY OF AARON: Main Menu \n" +
                    "****************************\n" +
                    " 1 - What are the goals of the game?\n" +
                    " 2 - How do I view the map?\n" +
                    " 3 - How do I move to another location?\n" +
                    " 4 - How do I display a list of animals, " +
                    "provisions and tools in the city storehouse?\n" +
                    " 5 - Back to main menu\n";
                max = 5;   
                    int helpMenuOption;
                    do 
                    {
                    //1 display  the menu
                    System.out.println(theHelpMenu);
                    //2 prompt user and get user input
                    helpMenuOption = getHelpMenuOption();
                    //3 perform desired action
                    doAction(helpMenuOption);
                    //4 determine the next display
                    } while(helpMenuOption != max);
                }
    // The getHelpMenuOption method
    // Purpose: gets the user's input
    // Parameters: none
    // Returns: integer - the option selected
    // ===================================       
    public int getHelpMenuOption()
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
        }while (userInput < 1 || userInput > max);
        return userInput;
    }
    
    //The doAction method 
    //purpose: Performs the selected action
    //Parameter: none
    //Returns: none
    //===========================================
    public void doAction(int option)
    {
        switch(option)
        {
            case 1://what are the goals of the game?
               viewGoals();
               break;
            case 2://How do I view the map?
               viewMapHelp();
               break;
            case 3://How do I move to another Location?
               viewMoveHelp();
            case 4://How do I display a list of animals, provisions and tools the in the ciy storehouse?
               viewListHelp();
               break;
            case 5:
               System.out.println(theMenu);
               break;
               
        }
    }
    // The viewGoals method
    // Purpose: display the goals of the Game
    // Parameters: none
    // Returns: none
    // ===================================     
    
    public void viewGoals(){
        //displat the viewGoals
        
        System.out.println("\nGoals of the Game");
    }
    
    // The viewMapHelp method
    // Purpose: display the map of the Game
    // Parameters: none
    // Returns: none
    // ===================================   
    
    public void viewMapHelp(){
        System.out.println("\nGo to the GameMenu, and pick the ViewMap option.");
    }
    
    // The viewMoveHelp method
    // Purpose: display the move of location options.
    // Parameters: none
    // Returns: none
    // ===================================  
    
    public void viewMoveHelp(){
        System.out.println("");
    }
    
    // The viewListHelp method
    // Purpose: display the map of the Game
    // Parameters: none
    // Returns: none
    // ===================================  
    
    public void viewListHelp(){
        System.out.println("\nGo the game menu, and choose the Second option ViewPrint list");
    }*/
}
