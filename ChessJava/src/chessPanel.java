import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class chessPanel extends JPanel {
    private final int WIDTH = 500, HEIGHT = 500;
    private Point startPoint = null, endPoint = null;

    public chessPanel(){

        addMouseListener(new chessListener());

        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
    }

    private class chessListener implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {}

        @Override
        public void mousePressed(MouseEvent e) {}

        @Override
        public void mouseReleased(MouseEvent e) {}

        @Override
        public void mouseEntered(MouseEvent e) {}

        @Override
        public void mouseExited(MouseEvent e) {}
    }
}
