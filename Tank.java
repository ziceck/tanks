import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.KeyAdapter;              
import java.awt.event.KeyEvent;

import javax.swing.JComponent;
import javax.swing.JFrame;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Write a description of class Tank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tank extends JComponent implements Movable {
    
    private BodyTank bodyTank;
    private HeadTank headTank;
    private Color color;
    private List<ItemJComponent> parts;
    private int x;
    private int y;
        
    public Tank(Color color) {
        this.x = 100;
        this.y = 100;
        this.color = color;
        this.parts = new ArrayList();
        this.initParts();
    }
  
    
    private void initParts() {
       this.bodyTank = new BodyTank(this.color);
       this.headTank = new HeadTank(this.color);
       this.parts.add(bodyTank);
       this.parts.add(headTank);
    }
    
    @Override
    public void paint(Graphics graphics) {
        for (ItemJComponent item: parts) {
            System.out.println("on paint parts");
           item.paint(this.x, this.y, graphics);
        }
    }
    
    
    @Override
    public void up(int offset) {
        this.y = this.y - offset;
        this.repaint();
    }
    
    @Override
    public void down(int offset) {
        this.y = this.y + offset;
        this.repaint();
    }
   
    
    @Override
    public void left(int offset) {
        this.x = this.x - offset;
         this.repaint();
    }
    
    @Override
    public void rigth(int offset) {
        this.x = this.x + offset;
         this.repaint();
    }
    
}
