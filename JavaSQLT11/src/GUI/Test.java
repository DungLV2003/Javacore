package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Test {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test");
        frame.setSize(500, 500);
        JTextArea jtaData = new JTextArea();
        jtaData.setBounds(50, 50, 300, 300);
        jtaData.setLineWrap(true); //TU DONG XUONG DONG
        jtaData.setWrapStyleWord(true); //Tu dong xuong tu
        frame.add(jtaData);
        
        JButton btnCount = new JButton("Count word");
        btnCount.setBounds(50, 400, 120, 20);
        JTextField jtfResult = new JTextField();
        jtfResult.setBounds(200, 400, 80, 20);
        
        frame.add(btnCount);
        frame.add(jtfResult);
        
        frame.setLocationRelativeTo(null); //hien thi o trung tam
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true); // lam cho hien thi
        
        btnCount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = jtaData.getText(); 
                String[] arr = data.split("\\s+");
                jtfResult.setText(arr.length + "");
            }
        });
    }
}
