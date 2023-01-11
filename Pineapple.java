import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Pinapple class
 * 
 * @author Justin Wu
 * @version January 2023
 */
public class Pineapple extends Actor
{
    int speed = 1;
    /**
     * Act - do whatever the Pineapple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Pinapple falls from the sky
        setLocation(getX(), getY()+2);
        
        MyWorld w = (MyWorld) getWorld();
        if(isTouching(Human.class)){
            w.gameOver();
        }
        if(getY() >= w.getHeight()){
            w.create();
            w.removeObject(this);
        }
    }
    public void setSpeed(int spd){
        speed = spd;
    }
}
