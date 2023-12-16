import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Returnbutton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Returnbutton extends Actor
{
    /**
     * Act - do whatever the Returnbutton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Returnbutton(){
        GreenfootImage returnbutton = new GreenfootImage("return.png");
        setImage(returnbutton);
        returnbutton.scale(100, 100);
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            Titlescreen title = new Titlescreen();
            Greenfoot.setWorld(title);
        }
    }
}
