import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * An airplane shape that can be animated.
 * 
 * @author Michael Zhang
 * @version 11 October 2015
 */
public class Airplane
{
    /** specifies the starting x coordinate of the airplane. */
    private int xLeft;
    
    /** specifies the starting y coordinate of the airplane. */
    private int yTop;
    
    /**
     * Constructor for objects of class Building that specifies the position of the airplane object.
     */
    public Airplane(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }

    /**
     * Draws the components of the airplane object and fills in the color of the components.
     *
     * @param    g2    the window in which the object will be drawn.
     */
    public void draw(Graphics2D g2)
    {
        Rectangle airplaneBody = new Rectangle(xLeft, yTop, 90, 35);
        g2.setColor(Color.lightGray);
        g2.fill(airplaneBody);
        g2.draw(airplaneBody);
        
        Rectangle topAirplaneWing = new Rectangle(xLeft + 35, yTop - 40, 20, 40);
        g2.fill(topAirplaneWing);
        g2.draw(topAirplaneWing);
        
        Rectangle bottomAirplaneWing = new Rectangle(xLeft + 35, yTop + 35, 20, 40);
        g2.fill(bottomAirplaneWing);
        g2.draw(bottomAirplaneWing);
        
        Rectangle window = new Rectangle(xLeft + 73, yTop + 5, 12, 12);
        g2.setColor(Color.WHITE);
        g2.fill(window);
        g2.draw(window);
    }
    
}
