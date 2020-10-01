import java.awt.Graphics;
import java.awt.Color;

/**
 * Write a description of class HeadTank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HeadTank extends ItemJComponent {
    
    public HeadTank(Color color) {
        super(color);
    }
    
    @Override
    public void paint(int x, int y, Graphics graphics) {
         graphics.drawRect(x + 80, y - 50, 50, 50);
    }
}
