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
        scoreLabel = new Label(score, 25);
        addObject(scoreLabel, 25, 25);
        
        addObject(tank, 0, 200);
        addObject(tanks, 0, 200);
        

    }
    
    public void act(){
        increaseEnemy();
        
    }
    
    public void increaseEnemy(){
        Semiautotank semi = new Semiautotank();
        int x = Greenfoot.getRandomNumber(300) + 300;
        int y = Greenfoot.getRandomNumber(200) + 100;
        Missile missile = new Missile();
        int a = Greenfoot.getRandomNumber(300) + 300;
        int b = Greenfoot.getRandomNumber(200) + 100;
        if(counter < level){
            for(int i = 0; i < level; i++){
                addObject(semi, x, y);
            }
        }
        
        
        /*if(simple.millisElapsed() > 1000){
            if(counter < level){
                for(int i = 0; i < level; i++){
                    addObject(semi, x, y);
                }
                counter++;
            }
            if(score == level*100){
                level++;
            }
        }
        if(score >= 1000){
            if(counter < level){
                addObject(missile, a, b);
                counter++;
            }
            
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
