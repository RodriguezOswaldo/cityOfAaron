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
 * @author Own
 */
public class CropControl 
{
    //constants 
    private static final int LAND_BASE = 17;
    private static final int LAND_RANGE = 10;
    
    private static final int ACRE_MIN = 17;
    private static final int ACRE_MAX = 27;
    
    // random number generator
    private static final Random random = new Random();
    
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
//     a reference to a CropData object 
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


    public static int buyLand(int acrePrice, int acresToBuy, CropData cropData)
    {
        
        // if acresToBuy < 0, return -1
            if(acresToBuy < 0) {
               
            }
                
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
    
}
