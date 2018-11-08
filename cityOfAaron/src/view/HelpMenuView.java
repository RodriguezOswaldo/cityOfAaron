/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.util.Scanner;

/**
 *
 * @author Own
 */
public class HelpMenuView {
    
    Scanner keyboard = new Scanner(System.in);
   // private String theMenu;
    private String theHelpMenu;
    private int max;
    
        //  Constructor
     public HelpMenuView() {
        this.theHelpMenu = theHelpMenu;
        //this.theMenu = theMenu;
        this.max = max;
     }
     public void displayHelpMenuView() 
    {
        
		/*the displayHelpMenu method
		purpose: display the help menu, get user input and perform selected action.
		parameters: none
		returns: none.
		Created by: Oswaldo Rodríguez */
		
	
    theHelpMenu =   "\n" +
                    "****************************\n" +
                    "  CITY OF AARON: Help Menu \n" +
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
               System.out.println(theHelpMenu);
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
    }
}
