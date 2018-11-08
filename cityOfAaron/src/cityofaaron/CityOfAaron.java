/*
 *The main() class file for the cityOfAaron project
 *CIT 260
 *Spring 2018
 *Team Members: Sam Wagner, Gabriel Gonzales, Oswaldo Rodríguez
 */
package cityofaaron;
import model.Game;
import model.Player;
import model.TeamMember;
//Oswaldo's Class!
import model.Location;
//Sam's Class!
import model.ListItem;
//Gabriel's Class!
import model.CropData;
import view.*;
/**
 *
 * @author Own
 */
public class CityOfAaron {

   // variable for keeping a reference to the Game object
    private static Game theGame = null;
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        // runs the main menu
        MainMenuView mmv = new MainMenuView();
        mmv.displayMenuView();
        
    }
    
    public static void setGame(Game game){
        theGame = game;
    }
    public Game getGame(){
        return theGame;
    }
    

}