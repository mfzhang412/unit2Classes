import javax.swing.JFrame;
import java.util.Scanner;

/**
 * Class that contains the main method for the program and creates the frame containing the component.
 * 
 * @author Michael Zhang
 * @version 11 October 2015
 */
public class CityscapeViewer
{
    /** animates the frame*/
    static final int ANIMATION_TIME_IN_SECONDS = 550;
   
    /**
     * main method for the program which creates and configures the frame for the program
     */
    public static void main(String[] args) throws InterruptedException
    {
        JFrame frame = new JFrame();
        
        frame.setSize(1400, 750);
        frame.setTitle("Cityscape");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter in a horizontal position for the sun (x value; 0 to 1250): ");
        int xValue = scanner.nextInt();
        System.out.print("Enter in a vertical position for the sun (y value; 0 to 100): ");
        int yValue = scanner.nextInt();
        
        
        CityscapeComponent component = new CityscapeComponent(xValue, yValue);
        frame.add(component);
        
        frame.setVisible(true);

        for( int seconds = 0; seconds < ANIMATION_TIME_IN_SECONDS; seconds++ )
        {
            component.nextFrame();
            Thread.sleep( 100 );
        }
        
    }

}
