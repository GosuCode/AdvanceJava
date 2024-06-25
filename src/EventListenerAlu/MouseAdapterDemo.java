package EventListenerAlu;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*
MouseAdapter is a class that allows you to override only the methods you are
interested in without having to implement all methods of these interfaces.
*/

public class MouseAdapterDemo extends MouseAdapter {
    JFrame frame;

    MouseAdapterDemo() {
        frame = new JFrame();
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.addMouseListener(this);
    }

    public static void main(String[] args) {
        new MouseListenerDemo();
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent){
        System.out.println("Click!");
    }
}
