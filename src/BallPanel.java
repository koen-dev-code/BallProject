import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;

public class BallPanel extends JPanel
{

    ArrayList<BallClass> balls = new ArrayList<BallClass>();

    public BallPanel()
    {
        setBackground(Color.red);
        setFocusable(true);
        addKeyListener(new KeyListener()
        {
            @Override
            public void keyTyped(KeyEvent e)
            {

            }

            @Override
            public void keyPressed(KeyEvent e)
            {
                System.out.println(e.getKeyCode());
            }

            @Override
            public void keyReleased(KeyEvent e)
            {

            }
        });
        for(int i = 0; i <=20 ; i++)
        {
            balls.add(new BallClass());
        }
    }



    @Override
    protected void paintComponent(Graphics g)
    {


        super.paintComponent(g);

        for(int i = 0; i < balls.size();i++)
        {
            balls.get(i).drawBall(g);
            balls.get(i).moveBall(getWidth(),getHeight());
        }
        try{
            Thread.sleep(10);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }


        repaint();
    }

}
