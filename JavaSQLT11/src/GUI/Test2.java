package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Test2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Test");
        frame.setSize(500, 500);
        
        String[] arr = {"C++", "Java", "Python", "C#"};
        JComboBox combo = new JComboBox(arr);
        
        combo.setBounds(50, 50, 100, 30);
        
        frame.add(combo);
        
        JButton btn = new JButton("CLICK");
        btn.setBounds(50, 180, 100, 20);
        
        frame.add(btn);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String res = (String) combo.getItemAt(combo.getSelectedIndex());
                System.out.println(res);
            }
        });
        

        frame.setLocationRelativeTo(null); //hien thi o trung tam
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true); // lam cho hien thi
    }
}
