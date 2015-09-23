import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * A target shape that can be positioned anywhere on the screen.
 * 
 * @author Michael Zhang
 * @version 23 September 2015
 */
public class Target
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;

    /**
     * Default constructor for objects of class Target
     */
    public Target(int x, int y)
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
        Ellipse2D.Double ring1 = new Ellipse2D.Double(xLeft + 100, yTop + 100, 400, 400);
        Ellipse2D.Double ring2 = new Ellipse2D.Double(xLeft + 150, yTop + 150, 300, 300);
        Ellipse2D.Double ring3 = new Ellipse2D.Double(xLeft + 200, yTop + 200, 200, 200);
        Ellipse2D.Double ring4 = new Ellipse2D.Double(xLeft + 250, yTop + 250, 100, 100);
        
        g2.draw(ring1);
        g2.draw(ring2);
        g2.draw(ring3);
        g2.draw(ring4);
        g2.fill(ring4);
        g2.fill(ring2);
    }

}
