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
        Enemytank enemy = new Enemytank();
        Enemyshoot enemys = new Enemyshoot();
        int x = Greenfoot.getRandomNumber(300) + 300;
        int y = Greenfoot.getRandomNumber(400);
        addObject(enemy, x, y);
        addObject(enemys, enemy.getX(), enemy.getY());
        addObject(tank, 300, 200);
        addObject(tanks, 300, 200);
        
    }
    
}
