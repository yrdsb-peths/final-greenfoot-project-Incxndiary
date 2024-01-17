import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rules here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rules extends World
{
    Label rules = new Label("Use W, A, S, D keys to move", 50);
    Label rules1 = new Label("Left click to shoot", 50);
    
    /**
     * Constructor for objects of class rules.
     * 
     */
    public Rules()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(rules, getWidth()/2, getHeight()/2);
        addObject(rules1, getWidth()/2, 250);
        prepare();
        
    }
    
    public void prepare(){
        Returnbutton returnbutton = new Returnbutton();
        addObject(returnbutton, 50, 350);
    }
}
