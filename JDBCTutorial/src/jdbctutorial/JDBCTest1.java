package jdbctutorial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JDBCTest1 extends JFrame implements ActionListener {

    private JLabel lblUsername, lblPassword;
    private JTextField username;
    private JPasswordField password;
    private JButton btnLogin, btnRegister;

    JDBCTest1() {

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

        btnRegister = new JButton("Register");
        btnRegister.setBounds(200, 150, 80, 30);

        this.add(lblUsername);
        this.add(lblPassword);
        this.add(username);
        this.add(password);
        this.add(btnLogin);
        this.add(btnRegister);

        btnLogin.addActionListener(this); // Đăng kí sự kiện cho btn 
        this.setSize(400, 400);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String url = "jdbc:sqlserver://LAPTOP-SQBHH25B\\MSSQLSERVER;databaseName=SQL_Basic;encrypt=true;trustServerCertificate=true";
            String username1 = "sa";
            String password1 = "0325325380";

            Connection con = DriverManager.getConnection(url, username1, password1);
            con.setAutoCommit(false);
            try{
            
            String user = username.getText();
            String pass = String.valueOf(password.getPassword());
            
            Statement stm = con.createStatement();
            String sql = "SELECT * FROM Account";
            
            ResultSet rs =  stm.executeQuery(sql);
            
            while(rs.next()){
                if(rs.getString(2).equals(user) && rs.getString(3).equals(pass)){
                    JOptionPane.showConfirmDialog(null, "Login Successfully !");
                    return;
                }
            }
            JOptionPane.showConfirmDialog(null, "Login failed !");
            con.commit();
            }catch(SQLException ex){
                con.rollback();         //transaction
            }
            con.close();
        
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
    public static void main(String[] args) {
        new JDBCTest1();
    }

}
