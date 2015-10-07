import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 * A building shape that can be positioned anywhere on the screen.
 * 
 * @author Michael Zhang
 * @version 2 October 2015
 */
public class Building
{
    /** description of instance variable x (add comment for each instance variable) */
    int xLeft;
    int yPos;
    int buildingHeight;
    int buildingWidth;
    
    /**
     * Default constructor for objects of class Building
     */
    public Building(int x, int height)
    {
        xLeft = x;
        buildingHeight = height;
        yPos = 900 - buildingHeight;
        buildingWidth = (int) (buildingHeight * .4);
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void draw(Graphics2D g2)
    {
        Rectangle building = new Rectangle(xLeft, yPos, buildingWidth, buildingHeight);
        
        g2.draw(building);
    }
}
