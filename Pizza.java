import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Pizza for a hungry human
 * 
 * @author Justin Wu 
 * @version January 2023
 */
public class Pizza extends Actor
{
    int speed = 2;
    /**
     * Act - do whatever the Pizza wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Pizza falls from the sky
        setLocation(getX(), getY()+2);
        
        MyWorld w = (MyWorld) getWorld();
        if(getY() >= w.getHeight()){
            w.gameOver();
            w.removeObject(this);
        }
    }
    public void setSpeed(int spd){
        speed = spd;
    }
}
