package JFrameTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MenuTest extends JFrame implements ActionListener {

    JMenuBar mb;
    JMenu op;
    JMenuItem addItem,subItem,multItem,divItem,exitItem;

    JPanel p1;
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1;

    public MenuTest() {

        this.setTitle("Menu Test");
		/*this.setSize(400, 200);
		this.setLocation(800, 400);*/
        this.setBounds(800, 400, 400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mb = new JMenuBar();
        op = new JMenu("Calculation");
        addItem = new JMenuItem("Addition");
        subItem=new JMenuItem("Subtraction");
        multItem=new JMenuItem("Multiplication");
        divItem=new JMenuItem("Division");
        exitItem = new JMenuItem("Exit");

        this.setJMenuBar(mb);

        mb.add(op);
        op.add(addItem);
        op.addSeparator();
        op.add(subItem);
        op.addSeparator();
        op.add(multItem);
        op.addSeparator();
        op.add(divItem);
        op.addSeparator();
        op.add(exitItem);

        addItem.addActionListener(this);
        subItem.addActionListener(this);
        multItem.addActionListener(this);
        divItem.addActionListener(this);
        exitItem.addActionListener(this);

        l1 = new JLabel("Number 1");
        l2 = new JLabel("Number 2");
        l3 = new JLabel("Result");

        t1 = new JTextField(5);
        t2 = new JTextField(5);
        t3 = new JTextField(5);

        b1 = new JButton("");
        b1.addActionListener(this);





        p1 = new JPanel();
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        p1.add(b1);






        this.add(p1);

      p1.setVisible(false);

        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // TODO Auto-generated method stub
        if (e.getSource() == addItem) {
            p1.setVisible(true);
            b1.setText("ADD");
            t1.setText("");
            t2.setText("");
            t3.setText("");


        }else if (e.getSource()==subItem) {
            p1.setVisible(true);
            b1.setText("SUB");
            t1.setText("");
            t2.setText("");
            t3.setText("");

        }
        else if (e.getSource()==multItem) {
            p1.setVisible(true);
            b1.setText("MULTI");
            t1.setText("");
            t2.setText("");
            t3.setText("");

        }
        else if (e.getSource()==divItem) {
            p1.setVisible(true);
            b1.setText("DIV");
            t1.setText("");
            t2.setText("");
            t3.setText("");

        }
        else if (e.getSource() == exitItem) {
            System.exit(0);
        }
        else
        {
            int n1=Integer.parseInt(t1.getText());
            int n2=Integer.parseInt(t2.getText());
            int ans;
            if(b1.getText().equals("ADD")||e.getSource()==addItem)
            {
                ans=n1+n2;
                t3.setText(Integer.toString(ans));
            }else if (b1.getText().equals("SUB")||e.getSource()==subItem){
                ans=n1-n2;
                t3.setText(Integer.toString(ans));
            }else if (b1.getText().equals("MULTI")||e.getSource()==multItem){
                ans=n1*n2;
                t3.setText(Integer.toString(ans));
            }else if (b1.getText().equals("DIV")||e.getSource()==divItem){
                ans=n1/n2;
                t3.setText(Integer.toString(ans));
            }

        }

    }

    public static void main(String[] args) {
        new MenuTest();

    }

}