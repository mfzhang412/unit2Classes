import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * A car shape that can be animated.
 * 
 * @author Michael Zhang
 * @version 11 October 2015
 */
public class Car
{
    /** specifies the starting x coordinate of the airplane */
    private int xLeft;
    
    /** specifies the starting y coordinate of the airplane */
    private int yTop;
    
    /**
     * Constructor for objects of class Building that specifies the position of the car object.
     */
    public Car(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }

    /**
     * Draws the component of the car object and fills in the color of the components.
     *
     * @param    g2    the window in which the object will be drawn.
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double backWheel = new Ellipse2D.Double(xLeft, yTop, 20, 20);
        Ellipse2D.Double frontWheel = new Ellipse2D.Double(xLeft + 40, yTop, 20, 20);
        Rectangle carBody = new Rectangle(xLeft, yTop - 20, 60, 20);
        Rectangle road = new Rectangle(0, yTop + 20, 1400, 50);
        
        g2.setColor(Color.GREEN);
        g2.fill(backWheel);
        g2.draw(backWheel);
        g2.fill(frontWheel);
        g2.draw(frontWheel);
        g2.fill(carBody);
        g2.draw(carBody);
        g2.setColor(Color.BLACK);
        g2.fill(road);
        g2.draw(road);
    }
}
