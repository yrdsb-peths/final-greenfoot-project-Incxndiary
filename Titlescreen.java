import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Titlescreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Titlescreen extends World
{
    Label titleLabel = new Label("Tank Shooter", 50);
    /**
     * Constructor for objects of class Titlescreen.
     * 
     */
    public Titlescreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(titleLabel, getWidth()/2, getHeight()/2);
        prepare();
        
    }
    Startbutton startbutton = new Startbutton();
    public void act(){
        
        
    }
    public void prepare(){
        Tank tank = new Tank();
        addObject(tank, 150, 100);
        Startbutton start = new Startbutton();
        addObject(start, 300, 300);
    }
    
}
