import javax.swing.*;
import java.awt.*;
public class Main
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        BallPanel bPanel = new BallPanel();

        //frame.add(panel);

        frame.add(bPanel);

        frame.setVisible(true);
    }
}