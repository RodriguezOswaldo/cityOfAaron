/*
 * The CropControl class - part of the control layer
 * class contains all of the calculations methods for managing the crops   
 * Author: Sam Wagner, Gabriel Gonzales, Oswaldo Rodríguez 
 * Date last modified: October 2018
 */
package control;

import java.util.Random;
import model.CropData;

/**
 *
 * @author Gabriel Gonzales, Sam Wagner, Oswaldo Rodriguez
 */
public class CropControl 
{
    //constants 
    private static final int LAND_BASE = 17;
    private static final int LAND_RANGE = 10;
    
    private static final int ACRE_MIN = 17;
    private static final int ACRE_MAX = 27;
    
    // random number generator
    private static Random random = new Random();
    
    //calcLandCosta() method
    //Purpose: Calculate a random land cost between 17 and 26 bushels/acre
    //Parameters: none
    //Returns: the land cost
    public static int calcLandCost()
    {
        int landPrice = random.nextInt(LAND_RANGE) + LAND_BASE;
        return landPrice;
    }  
    
    public static int calcAcreCost()
    {
        int acrePrice = random.nextInt(ACRE_MAX) + ACRE_MIN;
        return acrePrice;
    } 
        
    // The sellLand method
    // Purpose: To sell land
    // Parameters: the price of land, the number of acres to sell, and
    // a reference to a CropData object 
    // Returns: the acres owned after the sale
    // Pre-conditions: acres to sell must be positive
    // and <= acresOwned

    public static int sellLand(int landPrice, int acresToSell, CropData cropData)
    {
        // if acresToSell < 0, return -1
            if(acresToSell <0)
                return -1;
        // if acresToSell > acresOwned, return -1
            int owned = cropData.getAcresOwned(); //use the Getter method in the CropData class to get acres owned.
            if(acresToSell > owned)
                return -1;
        // acresOwned = acresOwned - acresToSell
            owned -= acresToSell;
            cropData.setAcresOwned(owned); // use the setter method in the cropData class to update the value of acresOwned
        // wheatInStore = wheatInStore + acresToSell * landPrice
            int wheat = cropData.getWheatInStore();
            wheat += (acresToSell * landPrice);
            cropData.setWheatInStore(wheat); //use the setter method inn the cropData class to save wheat in store.
        // return acresOwned
        return owned;// return this value so you can test your method against your test matrix.
    }
  
    // The buyLand method
    // Purpose: To buy land
    // Parameters: the price per acre of land, the number of acres to buy, bushels of wheat owned,
    // number of acres owned, and storage wheat owned    
    // Returns: the number of acres owned
    // Pre-conditions: number of acres to buy must be positive, bushels of wheat must be 
    // more than or equal to 17, price per acre of land must be greater than or equal
    // to 17 and less than or equal to 27 
    // Team Assingment
    
    public static int buyLand(int acresPrice, int acresToBuy, CropData cropData)
    {
            int totalPrice = 17;
        // if acresToBuy < 0, return -1
            if(acresToBuy < 0) {
               System.out.println("A negative value was input.");
            }        
        // if acresToSell > acresOwned, return -1
            int wheat = cropData.getWheatInStore();
      
            if (wheat < totalPrice){
                System.out.println("You don't have enough bushels");
            }
        // acresOwned = acresOwned + acresToBuy
            int acresOwned = cropData.getAcresOwned();
            if (acresToBuy == 0) {
                return acresOwned;
            } else {
            acresOwned += acresToBuy;
                System.out.println(acresOwned);
            
             wheat -=(totalPrice * acresToBuy);
                System.out.println(wheat);
                return acresOwned;
            }
    }
    
    // The feedPeople method
    // Author: Gabriel Gonzales
    // Purpose: Set aside wheat to feed the people
    // Parameters: number of bushels to set aside for food
    // Returns: Number of bushels remaining in the store
    // Pre-conditions: Number of bushels must be positive and have enough wheat in the store  
    
    public int feedPeople(CropData cropData)
    {    
            int wheatForPeople = 0;
        //if wheatForPeople < 0, return -1
            if(wheatForPeople < 0){
                 return -1;
            }
        //if wheatInStore < wheatForPeople return -1
            int wheatInStore = cropData.getWheatInStore();
            if(wheatForPeople > wheatInStore){
                return -1;
             }
        //wheatInStore = wheatInStore - wheatForPeople
            wheatInStore -= wheatForPeople;
            cropData.setWheatInStore(wheatInStore);
        // wheat for people
            cropData.setWheatForPeople(wheatForPeople);
        //return wheatInStore
                return wheatInStore;
    }
    
    // The plantTheCrops method
    // Purpose: To plan crops
    // Parameters: number of acres to plant, number of acres owned, number of people needed to plant them, bushels of wheat required,
    // number of people in the city, and storage wheat owned    
    // Returns: the number of wheat in store, acres planted.
    // Pre-conditions: 1. number of acres to plant must be positive, 2. number of acres owned  must be greater than acres to plant
    // 3. number of people in the city must be greater than needed (populationNeeded = acresToplant/10)
    // wheat in store must be greater than required (wheatRequired = acresToPlant/2)
    // Oswaldo Rodriguez

     public static int plantTheCrops(int acresToPlant, int populationNeeded, int wheatRequired,  CropData cropData) 
     {
        //If (A < 0) [Error, Enter the value again]
            if(acresToPlant < 0)
            {
                System.out.println("Error, enter the value again"); 
            }
        //If (L < A) [Error, Enter the value again]
            int owned = cropData.getAcresOwned();
            if(owned < acresToPlant)
            {
                System.out.println("Error, enter the value again");  
            }
        //Population needed = Pn; Pn= A/10
            populationNeeded = acresToPlant/10;
        //Population in the city = Pc (dataCrop) 
            int population = cropData.population;
        //If (Pc < Pn) [Error, there are not enough people, Enter a different value]. 
            if (population < populationNeeded)
            {
                System.out.println("Error, there are not enough people, enter a different value");
            }
        //Wheat required = WR; WR = A/2
            wheatRequired = acresToPlant/2; 
            int wheatInStore = cropData.getWheatInStore();
        //Ws  < WR   [There are not enough bushels of wheat in storage, enter the value again].  
            if(wheatInStore < wheatRequired)
            {
                System.out.println("There are not enough bushels of wheat in storage, enter the value again");
            }
        //Wheat in Store = Ws; Ws = Ws  - WR   
            wheatInStore -= wheatRequired;
        //Output: Display Acres Planted(A), and Wheat left in storage(WL)
            System.out.println(wheatInStore);
            System.out.println(acresToPlant);  
            return 0;            
     }
     
    // The setOffering method
    // Purpose: To set offering
    // Parameters: 
    // Returns: 
    // Pre-conditions: 
    // Author: Sam Wagner
     
}
    
                


       
        