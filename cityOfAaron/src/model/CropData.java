/*
 *The Game Class for the cityOfAaron project
 *CIT 260
 *Spring 2018
 *Team Members: Sam Wagner, Gabriel Gonzales, Oswaldo Rodríguez
 */
package model;

/**
 *
 * @author gabrielmemories
 */
import java.io.Serializable;

public class CropData implements Serializable {
    
    //Variables
    private int year;
    public int population;
    private int acresOwned;
    private int cropYield;
    private int wheatInStore;
    private int numberWhoDied;
    private int newPeople;
    private int harvest;
    private int wheatForFood;
    private int acresPlanted;
    private int wheatForPeople;
    private int offeringPercent;
    private int offering;
    private int offeringBushels;
    
        //Constructor
    public CropData(int year, int population, int acresOwned, int cropYield, int wheatInStore, int numberWhoDied, int newPeople, int harvest, int wheatForFood, int acresPlanted, int wheatForPeople, int offeringPercent, int offering, int offeringBushels) {
        this.year = year;
        this.population = population;
        this.acresOwned = acresOwned;
        this.cropYield = cropYield;
        this.wheatInStore = wheatInStore;
        this.numberWhoDied = numberWhoDied;
        this.newPeople = newPeople;
        this.harvest = harvest;
        this.wheatForFood = wheatForFood;
        this.acresPlanted = acresPlanted; 
        this.wheatForPeople = wheatForPeople;
        this.offeringPercent = offeringPercent;
        this.offering = offering;
        this.offeringBushels = offeringBushels;
        
}

    public CropData(){
        
    }
    
    // Getters and Setters
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getAcresOwned() {
        return acresOwned;
    }

    public void setAcresOwned(int acresOwned) {
        this.acresOwned = acresOwned;
    }

    public int getCropYield() {
        return cropYield;
    }

    public void setCropYield(int cropYield) {
        this.cropYield = cropYield;
    }

    public int getWheatInStore() {
        return wheatInStore;
    }

    public void setWheatInStore(int wheatInStore) {
        this.wheatInStore = wheatInStore;
    }

    public int getNumberWhoDied() {
        return numberWhoDied;
    }

    public void setNumberWhoDied(int numberWhoDied) {
        this.numberWhoDied = numberWhoDied;
    }

    public int getNewPeople() {
        return newPeople;
    }

    public void setNewPeople(int newPeople) {
        this.newPeople = newPeople;
    }

    public int getHarvest() {
        return harvest;
    }

    public void setHarvest(int harvest) {
        this.harvest = harvest;
    }

    public int getWheatForFood() {
        return wheatForFood;
    }
    
     public void setWheatForFood(int wheatForFood) {
        this.wheatForFood = wheatForFood;
    }   
    
    public int getOffering() {
        return offering;
    }
    
    public void setOffering(int offering) {
        this.offering = offering;
    } 
     
    public int getOfferingPercent() {
        return offeringPercent;
    }
    
    public void setOfferingPercent(int offeringPercent) {
        this.offeringPercent = offeringPercent;
    }
    
    public int getOfferingBushels() {
        return offeringPercent;
    }
    
    public void setOfferingBushels(int offeringBushels) {
        this.offeringBushels = offeringBushels;
    }

    public int getAcresPlanted() {
        return acresPlanted;
    }

    public void setAcresPlanted(int acresPlanted) {
        this.acresPlanted = acresPlanted;
    }
    public int getWheatForPeople() {
        return wheatForPeople;
    }

    public void setWheatForPeople(int wheatForPeople) {
        this.wheatForPeople = wheatForPeople;
    }
    
}