package GUI;

//JTable table = new JTable(data[][], column_name);
// Làm việc với table thì phải tạo frame , 1 crollframe, 1 table
// Cho table vào crollFrame rồi cho crollFrame vào frame
//Lưu ý: Khi cần làm việc với table(thêm, sửa, xóa,...) thì phải làm việc thông qua model
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Ex_JTable {

    public static void main(String[] args) {
        String[] columnName = {"ID", "Full name", "Class", "Gpa"};
        Object[][] data = {
            {"123", "Le Van Dung", "SE1771", 3.6},
            {"124", "Le Khanh Linh", "SE1772", 3.4},
            {"125", "Nguyen Thi Huyen", "SE1773", 3.2},
            {"126", "Le Van Dung", "SE1771", 3.6},
            {"127", "Le Khanh Linh", "SE1772", 1.9},
            {"128", "Nguyen Anh Minh", "SE1773", 3.2},
            {"129", "Chu Thuy Hoa", "SE1771", 2.5},
            {"130", "Hoang Ngoc Quynh", "SE1772", 3.4},
            {"131", "Nguyen Anh Thu", "SE1773", 2.2},
            {"132", "Le Van Manh", "SE1773", 3.7},};

        DefaultTableModel model = new DefaultTableModel(data, columnName);
        JTable table = new JTable(model);
        //Cách viết khác: JTable table = new JTable(new DefaultTableModel(data, columnName))

        JFrame frame = new JFrame("JTable Example");

        //JScrollPane
        JScrollPane pane = new JScrollPane(table);

        pane.setBounds(50, 50, 400, 400);
        frame.add(pane);

        JButton btnAdd = new JButton("Add");
        btnAdd.setBounds(150, 480, 80, 30);

        JButton btnDel = new JButton("Delete");
        btnDel.setBounds(250, 480, 80, 30);

        JButton btnDisplay = new JButton("Display");
        btnDisplay.setBounds(350, 480, 80, 30);

        JButton btnSort = new JButton("Sort By Gpa");
        btnSort.setBounds(450, 480, 150, 30);

        frame.add(btnSort);
        frame.add(btnDisplay);
        frame.add(btnDel);
        frame.add(btnAdd);

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Scanner sc = new Scanner(System.in);
                String id = sc.nextLine();
                String fullName = sc.nextLine();
                String className = sc.nextLine();
                double gpa = Double.parseDouble(sc.nextLine());
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.addRow(new Object[]{id, fullName, className, gpa});
            }
        });

        btnDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRowIndex = table.getSelectedRow();
                if (selectedRowIndex != -1) {
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    model.removeRow(selectedRowIndex);
                    JOptionPane.showMessageDialog(null, "Delete Successfully !");
                } else {
                    JOptionPane.showMessageDialog(null, "Please select row to delete");
                }
            }
        });

        btnDisplay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int row = table.getRowCount();
                int col = table.getColumnCount();

                //Tạo Object vì vừa làm việc với số và với string sau muốn chuyển thì ép sang string hoặc int
                Object[][] data = new Object[row][col];
                for (int i = 0; i < row; i++) {
                    //table.getValueAt(row,col)
                    for (int j = 0; j < col; j++) {
                        data[i][j] = table.getValueAt(i, j);
                        System.out.println(data[i][j] + " ");
                    }
                    System.out.println("");
                }
            }
        });

        btnSort.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int row = table.getRowCount();
                int col = table.getColumnCount();

                //Tạo Object vì vừa làm việc với số và với string sau muốn chuyển thì ép sang string hoặc int
                Object[][] data = new Object[row][col];
                for (int i = 0; i < row; i++) {
                    //table.getValueAt(row,col)
                    for (int j = 0; j < col; j++) {
                        data[i][j] = table.getValueAt(i, j);
                        System.out.println(data[i][j] + " ");
                    }
                    System.out.println("");
                }
                Arrays.sort(data, new Comparator<Object[]>() {
                    @Override
                    public int compare(Object[] o1, Object[] o2) {
                        double gpa1 = (double) o1[3];
                        double gpa2 = (double) o2[3];
                        if (gpa1 > gpa2) {
                            return -1;
                        } else {
                            return 1;
                        }
                    }
                }
                );
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.setRowCount(0); //Xóa hết mọi hàng trong table.
                for(int i = 0; i < row ;i++){
                    model.addRow(data[i]);
                }
            }
        });

        frame.setSize(800, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

//        System.out.println(table.getColumnCount());
//        System.out.println(table.getRowCount());
    }

}
