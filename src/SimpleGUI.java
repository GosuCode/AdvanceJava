import java.awt.*;

public class SimpleGUI {
    public static void main(String[] args) {
        Frame frame = new Frame();

        Label num1 = new Label("Num1");
        Label num2 = new Label("Num2");
        TextField txt1 = new TextField(20);
        TextField txt2 = new TextField(20);
        Button btn = new Button("Submit");

        frame.setLayout(new FlowLayout());

        frame.add(num1);
        frame.add(txt1);
        frame.add(num2);
        frame.add(txt2);
        frame.add(btn);

        frame.setVisible(true);

        frame.setSize(500,200);
    }
}
