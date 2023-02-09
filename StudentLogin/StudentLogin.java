package StudentLogin;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class StudentLogin extends JFrame implements ActionListener {

    public JLabel l1, l2, l3,l4;
    public JPasswordField pass;
    public JTextField t1;
    public JButton login, cancel,register;
    public JPanel p1, p2, p3,p4;

    //connected Database
    Connection conn;
    String db = "jdbc:mysql://localhost/login";
    String username = "root";
    String password = "Naing111";
    Statement stmt;
    String sql;
    ResultSet rs;


    public StudentLogin() {
        this.setTitle("Login Page");
        this.setSize(400, 250);
        this.setLocation(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("LOGIN");
        l2 = new JLabel("User Name");
        l3 = new JLabel("Password ");
        l4 = new JLabel("Is you are not a number,you are register first!");


        t1 = new JTextField(15);
        pass = new JPasswordField(15);
        pass.setEchoChar('*');

        login = new JButton("Login");
        login.addActionListener(this);
        cancel = new JButton("Cancel");
        cancel.addActionListener(this);
        register=new JButton("Register");
        register.addActionListener(this);;

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();

        p1.add(l1);

        p2.setBorder(BorderFactory.createEtchedBorder());
        p2.setLayout(new GridLayout(3, 3));

        p2.add(l2);
        p2.add(t1);
        p2.add(l3);
        p2.add(pass);
        p2.add(login);
        p2.add(cancel);

        p3.add(login);
        p3.add(cancel);

        p4.setLayout(new GridLayout(2,0));
        p4.add(l4);
        p4.add(register);


        this.setLayout(new FlowLayout());
        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);


        this.setVisible(true);


    }

    public static void main(String[] args) {

        new StudentLogin();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == login) {
            if (t1.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please fill the name");

            } else if (pass.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "please Fill Password");
            }


            else {


                String name = t1.getText();
                String pass1 = pass.getText();
                Boolean b = false;
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    conn = DriverManager.getConnection(db, username, password);
                    stmt = conn.createStatement();
                    //System.out.println("connection success");
                    sql = "select * from login.student where name='" + name + "' and password='" + pass1 + "'";
                    //sql="Select * from student where name=? and password=?";
                    //System.out.println(sql);
                    rs = stmt.executeQuery(sql);
                    while (rs.next()) {
                        b = true;
                        //System.out.println(b);
                        // success class for login successfully
                        int id=rs.getInt("id");
                        Success ls=new Success(id);
                        dispose();
                    }
                    if (!b) {
                        JOptionPane.showMessageDialog(this, "Invalid Login. Please Register First!", "Error Message", 0);
                    }
                    stmt.close();
                    conn.close();

                } catch (ClassNotFoundException | SQLException ex) {
                    ex.printStackTrace();

                }
            }
        }else{
            // call Student register page for student register
            if(e.getSource()==register)
                new Registation();
                dispose();
        }
            t1.setText("");
            pass.setText("");

    }
}
