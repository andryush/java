import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseListnerTest extends Applet implements MouseMotionListener, MouseListener {

    int x, x1, y, y1;
    String str;
    boolean releaseOn;

    public void init(){
        x = 0;
        y = 0;
        str = "Hello world";
        //releaseOn = false;
        System.out.println("init");
        addMouseMotionListener(this);
        addMouseListener(this);
    }

    public void start(){
        System.out.println("start");
    }



    public void paint(Graphics g) {
        g.drawString(str, x, y);
        System.out.println("paint");
        if(releaseOn) {
            g.drawLine(x, y, x1, y1);
       }

    }

    public void stop(){
        System.out.println("stop");
    }

    public void destroy(){
        System.out.println("destroy");
    }

    public void mouseDragged(MouseEvent e){

           /* x = e.getX();
            y = e.getY();
            System.out.println("x = " + x + " " + y);
            repaint();*/
        }

    public void mouseMoved(MouseEvent e) {

//        x = e.getX();
//        y = e.getY();
        //System.out.println(x + " " + y);
        //repaint();
    }
        public void mouseClicked(MouseEvent e){



        }

        public void mousePressed(MouseEvent e){

            x = e.getX();
            y = e.getY();
            System.out.println("x = " + x + " " + y);

        }


        public void mouseReleased(MouseEvent e){

            x1 = e.getX();
            y1 = e.getY();
            releaseOn = true;
            System.out.println("x1 = " + x1 + " " + y1);
            repaint();



        }


        public void mouseEntered(MouseEvent e){

        }

        public void mouseExited(MouseEvent e){

        }



}//class
