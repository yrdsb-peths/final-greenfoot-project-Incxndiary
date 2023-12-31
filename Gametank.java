import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gametank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gametank extends Actor
{
    /**
     * Act - do whatever the Gametank wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage tankbody = new GreenfootImage("images/tank_idle/tile000.png");
    
    int leftSpeed = -2;
    int rightSpeed = 2;
    public Gametank(){
        
        setRotation(90); 
        tankbody.scale(65, 50);
        setImage(tankbody);
    }
    SimpleTimer animationTimer = new SimpleTimer();
    SimpleTimer speed = new SimpleTimer();
    
    public void act()
    {
        if(speed.millisElapsed() > 2500){
            leftSpeed = -2;
            rightSpeed = 2;
        }
        if(Greenfoot.isKeyDown("w")){
            
            move(rightSpeed);
        }
        if(Greenfoot.isKeyDown("s")){
            
            move(leftSpeed);
        }
        if(Greenfoot.isKeyDown("a")){
            
            setRotation(getRotation() - 3);
        }
        if(Greenfoot.isKeyDown("d")){
            
            setRotation(getRotation() + 3);
        }
        
        
    }
}
