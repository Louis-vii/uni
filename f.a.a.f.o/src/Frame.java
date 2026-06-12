import javax.swing.*;
import java.awt.*;

public class Frame {
    void main(){ }

     protected  int width ;

     protected  int height;
     protected String title ;
     public Frame (){}
    public Frame(String title , int height , int width ) {
       JFrame frame = new JFrame(title);
       frame.setResizable(false);
       frame.setSize(height, width);
       frame.setLocationRelativeTo(null );
       frame.setLayout(new BorderLayout());
         frame.setVisible(true);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

