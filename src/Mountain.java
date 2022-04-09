import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;


public class Mountain extends JComponent{
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double size;
    private Color color;

    public Mountain(double x1, double y1,double x2, double y2, double size, Color color){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.size = size;
        this.color = color;
    }
    public void drawMountain(Graphics2D g2d){
         // triangle
        double alas = x2-x1;
        double tinggi = size*2 / (x2-x1);

         //size 100;
         Path2D line2 = new Path2D.Double();
         // 0, 0
         line2.moveTo(x1, y1);
         line2.lineTo(alas, tinggi);
         line2.lineTo(x2, y2);
         g2d.setColor(color);
         g2d.fill(line2);
 
         // triangle
         Path2D line3 = new Path2D.Double();
         line3.moveTo(x2, y2);
         line3.lineTo(x2+alas, y1);
         line3.lineTo(x2+alas, y1);
         g2d.setColor(Color.GREEN);
         g2d.fill(line3);
 
 
    }
}
