import javax.swing.JFrame;

/**
 * Makes the target visible on the scrren
 * 
 * @author Michael Zhang
 * @version 23 September 2015
 */
public class TargetViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        
        frame.setSize(2500,2500);
        frame.setTitle("Target");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        TargetComponent component = new TargetComponent();
        frame.add(component);
        
        frame.setVisible(true);
    }
}
