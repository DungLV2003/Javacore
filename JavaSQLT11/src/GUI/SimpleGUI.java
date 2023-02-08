
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SimpleGUI implements ActionListener{
    
    JFrame frame;
    JLabel lblUsername;
    JLabel lblPassword;
    JButton btnLogin;
    JTextField jtfUsername, jtfPassword;
    
    public SimpleGUI() {
        frame = new JFrame("Simple GUI");
        frame.setSize(400, 300);
        
        
        lblUsername = new JLabel("Username");
        lblPassword = new JLabel("Password");
        btnLogin = new JButton("Login");
        
        lblUsername.setBounds(50, 50, 80, 20);
        lblPassword.setBounds(50, 100, 80, 20);
        btnLogin.setBounds(140, 150, 80, 20);
        
        jtfUsername = new JTextField();
        jtfPassword = new JPasswordField();
        
        jtfUsername.setBounds(150, 50, 100, 20);
        jtfPassword.setBounds(150, 100, 100, 20);
        
        frame.add(lblUsername);
        frame.add(lblPassword);
        frame.add(btnLogin);
        frame.add(jtfUsername);
        frame.add(jtfPassword);
        btnLogin.addActionListener(this);
        
       
        frame.setLocationRelativeTo(null); //hien thi o trung tam
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true); // lam cho hien thi
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Nut login duoc click !");
        System.out.println(jtfUsername.getText() + " " + jtfPassword.getText());
        lblPassword.setText("Mat khau");
        lblUsername.setText("Tai khoan");
    }
    
    public static void main(String[] args) {
        new SimpleGUI();
    }
    
}
