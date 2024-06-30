package LayoutManagerAlu;

import javax.swing.*;
import java.awt.*;

public class GridLayoutAlu {
    JFrame frame;
    JButton btn1, btn2, btn3, btn4, btn5, btn6;

    GridLayoutAlu() {
        frame = new JFrame();
        btn1 = new JButton("Button 1");
        btn2 = new JButton("Button 2");
        btn3 = new JButton("Button 3");
        btn4 = new JButton("Button 4");
        btn5 = new JButton("Button 5");
        btn6 = new JButton("Button 6");

        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);
        frame.add(btn6);

        //for giving gap between grids (note: row takes the priority);
        GridLayout getBackLayout = new GridLayout(2,2);

        getBackLayout.setHgap(10);
        getBackLayout.setVgap(10);

        frame.setLayout(getBackLayout);

        frame.setSize(800,800);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutAlu();
    }
}
