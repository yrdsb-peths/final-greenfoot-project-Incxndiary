import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menu extends Actor
{
    /**
     * Act - do whatever the menu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //Menu class
    GreenfootImage menu = new GreenfootImage("images/Menu.jpg");
    public menu(){
        menu.scale(100, 50);
        setImage(menu);
    }
    //Play again
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            MyWorld world = new MyWorld();
            Greenfoot.setWorld(world);
        }
    }
}
