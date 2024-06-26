package LayoutManagerAlu;

import javax.swing.*;

public class NoLayoutAlu {
    JFrame frame;
    JButton addButton, subButton, mulButton;

    NoLayoutAlu() {
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

        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new NoLayoutAlu();
    }
}
