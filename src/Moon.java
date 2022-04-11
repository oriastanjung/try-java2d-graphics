import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Moon extends JComponent{
    public Moon(){

    }

    public void drawMoon(Graphics2D g2d){
        // moon glow effect
        Ellipse2D lingkaranGlow1 = new Ellipse2D.Double(85,45, 100, 100);
        float alpha = 0.15f;
        AlphaComposite alcom = AlphaComposite.getInstance(
        AlphaComposite.SRC_OVER, alpha);
        g2d.setComposite(alcom);
        g2d.setColor(new Color(226, 235, 238));
        g2d.fill(lingkaranGlow1);
        Ellipse2D lingkaranGlow2 = new Ellipse2D.Double(80,40, 110, 110);
        alpha = 0.07f;
        alcom = AlphaComposite.getInstance(
        AlphaComposite.SRC_OVER, alpha);
        g2d.setComposite(alcom);
        g2d.setColor(new Color(240, 248, 250));
        g2d.fill(lingkaranGlow2);

        // moon
        alpha = 1.0f;
        alcom = AlphaComposite.getInstance(
        AlphaComposite.SRC_OVER, alpha);
        g2d.setComposite(alcom);

        Ellipse2D lingkaran = new Ellipse2D.Double(90,50, 90, 90);
        g2d.setColor(new Color(144, 209, 227));
        g2d.fill(lingkaran);
    }
}
