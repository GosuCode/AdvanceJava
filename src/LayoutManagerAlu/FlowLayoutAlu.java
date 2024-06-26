package LayoutManagerAlu;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutAlu{
    JFrame frame;
    JButton addButton, subButton, mulButton;

    FlowLayoutAlu() {
        frame = new JFrame();
        addButton = new JButton("Add");
        subButton = new JButton("Sub");
        mulButton = new JButton("Mul");

        frame.setSize(300, 300);

        frame.setLayout(null);
        addButton.setBounds(50, 50, 100, 20);
        subButton.setBounds(50, 80, 100, 20);
        mulButton.setBounds(50, 110, 100, 20);

        frame.add(addButton);
        frame.add(subButton);
        frame.add(mulButton);

        frame.setLayout(new FlowLayout());

        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new FlowLayoutAlu();
    }
}
