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
        int result = CropControl.sellLand(landPrice, acresToSell, cropData);
        assertEquals(expResult, result);
     
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
        int result = CropControl.buyLand(acresPrice, acresToBuy, cropData);
        assertEquals(expResult, result);
       
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
        int result = CropControl.plantTheCrops(acresToPlant, cropData);
        assertEquals(expResult, result);
        
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
        int result = instance.feedPeople(cropData, wheatForPeople);
        assertEquals(expResult, result);

    }
        @Test //Invalid
    public void testFeedPeople1() {
        System.out.println("feedPeople");
        CropData cropData = new CropData();
        CropControl instance = new CropControl();
        int wheatForPeople = -1;
        cropData.setWheatInStore(10);
        int expResult = -1;
        int result = instance.feedPeople(cropData, wheatForPeople);
        assertEquals(expResult, result);

    }

           @Test //Boundary
    public void testFeedPeople3() {
        System.out.println("feedPeople");
        CropData cropData = new CropData();
        CropControl instance = new CropControl();
        int wheatForPeople = 10;
        cropData.setWheatInStore(10);
        int expResult = 0;
        int result = instance.feedPeople(cropData, wheatForPeople);
        assertEquals(expResult, result);

    }
    
}
