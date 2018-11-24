/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;
import java.util.ArrayList;
import control.*;
import model.ListItem;

/**
 *
 * @author Gabriel Memories
 */
public class ListMenuView extends MenuView{
    

public ListMenuView(){
    //Display the menu
    //Prompt user and get user's input
    //Perform the desired action
    //determine and display the next view
    
        super("\n"
                + "**********************************\n"
                + "* CITY OF AARON: LIST MENU   *\n"
                + "**********************************\n"
                + " 1 - List or View the animals in the storehouse\n"
                + " 2 - List or View the tools in the storehouse\n"
                + " 3 - List or View the provisions in the storehouse\n"
                + " 4 - List or View the authors of this game\n"
                + " 5 - Return to the Main Menu\n"
                ,5);        
    }
    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // ==================================
@Override public void doAction(int option){
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
      case 4: // display the Authors list
        displayTeamList();
        break;
       case 6: // back to main menu
         break;
        
    }
}
   // The displayAnimalsList method
    // Purpose: Displays a list of Animals
    // Parameters: none
    // Returns: none
    //Created by: Oswaldo Rodríguez
 public void displayAnimalsList(){
   // System.out.println("\n *View Animals List Selected*");
   
   //Creating the game object.
   GameControl gameControl = new GameControl();
   
   //Creating the New ArrayList
   ArrayList<ListItem> listItem = new ArrayList<ListItem>();
   ArrayList<ListItem> animalsList = gameControl.createAnimalsList();
   
   //Displaying the list .
   for (int i = 0; i< animalsList.size(); i++){
   System.out.println(animalsList.get(i).getName() + "\t" + animalsList.get(i).getNumber());
   
  }
 }
    // The displayToolsList method
    // Purpose: Displays a list of Tools
    // Parameters: none
    // Returns: none
 public void displayToolsList(){
    System.out.println("\n *View a List of Tools*");
  }
   // The displayProvisionsList method
    // Purpose: Displays a list of Provision
    // Parameters: none
    // Returns: none
 public void displayProvisionsList(){
    System.out.println("\n *View Provision List*.");
  }
     // The displayTeamList method
    // Purpose: Displays a list of the Team
    // Parameters: none
    // Returns: none
 public void displayTeamList(){
    System.out.println("\n *View a List of the Team");
  }
 
 public void displayCityList(){
    System.out.println("\n *View a List of the Team");
  }
}