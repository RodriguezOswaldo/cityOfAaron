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
    
    private Player thePlayer;
    
    public Game(){}
    
    public Player getPlayer()
    {
         return thePlayer;
    }
    public void setPlayer(Player _thePlayer){
        this.thePlayer = _thePlayer;
    }  
}