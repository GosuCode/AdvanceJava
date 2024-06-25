package EventListenerAlu;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerDemo implements KeyListener {
    JFrame frame;

    KeyListenerDemo() {
        frame = new JFrame();
        frame.setSize(200,200);
        frame.setVisible(true);
        frame.addKeyListener(this);
    }

    public static void main(String[] args) {
        new KeyListenerDemo();
    }
    @Override
    public void keyTyped(KeyEvent keyEvent) {
        System.out.println("Key Typed");
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
