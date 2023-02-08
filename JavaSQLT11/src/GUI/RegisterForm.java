
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;


public class RegisterForm extends JFrame implements ActionListener{

    private JLabel lblUsername, lblPassword;
    private JTextField username;
    private JPasswordField password;
    private JButton btnRegister;

    public RegisterForm() {
        
        lblUsername = new JLabel("Username");
        lblPassword = new JLabel("Passsword");
        lblUsername.setBounds(50, 50, 100, 30);
        lblPassword.setBounds(50, 80, 100, 30);

        username = new JTextField();
        password = new JPasswordField();
        username.setBounds(150, 50, 100, 30);
        password.setBounds(150, 80, 100, 30);

        btnRegister = new JButton("Login");
        btnRegister.setBounds(100, 150, 80, 30);

        this.add(lblUsername);
        this.add(lblPassword);
        this.add(username);
        this.add(password);
        this.add(btnRegister);

        btnRegister.addActionListener(this); // Đăng kí sự kiện cho btn 
        this.setSize(400, 400);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
   

    
    @Override
    public void actionPerformed(ActionEvent e) {
       
    }
    
}
