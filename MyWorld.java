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
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Gametank tank = new Gametank();
        Tankshoot tanks = new Tankshoot();
        scoreLabel = new Label(score, 25);
        addObject(scoreLabel, 25, 25);
        Semiautotank semi = new Semiautotank();
        int x = Greenfoot.getRandomNumber(300) + 300;
        int y = Greenfoot.getRandomNumber(200) + 100;
        Missle missle = new Missle();
        int a = Greenfoot.getRandomNumber(300) + 300;
        int b = Greenfoot.getRandomNumber(200) + 100;
        addObject(semi, x, y);
        addObject(missle, a, b);
        addObject(tank, 0, 200);
        addObject(tanks, 0, 200);
    }
    public void increaseScore(){
        score += 100;
        scoreLabel.setValue(score);
    }
    public void increaseScore1(){
        score += 200;
        scoreLabel.setValue(score);
    }
    public void increaseScore2(){
        score += 250;
        scoreLabel.setValue(score);
    }
}
