/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;

/**
 *
 * @author swagner
 */
import java.io.Serializable;
public class ListItem implements Serializable {
    
    private String name;
    private Integer number;
    
    //Constructor for the AnimalsLists.
    public ListItem(String type, int numType) {
        
        //setting the parameter to the variables.
         setName(type);  
         setNumber(numType);

    }       
   

 
 
    public void setName(String _name)
    {
        this.name = _name;
    }  
    
    public String getName()
    {
         return name;
    }
    
    public void setNumber(Integer _number)
    {
        this.number = _number;
    } 
    
    public Integer getNumber()
    {
         return number;
    }
    
}
