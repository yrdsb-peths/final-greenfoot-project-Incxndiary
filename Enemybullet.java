import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemybullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemybullet extends SmoothMover
{
    /**
     * Act - do whatever the Enemybullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //Sets the characteristics of the bullet
    GreenfootImage enemybullet = new GreenfootImage("images/Bullet.png");
    public Enemybullet(int direction){
        fizzOut = 7;
        setRotation(direction);
        setImage(enemybullet);
    }
    
    public void act()
    {
        //Speed
        move(50);
        //Checks if it touches the "good" tank
        fizz();
        MyWorld world = new MyWorld();
        
    }

    //Fizzes the bullet out
    public void fizz(){
        Actor object = getOneIntersectingObject(Enemybullet.class);
        counter++;
        //Removes bullet if it touches border
        if(counter > fizzOut || object != null){
            getWorld().removeObject(this);
        }
    }
}
