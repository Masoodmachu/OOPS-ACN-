import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame {

    TextField t1, t2, t3;
    Label l1, l2, l3;
    Button b1, b2, b3, b4, b5, b6;

    Calculator() {
        setTitle("CALCULATOR");
        setLayout(null);


        l1 = new Label("Enter 1st No");
        l1.setBounds(100, 45, 145, 20);
        add(l1);

        t1 = new TextField();
        t1.setBounds(100, 75, 145, 20);
        add(t1);

        l2 = new Label("Enter 2nd No");
        l2.setBounds(100, 110, 145, 20);
        add(l2);

        t2 = new TextField();
        t2.setBounds(100, 145, 145, 20);
        add(t2);

        l3 = new Label("Result");
        l3.setBounds(100, 170, 145, 20);
        add(l3);

        t3 = new TextField();
        t3.setBounds(100, 195, 145, 20);
        add(t3);

       
        b1 = new Button("+");
        b1.setBounds(65, 230, 80, 40);
        add(b1);

        b2 = new Button("-");
        b2.setBounds(155, 230, 80, 40);
        add(b2);

        b3 = new Button("*");
        b3.setBounds(245, 230, 80, 40);
        add(b3);

        b4 = new Button("/");
        b4.setBounds(95, 280, 80, 40);
        add(b4);

        b5 = new Button("%");
        b5.setBounds(195, 280, 80, 40);
        add(b5);

        b6 = new Button("EXIT");
        b6.setBounds(140, 330, 80, 40);
        add(b6);

        
        b1.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = a + b;
            t3.setText(a + " + " + b + " = " + c);
        });

        b2.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = a - b;
            t3.setText(a + " - " + b + " = " + c);
        });

        b3.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = a * b;
            t3.setText(a + " * " + b + " = " + c);
        });

        b4.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            if (b != 0) {
                int c = a / b;
                t3.setText(a + " / " + b + " = " + c);
            } else {
                t3.setText("Division by zero error");
            }
        });

        b5.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = a % b;
            t3.setText(a + " % " + b + " = " + c);
        });

        b6.addActionListener(e -> System.exit(0));

        setSize(400, 420);
        setVisible(true);

  
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
