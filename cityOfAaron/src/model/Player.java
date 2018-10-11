/*
 *The Player Class for the cityOfAaron project
 *CIT 260
 *Spring 2018
 *Team Members: Sam Wagner, Gabriel Gonzales, Oswaldo Rodríguez
 */
package model;

/**
 *
 * @author Own
 */

import java.io.Serializable;
public class Player implements Serializable {
    
    private String name;
    
    public Player(){}
    
    public String getName()
    {
         return name;
    }
    public void setName(String _name){
        this.name = _name;
    }  
}
