import java.awt.Graphics;
import java.awt.Color;


/**
 * 
 * @author (ziceck) 
 * @version (a version number or a date)
 */
public class BodyTank extends ItemJComponent {
    
    /**
     * Constructor for objects of class BodyTank
     */
    public BodyTank(Color color) {
        super(color);
    }
    
    @Override
    public void paint(int x, int y, Graphics graphics) {
        graphics.drawRect(x, y, 200, 200);
    }

}
