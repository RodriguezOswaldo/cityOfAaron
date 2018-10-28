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
 * @author Oswaldo Rodriguez, Sam Wagner, Gabriel Gonzalez
 */
public class CropControlTest {
    
    public CropControlTest() {
    }

    /**
     * Test of sellLand method, of class CropControl.
     */
    @Test
    public void testSellLand() {
        System.out.println("sellLand");
        int landPrice = 20;
        int acresToSell = 10;
        CropData cropData = new CropData();
        int expResult = 2790;
        int result = CropControl.sellLand(landPrice, acresToSell, cropData);
        assertEquals(expResult, result);
     
    }

    /**
     * Test of buyLand method, of class CropControl.
     */
    @Test
    public void testBuyLand() {
        System.out.println("buyLand");
        int acresPrice = 20;
        int acresToBuy = 10;
        CropData cropData = new CropData();
        cropData.setAcresOwned(2800);
        int expResult = 2790;
        int result = CropControl.buyLand(acresPrice, acresToBuy, cropData);
        assertEquals(expResult, result);
       
    }Let

   /**
     * Test of plantTheCrops method, of class CropControl.
     */
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
        int result = CropControl.plantTheCrops(acresToPlant, populationNeeded, wheatRequired, cropData);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of feedPeople method, of class CropControl.
     */
    @Test
    public void testFeedPeople() {
        System.out.println("feedPeople");
        CropData cropData = null;
        CropControl instance = new CropControl();
        int expResult = 0;
        int result = instance.feedPeople(cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
}
