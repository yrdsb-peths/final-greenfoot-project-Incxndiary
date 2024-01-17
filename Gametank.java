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
    //Set image of game tank
    int leftSpeed = -2;
    int rightSpeed = 2;
    public int score = 0;
    int myHealth = 100;
    public Gametank(){
        
        setRotation(90); 
        tankbody.scale(65, 50);
        setImage(tankbody);
    }
    SimpleTimer animationTimer = new SimpleTimer();
    SimpleTimer speed = new SimpleTimer();
    
    public void act()
    {
        //Movement
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
        collision();
        
    }
    //Checks if enemy bullet hits the tank
    public void collision(){
        Actor normal = getOneIntersectingObject(Enemybullet.class);
        
        if(normal != null){
            myHealth =- 10;
            
        }
    }

}
