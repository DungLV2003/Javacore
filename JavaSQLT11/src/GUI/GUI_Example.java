package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;

//JOptionePane
//getActionCommand, getSource
public class GUI_Example extends JFrame implements ActionListener {

    JButton btn1, btn2;

    public GUI_Example() {
        btn1 = new JButton("Login");
        btn1.setBounds(50, 50, 80, 20);
        btn1.addActionListener(this);

        btn2 = new JButton("Register");
        btn2.setBounds(150, 50, 80, 20);
        btn2.addActionListener(this);

        this.add(btn1);
        this.add(btn2);
        this.setSize(300, 300);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //C1:
//        JButton clickButton = (JButton) e.getSource();
//        if (clickButton == btn1) {
//            JOptionPane.showConfirmDialog(null, "Login click");
//        }
//        else{
//            JOptionPane.showConfirmDialog(null, "Register click");
//            
//        }

        //C2:
        String command = e.getActionCommand();
        if (command.equals("Login")) {
            JOptionPane.showMessageDialog(null, "Login");
        } else {
            JOptionPane.showMessageDialog(null, "Register");
        }

    }

    public static void main(String[] args) {
        new GUI_Example();
    }
}
