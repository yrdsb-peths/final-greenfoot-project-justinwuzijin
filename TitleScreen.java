import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen for Falling Pizza game
 * 
 * @author Justin Wu 
 * @version January 2023
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Falling Pizza", 70);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(titleLabel, 250, 100);
        titleLabel.setLocation(300,150);

        prepare();
    }

    public void act(){
        if(Greenfoot.isKeyDown("space")){
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("Press <space> to Start", 40);
        addObject(label, 262,220);
        Label label2 = new Label("Use \u2190 and \u2192 to Move", 40);
        addObject(label2,268,228);
        label2.setLocation(179,234);

        label2.setLocation(313,239);
        label.setLocation(300,283);
    }
}
