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
        //starts the game
        if(Greenfoot.isKeyDown("space")){
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
        //goes to the instructions page
        if(Greenfoot.isKeyDown("i")){
            Instructions instructions = new Instructions();
            Greenfoot.setWorld(instructions);
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
        Label label2 = new Label("Press <i> to view Instructions", 25);
        addObject(label2,268,228);

        label.setLocation(304,244);
        label2.setLocation(301,298);
    }
}
