import javax.swing.*;

public class Hello {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                System.out.println("Hello!");
            }
        });
    }
}
