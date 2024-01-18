import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemymissle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemymissile extends SmoothMover
{
    /**
     * Act - do whatever the Enemymissle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //Sets the image of the missle
    GreenfootImage missle = new GreenfootImage("images/Missle.png");
    public Enemymissile(int direction){
        fizzOut = 10;
        setRotation(direction);
        missle.scale(100, 20);
        setImage(missle);
    }
    
    public void act()
    {
        //Speed of missle
        move(30);
        MyWorld world = new MyWorld();
        fizz();
    }
    //Fizzes the bullet out or out of bounds
    public void fizz(){
        Actor missile = getOneIntersectingObject(Enemymissile.class);
        counter++;
        if(counter > fizzOut || missile != null){
            getWorld().removeObject(this);
        }
    }
}
