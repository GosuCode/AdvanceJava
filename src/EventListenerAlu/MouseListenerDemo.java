package EventListenerAlu;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//use MouseAdapter class for using specific method, as it is a class it extends other class

public class MouseListenerDemo implements MouseListener {
    JFrame frame;
    JLabel label;

    MouseListenerDemo() {
        frame = new JFrame();
        label = new JLabel("Hello");
        frame.add(label);
        frame.setSize(200,200);
        frame.setVisible(true);
        label.addMouseListener(this);
    }

    public static void main(String[] args) {
        new MouseListenerDemo();
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        System.out.println("Mouse Clicked");
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        System.out.println("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        System.out.println("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        System.out.println("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        System.out.println("Mouse exited");
    }
}
