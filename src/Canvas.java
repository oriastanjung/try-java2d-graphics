import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Canvas extends JComponent{
    private int width;
    private int height;
    private Cloud cloud1;
    private Cloud cloud6;
    private Cloud cloud2;
    private Cloud cloud3;
    private Cloud cloud4;
    private Cloud cloud5;
    private Moon moon;
    private Mountain1 mountain1;
    private Mountain2 mountain2;
    private Mountain3 mountain3;

    public Canvas(int width, int height){
        this.width = width;
        this.height = height;
        cloud1 = new Cloud(10,35,20,new Color(169, 214, 227));
        cloud6 = new Cloud(50,80,40,new Color(169, 214, 227));
        cloud2 = new Cloud(230,90,30,new Color(169, 214, 227));
        cloud3 = new Cloud(160,60,15,new Color(169, 214, 227));
        cloud4 = new Cloud(340,20,35,new Color(169, 214, 227));
        cloud5 = new Cloud(270,50,65,new Color(169, 214, 227));
        moon = new Moon();
        mountain1 = new Mountain1();
        mountain2 = new Mountain2();
        mountain3 = new Mountain3();

    }

    @Override
    protected void paintComponent(Graphics g){
        // inspirasi gambar ==> https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZm6EEdFZY9BrP4xBAGNKxUeiliD9zT9FVWw&usqp=CAU

        Graphics2D g2d = (Graphics2D)g;

        
        // ANTIALIASING
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);
        
        
        // langit
        Rectangle2D persegiPanjang = new Rectangle2D.Double(0,0,width,height);
        g2d.setColor(new Color(53, 134, 162));
        g2d.fill(persegiPanjang);

        //bulan
        moon.drawMoon(g2d);

        //awan
        cloud1.drawCloud(g2d);
        cloud2.drawCloud(g2d);
        cloud3.drawCloud(g2d);
        cloud4.drawCloud(g2d);
        cloud5.drawCloud(g2d);
        cloud6.drawCloud(g2d);

        //mountain 1

        mountain1.drawMountain1(g2d);
        
        
        // mountain 2
        mountain2.drawMountain2(g2d);
        
        // mountain 3
        mountain3.drawMountain3(g2d);
        
       
    }   

}
