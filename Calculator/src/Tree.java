import java.applet.Applet;
import java.awt.*;

public class Tree extends Applet {

    int h;

    public void init() {

        h = 50;

        setBackground(Color.BLACK);
        setSize(700,500);

    }

    public void paint(Graphics g) {

        drawTree(g, 350, 400, -90, 7);
        drawTree(g, 450, 400, -90, 5);

    }

    public void drawTree(Graphics gx, int x1, int y1, int alpha,int n) {

        if (n == 0) return;
        //int x2 = x1 + alpha;
        //int y2 = y1 - h;

        int x2 = x1 + (int)((n * 10) * (Math.cos(Math.toRadians(alpha))));
        int y2 = y1 + (int)((n * 10) * (Math.sin(Math.toRadians(alpha))));
        gx.setColor(new Color(0,n*30,0));
        gx.drawLine(x1,y1,x2,y2);
        gx.setColor(Color.YELLOW);
        gx.drawString("*",x1,y1);
        //gx.setColor(Color.GREEN);

        drawTree(gx, x2, y2, alpha - 30, n-1);
        drawTree(gx, x2, y2, alpha + 30, n-1);
        //drawTree(gx, x2, y2, alpha + 10, n-1);


    }



}
