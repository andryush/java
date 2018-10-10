import java.applet.Applet;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class Calculator extends Applet implements TextListener, FocusListener {

    Dimension appletSize;

    TextField input1;
    TextField input2;
    TextField sign;
    TextField output;

    Label input1Label;
    Label input2Label;
    Label outputLabel;
    Label signLabel;

    public void init() {
        setBackground(Color.DARK_GRAY);
        setForeground(Color.WHITE);
        appletSize = new Dimension(800, 500);
        setSize(appletSize);

        input1 = new TextField(5);
        input2 = new TextField(5);
        sign = new TextField(5);
        output = new TextField(5);

        input1Label = new Label("First number");
        input2Label = new Label("Second number");
        outputLabel = new Label("Result");
        signLabel = new Label("Sign");

        input1.setBackground(Color.WHITE);
        input1.setForeground(Color.BLACK);

        sign.setBackground(Color.WHITE);
        sign.setForeground(Color.BLACK);

        input2.setBackground(Color.WHITE);
        input2.setForeground(Color.BLACK);

        output.setBackground(Color.WHITE);
        output.setForeground(Color.BLACK);

        input1.addTextListener(this);
        input2.addTextListener(this);
        sign.addTextListener(this);

        input1.addFocusListener(this);
        input2.addFocusListener(this);
        sign.addFocusListener(this);

        add(input1Label);
        add(input1);

        add(signLabel);
        add(sign);

        add(input2Label);
        add(input2);

        add(outputLabel);
        add(output);




    }


    public void paint(Graphics g) {

        g.setColor(Color.gray);
        g.drawRect(10,10,appletSize.width - 20, appletSize.height - 20);

    }

    public void textValueChanged(TextEvent e) {

        int a, b, c;
        a = b = c = 0;

        String aText = input1.getText();
        if (!aText.equals("")) {
            a = Integer.parseInt(aText);
        }

        String bText = input2.getText();
        //System.out.println("BBBBB" + bText);
        if (!bText.equals("")) {
            b = Integer.parseInt(bText);
        }


        String signText = sign.getText();

        if (signText.equals("+")) {
            c = a + b;
        }
        else if (signText.equals("-")) {
            c = a - b;
        }

        String cText = String.valueOf(c);
        output.setText(cText);


        System.out.println(e.getID() + " " + e.getSource());
    }
    public void focusLost(FocusEvent e) {

        System.out.println(e.getSource() + " " + e.getID());

    }

    public void focusGained(FocusEvent e) {

    }




}
