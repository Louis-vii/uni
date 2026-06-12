import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args){

        int height = 500 ;
        int width = 500;
 //Frame frame = new Frame("balls ", 320, 150 );

        //Frame frame1 = new Frame("balls ", 420, 150 );

        JFrame  frame = new JFrame(" balls ");
        ImageIcon image = new ImageIcon("screenshot-2026-04-24_19-12-25.png");
        JLabel label  = new JLabel();



        label.setText("huge balls");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setForeground(new Color(50,150,255));



        frame.setResizable(false);
        frame.setSize(height, width);
        frame.setLocationRelativeTo(null );
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
    }
}
