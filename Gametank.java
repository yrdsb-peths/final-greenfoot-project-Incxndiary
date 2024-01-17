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
    private int myHealth;
    private int leftSpeed = -2;
    private int rightSpeed = 2;
    public int score = 0;
    public Gametank(){
        myHealth = 200;
        setRotation(90); 
        tankbody.scale(65, 50);
        setImage(tankbody);
    }
    SimpleTimer speed = new SimpleTimer();
    
    public void act()
    {
        if(myHealth > 0){
            moveAround();
            collision();
        }
    }
    //Checks if enemy bullet hits the ta
    //Movement
    public void moveAround(){
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
    public void collision(){
        Actor normal = getOneIntersectingObject(Enemybullet.class);
        Actor missile = getOneIntersectingObject(Enemymissle.class);
        if(normal != null){

            myHealth -= 10;
            getWorld().removeObject(normal);
        }
        if(missile != null){
            myHealth -= 20;
            getWorld().removeObject(missile);
        }
        System.out.println(myHealth);
    }
}
