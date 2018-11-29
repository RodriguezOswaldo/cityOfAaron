/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import model.*;
import control.*;
import exceptions.*;
import java.util.Scanner;
import cityofaaron.CityOfAaron;

/**
 *
 * @author Own
 */
public class CropView {
    
    //Create a Scanner object
    private static Scanner keyboard = new Scanner(System.in);
    
    //Get references to the Game object and the CropData object
    static private Game game = CityOfAaron.getGame();
    static private CropData cropData = game.getCropData();
    
    
    //The buyLandView method
    //Purpose: Interface with the user input for buying land
    //Parameters: none
    //Returns: none
    public static void buyLandView(){
        
        //Get the cost of Land for this round
        int price = CropControl.calcLandCost();
        
        //Prompt the user to enter the number of acres to buy
        System.out.format("Land is selling for %d bushles per acre.%n", price);
        System.out.println("\nHow many acres of land do you wish to buy?");
        
        //Get the user's input and save it.
        int toBuy;
        toBuy = keyboard.nextInt();
        boolean paramsNotOkay;
        do{
            paramsNotOkay = false;
            System.out.print("\nHow many acres of land do you wish to buy? ");  
            toBuy = keyboard.nextInt();
            try{
                //Call the buyLand() method in the control later to buy the land
                CropControl.buyLand(price, toBuy, cropData);
            }
            catch(CropException e){
                System.out.println("I am sorry señor, No puedo.");
                System.out.println(e.getMessage());
                paramsNotOkay = true;

            }
        } while (paramsNotOkay);
        
        //Output how much land we now own
        System.out.format("You now own %d acres of land, ", cropData.getAcresOwned());
    }
     //The sellLandView method
    //Purpose: Interface with the user input for selling land
    //Parameters: none
    //Returns: none
    //Created By Oswaldo Rodríguez
     public static void sellLandView(){
        
        //Get the cost of Land for this round
        int price = CropControl.calcLandCost();
        
        //Prompt the user to enter the number of acres to sell
        System.out.format("Land is selling for %d bushles per acre.%n", price);
        System.out.println("\nHow many acres of land do you wish to sell?");
        
        //Get the user's input and save it.
        int toSell;
        toSell = keyboard.nextInt();
        
        //Call the sellLand() method in the control later to buy the land
        CropControl.sellLand(price, toSell, cropData);
        
        //Output how much land we now own
        System.out.format("You now own %d acres of land, ", cropData.getAcresOwned());
    }
     
    //The plantCropsView method
    //Purpose: Interface with the user input for plant crops
    //Parameters: none
    //Returns: none
    //Created by Sam Wagner
      public static void plantCropsView(){
        
        //Get the cost of Land for this round
        int population = CropControl.calcLandCost();
        
        //Prompt the user to enter the number of acres to plant
        System.out.format("Land is selling for %d bushles per acre.%n", population);
        System.out.println("\nHow many acres of land do you want to plant?”");
        
        //Get the user's input and save it.
        int toPlant;
        toPlant = keyboard.nextInt();
      
        //Call the plantTheCrops() method in the control layer to plant the crops 
        CropControl.plantTheCrops(toPlant, cropData);
        
        //Output how many acres were planted
        System.out.format("You have planted %d acres of land, ", cropData.getAcresPlanted());
    }
      
    //The feedPeopleView method
    //Purpose: Interface with the user input for setting aside wheat to feed the people 
    //Parameters: none
    //Returns: none
    //Created by Gabriel Gonzales
       public static void feedPeopleView(){
        
        //Get the cost of Land for this round //fix this comments 
        int population = cropData.getPopulation();
        
        //Prompt the user to enter the number of acres to buy //Fix this Comments 
        System.out.format("Land is selling for %d bushles per acre.%n", population);
        System.out.println("\nHow many bushels of grain do you want to set aside to feed the people?”");
        
        //Get the user's input and save it.
        int bushelsGrain;
        bushelsGrain = keyboard.nextInt();
        
        cropData.setWheatForPeople(bushelsGrain);
   
        //Call the buyLand() method in the control later to buy the land //Fix This Comments 
        CropControl.feedPeople(cropData, bushelsGrain);
        
        //Output how many acres were planted //Fix the message down there, and make sure that this displays what it is supposed to.
        //See City of Aaron requirements to make sure 
        System.out.format("You have planted %d acres of land, ",cropData.getWheatInStore());
    }
    //The runCropView method()
    //Purpose: runs the methods to manage the crops game
    //Parameters: none
    //Returns: none
    public static void runCropView(){
        
        //call the buyLandView() method
        buyLandView();
        //call the sellLandView() method
        sellLandView();
         //call the plantCropsView() method
        plantCropsView();
        //call the feedPeopleView() method
        feedPeopleView();
        //displayCropsReportView()
        displayCropsReportView();
    }
    
    // The endOfYearReportView method
    // Purpose: display the city stats
    // Parameters: none
    // Returns: none
    //Author: Gabriel Gonzales
     
        public static void displayCropsReportView() {
           
        int yearNumber = cropData.getYear();
        int newPeople = cropData.getNewPeople();
        int population = cropData.getPopulation();
        int acresOwned = cropData.getAcresOwned();
        int cropYield = cropData.getCropYield();
        int wheatInStore = cropData.getWheatInStore();
                
        System.out.format("Year:" + yearNumber + " %n");
        System.out.format("Number of people in the city: " + newPeople + " %n");
        System.out.format("Number of current population: " + population + " %n");
        System.out.format("Number of land owned by the city: " + acresOwned + " %n");
        System.out.format("Number of bushels per acre harvested this year: " + cropYield + " %n");
        System.out.format("Number of bushels in store: " + wheatInStore + " %n");
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
