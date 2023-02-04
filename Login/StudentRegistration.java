package Login;

import javax.management.StringValueExp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentRegistration extends JFrame implements ActionListener {

    public JLabel sname,roll,maj,addr,hob;
    public JTextField tname,troll;
    public JRadioButton rit,rnet,rec,rci;
    public JTextArea tadd;
    public ButtonGroup bg=new ButtonGroup();

    public JPanel sp,rp,cbp,bp;
    public JCheckBox cg,ci,cs;
    public JButton ok,cancel;

    public StudentRegistration(){
        this.setTitle("Student Register");
        this.setSize(500,400);
        this.setLocation(100,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        sname=new JLabel("Student Name ");
        roll=new JLabel("Roll Number ");
        maj=new JLabel("Major ");
        addr=new JLabel("Address ");
        hob=new JLabel("Hobbies ");

        tname=new JTextField();
        troll=new JTextField();
        tadd=new JTextArea();

        rit=new JRadioButton("IT");
        rnet=new JRadioButton("Networking");
        rec=new JRadioButton("EC");
        rci=new JRadioButton("Civil");

        cg=new JCheckBox("Game");
        ci=new JCheckBox("Internet");
        cs=new JCheckBox("Studying");

        ok=new JButton("OK");
        cancel=new JButton("Cancel");
        bg=new ButtonGroup();

        sp=new JPanel();
        rp=new JPanel();
        cbp=new JPanel();
        bp=new JPanel();

        rp.setBorder(BorderFactory.createEtchedBorder());
        rp.add(rit);
        rp.add(rnet);
        rp.add(rec);
        rp.add(rci);

        bg.add(rit);
        bg.add(rnet);
        bg.add(rec);
        bg.add(rci);

        cbp.setBorder(BorderFactory.createEtchedBorder());
        cbp.add(cg);
        cbp.add(ci);
        cbp.add(cs);

        sp.setBorder(BorderFactory.createEtchedBorder());
        sp.setLayout(new GridLayout(5,2));
        sp.add(sname);
        sp.add(tname);
        sp.add(roll);
        sp.add(troll);
        sp.add(maj);
        sp.add(rp);
        sp.add(addr);
        sp.add(tadd);
        sp.add(hob);
        sp.add(cbp);

        bp.setBorder(BorderFactory.createEtchedBorder());
        bp.add(ok);
        bp.add(cancel);

        ok.addActionListener(this);
        cancel.addActionListener(this);

        Container container=this.getContentPane();
        container.add(sp,BorderLayout.CENTER);
        container.add(bp,BorderLayout.SOUTH);
        this.setVisible(true);

    }
    @Override

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==ok){

            String sif="Name :"+tname.getText()+"\n"+"Roll No :"+troll.getText()+"\n";

            String rsi="";
            if (rit.isSelected())
                rsi+="IT \n";
            if (rnet.isSelected())
                rsi+="Networking \n";
            if (rec.isSelected())
                rsi+="EC \n";
            if (rci.isSelected())
                rsi+="Civil \n";

            sif+="Major :"+rsi+"Address :"+ tadd.getText()+"\n";


            String si="";
            if  (cg.isSelected())
                 si+="Game ";
            if (ci.isSelected())
                si+="Internet ";
            if (cs.isSelected())
                si+="Studying ";

            if (si.equals("") || rsi.equals("")  )
            sif="Select Your Data ";
            else {
                sif +="Hobbies :"+ si;
            }

            JOptionPane.showMessageDialog(this, sif, "Student Information", JOptionPane.INFORMATION_MESSAGE);
            tname.setText("");
            troll.setText("");
            tadd.setText("");

            bg.clearSelection();

            cg.setSelected(false);
            ci.setSelected(false);
            cs.setSelected(false);




        }
        else
            JOptionPane.showMessageDialog(this,"All Cancel");

        tname.setText("");
        troll.setText("");
        tadd.setText("");

        bg.clearSelection();

        cg.setSelected(false);
        ci.setSelected(false);
        cs.setSelected(false);


    }

    public static void main(String[] args) {

        new StudentRegistration();
    }
}
