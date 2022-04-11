import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;


public class Mountain2 extends JComponent{
    public Mountain2(){

    }
    public void drawMountain2(Graphics2D g2d){
        
        Path2D mountain = new Path2D.Double();
        mountain.moveTo(0, 240);
        mountain.lineTo(70, 220);
        mountain.lineTo(120, 190);
        mountain.lineTo(150, 185);
        mountain.lineTo(210, 200);
        mountain.lineTo(240, 215);
        mountain.lineTo(270, 190);
        mountain.lineTo(280, 175);
        mountain.lineTo(290, 173);
        mountain.lineTo(320, 173);
        mountain.lineTo(360, 171);
        mountain.lineTo(390, 160);
        mountain.lineTo(410, 150);
        mountain.lineTo(430, 140);
        mountain.lineTo(440, 130);
        mountain.lineTo(450, 120);
        mountain.lineTo(460, 130);
        mountain.lineTo(470, 140);
        mountain.lineTo(480, 135);
        mountain.lineTo(490, 145);
        mountain.lineTo(500, 150);
        mountain.lineTo(500, 390);
        mountain.lineTo(0, 410);
        mountain.lineTo(0, 190);
        g2d.setColor(new Color(25,67,81));
        g2d.fill(mountain);

    }
}
