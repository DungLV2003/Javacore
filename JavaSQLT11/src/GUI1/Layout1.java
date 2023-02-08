
package GUI1;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.*;

public class Layout1 { 
    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayout");
        
        JButton btnSouth = new JButton("SOUTH");
        JButton btnNorth = new JButton("NORTH");
        JButton btnWest = new JButton("WEST");
        JButton btnEast = new JButton("EAST");
        JButton btnCenter = new JButton("CENTER");
        
        
        
        frame.setLayout( new BorderLayout(10, 10));
        frame.add(btnSouth, BorderLayout.SOUTH);
        frame.add(btnCenter, BorderLayout.CENTER);
        frame.add(btnEast, BorderLayout.EAST);
        frame.add(btnNorth, BorderLayout.NORTH);
        frame.add(btnWest, BorderLayout.WEST);
        
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
