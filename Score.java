import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends World
{
    /**
     * Constructor for objects of class Score.
     * 
     */
    
    
    
    public Score()
    {   
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        
    }
    //Creating menu button
    public void prepare(){
        menu menu = new menu();
        addObject(menu, 300, 350);
    }
}
