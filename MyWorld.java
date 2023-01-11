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
    GreenfootSound pizza = new GreenfootSound("[YT2mp3.info] - Pizza (320kbps).mp3");
    
    /**
     * Constructor for objects of class MyWorld.
     * .
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        //Creating human object
        Human h = new Human();
        addObject(h, 250, 350);
        
        //Creating a label
        score = new Label(0,100);
        addObject(score, 50,50);
        pizza.play();
        create();
        
    }
    public void create(){
        int x = Greenfoot.getRandomNumber(100);
        if(x%2 == 0){
            createPineapple();
        }
        else{
            createPizza();
        }
    }
    public void increase(){
        s++;
        score.setValue(s);
    
    }
    public void gameOver(){
        Label gameOverLabel = new Label("You Lose", 100);
        addObject(gameOverLabel, 300, 200);
    }
    public void createPizza(){
        Pizza p = new Pizza();
        int x = Greenfoot.getRandomNumber(600);
        int y= 0;
        addObject(p,x,y);
    }
    public void createPineapple(){
        Pineapple p = new Pineapple();
        int x = Greenfoot.getRandomNumber(600);
        int y= 0;
        addObject(p,x,y);
    }
    
}
