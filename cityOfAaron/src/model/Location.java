/*
 *The Location Class for the cityOfAaron project
 *CIT 260
 *Spring 2018
 *Team Member: Sam Wagner, Gabriel Gonzales, Oswaldo Rodríguez
 *@author Oswaldo Rodriguez
 */
package model;

/**
 *
 * @author Own
 */
import java.io.Serializable;  
public class Location implements Serializable{
    
    private String description; 
    private String symbol;
    
    public Location(){}
    
    public String getDescription() 
    {
        return description;
    }
    public void setDescription(String _description){
        this.description = _description;
    }
    
    public String getSymbol()
    {
        return symbol;
    }
    public void setSymbol(String _symbol){
        this.symbol = symbol;
    }
}
