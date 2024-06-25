package swing;

import javax.swing.*;

public class Swing {
    JFrame frame;
    MyPanel p;
    Swing() {
        frame = new JFrame();
        p = new MyPanel();
        frame.add(p);
        frame.setSize(200,200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Swing();
    }
}
