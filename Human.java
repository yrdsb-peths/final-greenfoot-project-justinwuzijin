import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A human class for the Falling Pizza assignment
 * 
 * @author Justin Wu
 * @version January 2023
 */
public class Human extends Actor
{
    //Creating the sound a human makes when it eats, and also creating an array of all the sprites
    GreenfootSound humanSound = new GreenfootSound("[YT2mp3.info] - Yum - Sound Effect (320kbps).mp3");
    GreenfootImage [] idleRight = new GreenfootImage[8];
    GreenfootImage [] idleLeft = new GreenfootImage[8];
    
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    
    /**
     * Human Constructor
     */
    public Human(){
        for(int i = 1; i <= idleRight.length; i++){
            idleRight[i-1] = new GreenfootImage("images/png/Run " + "(" + i + ")" + ".png");
            idleRight[i-1].scale(100,100);    
        }
        for(int i = 1; i <= idleLeft.length; i++){
            idleLeft[i-1] = new GreenfootImage("images/png/Run " + "(" + i + ")" + ".png");
            idleLeft[i-1].mirrorHorizontally();
            idleLeft[i-1].scale(100,100);
        }
        animationTimer.mark();
        setImage(idleRight[0]);
        
    }
    /**
     * Animates the human movement
     */
    int index = 0;
    public void animateHuman(){
        if(animationTimer.millisElapsed() < 100){
            return;
        }
        animationTimer.mark();
        if(facing.equals("d")){
            setImage(idleRight[index]);
            index = (index +1) % idleRight.length;
        }
        else{
            setImage(idleLeft[index]);
            index = (index +1) % idleLeft.length;
        }
    }
    
    /**
     * Act - do whatever the Human wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("a")){
            move(-1);
            facing = "a";
        }
        else if(Greenfoot.isKeyDown("d")){
            move(1);
            facing = "d";
        }
        
        eat();
        animateHuman();
    }
    public void eat(){
        if(isTouching(Pizza.class)){
            removeTouching(Pizza.class);
            MyWorld w = (MyWorld) getWorld();
            w.createPizza();
            w.increase();
            humanSound.play();
        }
    }
}
