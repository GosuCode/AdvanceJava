package swing;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel{

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawRect(10,10,80,40);
        g.drawOval(10,10, 80, 40);

        g.setColor(Color.BLUE);
        g.fillRect(10,10,80,40);

        g.setColor(Color.GREEN);
        g.setFont(new Font(Font.MONOSPACED, Font.ITALIC, 40));
        g.drawString("Alember", 80, 80);

        Image image = new ImageIcon("Alu.png").getImage();
//        g.drawImage(image, 50, 50, null);
        g.drawImage(image, 50, 50, 60, 60, null);
    }
}
