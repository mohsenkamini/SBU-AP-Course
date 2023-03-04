import javax.swing.JFrame;

public class TestFrame {
    public static void main (String[] args) {
        JFrame frame1= new JFrame();
        frame1.setTitle("Window 1");
        frame1.setSize(200,150);
        frame1.setVisible(true);
        JFrame frame2= new JFrame();
        frame2.setTitle("Window 2");
        frame2.setSize(200,250);
        frame2.setVisible(true);
    }
}