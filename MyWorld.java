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
    int level = 2;
    Label score;
    public static SimpleTimer myTimer = new SimpleTimer();
    public static Counter myTimeCount = new Counter();
    
    
    /**
     * Constructor for objects of class MyWorld.
     * .
     */
    public MyWorld()
    {    
        //Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        //Creating human object
        Human h = new Human();
        addObject(h, 250, 350);
        myTimer.mark();
        
        //Creating a score label
        score = new Label(0,100);
    
        //Creating timer counter
        addObject(myTimeCount, 200, 50);
        myTimer.mark();
        
        addObject(score, 50,50);
        create();
        
    }
    
    boolean over = false;
    //Start timer starting from 60 seconds
    public void act(){
        if(!over){
            myTimeCount.setValue(60 - (myTimer.millisElapsed() / 1000));
        }
        if(myTimeCount.getValue() == 0){
            gameOver();
            over = true;
        }
    }
    
    public void create(){
        int x = Greenfoot.getRandomNumber(100);
        if(x%2 == 0){
            createApple();
        }
        else{
            createPizza();
        }
    }
    public void increase(){
        s++;
        score.setValue(s);
        if(s % 5 == 0){
            level++;
        }
    
    }
    public void gameOver(){
        myTimeCount.setValue(0);
        Label gameOverLabel = new Label("Game Over", 100);
        Label gameOverLabel2;
        //changes sentence structure of sentence depending on # of pizza
        if(s != 1){
            gameOverLabel2 = new Label("You ate " + s + " pizzas!", 50);
        }
        else{
            gameOverLabel2 = new Label("You ate " + s + " pizza!", 50);
        }
        addObject(gameOverLabel, 300, 150);
        addObject(gameOverLabel2, 300, 250);
    }
    public void createPizza(){
        Pizza p = new Pizza();
        p.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y= 0;
        addObject(p,x,y);
    }
    public void createApple(){
        Apple a = new Apple();
        a.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y= 0;
        addObject(a,x,y);
    }
    
}
