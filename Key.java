import java.awt.event.KeyAdapter;              
import java.awt.event.KeyEvent;

/**
 * Write a description of class Key here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Key extends KeyAdapter {
    
    private Movable movable;
    
    public Key(Movable movable) {
        this.movable = movable;
    }
    
    public void keyPressed(KeyEvent e){  
        int key = e.getKeyCode();                                                
        if (key == KeyEvent.VK_RIGHT) { 
            this.movable.rigth(5);
        } else if (key == KeyEvent.VK_LEFT) {                    
            this.movable.left(5);
        } else if (key == KeyEvent.VK_UP) {
            this.movable.up(5);
        } else if (key == KeyEvent.VK_DOWN) {
            this.movable.down(5);
        }
    }

    public void keyReleased(KeyEvent e){       
                          
    }
       
    public void keyTyped(KeyEvent e) {
    }
}
