/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author Gabriel Memories
 */
public class ListMenuView {
    
    Scanner keyboard = new Scanner(System.in);
   // private String theMenu;
    private String theMenu;
    private int max;
    
        //  Constructor
     public ListMenuView() {
        this.theMenu = theMenu;
        //this.theMenu = theMenu;
        this.max = max;
     }
     public void displayListMenuView() 
    {
    
//Display the menu
    //Prompt user and get user's input
    //Perform the desired action
    //determine and display the next view
    
        theMenu = "\n"
                + "**********************************\n"
                + "* CITY OF AARON: LIST MENU   *\n"
                + "**********************************\n"
                + " 1 - List or View the animals in the storehouse\n"
                + " 2 - List or View the tools in the storehouse\n"
                + " 3 - List or View the provisions in the storehouse\n"
                + " 4 - List or View the authors of this game\n"
                + " 5 - Return to the Main Menu\n";
        max = 5;         
                    int listMenuOption;
                    do 
                    {
                    //1 display  the menu
                    System.out.println(theMenu);
                    //2 prompt user and get user input
                    listMenuOption = getListMenuOption();
                    //3 perform desired action
                    doAction(listMenuOption);
                    //4 determine the next display
                    } while(listMenuOption != max);
                }
    // The getHelpMenuOption method
    // Purpose: gets the user's input
    // Parameters: none
    // Returns: integer - the option selected
    // ===================================       
    public int getListMenuOption()
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
   
    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // ==================================
public void doAction(int option){
    switch (option) {
      case 1: // display Animals List
        displayAnimalsList();
        break;
      case 2:// display Tools list
        displayToolsList();
        break;
      case 3: // display Provisions list
        displayProvisionsList();
        break;
      case 4: // display the Team list
        displayTeamList();
        break;
       case 5: // back to main menu
       break;
        
    }
  }
   // The displayAnimalsList method
    // Purpose: Displays a list of Animals
    // Parameters: none
    // Returns: none
 public void displayAnimalsList(){
    System.out.println("\n *Displays Animals List*");
  }
    // The displayToolsList method
    // Purpose: Displays a list of Tools
    // Parameters: none
    // Returns: none
 public void displayToolsList(){
    System.out.println("\n *Displays a List of Tools*");
  }
   // The displayProvisionsList method
    // Purpose: Displays a list of Provision
    // Parameters: none
    // Returns: none
 public void displayProvisionsList(){
    System.out.println("\n *Displays Provision List*.");
  }
     // The displayTeamList method
    // Purpose: Displays a list of the Team
    // Parameters: none
    // Returns: none
 public void displayTeamList(){
    System.out.println("\n *Displays a List of the Team");
  }

}