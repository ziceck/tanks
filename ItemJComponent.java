import java.awt.Graphics;
import java.awt.Color;

/**
 * Write a description of class ItemJComponent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class ItemJComponent {
    
    protected Color color;
    
    public ItemJComponent(Color color) {
        this.color = color;
    }
   
    public abstract void paint(int x, int y, Graphics graphics);
}
