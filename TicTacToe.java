import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToe{
    int gameWidth = 600;
    int gameHeight = 650;

    JFrame frame = new JFrame("Tic Tac Toe");
    JLabel textLabel = new JLabel();
    JPanel textPanel = new JPanel();
    JPanel gamePanel = new JPanel();

    JButton[][] game = new JButton[3][3];
    String px = "X";
    String po = "O";

    String curplayer = px;

    boolean over = false;
    int turn = 0;

    TicTacToe() {
        frame.setVisible(true);
        frame.setSize(gameWidth, gameHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
    }
}

