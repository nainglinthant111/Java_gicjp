package SwingTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingTest1 extends JFrame implements ActionListener {
    public JButton b1;
    public JLabel l1;

    public SwingTest1(){
        setTitle("Swing Test1");
        setSize(300,250);
        setLocation(300,250);
        getContentPane().setLayout(new FlowLayout());


        b1 =new JButton("Ok");
        getContentPane().add(b1);
        l1 = new JLabel("Before Clicking");
        getContentPane().add(l1);

        b1.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new SwingTest1();
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        l1.setText("After Clicking");
    }
}
