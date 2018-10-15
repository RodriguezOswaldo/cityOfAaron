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
    private int population;
    private int acresOwned;
    private int cropYield;
    private int wheatInStore;
    private int numberWhoDied;
    private int newPeople;
    private int harvest;
    private int wheatForFood;
    private int acresPlanted;
    
        //Constructor
    public CropData(int year, int population, int acresOwned, int cropYield, int wheatInStore, int numberWhoDied, int newPeople, int harvest, int wheatForFood, int acresPlanted) {
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

    public int getAcresPlanted() {
        return acresPlanted;
    }

    public void setAcresPlanted(int acresPlanted) {
        this.acresPlanted = acresPlanted;
    }
}