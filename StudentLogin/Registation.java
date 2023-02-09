package StudentLogin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Registation extends JFrame implements ActionListener {
    //declare for UI
    public JLabel l1,l2,l3,l4,l5,l6;
    public JPasswordField t2;
    public JTextField t1,t3,t5;
    public JTextArea t4;
    public JButton save,cancel;
    public JRadioButton male,female;
    public ButtonGroup group;
    public JPanel rp,mp;

    //declare for database
    public Connection connection;
    public String db="jdbc:mysql://localhost/login";
    public String username="root";
    public String password="Naing111";
    public Statement smt;
    public String sql;
    public ResultSet rs;


    public Registation(){
        //for Registration frame
        this.setTitle("Student Registration");
        this.setSize(350, 300);
        this.setLocation(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1=new JLabel("Name");
        l2=new JLabel("Password");
        l3=new JLabel("Gender");
        l4=new JLabel("Email");
        l5=new JLabel("Address");
        l6=new JLabel("PhoneNo");

        t1=new JTextField(15);
        t2=new JPasswordField(15);
        t2.setEchoChar('*');
        t3=new JTextField(15);
        t4=new JTextArea();
        t5=new JTextField(15);

        male=new JRadioButton("Male");
        female=new JRadioButton("Female");
        group=new ButtonGroup();
        group.add(male);
        group.add(female);

        rp=new JPanel();
        rp.add(male);
        rp.add(female);

        save=new JButton("Save");
        save.addActionListener(this);
        cancel=new JButton("Cancel");
        cancel.addActionListener(this);

        mp=new JPanel();
        mp.setLayout(new GridLayout(7,2));
        mp.setBorder(BorderFactory.createEtchedBorder());
        mp.add(l1);
        mp.add(t1);
        mp.add(l2);
        mp.add(t2);
        mp.add(l3);
        mp.add(rp);
        mp.add(l4);
        mp.add(t3);
        mp.add(l5);
        mp.add(t4);
        mp.add(l6);
        mp.add(t5);
        mp.add(save);
        mp.add(cancel);

        this.setLayout(new FlowLayout());
        this.add(mp);
        this.setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == save) {
            String name=t1.getText();
            String pass=t2.getText();
            String gender=male.isSelected() ? "Male" : "Female";
            String address=t4.getText();
            String email=t3.getText();
            String phno=t5.getText();
            String msg=""+name;
            if (name.equals("")||pass.equals("")||gender.equals("")||address.equals("")||email.equals("")||phno.equals(""))
            {
                JOptionPane.showMessageDialog(save,"Please fill require information");

            }else {

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    connection = DriverManager.getConnection(db, username, password);
                    PreparedStatement smt=connection.prepareStatement("insert into student values (null,?,?,?,?,?,?)");


                    smt.setString(1,name);
                    smt.setString(5,pass);
                    smt.setString(4,gender);
                    smt.setString(3,email);
                    smt.setString(2,address);
                    smt.setString(6,phno);
                    smt.executeUpdate();


                    JOptionPane.showMessageDialog(save,"Welcome, "+ msg +" Your account is successfully created");
                    dispose();
                    smt.close();
                    connection.close();
                    StudentLogin sl=new StudentLogin();
                    sl.setVisible(true);


                } catch (SQLException | ClassNotFoundException ex) {
                    ex.printStackTrace();

                }
            }


        }else{
            //for clear text
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            group.clearSelection();

        }
    }


}
