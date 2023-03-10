import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Pinapple that humans are not supposed to eat
 * 
 * @author Justin Wu
 * @version January 2023
 */
public class Apple extends Actor
{
    int speed = 2;
    /**
     * Act - do whatever the apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Pinapple falls from the sky
        setLocation(getX(), getY()+speed);
        
        MyWorld w = (MyWorld) getWorld();
        if(isTouching(Human.class)){
            w.gameOver();
            w.over = true;
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
