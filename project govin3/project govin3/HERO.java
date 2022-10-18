import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HERO here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HERO extends Actor
{
    /**
     * Act - do whatever the HERO wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        moveHero();
        shootLaser();
        getTouch();
    }
    public void moveHero()
    {
        if(Greenfoot.isKeyDown("W"))
        setLocation(getX(), getY()-3);
        if(Greenfoot.isKeyDown("S"))
        setLocation(getX(), getY()+3);
        if(Greenfoot.isKeyDown("A"))
        setLocation(getX()-3, getY());
        if(Greenfoot.isKeyDown("D"))
        setLocation(getX()+3, getY());
    }
    public void shootLaser()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            getWorld().addObject(new LASER(), getX()+50, getY());
        }
    }
    public void getTouch()
    {
        if(isTouching(ENEMY.class)||isTouching(LASERENEMY.class))
        {
            getWorld().addObject(new BOOM(),getX(), getY());
            setLocation(112,180);
        }
    }
}
