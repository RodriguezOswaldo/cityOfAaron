/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
}
