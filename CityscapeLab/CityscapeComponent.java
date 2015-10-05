import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Random;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author Michael Zhang
 * @version 2 October 2015
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // ...
    
    
    
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    
    
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Random randomPlacement = new Random();
        int buildingPlacement;
        Random randomNumber = new Random();
        int buildingNumber = randomNumber.nextInt(10) + 5;
        for (int i = 0; i < buildingNumber; i += 1)
        {
            buildingPlacement = randomPlacement.nextInt(750) + 25;
            Building building = new Building(buildingPlacement, 600);
            
            int x = getWidth();
            int y = getHeight();
            
            building.draw(g2);
        }
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
