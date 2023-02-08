package GUI;

//JList
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;

public class Test3 extends JFrame implements ActionListener {

    JButton btn1;
   
    JList listFood, listDrink;

    Test3() {

        DefaultListModel model1 = new DefaultListModel();
        model1.addElement("Ga ran");
        model1.addElement("Khoai tay chien");
        model1.addElement("Pho");
        listFood = new JList(model1);

        String[] drink = {"Cocacola", "Pepsi", "Sting", "Beer"};
        DefaultListModel model2 = new DefaultListModel();
        for (String x : drink) {
            model2.addElement(x);
        }
        listDrink = new JList(model2);

        listFood.setBounds(50, 50, 100, 100);
        listDrink.setBounds(50, 200, 100, 100);

        btn1 = new JButton("Order");
        btn1.setBounds(50, 350, 80, 20);

        btn1.addActionListener(this);
        this.add(btn1);
        this.add(listFood);
        this.add(listDrink);

        this.setSize(300, 500);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    //getSelectedValue: chỉ chọn đối tượng có giá trị index nhỏ nhất
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Selected Food :");
        int[] idx1 = listFood.getSelectedIndices();
        for (int x : idx1) {
            System.out.println(listFood.getModel().getElementAt(x));
        }

        System.out.println("Selected Drink :");
        int[] idx2 = listDrink.getSelectedIndices();
        for (int x : idx2) {
            System.out.println(listDrink.getModel().getElementAt(x));
        }
    }

    public static void main(String[] args) {
        new Test3();
    }

}
