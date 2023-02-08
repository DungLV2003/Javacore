package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.*;

public class BasicGUI implements ActionListener {

    JFrame frame;
    JLabel lblNumber1;
    JLabel lblNumber2;
    JButton btnadd;
    JButton btnsub;
    JButton btnmul;
    JButton btndiv;
    JTextField jtfNumber1, jtfNumber2;
    JLabel lblResult;
    JTextField jtfResult;

    public BasicGUI() {
        frame = new JFrame("Basic GUI");
        frame.setSize(500, 500);

        lblNumber1 = new JLabel("Number 1");
        lblNumber2 = new JLabel("Number 2");
        lblResult = new JLabel("Result");

        lblNumber1.setBounds(50, 50, 80, 20);
        lblNumber2.setBounds(50, 100, 80, 20);
        lblResult.setBounds(50, 300, 80, 20);

        jtfNumber1 = new JTextField();
        jtfNumber2 = new JTextField();
        jtfResult = new JTextField();

        jtfNumber1.setBounds(150, 50, 100, 20);
        jtfNumber2.setBounds(150, 100, 100, 20);
        jtfResult.setBounds(150, 300, 100, 20);

        btnadd = new JButton("+");
        btnsub = new JButton("-");
        btnmul = new JButton("*");
        btndiv = new JButton("/");

        btnadd.addActionListener(this);
        btnsub.addActionListener(this);
        btnmul.addActionListener(this);
        btndiv.addActionListener(this);

        btnadd.setBounds(50, 200, 50, 50);
        btnsub.setBounds(150, 200, 50, 50);
        btnmul.setBounds(250, 200, 50, 50);
        btndiv.setBounds(350, 200, 50, 50);

        frame.add(lblNumber1);
        frame.add(lblNumber2);
        frame.add(jtfNumber1);
        frame.add(jtfNumber2);
        frame.add(btnadd);
        frame.add(btnsub);
        frame.add(btnmul);
        frame.add(btndiv);
        frame.add(lblResult);
        frame.add(jtfResult);

        frame.setLocationRelativeTo(null); //hien thi o trung tam
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true); // lam cho hien thi
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int Number1 = Integer.parseInt(jtfNumber1.getText());
        int Number2 = Integer.parseInt(jtfNumber2.getText());
        if (e.getSource() == btnadd) {
            jtfResult.setText(Number1 + Number2 + "");
        } else if (e.getSource() == btnsub) {
            jtfResult.setText(Number1 - Number2 + "");
        } else if (e.getSource() == btnmul) {
            jtfResult.setText(Number1 * Number2 + "");
        } else {
            jtfResult.setText(Number1 / Number2 + "");
        }
    }

    public static void main(String[] args) {
        new BasicGUI();
    }
}
