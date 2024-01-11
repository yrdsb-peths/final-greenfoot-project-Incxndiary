import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        Gametank tank = new Gametank();
        Tankshoot tanks = new Tankshoot();
        Semiautotank semi = new Semiautotank();
        int x = Greenfoot.getRandomNumber(300) + 300;
        int y = Greenfoot.getRandomNumber(400);
        addObject(semi, x, y);
        addObject(tank, 0, 200);
        addObject(tanks, 0, 200);
        
    }
    
}
