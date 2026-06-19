/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calmirea;

/**
 *
 * @author Sri Dayanti
 */
 import java.awt.Color;
import java.awt.LinearGradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import javax.swing.JPanel;

public class LatarGradasi extends JPanel{
    
   public LatarGradasi() {
        setOpaque(false); 
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0) {
            width = 100;
            height = 100;
        }

        Point2D start = new Point2D.Float(0, 0);
        Point2D end = new Point2D.Float(width, 0);

        float[] fractions = {0.0f, 0.2f, 0.4f, 0.6f, 0.8f, 1.0f};

        Color[] colors = {
            Color.decode("#C2C395"), 
            Color.decode("#D3D3AF"), 
            Color.decode("#E5DCC9"), 
            Color.decode("#ECDAC2"), 
            Color.decode("#EEDACF"), 
            Color.decode("#EFD7CF")  
        };

        LinearGradientPaint lgp = new LinearGradientPaint(start, end, fractions, colors);
        
        g2d.setPaint(lgp);
        g2d.fillRect(0, 0, width, height);
    }
}

