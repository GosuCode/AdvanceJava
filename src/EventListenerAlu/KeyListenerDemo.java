package EventListenerAlu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerDemo implements KeyListener {
    JFrame frame;
    JTextField txt;

    KeyListenerDemo() {
        frame = new JFrame();
        txt = new JTextField(20);
        frame.add(txt);
        frame.setLayout(new FlowLayout());
        frame.setSize(200,200);
        frame.setVisible(true);
        txt.addKeyListener(this);
    }

    public static void main(String[] args) {
        new KeyListenerDemo();
    }
    @Override
    public void keyTyped(KeyEvent keyEvent) {
        System.out.println("Key Typed");
        System.out.println(keyEvent.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        System.out.println("Key Pressed");
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        System.out.println("Key Released");
    }
}
