package LayoutManagerAlu;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutAlu{
    JFrame frame;
    JButton north, south, west, east;

    BorderLayoutAlu() {
        frame = new JFrame();
         north = new JButton("North");
         east = new JButton("East");
        west = new JButton("West");
       south = new JButton("South");

        frame.setSize(300, 300);

        frame.add(north, BorderLayout.NORTH);
        frame.add(west, BorderLayout.WEST);
        frame.add(south, BorderLayout.SOUTH);
        frame.add(east, BorderLayout.EAST);

        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new BorderLayoutAlu();
    }
}
