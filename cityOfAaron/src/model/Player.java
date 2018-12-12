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
    
    //Data Member
    private String name;
    
    //Data Members for the Location of the player
    private int row;
    private int column;
    
    //Public Constructor 
    
    public Player(){}
    
    //Getter and Setters for the Name Data Member
    public String getName()
    {
         return name;
    }
    public void setName(String _name){
        this.name = _name;
    }  
    
    //Getter and Setters for the row & column Location
    public int getRow(){
        return row;
    }
    public void setRow(int _row){
        this.row = _row;
    }
    
    public int getColumn(){
        return column;
    }
    public void setColumn(int _column){
        this.column = _column;
    }
}
