import java.applet.Applet;
import java.awt.*;

public class DrawPoly extends Applet {
    public void paint(Graphics g) {

//Initializing FIRST polygon

        // Array with coordinates
        int firstPolyXPoints[] = {100, 50, 50, 150, 150};
        int firstPolyYPoints[] = {10, 60, 180, 180, 60};

        // Number of dots
        int firstPolyNPoints = 5;

        // Background color
        g.setColor(Color.black);
        g.fillRect(0,0,500,500);

        //Polygon color
        g.setColor(Color.green);

        // Drawing polygon
        g.drawPolygon(firstPolyXPoints, firstPolyYPoints, firstPolyNPoints);

        //Filling polygon
        g.fillPolygon(firstPolyXPoints, firstPolyYPoints, firstPolyNPoints);


//Initializing SECOND polygon

        // Array with coordinates
        int secondPolyXPoints[] = {50, 240, 290, 240, 50};
        int secondPloyYPoints[] = {180,180, 230, 280, 280};

        // Number of dots
        int secondPolyNPoints = 5;

        // Drawing polygon
        g.drawPolygon(secondPolyXPoints, secondPloyYPoints, secondPolyNPoints);

        // Filling polygon
        g.fillPolygon(secondPolyXPoints, secondPloyYPoints, secondPolyNPoints);

    }
}
