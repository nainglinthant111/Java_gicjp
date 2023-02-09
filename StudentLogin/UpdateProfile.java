package StudentLogin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class UpdateProfile extends JFrame implements ActionListener {

    //declare for UI
    public JLabel l1,l2,l3,l4,l5,l6;
    public JPasswordField t2;
    public JTextField t1,t3,t5;
    public JTextArea t4;
    public JButton update;
    public JRadioButton male,female;
    public ButtonGroup group;
    public JPanel rp,mp;


    int stuid;
    String name,stupass,gender,email,address,phno;

    //connected Database
    Connection conn;
    String db = "jdbc:mysql://localhost/login";
    String username = "root";
    String password = "Naing111";
    PreparedStatement stmt;
    ResultSet rs;


    public UpdateProfile(int loginid){
        stuid=loginid;
        //for Registration frame
        this.setTitle("Student Registration");
        this.setSize(350, 300);
        this.setLocation(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn= DriverManager.getConnection(db,username,password);
            //System.out.println("Test connection ok!");
             stmt=conn.prepareStatement("select * from student where id=?");
            stmt.setInt(1,stuid);
            rs=stmt.executeQuery();

            while (rs.next()){
                name=rs.getString("name");
                stupass=rs.getString("password");
                gender=rs.getString("genter");
                email=rs.getString("email");
                address=rs.getString("address");
                phno=rs.getString("phoneno");
            }
            stmt.close();
            conn.close();




        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            //System.out.println("error");
        }


        l1=new JLabel("Name");
        l2=new JLabel("Password");
        l3=new JLabel("Gender");
        l4=new JLabel("Email");
        l5=new JLabel("Address");
        l6=new JLabel("PhoneNo");

        t1=new JTextField(15);
        t1.setText(name);
        t2=new JPasswordField(15);
        t2.setText(stupass);
        t2.setEchoChar('*');
        t3=new JTextField(15);
        t3.setText(email);
        t4=new JTextArea();
        t4.setText(address);
        t5=new JTextField(15);
        t5.setText(phno);

        male=new JRadioButton("Male");
        female=new JRadioButton("Female");

        rp=new JPanel();
        rp.add(male);
        rp.add(female);
        if (gender.equals("MALE"))
        {
            male.setSelected(true);
        }else{
            female.setSelected(true);
        }
        group=new ButtonGroup();
        group.add(male);
        group.add(female);

        update=new JButton("Update");
        update.addActionListener(this);


        mp=new JPanel();
        mp.setLayout(new GridLayout(6,2));
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



        this.setLayout(new FlowLayout());
        this.add(mp);
        this.add(update);
        this.setVisible(true);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource()==update){
                String name=t1.getText();
                String stupass=t2.getText();
                String gender=male.isSelected() ? "Male" : "Female";
                String email=t3.getText();
                String address=t4.getText();
                String phno=t5.getText();
                String msg=""+name;
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    conn= DriverManager.getConnection(db,username,password);
                    //System.out.println("Test connection ok!");
                    PreparedStatement stmt=conn.prepareStatement("update student set name=?,password=?,genter=?,email=?,address=?,phoneno=? where id=?");

                    stmt.setString(1,name);
                    stmt.setString(2,stupass);
                    stmt.setString(3,gender);
                    stmt.setString(4,email);
                    stmt.setString(5,address);
                    stmt.setString(6,phno);
                    stmt.setInt(7,stuid);
                    stmt.executeUpdate();
                    JOptionPane.showMessageDialog(update,"Welcome, "+msg+" Your account is successfully update");
                    new StudentLogin();
                    dispose();

                } catch (SQLException | ClassNotFoundException exp) {
                    exp.printStackTrace();
                   // System.out.println("error");
                }
            }
    }


}
