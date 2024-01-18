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
    public int score = 0;
    Label scoreLabel;
    private int counter = 0;
    SimpleTimer simple = new SimpleTimer();
    private int level = 1;
    public MyWorld()
    {   
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Gametank tank = new Gametank();
        Tankshoot tanks = new Tankshoot();
        scoreLabel = new Label(score, 50);
        addObject(scoreLabel, 25, 25);
        
        addObject(tank, 0, 200);
        addObject(tanks, 0, 200);
        

    }
    
    public void act(){

        increaseEnemy();
    }
    //Couldn't get a fixed number of spawning of enemy tanks, so I controlled it a bit with the millElapsed() 
    public void increaseEnemy(){
        Semiautotank semi = new Semiautotank();
        int x = Greenfoot.getRandomNumber(300) + 300;
        int y = Greenfoot.getRandomNumber(200) + 100;
        Missile missile = new Missile();
        int a = Greenfoot.getRandomNumber(300) + 300;
        int b = Greenfoot.getRandomNumber(200) + 100;
        if(simple.millisElapsed() % 100 == 0){
            addObject(semi, x, y);
        }
        if(simple.millisElapsed() % 200 == 0){
            addObject(missile, a, b);
        }
        /*if(counter < level){
            for(counter = 0; counter < level; counter++){
                addObject(semi, x, y);
            }
            if(score == level*100){
                counter = 0;
                level++;
            }
            System.out.println(score);
            System.out.println(counter);
        }
        */
            
        
    }
    
    //Increases score for normal tank
    public void increaseScore(){
        score += 100;
        scoreLabel.setValue(score);
    }
    //Increases score for missile tank
    public void increaseScore1(){
        score += 200;
        scoreLabel.setValue(score);
    }
    
    
    
}
