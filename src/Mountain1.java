import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;


public class Mountain1 extends JComponent{
    public Mountain1(){

    }
    public void drawMountain1(Graphics2D g2d){
        Path2D mountain = new Path2D.Double();
        mountain.moveTo(0, 140);
        mountain.lineTo(70, 150);
        mountain.lineTo(120, 170);
        mountain.lineTo(150, 170);
        mountain.lineTo(210, 140);
        mountain.lineTo(240, 135);
        mountain.lineTo(270, 130);
        mountain.lineTo(280, 125);
        mountain.lineTo(290, 123);
        mountain.lineTo(320, 123);
        mountain.lineTo(360, 121);
        mountain.lineTo(370, 111);
        mountain.lineTo(390, 70);
        mountain.lineTo(400, 65);
        mountain.lineTo(410, 60);
        mountain.lineTo(420, 55);
        mountain.lineTo(430, 50);
        mountain.lineTo(450, 45);
        mountain.lineTo(470, 40);
        mountain.lineTo(480, 30);
        mountain.lineTo(490, 25);
        mountain.lineTo(495, 45);
        mountain.lineTo(500, 100);
        mountain.lineTo(500, 360);
        mountain.lineTo(0, 360);
        mountain.lineTo(0, 140);
        g2d.setColor(new Color(26,82,99));
        g2d.fill(mountain);
    }
}
