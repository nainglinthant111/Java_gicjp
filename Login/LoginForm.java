package Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame implements ActionListener {
    public JButton b1,b2;
    public JPanel p1,p2;
    public JLabel l1,l2;
    public JPasswordField pass;
    public JTextField t1;
    public LoginForm(){
        this.setTitle("Login Form");
        this.setSize(500,300);
        this.setLocation(500,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1=new JButton("OK");
        b2=new JButton("Cancel");
        b1.addActionListener(this);
        b2.addActionListener(this);

        l1=new JLabel("User Name");
        l2=new JLabel("Password");
        t1=new JTextField(15);
        pass=new JPasswordField(15);
        pass.setEchoChar('*');



        p1=new JPanel();
        p2=new JPanel();

        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(pass);
        p1.setBorder(BorderFactory.createEtchedBorder());
        p1.setLayout(new GridLayout(2, 2));

        p2.add(b1);
        p2.add(b2);
        p2.setBorder(BorderFactory.createEtchedBorder());



        this.setLayout(new BorderLayout());
        this.add(p1,BorderLayout.NORTH);
        this.add(p2, BorderLayout.CENTER);
        this.setVisible(true);


    }

    public static void main(String[] args) {
        new LoginForm();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
            char[] input=pass.getPassword();
            String user=t1.getText();
            String correctUser="Hla Hla";
            if(correctUser.equals(user) && ispPasswordCorrect(input)){
                JOptionPane.showMessageDialog(this,"Login Successful");
            }else{
                JOptionPane.showMessageDialog(this,"Invalid Login. Try Again!");
            }

        }
        else{
            t1.setText("");
            pass.setText("");
        }

    }
    private boolean ispPasswordCorrect(char[] input) {
        char[] correctPass = {'h', 'l', 'a', 'h', 'l', 'a'};
        if (input.length != input.length)
            return false;
         else {
            for (int i = 0; i < input.length; i++){
                if(input[i] !=correctPass[i])
                    return false;

            }
        }
         return true;
    }

}
