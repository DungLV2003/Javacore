package GUI;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Test1 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Test");
        frame.setSize(500, 500);
        
        JButton btn = new JButton("Click");
        btn.setBounds(50, 200, 100, 20);
        
        JCheckBox checkBox1 = new JCheckBox("Nam");
        JCheckBox checkBox2 = new JCheckBox("Nu");
        
        checkBox1.setBounds(50, 50, 100, 20);
        checkBox2.setBounds(50, 100, 100, 20);
        
        frame.add(checkBox1);
        frame.add(checkBox2);
        frame.add(btn);
        
        checkBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
               int res = e.getStateChange();
                System.out.println("Nam");
            }
        });
        
        checkBox2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
               int res = e.getStateChange();
                System.out.println("Nu");
            }
        });
        
        frame.setLocationRelativeTo(null); //hien thi o trung tam
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true); // lam cho hien thi
    }
}
