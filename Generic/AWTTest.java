package Generic;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTTest extends Frame {
    public AWTTest(){
        setTitle("This is my first frame");
        setSize(300,250);
        setLocation(250,250);
        setVisible(true);

        addWindowFocusListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

    }
    public static void main(String[] args) {
        new AWTTest();
    }
}
