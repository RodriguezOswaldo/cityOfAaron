/*
 *The main() class file for the cityOfAaron project
 *CIT 260
 *Spring 2018
 *Team Members: Sam Wagner, Gabriel Gonzales, Oswaldo Rodríguez
 */
package cityofaaron;
import model.CropData;
import model.Game;
import model.Player;
import model.TeamMember;
//Oswaldo's Class!
import model.Location;
//Sam's Class!
import model.ListItem;
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
        
        //player class acting like "string" or "int" primitive data
        Player person = greatGame.getPlayer();
        String name = person.getName();
        System.out.println(name);
        
        //Oswaldo's Location class;
        Location location = new Location();
        location.setDescription("J't'p'tan");
        
        //Oswaldo's class;
        String description = location.getDescription();
        System.out.println(description);
        
        //Sam's ListItem class
        ListItem randomNumber = new ListItem();
        randomNumber.setNumber(2);
        Integer sameRandomNumber = randomNumber.getNumber();
        System.out.println(sameRandomNumber);
        
        System.out.println(TeamMember.SAM.getName()+ " - " + TeamMember.SAM.getTitle());
        
        //Gabriel's CropData class           
        CropData cropdata = new CropData(2018, 2000, 1000, 300, 500, 3, 10, 600, 150, 100);
        System.out.println("Year: " + cropdata.getYear());
        System.out.println("Population: " + cropdata.getPopulation());
        System.out.println("Acres Owned: " + cropdata.getAcresOwned());
        System.out.println("Crop Yield: " + cropdata.getCropYield());
        System.out.println("Wheat In Store: " + cropdata.getWheatInStore());
        System.out.println("Number Who Died: " + cropdata.getNumberWhoDied());
        System.out.println("New People: " + cropdata.getNewPeople());
        System.out.println("Harvest: " + cropdata.getHarvest());
        System.out.println("Wheat for Food " + cropdata.getWheatForFood());
        System.out.println("Acres Planted: " + cropdata.getAcresPlanted());    
    }
    
}