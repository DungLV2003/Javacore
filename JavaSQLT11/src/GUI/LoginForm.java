package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.*;

public class LoginForm extends JFrame implements ActionListener {

    private JLabel lblUsername, lblPassword;
    private JTextField username;
    private JPasswordField password;
    private JButton btnLogin, btnRegister;
    private ArrayList<Account> list;

    LoginForm(ArrayList<Account> list) {
        this.list = new ArrayList<>(list); // Tao list tu list khac
        
//        for(int i = 0 ; i < list.size(); i++){
//            this.list.add(list.get(i));
//        }

        lblUsername = new JLabel("Username");
        lblPassword = new JLabel("Passsword");
        lblUsername.setBounds(50, 50, 100, 30);
        lblPassword.setBounds(50, 80, 100, 30);

        username = new JTextField();
        password = new JPasswordField();
        username.setBounds(150, 50, 100, 30);
        password.setBounds(150, 80, 100, 30);

        btnLogin = new JButton("Login");
        btnLogin.setBounds(100, 150, 80, 30);
        
        btnRegister = new JButton("Login");
        btnRegister.setBounds(200, 150, 80, 30);

        this.add(lblUsername);
        this.add(lblPassword);
        this.add(username);
        this.add(password);
        this.add(btnLogin);

        btnLogin.addActionListener(this); // Đăng kí sự kiện cho btn 
        this.setSize(400, 400);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    LoginForm() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str1 = username.getText();
        char[] str2 = password.getPassword();
        String str3 = "";
        for(char x : str2){
            str3 += x;
        }

        for (int i = 0; i < list.size(); i++) {
            if (str1.equals(list.get(i).getUsername()) && str3.equals(list.get(i).getPassword())) {
                JOptionPane.showMessageDialog(null, "Login Successfully");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Login failed");
    }

}
