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
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Own
 */
public class GameControl {

    // size of the Locations array
    private static final int MAX_ROW = 5;
    private static final int MAX_COL = 5;
    private static Scanner keyboard = new Scanner(System.in);

    // create the game object
    private static Game theGame = new Game();

    public static void createNewGame(String _name) {

        // create the player object and set the name
        Player thePlayer = new Player();

        // save reference to the player object in the player
        thePlayer.setName(_name);
        // save reference to the player object in the game
        theGame.setPlayer(thePlayer);
        
        // create the player object and set the name
        //Map theMap = new Map();

        // save reference to the player object in the player
        //theMap.setMap(int x, int y);
        // save reference to the player object in the game
        //theGame.setMap(thePlayer);

        // create and initialize a CropData object
        /*
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
        theGame.setCropData(cropData);*/

        // when all is done, save a reference to the Game object
        CityOfAaron.setGame(theGame);
    }

    // method prologue ….
    public static void createCropDataObject() {
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
    public static void createMap() {
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
        String river = "\nYou are on the River. The river is the source"
                + "\nof life for our city. The river marks the eastern "
                + "\nboundary of the city - it is wilderness to the East.";

        // create a new Location object
        Location loc = new Location();

        // use setters in the Location class to set the description and symbol
        loc.setDescription(river);
        loc.setSymbol("~~~");

        // set this location object in each cell of the array in column 4      
        for (int i = 0; i < MAX_ROW; i++) {
            theMap.setLocation(i, 4, loc);
        }

        //#2 - FARMLAND
        // define the string for a farm land location
        String farmland = "\nYou are on the fertile banks of the River."
                + "\nIn the springthis low farmland floods and is covered with rich"
                + "\nnew soil. Wheat is planted as far as you can see.";

        // set a farmland location with a hint
        loc = new Location();
        loc.setDescription(farmland + "\nOne bushel will plant two acres of wheat.");
        loc.setSymbol("!!!");
        theMap.setLocation(0, 2, loc);

        //#3 - DESERT
        // define the string for a desert land location
        String desert = "\nYou are on the dry desert."
                + "\nIn the summer you can cook an egg on the ground."
                + "\nYou are very close to dying.";

        // set a desert location with a hint
        loc = new Location();
        loc.setDescription(desert + "\nPack water!!");
        loc.setSymbol("____");
        theMap.setLocation(4, 2, loc);

        //#4 - Village
        // define the string for a farm land location
        String village = "\nYou are in the little village of the big city."
                + "\nWe love sleeping."
                + "\nWe are known for our chic fil a biscuits.";

        // set a village location with a hint
        loc = new Location();
        loc.setDescription(village + "\nCarry a weapon in case of danger.");
        loc.setSymbol("<><><>");
        theMap.setLocation(0, 2, loc);

        // set this location object in each cell of the array in column 4  
        //rows 1 to 3
        for (int i = 1; i < 4; i++) {
            theMap.setLocation(i, 2, loc);
        }

        theGame.setMap(theMap);
    }

    //Oswaldo Created animals method 
    public static ArrayList<ListItem> createAnimalsList() {

        //Getting reference to the Game object in the CityOfAaron Class. 
        Game theGame = CityOfAaron.getGame();
        //Creating the Game object
        //Game theGame = new Game();
        ArrayList<ListItem> animals = new ArrayList<ListItem>();
        //Adding items to the Animals Array.
        animals.add(new ListItem("Cows", 12));
        animals.add(new ListItem("Horses", 3));
        animals.add(new ListItem("Goats", 7));
        animals.add(new ListItem("Cumomes", 4));

        //Save the Array into the program
        theGame.setAnimals(animals);
        //Sending the Value to the program that is calling it.
        return animals;
    }

    // The createProvisionsList method
    // Purpose: creates the list of provisions
    // Parameters: none
    // Returns: none
    //Author: Gabriel Gonzales
    public static ArrayList<ListItem> createProvisionsList() {

        //Getting reference to the Game object in the CityOfAaron Class. 
        Game theGame = CityOfAaron.getGame();

        ArrayList<ListItem> provisions = new ArrayList<>();
        //Adding items to the Provisions Array.

        provisions.add(new ListItem("Water", 200));
        provisions.add(new ListItem("Meat", 100));
        provisions.add(new ListItem("Shoes", 30));
        provisions.add(new ListItem("Wheat", 20));
        provisions.add(new ListItem("Oil", 40));

        theGame.setProvisions(provisions);

        return provisions;
    }

    // The createToolsList method
    // Purpose: creates the list of tools
    // Parameters: none
    // Returns: none
    //Author: Sam Wagner
    public static ArrayList<ListItem> createToolsList() {

        //Getting reference to the Game object in the CityOfAaron Class. 
        Game theGame = CityOfAaron.getGame();

        ArrayList<ListItem> tools = new ArrayList<>();
        //Adding items to the Tools Array.

        tools.add(new ListItem("Hammers", 5));
        tools.add(new ListItem("Nails", 500));
        tools.add(new ListItem("Saws", 5));
        tools.add(new ListItem("Wheels", 10));
        tools.add(new ListItem("Lamps", 20));

        theGame.setTools(tools);

        return tools;
    }

    // the getSavedGame method
    // Purpose: load a saved game from disk
    // Parameters: the file path
    // Returns: none
    // Side Effect: the game reference in the driver is updated
    public static void getSavedGame(String filePath) {
        Game theGame = null;

        try ( FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            theGame = (Game) input.readObject();
            CityOfAaron.setGame(theGame);
        } catch (Exception e) {
            System.out.println("\nThere was an error reading the saved game file");
        }
    }

    public static void saveGame(String filePath) {
        FileWriter outFile = null;
        String fileLocation = filePath;

        try ( FileOutputStream fips = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fips);
            output.writeObject(theGame);
            output.flush();
        } catch (Exception e) {
            System.out.println("\nThere was an error reading the saved game file");
        } finally {
            if (outFile != null) {
                try {
                    outFile.close();
                } catch (IOException e) {
                    System.out.println("Error closing file.");
                }

            }
        }
    }

