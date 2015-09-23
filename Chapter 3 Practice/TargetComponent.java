import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * This component draws the target shape.
 * 
 * @author Michael Zhang
 * @version 23 September 2015
 */
public class TargetComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Target target = new Target(0,0);
        
        int x = getWidth();
        int y = getHeight();
        
        target.draw(g2);
    }
}
