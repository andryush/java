import java.applet.Applet;
import java.awt.*;

public class Drawing extends Applet {
    public void paint(Graphics g)
    {
//        Color myBlue = new Color(0x3d3191);
//        g.setColor(myBlue);
//        //g.drawLine(0, 0, 200, 200);
//
////        g.setColor(Color.green);
////        g.drawRect(0,0, 200, 200);
////        g.setColor(Color.red);
////        g.fillRect(10,10,180,180);
//
//        //g.setColor(new Color(0x3d3191));
//        for (int i = 0; i <= 300; i++)
//        {
//            g.setColor(new Color((2*i) % 256,0,255,i % 256));
//            //g.fillOval(2 * i,i,10 + 2*i,10 + i);
//            g.drawLine(0,i,200,i);
//        }
//        //HOME
//        //DRAW STRING, DRAW PLOIGON, DRAW POLILINE
//        //DRAW OVAL -  COLOR i, RANDOM X,Y,
//        Color mySecondBlue = new Color(0x3d3191);
        int xPoints[] = {50, 240, 290, 240, 50};
        int yPoints[] = {180,180, 230, 280, 280};
        int nPoints = 5;
        g.drawPolyline(xPoints, yPoints, nPoints);

    }
}
