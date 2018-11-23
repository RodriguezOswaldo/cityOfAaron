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
public class HelpMenuView extends MenuView{
    
   
    
        //  Constructor
     public HelpMenuView() {
        
		/*the displayMenu method
		purpose: display the help menu, get user input and perform selected action.
		parameters: none
		returns: none.
		Created by: Oswaldo Rodríguez */
		
    super("\n" +
                    "****************************\n" +
                    "  CITY OF AARON: Help Menu \n" +
                    "****************************\n" +
                    " 1 - What are the goals of the game?\n" +
                    " 2 - How do I view the map?\n" +
                    " 3 - How do I move to another location?\n" +
                    " 4 - How do I display a list of animals, " +
                    "provisions and tools in the city storehouse?\n" +
                    " 5 - Back to main menu\n",
                 5);   
                    
                }
  
    //The doAction method 
    //purpose: Performs the selected action
    //Parameter: none
    //Returns: none
    //===========================================
    @Override public void doAction(int option)
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
               System.out.println(menu);
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
        
        System.out.println("Goals of the Game:\n" + " You have been appointed as a ruler in the City of Aaron,\n"
                + " your role is to manage the resources possesed by them in order to protect the city and their people,\n"
                + " and to make sure that they have all the resources that they need in a 10 years period of time.\n");
    }
    
    // The viewMapHelp method
    // Purpose: display the map of the Game
    // Parameters: none
    // Returns: none
    // ===================================   
    
    public void viewMapHelp(){
        System.out.println("Go to the Game Menu, and choose the View Map option (1).\n");
    }
    
    // The viewMoveHelp method
    // Purpose: display the move of location options.
    // Parameters: none
    // Returns: none
    // ===================================  
    
    public void viewMoveHelp(){
        System.out.println("Go to the Game Menu, and choose the Move to a New Location option (3) And give there the new coordinates.\n");
    }
    
    // The viewListHelp method
    // Purpose: display the map of the Game
    // Parameters: none
    // Returns: none
    // ===================================  
    
    public void viewListHelp(){
        System.out.println("Go the game menu, and choose the View List option (2)\n");
    }
}
