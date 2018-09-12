import java.applet.Applet;
import java.awt.*;

public class DrawString extends Applet{
            public void paint(Graphics g) {

                g.setColor(Color.black);
                g.fillRect(0,0,500,500);

                g.setColor(Color.green);
                g.drawString("Hello world",150,150);

            }
        }