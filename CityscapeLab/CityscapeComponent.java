import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Random;
import java.util.Scanner;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author Michael Zhang
 * @version 2 October 2015
 */
public class CityscapeComponent extends JComponent
{
    Sun sun;
    Building building1;
    Building building2;
    Car car;
    
    public CityscapeComponent(int xValue,int yValue)
    {
        sun = new Sun(xValue,yValue);
        building1 = new Building(600, 500);
        building2 = new Building(200, 700);
        car = new Car(0, 800);
    }
    
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        car.draw(g2);
        building1.draw(g2);
        building2.draw(g2);
        sun.draw(g2);
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        
        
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}
