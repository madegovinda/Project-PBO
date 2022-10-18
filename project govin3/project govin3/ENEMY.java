import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ENEMY here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ENEMY extends Actor
{
    /**
     * Act - do whatever the ENEMY wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ENEMY()
    {
        setRotation(180);
    }
    public ENEMY(int speed)
    {
        setRotation(180);
        this.speed = speed;
    }
    public void removeEnemy()
    {
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }
    public int speed = 1;
    public void act()
    {
        // Add your action code here.
        move(speed);
        removeEnemy();
        shootLaser();
    }
    int laserTimer = 0;
    public void shootLaser()
    {
        if (laserTimer == 120)
        {
            getWorld().addObject(new LASERENEMY(), getX()-60, getY());
        }
        else
        {
            laserTimer++;
        }
    }
}
