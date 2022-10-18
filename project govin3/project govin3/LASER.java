import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LASER here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LASER extends Actor
{
    /**
     * Act - do whatever the LASER wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(8);
        laserCollision();
    }
    public void laserCollision()
    {
        if(isTouching(ENEMY.class))
        {
            getWorld().addObject(new BOOM(), getX(), getY());
            removeTouching(ENEMY.class);
            getWorld().removeObject(this);
        }
        else if
            (isAtEdge())
            getWorld().removeObject(this);
    }
}
