/*
 *The GameControl class - part of the View layer.
 * class contains some important information.   
 * Author: Sam Wagner, Gabriel Gonzales, Oswaldo Rodríguez 
 * Date last modified: October 2018
 */
package control;
import model.*;
import cityofaaron.CityOfAaron;
import java.util.ArrayList;
/**
 *
 * @author Own
 */
public class GameControl {
    
        // size of the Locations array
        private static final int MAX_ROW = 5;
        private static final int MAX_COL = 5;

        public static void createNewGame(String _name){
            
        // create the game object
        Game theGame = new Game();
        // create the player object and set the name
        Player thePlayer = new Player();
        
        // save reference to the player object in the player
        thePlayer.setName(_name);
        // save reference to the player object in the game
        theGame.setPlayer(thePlayer);
        
        // create and initialize a CropData object
        CropData cropData = new CropData();
        
        cropData.setYear(0);
        cropData.setPopulation(100);
        cropData.setNewPeople(5);
        cropData.setCropYield(3);
        cropData.setNumberWhoDied(0);
        cropData.setWheatInStore(2700);
        cropData.setAcresOwned(1000);
        cropData.setAcresPlanted(1000);
        cropData.setHarvest(3000);
        cropData.setAcresPlanted(1000); 
        cropData.setOffering(10);
        cropData.setOfferingBushels(300);
        
        // save a reference to it in the Game object
        theGame.setCropData(cropData); 
        
        // when all is done, save a reference to the Game object
        CityOfAaron.setGame(theGame);
        }
        
        // method prologue ….
        public static void createCropDataObject()
        {
            CropData theCrops = new CropData();
            // create the game object
            Game theGame = new Game();
            // save reference to the player object in the game
            
            theCrops.setYear(0);
            theCrops.setPopulation(100);
            theCrops.setNewPeople(5);
            theCrops.setCropYield(3);
            theCrops.setNumberWhoDied(0);
            theCrops.setOffering(10);
            theCrops.setWheatInStore(2700);
            theCrops.setAcresOwned(1000);
            theCrops.setAcresPlanted(1000);
            theCrops.setHarvest(3000);
            theCrops.setOfferingBushels(300);
            theCrops.setAcresPlanted(1000); 

            theGame.setCropData(theCrops);         
        }

        // The createMap method
        // Purpose: creates the location objects and the map
        // Parameters: none
        // Returns: none
        public static void createMap()   
        {
            // create the Map object, it is 5 x 5
            // refer to the Map constructor
            Map theMap = new Map(MAX_ROW, MAX_COL);
            
            // create the game object
            Game theGame = new Game();
            
            //|||||
            //|||||
            //|||||
            //|||||
            //|||||
            //#1 - THE RIVER
            // create a string that will go in the Location objects
            // that contain the river
            String river = "\nYou are on the River. The river is the source" +
                           "\nof life for our city. The river marks the eastern " +
                           "\nboundary of the city - it is wilderness to the East.";

            // create a new Location object
            Location loc = new Location();

            // use setters in the Location class to set the description and symbol
            loc.setDescription(river);
            loc.setSymbol("~~~");  

            // set this location object in each cell of the array in column 4      
            for(int i = 0; i < MAX_ROW; i++)
             {
                    theMap.setLocation(i, 4, loc);
             }
            
            //#2 - FARMLAND
            // define the string for a farm land location
            String farmland = "\nYou are on the fertile banks of the River." +
                              "\nIn the springthis low farmland floods and is covered with rich" +
                              "\nnew soil. Wheat is planted as far as you can see."; 

            // set a farmland location with a hint
            loc = new Location();
            loc.setDescription(farmland + "\nOne bushel will plant two acres of wheat.");
            loc.setSymbol("!!!");
            theMap.setLocation(0, 2, loc);
            
            //#3 - DESERT
            // define the string for a desert land location
            String desert = "\nYou are on the dry desert." +
                            "\nIn the summer you can cook an egg on the ground." +
                            "\nYou are very close to dying."; 

            // set a desert location with a hint
            loc = new Location();
            loc.setDescription(desert + "\nPack water!!");
            loc.setSymbol("____");
            theMap.setLocation(4, 2, loc); 
            
            //#4 - Village
            // define the string for a farm land location
            String village = "\nYou are in the little village of the big city." +
                             "\nWe love sleeping." +
                             "\nWe are known for our chic fil a biscuits."; 

            // set a village location with a hint
            loc = new Location();
            loc.setDescription(village + "\nCarry a weapon in case of danger.");
            loc.setSymbol("<><><>");
            theMap.setLocation(0, 2, loc);
            
            // set this location object in each cell of the array in column 4  
            //rows 1 to 3
            for(int i = 1; i < 4; i++)
             {
                    theMap.setLocation(i, 2, loc);
             }
            

            theGame.setMap(theMap);
        }
        //Oswaldo Created animals method 
        public static ArrayList<ListItem> createAnimalsList(){
            //Creating the Game object
            Game theGame = new Game();
            ArrayList<ListItem> animals = new ArrayList<ListItem>();
            //Adding items to the Animals Array.
            animals.add(new ListItem("Cows", 12));
            animals.add(new ListItem("Horses", 3));
            animals.add(new ListItem("Curelomes", 7));
            animals.add(new ListItem("Cumomes", 4));
            
            //Save the Array into the program
             theGame.setAnimals(animals);
             //Sending the Value to the program that is calling it.
             return animals;
        }
        
}



    
