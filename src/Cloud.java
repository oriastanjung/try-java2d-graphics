import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;


public class Cloud extends JComponent{
    private double x;
    private double y;
    private double size;
    private Color cloudColor;

    public Cloud(double x, double y, double size, Color cloudColor){
        this.x = x;
        this.y = y;
        this.size = size;
        this.cloudColor = cloudColor;
    }
    public void drawCloud(Graphics2D g2d){
        Ellipse2D elips1 = new Ellipse2D.Double(x,y,size,size); //200,75,100,100
        Ellipse2D elips2 = new Ellipse2D.Double(x+size*0.35 , y-size*0.2 , size*1.75 , size*1.4);
        Ellipse2D elips3 = new Ellipse2D.Double(x+size*1.5 , y+size*0.15 , size*0.9 , size*0.9 );
        Ellipse2D elips4 = new Ellipse2D.Double(x+size*1.8 , y+size*0.05 , size*0.3 , size*0.3);

        g2d.setColor(cloudColor);
        g2d.fill(elips1);
        g2d.fill(elips2);
        g2d.fill(elips3);
        g2d.fill(elips4);

    }
}
