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
    private ArrayList<ListItem> animals;

    public ListItem(String cows, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
      public void setAnimals(ArrayList<ListItem>  _animals)
    {
        this.animals = _animals;
    } 
    
    public ArrayList<ListItem>  getAnimals()
    {
         return animals;
    }
    
}