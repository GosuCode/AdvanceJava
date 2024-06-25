import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SI implements ActionListener {
    JFrame frame;
    JLabel labelP, labelT, labelR;
    JTextField txtP, txtT, txtR;
    JButton btn;
    JLabel result;

    SI() {
        frame = new JFrame();
        labelP = new JLabel("P");
        labelT = new JLabel("T");
        labelR = new JLabel("R");
        txtP = new JTextField(20);
        txtT = new JTextField(20);
        txtR = new JTextField(20);
        btn = new JButton("Calculate");
        result = new JLabel("");

        frame.setLayout(new FlowLayout());

        frame.add(labelP);
        frame.add(txtP);
        frame.add(labelT);
        frame.add(txtT);
        frame.add(labelR);
        frame.add(txtR);
        frame.add(btn);
        frame.add(result);

        btn.addActionListener(this);

        frame.setVisible(true);

        frame.setSize(250, 200);

        btn.addActionListener(this);
    }

    public static void main(String[] args) {
        new SI();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int p = Integer.parseInt(txtP.getText());
        int t = Integer.parseInt(txtR.getText());
        int r = Integer.parseInt(txtT.getText());
        int si = p*t*r/100;

        result.setText(" " + si);
    }
}