import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Random;
import java.util.Scanner;
import java.util.Random;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author Michael Zhang
 * @version 11 October 2015
 */
public class CityscapeComponent extends JComponent
{
    Sun sun;
    Building building1;
    Building building2;
    Building building3;
    Building building4;
    Building building5;
    Building building6;
    Car car;
    Airplane airplane;
    Random random;
    
    int planeAnimation;
    int carAnimation;
    int randomBuildings;
    int sunAnimation;
    int counter;
    int xSun;
    int ySun;
    
    int randomHeight1;
    int randomPosition1;
    int randomHeight2;
    int randomPosition2;
    int randomHeight3;
    int randomPosition3;
    int randomHeight4;
    int randomPosition4;
    int randomHeight5;
    int randomPosition5;
    int randomHeight6;
    int randomPosition6;
    
    public CityscapeComponent(int xValue,int yValue)
    {
        xSun = xValue;
        ySun = yValue;
        counter += 1;
        random = new Random();
        
        if (counter == 1)
        {
            randomBuildings = random.nextInt(3) + 3;
        }
        
        if (counter == 1)
        {
            if (randomBuildings >= 3)
            {
                randomHeight1 = random.nextInt(350) + 200;
                randomPosition1 = random.nextInt(1080);
                building1 = new Building(randomPosition1, randomHeight1);
                
                randomHeight2 = random.nextInt(350) + 200;
                randomPosition2 = random.nextInt(1080);
                building2 = new Building(randomPosition2, randomHeight2);
                
                randomHeight3 = random.nextInt(350) + 200;
                randomPosition3 = random.nextInt(1080);
                building3 = new Building(randomPosition3, randomHeight3);
            }
            
            if (randomBuildings >= 4)
            {
                randomHeight4 = random.nextInt(350) + 200;
                randomPosition4= random.nextInt(1080);
                building4 = new Building(randomPosition4, randomHeight4);
            }
            
            if (randomBuildings >= 5)
            {
                randomHeight5 = random.nextInt(350) + 200;
                randomPosition5 = random.nextInt(1080);
                building5 = new Building(randomPosition5, randomHeight5);
            }
            
            if (randomBuildings == 6)
            {
                randomHeight6 = random.nextInt(350) + 200;
                randomPosition6 = random.nextInt(1080);
                building6 = new Building(randomPosition6, randomHeight6);
            }
        }
        
        
    }
    
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        sun.draw(g2);
        if (randomBuildings >= 3)
        {
            building1.draw(g2);
            building2.draw(g2);
            building3.draw(g2);
        }
        
        if (randomBuildings >= 4)
        {
            building4.draw(g2);
        }
        
        if (randomBuildings >= 5)
        {
            building5.draw(g2);
        }
        
        if (randomBuildings == 6)
        {
            building6.draw(g2);
        }
        
        airplane.draw(g2);
        car.draw(g2);
    }
    
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        sunAnimation += 8;
        sun = new Sun(xSun + sunAnimation,ySun);
        
        planeAnimation += 20;
        airplane = new Airplane(100 + planeAnimation, 100);
        
        carAnimation += 13;
        car = new Car(1400 - carAnimation, 650);
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}
