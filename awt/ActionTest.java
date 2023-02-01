package awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ActionTest extends Frame implements ActionListener {
    Button b1,b2;
    Label la1;
    public  ActionTest(){


        setTitle("Awt Button Action Test");
        setSize(300,250);
        setLayout(new FlowLayout());
        setLocation(200,150);
        setVisible(true);
        b1=new Button("B1");
        add(b1);
        b1.addActionListener(this);

        b2=new Button("B2");
        add(b2);
        b2.addActionListener(this);


        la1=new Label("Hello Click me");

        add(la1);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
    public static void main(String[] args) {
        new ActionTest();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource().equals(b1)){
                la1.setText("Hello I am B1");
        }else {
                la1.setText("I am B2");
            }
    }
}
