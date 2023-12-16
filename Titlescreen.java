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
    Label rules = new Label("Rules", 50);
    /**
     * Constructor for objects of class Titlescreen.
     * 
     */
    public Titlescreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(titleLabel, getWidth()/2, getHeight()/2);
        addObject(rules, 100, 300);
        prepare();
        
    }
    Startbutton startbutton = new Startbutton();
    public void act(){
        if(Greenfoot.mouseClicked(rules)){
            Rules rule = new Rules();
            Greenfoot.setWorld(rule);
        }
        
    }
    public void prepare(){
        Tank tank = new Tank();
        addObject(tank, 150, 100);
        Startbutton start = new Startbutton();
        addObject(start, 300, 300);
    }
    
}
