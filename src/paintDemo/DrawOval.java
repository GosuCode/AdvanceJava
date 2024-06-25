package paintDemo;

import javax.swing.*;
import java.awt.*;

public class DrawOval extends JPanel{
    JFrame frame;
    JPanel p;

    DrawOval() {
        p=new JPanel(){
            @Override
            public void paint(Graphics g){
                super.paint(g);
                g.drawOval(10,10,80,30);
            }
        };
        frame=new JFrame();
        frame.setVisible(true);
        frame.setSize(200,200);
        frame.add(p);
    }

    public static void main(String[] args) {
        DrawOval drawOval = new DrawOval();
    }
}
