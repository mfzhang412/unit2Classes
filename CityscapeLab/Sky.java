import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * A clas that simulates daytime and nighttime with the color of the sky, sun shape, and moon shape.
 * 
 * @author Michael Zhang
 * @version 11 October 2015
 */
public class Sky
{
    /**  specifies the x coordinate of the sun. */
    private int xLeft;
    
    /**  specifies the y coordinate of the sun. */
    private int yTop;

    /**
     * Constructor for objects of class Target that specifies the position of the sun object.
     */
    public Sky(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }

    /**
     * Draws the sun, moon, and sky objects and fills in their respective colors.
     *
     * @param    g2    the window in which the object will be drawn.
     */
    public void draw(Graphics2D g2)
    {
        Rectangle sky = new Rectangle (0, 0, 1400, 500);
        
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
        
        
        if (xLeft > 1400)
        {
            g2.setColor(Color.BLACK);
            g2.fill(sky);
            
            Ellipse2D.Double moon = new Ellipse2D.Double(xLeft - 1400, yTop, 100, 100);
            g2.setColor(Color.WHITE);
            g2.fill(moon);
            g2.draw(moon);
            
            Ellipse2D.Double crescent = new Ellipse2D.Double(xLeft - 1360, yTop, 100, 100);
            g2.setColor(Color.BLACK);
            g2.fill(crescent);
            g2.draw(crescent);
            
        }
        
        g2.draw(sky);
        
        Ellipse2D.Double sun = new Ellipse2D.Double(xLeft, yTop, 100, 100);
        g2.setColor(Color.YELLOW);
        g2.fill(sun);
        g2.draw(sun);
    }

}
