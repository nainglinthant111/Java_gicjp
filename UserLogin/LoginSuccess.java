package UserLogin;

import javax.swing.*;

public class LoginSuccess extends JFrame {

    public LoginSuccess(){
        this.setTitle("Login Success");
        this.setSize(500,500);
        this.setLocation(200,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel p=new JPanel();
        JLabel l=new JLabel("Welcome to our Home Page");
        p.add(l);

        this.add(p);
        this.setVisible(true);

    }

    public static void main(String[] args) {
//        System.out.println("Database tutorial");
//
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            System.out.println("connectino has");
//           Connection con= DriverManager.getConnection("jdbc:mysql://localhost/Naing_Java","root","Naing111");
//            System.out.println("Database has");
//            Statement st=con.createStatement();
//            ResultSet rs=st.executeQuery("select * from students;");
//            rs.first();
//            System.out.println("ID is "+rs.getInt(1)+"Name is"+rs.getString(2));
//
//
//        }catch (Exception e){
//            e.printStackTrace();
//            System.out.println("Fail toturial");
//
//        }

    }
}
