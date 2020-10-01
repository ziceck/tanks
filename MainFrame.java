import javax.swing.JFrame;

import java.awt.Graphics;
import java.awt.Color;

/**
 * Write a description of class MainFrame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainFrame extends JFrame {
    
    public MainFrame() {
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(30, 30, 800, 800);
        this.setVisible(true);
        Tank tank = new Tank(Color.RED);
        this.getContentPane().add(tank);
        this.addKeyListener(new Key(tank));
    }
    
    @Override
    public void paint(Graphics graphics) {
    }
}
