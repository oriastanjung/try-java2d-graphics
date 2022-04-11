import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;


public class Mountain3 extends JComponent{
    public Mountain3(){

    }
    public void drawMountain3(Graphics2D g2d){
        
        
        Path2D mountain = new Path2D.Double();
        mountain.moveTo(0, 350);
        mountain.lineTo(50, 320);
        mountain.lineTo(70, 300);
        mountain.lineTo(100, 270);
        mountain.lineTo(120, 250);
        mountain.lineTo(130, 245);
        mountain.lineTo(140, 260);
        mountain.lineTo(160, 270);
        mountain.lineTo(170, 275);
        mountain.lineTo(190, 285);
        mountain.lineTo(230, 300);
        mountain.lineTo(250, 310);
        mountain.lineTo(260, 320);
        mountain.lineTo(270, 310);
        mountain.lineTo(280, 300);
        mountain.lineTo(300, 260);
        mountain.lineTo(330, 270);
        mountain.lineTo(360, 240);
        mountain.lineTo(370, 210);
        mountain.lineTo(420, 180);
        mountain.lineTo(440, 190);
        mountain.lineTo(460, 200);
        mountain.lineTo(470, 210);
        mountain.lineTo(480, 215);
        mountain.lineTo(490, 220);
        mountain.lineTo(500, 225);
        mountain.lineTo(500, 480);
        mountain.lineTo(0, 480);
        mountain.lineTo(0, 350);
       
        g2d.setColor(new Color(19,49,59));
        g2d.fill(mountain);

    }
}
