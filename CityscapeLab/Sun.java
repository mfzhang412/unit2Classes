import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * A sun shape that can be drawn on the screen.
 * 
 * @author Michael Zhang
 * @version 11 October 2015
 */
public class Sun
{
    /**  specifies the x coordinate of the sun. */
    private int xLeft;
    
    /**  specifies the y coordinate of the sun. */
    private int yTop;

    /**
     * Constructor for objects of class Target that specifies the position of the sun object.
     */
    public Sun(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }

    /**
     * Draws the sun object and fills in the color.
     *
     * @param    g2    the window in which the object will be drawn.
     */
    public void draw(Graphics2D g2)
    {
        Rectangle sky = new Rectangle (0, 0, 1400, 350);
        if (xLeft >= 0)
        {
            g2.setColor(Color.PINK);
            g2.fill(sky);
        }
        
        if (xLeft >= 312)
        {
            g2.setColor(Color.CYAN);
            g2.fill(sky);
        }
        
        if (xLeft >= 938)
        {
            g2.setColor(Color.RED);
            g2.fill(sky);
        }
        
        g2.draw(sky);
        
        Ellipse2D.Double sun = new Ellipse2D.Double(xLeft, yTop, 100, 100);
        g2.setColor(Color.YELLOW);
        g2.fill(sun);
        g2.draw(sun);
    }

}
