package StudentLogin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Success extends JFrame implements ActionListener {
    public int loginid;
    public JButton update;
    public Success(int id){
        loginid = id;
        this.setTitle("Login Success");
        this.setSize(200,250);
        this.setBounds(500,400,600,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel p=new JPanel();
        p.setLayout(new GridLayout(2,0));

        JLabel l=new JLabel("Welcome to our Home Page");
        p.add(l);

        update=new JButton("Update Profile");
        update.addActionListener(this);
        p.add(update);

        this.setLayout(new FlowLayout());
        this.add(p);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == update){
            UpdateProfile up=new UpdateProfile(loginid);
            dispose();


        }
    }
}
