import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * In this world, the human eats pizza slices
 * 
 * @author Justin Wu
 * @version January 2023
 */
public class MyWorld extends World
{
    public static int s;
    Label score;
    int level = 1;
    /**
     * Constructor for objects of class MyWorld.
     * .
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        Human h = new Human();
        addObject(score, 50, 50);
        
    }
    public void increase(){
        s++;
        score.setValue(s);
        level++;
    
    }
    public void gameOver(){
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    public void createPizza(){
        Pizza p = new Pizza();
        p.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y= 0;
        addObject(p,x,y);
    }
}
