
package GUI1;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.*;

public class Layout2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Grid Layout");
        JButton[] btn = new JButton[64];
        
        for(int i = 0; i < 64; i++){
            btn[i] = new JButton("");
        }
        
        frame.setLayout(new GridLayout(8, 8));
        
        
        for(int i = 0; i < 64; i++){
            frame.add(btn[i]);
        }
        
        
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
