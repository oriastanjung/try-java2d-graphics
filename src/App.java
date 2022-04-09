import javax.swing.*;


public class App {
    public static void main(String[] args) {
        int width = 500;
        int height = 500;
        //canvas
        Canvas myCanvas = new Canvas(width, height);
        // frame
        JFrame myFrame = new JFrame();
        myFrame.setSize(width,height);
        myFrame.setTitle("learn 2D graph");
        myFrame.add(myCanvas);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);

    }
}
