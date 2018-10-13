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
/**
 *
 * @author Own
 */
public class CityOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //set player
        Player greatPlayer = new Player();
        greatPlayer.setName("Sam");
        
        //set game
        Game greatGame = new Game();
        greatGame.setPlayer(greatPlayer);
        
        //Oswaldo's class;
        Location location = new Location();
        location.setDescription("J't'p'tan");
        
        //player class acting like "string" or "int" primitive data
        Player person = greatGame.getPlayer();
        String name = person.getName();
        System.out.println(name);
        
        //Oswaldo's class;
        String description = location.getDescription();
        System.out.println(description);
        
        System.out.println(TeamMember.SAM.getName()+ " - " + TeamMember.SAM.getTitle());
        
    }
    
}