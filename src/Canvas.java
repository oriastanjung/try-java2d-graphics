import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Canvas extends JComponent{
    private int width;
    private int height;
    private Cloud cloud1;
    private Cloud cloud2;
    private int cloudX;

    private Mountain mount1;

    public Canvas(int width, int height){
        this.width = width;
        this.height = height;
        cloud1 = new Cloud(cloudX,35,40,new Color(213, 238, 247));
        cloud2 = new Cloud(340,50,40,new Color(213, 238, 247));

        mount1 = new Mountain(0,0,100,180,100, Color.GREEN);
    }

    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        // ANTIALIASING
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);
        
        
        // langit
        Rectangle2D persegiPanjang = new Rectangle2D.Double(0,0,width,height);
        g2d.setColor(new Color(66, 206, 245));
        g2d.fill(persegiPanjang);

        // sun
        Ellipse2D lingkaran = new Ellipse2D.Double(200,50, 75, 75);
        g2d.setColor(new Color(245, 208, 24));
        g2d.fill(lingkaran);
        // // line
        // Line2D garis = new Line2D.Double(100,250,300,75);
        // g2d.setColor(Color.BLACK);
        // g2d.draw( garis);


        // making cloud
        for (int i = 0; i < 100; i++){
            cloudX += 10;
        }
        
        cloud1.drawCloud(g2d);
        cloud2.drawCloud(g2d);

        // mount1.drawMountain(g2d);

        //path
        Path2D line1 = new Path2D.Double();
        line1.moveTo(100, 300);
        line1.lineTo(150,200);
        g2d.setColor(Color.BLACK);
        g2d.draw(line1);

        // triangle
        Path2D line2 = new Path2D.Double();
        line2.moveTo(-10, 280);
        line2.lineTo(170, 150);
        line2.lineTo(300, 280);
        g2d.setColor(Color.GREEN);
        g2d.fill(line2);

        // triangle
        Path2D line3 = new Path2D.Double();
        line3.moveTo(250, 280);
        line3.lineTo(400, 150);
        line3.lineTo(500, 280);
        g2d.setColor(Color.GREEN);
        g2d.fill(line3);


        // curve
        Path2D curve = new Path2D.Double();
        curve.moveTo(250, 400);
        curve.curveTo(350, 300, 500, 300, 600, 400);
        g2d.draw(curve);
    }   

}
