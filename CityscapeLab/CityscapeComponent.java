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
    /** defines the sun object as an object in class Sky */
    Sky sun;
    
    /** defines the building1 object as an object in class Building */
    Building building1;
    
    /** defines the building2 object as an object in class Building */
    Building building2;
    
    /** defines the building3 object as an object in class Building */
    Building building3;
    
    /** defines the building4 object as an object in class Building */
    Building building4;
    
    /** defines the building5 object as an object in class Building */
    Building building5;
    
    /** defines the building6 object as an object in class Building */
    Building building6;
    
    /** defines the car1 object as an object in class Car */
    Car car1;
    
    /** defines the car2 object as an object in class Car */
    Car car2;
    
    /** defines the car3 object as an object in class Car */
    Car car3;
    
    /** defines the car4 object as an object in class Car */
    Car car4;
    
    /** defines the car5 object as an object in class Car */
    Car car5;
    
    /** defines the airplane1 object as an object in class Airplane */
    Airplane airplane1;
    
    /** defines the airplane2 object as an object in class Airplane */
    Airplane airplane2;
    
    /** defines the random object as an object in class Random */
    Random random;
    
    
   
    /** specifies the incrementation of the plane1 object's animation */
    int plane1Animation;
    
    /** specifies the incrementation of the plane2 object's animation */
    int plane2Animation;
    
    /** specifies the incrementation of the car1 object's animation */
    int car1Animation;
    
    /** specifies the incrementation of the car2 object's animation */
    int car2Animation;
    
    /** specifies the incrementation of the car3 object's animation */
    int car3Animation;
    
    /** specifies the incrementation of the car4 object's animation */
    int car4Animation;
    
    /** specifies the incrementation of the car5 object's animation */
    int car5Animation;
    
    /** specifies the incrementation of the sun object's animation */
    int sunAnimation;
    
    
    
    /** specifies the number of buildings generated */
    int randomBuildings;
    
    /** makes sure that the building objects don't change when a new frame is created */
    int counter;
    
    
    
    /** specifies starting x coordinate of the sun object */
    int xSun;
    
    /** specifies starting y coordinate of the sun object */
    int ySun;
    
    /** specifies the height of the building1 object */
    int randomHeight1;
    
    /** specifies the position of the building1 object */
    int randomPosition1;
    
    /** specifies the height of the building2 object */
    int randomHeight2;
    
    /** specifies the position of the building2 object */
    int randomPosition2;
    
    /** specifies the height of the building3 object */
    int randomHeight3;
    
    /** specifies the position of the building3 object */
    int randomPosition3;
    
    /** specifies the height of the building4 object */
    int randomHeight4;
    
    /** specifies the position of the building4 object */
    int randomPosition4;
    
    /** specifies the height of the building5 object */
    int randomHeight5;
    
    /** specifies the position of the building5 object */
    int randomPosition5;
    
    /** specifies the height of the building6 object */
    int randomHeight6;
    
    /** specifies the position of the building6 object */
    int randomPosition6;
    
    /**
     * Constructor for objects of CityscapeComponent that specifies the starting coordinates of the sun, and creates a random number of building objects with
     * random heights and widths.
     */
    public CityscapeComponent(int xValue,int yValue)
    {
        random = new Random();
        xSun = xValue;
        ySun = yValue;
        counter += 1;
        
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

        airplane1.draw(g2);
        airplane2.draw(g2);
        car1.draw(g2);
        car2.draw(g2);
        car3.draw(g2);
        car4.draw(g2);
        car5.draw(g2);
    }
    
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     */
    public void nextFrame()
    {
        sunAnimation += 8;
        sun = new Sky(xSun + sunAnimation,ySun);
        
        plane1Animation += 25;
        airplane1 = new Airplane(100 + plane1Animation, 100);
        
        plane2Animation += 25;
        airplane2 = new Airplane(-5000 + plane2Animation, 50);
        
        car1Animation += 10;
        car1 = new Car(1400 - car1Animation, 650);

        car2Animation += 13;
        car2 = new Car(0 + car2Animation, 650);
        
        car3Animation += 20;
        car3 = new Car(500 + car3Animation, 650);
        
        car4Animation += 2;
        car4 = new Car(800 - car4Animation, 650);
        
        car5Animation += 75;
        car5 = new Car(20000 - car5Animation, 650);
        
        repaint();
    }

}
