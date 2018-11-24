/*
 *The Game Class for the cityOfAaron project
 *CIT 260
 *Spring 2018
 *Team Members: Sam Wagner, Gabriel Gonzales, Oswaldo Rodríguez
 */
package model;
import java.util.ArrayList;

/**
 *
 * @author Own
 */
import java.io.Serializable;
public class Game implements Serializable {
    
    private Player thePlayer;
    private CropData cropData;
    private Map theMap;
    private ArrayList<ListItem> animals;
    
    //Default Constructors
    public Game(){}
    
    public Player getPlayer()
    {
         return thePlayer;
    }
    public void setPlayer(Player _thePlayer){
        this.thePlayer = _thePlayer;
    }  
    
    public CropData getCropData(){
        return cropData;
    } 
    
    public void setCropData(CropData cropData){
        this.cropData = cropData;
    }
    
    public Map getMap(){
        return theMap;
    } 
    
    public void setMap(Map _theMap){
        this.theMap = _theMap;
    }
    //Animals Getter and Setter by Oswaldo...
    public  ArrayList<ListItem> getAnimals(){
        return animals;
    } 
    
    public void setAnimals(ArrayList<ListItem> _animals){
        this.animals = _animals;
    }
}