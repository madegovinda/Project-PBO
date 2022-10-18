import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LASERENEMY here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LASERENEMY extends Actor
{
    /**
     * Act - do whatever the LASERENEMY wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 2;
    public void act()
    {
        // Add your action code here.
        move(speed);
        setRotation(180);
        laserCollision();
    }
    public void laserCollision()
    {
        if (isTouching(LASER.class))
        {
            getWorld().addObject(
            new BOOM(), getX(), getY());
            removeTouching(LASER.class);
            getWorld().removeObject(this);
        }
        else if (isAtEdge())
        getWorld().removeObject(this);
    }
}
