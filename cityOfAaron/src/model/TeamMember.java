/*
 *The Team Member enum for the cityOfAaron project
 *CIT 260
 *Spring 2018
 *Team Members: Sam Wagner, Gabriel Gonzales, Oswaldo Rodríguez
 */
package model;

/**
 *
 * @author Own
 */
public enum TeamMember
{
    SAM("Sam","Starlord"),
    OSWALDO("Oswaldo", "Lord Sith"),
    GABRIEL("Gabriel", "Jedi Master");
    
    
    private String name;
    private String title; 
    
TeamMember(String _name, String _title){

    name = _name;
    title = _title;
}        
    public String getTitle(){
        return title;
    }
    public String getName()
    {
       return name; 
    }
    }
