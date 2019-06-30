import javax.swing.*;

public class Chess {
    public static void main(String[] args) {
        JFrame chessFrame = new JFrame("Chess");
        chessFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        chessFrame.getContentPane().add(new chessPanel());

        chessFrame.pack();
        chessFrame.setVisible(true);
    }
}

