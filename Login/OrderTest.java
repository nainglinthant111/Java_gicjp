package Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.AbstractExecutorService;

public class OrderTest extends JFrame implements ActionListener {

        JButton b;
        JRadioButton sm,med,lar;
        ButtonGroup bg;
        JCheckBox a,ex,p,o,m,s;

    public OrderTest(){
        this.setTitle("Login Form");
        this.setSize(650,300);
        this.setLocation(500,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c=this.getContentPane();
        c.setLayout(new FlowLayout());

        JPanel rp=new JPanel();
        rp.setBorder(BorderFactory.createTitledBorder("Sizes available"));

        bg=new ButtonGroup();
        sm=new JRadioButton("Small");
        med=new JRadioButton("Medium");
        lar=new JRadioButton("Large");

        rp.add(sm);
        rp.add(med);
        rp.add(lar);
        bg.add(sm);
        bg.add(med);
        bg.add(lar);

        JPanel cp=new JPanel();
        cp.setBorder(BorderFactory.createTitledBorder("Varieties available"));
        a=new JCheckBox("Anchovies");
        ex=new JCheckBox("Extra Cheese");
        p=new JCheckBox("Pepperoni");
        o=new JCheckBox("Onion");
        m=new JCheckBox("Mushrooms");
        s=new JCheckBox("Sausage");

        cp.add(a);
        cp.add(ex);
        cp.add(p);
        cp.add(o);
        cp.add(m);
        cp.add(s);

        JPanel bp=new JPanel();
        b=new JButton("OK");
        b.addActionListener(this);
        bp.add(b);

        c.add(rp);
        c.add(cp);
        c.add(bp);

        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b){
            String msg="You Ordered";
            if (sm.isSelected())
                msg+=" a small Spagetti with ";
            if (med.isSelected())
                msg+=" a medium Spagetti with ";
            if (lar.isSelected())
                msg+=" a large Spagetti with ";

            String st ="";
            
            if (a.isSelected())
                st+="Anchovies \n";
            if (ex.isSelected())
                st+="Extra Cheese \n";
            if (p.isSelected())
                st+="Pepperoni \n";
            if (o.isSelected())
                st+="Onion \n";
            if (m.isSelected())
                st+="Mushrooms \n";
            if (s.isSelected())
                st+="Sausage \n";
           if(st.equals(""))
               msg+="no Toppings";
           else {
               msg += "the toppings: \n" + st;
               JOptionPane.showMessageDialog(this, msg, "Your Order", JOptionPane.INFORMATION_MESSAGE);
               a.setSelected(false);
               ex.setSelected(false);
               p.setSelected(false);
               o.setSelected(false);
               m.setSelected(false);
               s.setSelected(false);
               bg.clearSelection();
           }
        }

    }

    public static void main(String[] args) {
        new OrderTest();
    }
}
