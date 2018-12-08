/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.CropData;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Oswaldo Rodriguez, Sam Wagner, Gabriel Gonzales
 */
public class CropControlTest {
    public CropControlTest() {
    
    }

    //* Test of sellLand method, of class CropControl.

     @Test
    public void testSellLand() {
        System.out.println("sellLand");
        int landPrice = 20;
        int acresToSell = 10;
        CropData cropData = new CropData();
        int expResult = 2790;
        
    }

     //* Test of buyLand method, of class CropControl.
    @Test
    public void testBuyLand() {
        System.out.println("buyLand");
        int acresPrice = 20;
        int acresToBuy = 10;
        CropData cropData = new CropData();
        cropData.setAcresOwned(2800);
        int expResult = 2790;
       
    }

     //* Test of plantTheCrops method, of class CropControl.
    @Test
    public void testPlantTheCrops() {
        System.out.println("plantTheCrops");
        int acresToPlant = 35;
        int populationNeeded = 4;
        int wheatRequired = 18;
        CropData cropData = new CropData();
        cropData.setAcresOwned(50);
        cropData.setPopulation(100);
        cropData.setWheatInStore(60);
        int expResult = 35;
       
        
    }
    /**
     * Test of feedPeople method, of class CropControl.
     */
    @Test //Valid
    public void testFeedPeople() {
        System.out.println("feedPeople");
        CropData cropData = new CropData();
        CropControl instance = new CropControl();
        int wheatForPeople = 4;
        cropData.setWheatInStore(10);
        int expResult = 6;
        

    }
        @Test //Invalid
    public void testFeedPeople1() {
        System.out.println("feedPeople");
        CropData cropData = new CropData();
        CropControl instance = new CropControl();
        int wheatForPeople = -1;
        cropData.setWheatInStore(10);
        int expResult = -1;
        

    }

           @Test //Boundary
    public void testFeedPeople3() {
        System.out.println("feedPeople");
        CropData cropData = new CropData();
        CropControl instance = new CropControl();
        int wheatForPeople = 10;
        cropData.setWheatInStore(10);
        int expResult = 0;
        

    }

    /**
     * Test of calcLandCost method, of class CropControl.
     */
    @Test
    public void testCalcLandCost() {
        System.out.println("calcLandCost");
        int expResult = 0;
        int result = CropControl.calcLandCost();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcAcreCost method, of class CropControl.
     */
    @Test
    public void testCalcAcreCost() {
        System.out.println("calcAcreCost");
        int expResult = 0;
        int result = CropControl.calcAcreCost();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOffering method, of class CropControl.
     */
    @Test
    public void testSetOffering() {
        System.out.println("setOffering");
        int offeringPercent = 0;
        CropData cropdata = null;
        int expResult = 0;
        int result = CropControl.setOffering(offeringPercent, cropdata);
        assertEquals(expResult, result);
    }
    
}
