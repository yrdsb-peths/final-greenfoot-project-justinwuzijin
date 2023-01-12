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
        Label label3 = new Label("Rules: Eat Pizza. Avoid Apples", 40);
        addObject(label3,268,228);

        label2.setLocation(313,239);
        label.setLocation(300,283);
        label2.setLocation(297,81);
        label2.setLocation(293,220);
        label2.setLocation(313,86);
        label2.setLocation(286,222);
        label2.setLocation(281,89);
        label2.setLocation(293,218);
        label2.setLocation(274,78);
        label2.setLocation(261,230);
        label2.setLocation(308,77);
        label2.setLocation(278,235);
        label2.setLocation(317,71);
        label2.setLocation(315,233);
        label2.setLocation(337,102);
        label3.setLocation(337,86);
        label3.setLocation(337,87);
        label2.setLocation(325,227);
        label2.setLocation(339,238);
        label2.setLocation(291,233);
    }
}
