import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * A car shape that can be placed anywhere the screen.
 * 
 * @author Michael Zhang
 * @version 11 October 2015
 */
public class Car
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;
    
    /**
     * Default constructor for objects of class Building
     */
    public Car(int x, int y)
    {
        xLeft = x;
        yTop = y;
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
        Ellipse2D.Double backWheel = new Ellipse2D.Double(xLeft, yTop, 20, 20);
        Ellipse2D.Double frontWheel = new Ellipse2D.Double(xLeft + 40, yTop, 20, 20);
        Rectangle carBody = new Rectangle(xLeft, yTop - 20, 60, 20);
        g2.draw(backWheel);
        g2.draw(frontWheel);
        g2.draw(carBody);
    }
}
