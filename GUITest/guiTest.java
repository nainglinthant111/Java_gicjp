package GUITest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class guiTest extends JFrame implements ActionListener {
    public JButton b1,b2,b3,b4,b5,b6;
    public JPanel p1;

    public guiTest(){
        setTitle("GUI Button Test");
        setSize(500,500);
        setLocation(200,250);
        getContentPane().setLayout(new FlowLayout());


        b1=new JButton("BevelBolder");
        b2=new JButton("EmptyBorder");
        b3=new JButton("EtchedBorder");
        b4=new JButton("LineBorder");
        b5=new JButton("MatteBorder");
        b6=new JButton("TitleBorder");
        getContentPane().add(b1);
        getContentPane().add(b2);
        getContentPane().add(b3);
        getContentPane().add(b4);
        getContentPane().add(b5);
        getContentPane().add(b6);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        p1= new JPanel();
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        p1.add(b6);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    };
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==b1){
            p1.setBorder(BorderFactory.createBevelBorder(1));
        }else if(e.getSource()==b2){
            p1.setBorder(BorderFactory.createEmptyBorder());
        }else if(e.getSource()==b3){
            p1.setBorder(BorderFactory.createEtchedBorder());
        }else if(e.getSource()==b4){
            p1.setBorder(BorderFactory.createLineBorder(Color.blue,5));
        }else if(e.getSource()==b5){
            p1.setBorder(BorderFactory.createMatteBorder(7,5,3,10,Color.pink));
        }else{

                p1.setBorder(BorderFactory.createTitledBorder("Ordering System"));
            }
        }

    

    public static void main(String[] args) {
        new guiTest();
    }
}
