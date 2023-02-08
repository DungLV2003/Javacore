
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

//Label: Nhan
//Button: 
//JTextField:

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI Example");
        
        frame.setSize(400, 300);
        
        
        JLabel lblusername = new JLabel("Username");
        JLabel lblPassword = new JLabel("Password");
        
        lblusername.setBounds(50, 50, 80, 20);
        lblPassword.setBounds(50, 100, 80, 20);
        
        
        JButton btnLogin = new JButton("Login");
        btnLogin.setBounds(140, 150, 80, 20);
        
        JTextField jtfUsername = new JTextField();
        JTextField jtfPassword = new JTextField();
        
        jtfUsername.setBounds(150, 50, 100, 20);
        jtfPassword.setBounds(150, 100, 100, 20);
        
        
        frame.add(lblusername);
        frame.add(lblPassword);
        frame.add(btnLogin);
        frame.add(jtfUsername);
        frame.add(jtfPassword);
        
        frame.setLocationRelativeTo(null); //hien thi o trung tam
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true); // lam cho hien thi
        
        btnLogin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = jtfUsername.getText();
                String password = jtfPassword.getText();
                System.out.println(username + " " + password);
            }
        });
        
        
        
    }
}
