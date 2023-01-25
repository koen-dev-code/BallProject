
import java.awt.*;
import javax.swing.*;
public class BallClass
{
    private int x,y,size,xSpeed, ySpeed;
    public BallClass(int x, int y,int size, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.size = size;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public BallClass()
    {
        x =(int)((Math.random()+1)*200)-size;
        y=(int)((Math.random()+1)*200)-size;
        size = (int)((Math.random()+1)*20);
        xSpeed=(int)((Math.random()+1)*5);
        ySpeed=(int)((Math.random()+1)*5);

    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public int getSize()
    {
        return size;
    }

    public void drawBall(Graphics cow)
    {
        cow.fillOval(x,y,size,size);
    }
    public void moveBall(int xSize, int ySize)
    {
        x=x+xSpeed;
        y=y+ySpeed;
        if(x >= xSize-size|| x<= 0)
        {
            xSpeed*=-1;
        }
        if(y>=ySize-size ||y <= 10)
        {
            ySpeed*=-1;
        }
    }
public void moveRight()
{
    x += xSpeed;
}



}
