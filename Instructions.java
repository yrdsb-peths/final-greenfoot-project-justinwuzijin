import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Provides the instructions of the Falling Pizza game
 * 
 * @author Justin Wu
 * @version January 2023
 */
public class Instructions extends World
{
    Label titleLabel = new Label("Instructions", 70);
    /**
     * Constructor for objects of class Instructions.
     * 
     */
    public Instructions()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(titleLabel, 300, 100);
        prepare();
    }
    public void act(){
        //goes back to the titlescreen
        if(Greenfoot.isKeyDown("b")){
            TitleScreen t = new TitleScreen();
            Greenfoot.setWorld(t);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("Press <b> to go back", 25);
        addObject(label, 268,228);
        Label label2 = new Label("Use \u2190 and \u2192 to Move", 40);
        addObject(label2,268,228);
        Label label3 = new Label("Eat Pizza. Avoid Apples.", 40);
        addObject(label3,268,228);

        Human human = new Human();
        addObject(human,308,222);
        label.setLocation(290,58);
        human.setLocation(290,235);
        label2.setLocation(299,316);
        label3.setLocation(300,158);
    }
    
}
