/*
 *The Game Class for the cityOfAaron project
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
public class Game implements Serializable {
    
    private String thePlayer;
    
    public Game(){}
    
    public String getPlayer()
    {
         return thePlayer;
    }
    public void setPlayer(String _thePlayer){
        this.thePlayer = _thePlayer;
    }  
}