    //Oswaldo Created the SavingAnimalsList Method
    public static void savingAnimalsList(ArrayList<ListItem> animals) {

        // declare a string to hold the file name
        String file;

        // prompt the user for a file name, get and save the user’s input
        System.out.println("Please, type the file name: ");
        file = keyboard.next();

        // create the PrintWriter object
        try ( PrintWriter output = new PrintWriter(file)) {

            // output a heading for the report
            output.println("***Animals List***\n");

            // use a for loop to get the data from the ArrayList
            for (int i = 0; i < animals.size(); i++) {

                // and output it
                output.println(animals.get(i).getName() + "\t" + animals.get(i).getNumber());

            }

            output.close();

        } catch (Exception e) {
            System.out.println("Error");
        }

    }
    //method to save the provision list to disk 
    //Author: Gabriel Gonzales

    public static void saveProvisionList() {
        Scanner keyboard = new Scanner(System.in);
        //receive a string of the file name, passed into the printing routine.
        String listPath;
        System.out.println("Please enter a file path for the Provision list: ");
        listPath = keyboard.next();

        //declare a reference to a PrintWriter object
        try ( PrintWriter out = new PrintWriter(listPath);) {
            //create the PrintWriter object

            //get a reference to the ArrayList
            ArrayList<ListItem> provisions = theGame.getProvisions();

            //output a heading for the report
            out.println("\n\n Provision List      ");
            //use a for loop to get the data from the ArrayList
            for (ListItem item : provisions) {
                out.printf("%n%-20s%7d", item.getName(),
                        item.getNumber());

            }

            //output it
        } catch (Exception e) {
            //output error message
            System.out.println("Error saving list to file.");
        }

    }

    //Method saves the tools list to disk
    //Author: Sam Wagner
    public static void savingToolsList(ArrayList<ListItem> tools) {
        // declare a string to hold the file name
        String file;
        // prompt the user for a file name, get and save the user’s input
        System.out.println("Please, type the file name: ");
        file = keyboard.next();

        // create the PrintWriter object
        try ( PrintWriter output = new PrintWriter(file)) {

            // output a heading for the report
            output.println("Tools List\n");

            // use a for loop to get the data from the ArrayList
            for (int i = 0; i < tools.size(); i++) {
                // and output it
                output.println(tools.get(i).getName() + "\t" + tools.get(i).getNumber());
            }

            output.close();

        } catch (Exception e) {
            System.out.println("Error");
        }

    }
    // the setCoordinates method
    // Purpose: setCoordinates of the player in the game
    // Parameters:row & column
    // Returns: none
    //Created by Oswaldo Rodríguez
    
    public static void setCoordinates() {

        // create the player object and set the name
        Player thePlayer = new Player();

        // save reference to the player object in the player
        thePlayer.setRow(0);

        // save reference to the player object in the player
        thePlayer.setColumn(0);

       
    }

}
