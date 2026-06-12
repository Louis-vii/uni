import java.awt.*;
import javax.swing.*;

public class Calc {
    void main(){}
    int Boardwidth = 360 ;
    int Boardheight = 540 ;
    Color Lightgrey = new Color( 212 , 212 , 210 );
    Color Darkgrey = new Color (80 , 80 , 80 );
     Color Black = new Color(28 , 28 , 28 );
     Color Orange = new Color(255 , 149 , 0 );
     JPanel panel = new JPanel();
     JLabel label = new JLabel();
    String[] buttonValues = {
            "AC", "+/-", "%", "÷",
            "7", "8", "9", "×",
            "4", "5", "6", "-",
            "1", "2", "3", "+",
            "0", ".", "√", "="
    };
    String[] rightSymbols = {"÷", "×", "-", "+", "="};
    String[] topSymbols = {"AC", "+/-", "%"};

        JPanel buttonpanel = new JPanel();
            JFrame frame = new JFrame("calc");
            Calc(){
                frame.setVisible(true);
                frame.setSize(Boardwidth , Boardheight);
                frame.setLocationRelativeTo(null);
                frame.setResizable(false);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout() );
                label.setBackground(Black);
                label.setForeground(Color.white);
                label.setFont(new Font("Arial", Font.PLAIN , 81));
                label.setHorizontalAlignment(JLabel.RIGHT);
                label.setText("0");
                label.setOpaque(true);
                panel.setLayout(new BorderLayout());
                panel.add(label);
                frame.add(panel , BorderLayout.NORTH);
                buttonpanel.setLayout( new GridLayout(5,4 ));
                buttonpanel.setBackground(Black);
                frame.add(buttonpanel);
                for(int  i = 0 ; i < buttonValues.length; i++ ){
                    JButton button = new JButton();
                    String buttonValue =  buttonValues[i];
                    button.setFont(new Font("Arial ", Font.PLAIN , 30 ));
                    button.setText(buttonValue);
                    button.setFocusable(false);
                    buttonpanel.add(button);
                }
            }
}
