import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

/**
 * A building shape that can be positioned anywhere on the screen.
 * 
 * @author Michael Zhang
 * @version 11 October 2015
 */
public class Building
{
    /** specifies the x coordinate of the building. */
    int xLeft;
    
    /** specifies the y coordinate of the building. */
    int yPos;
    
    /** specifies the height of the building. */
    int buildingHeight;
    
    /** specifies the width of the building. */
    int buildingWidth;
    
    /**
     * Constructor for objects of class Building that specifies the position, width, and height of the building object.
     */
    public Building(int x, int height)
    {
        xLeft = x;
        buildingHeight = height;
        yPos = 750 - buildingHeight - 81;
        buildingWidth = (int) (buildingHeight * .4);
    }

    /**
     * Draws the components of the building object.
     *
     * @param    g2    the window in which the object will be drawn.
     */
    public void draw(Graphics2D g2)
    {
        Rectangle building = new Rectangle(xLeft, yPos, buildingWidth, buildingHeight);
        g2.setColor(Color.GRAY);
        g2.fill(building);
        g2.draw(building);
        g2.setColor(Color.WHITE);
        for (int yIncrement = 20; yIncrement < buildingHeight - 20; yIncrement += 40)
        {
            for (int xIncrement = 20; xIncrement < buildingWidth - 20; xIncrement += 40)
            {
                Rectangle window = new Rectangle(xLeft + xIncrement, yPos + yIncrement, 20, 20);
                g2.fill(window);
                g2.draw(window);
            }
        }
    }
}
