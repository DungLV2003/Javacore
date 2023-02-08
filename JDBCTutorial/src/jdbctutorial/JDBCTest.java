package jdbctutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBCTest {

    public static void main(String[] args) {
        try {
            String url = "jdbc:sqlserver://LAPTOP-SQBHH25B\\MSSQLSERVER;databaseName=SQL_Basic;encrypt=true;trustServerCertificate=true";
            String username = "sa";
            String password = "0325325380";

            Connection con = DriverManager.getConnection(url, username, password);
            
//            String sql = "INSERT INTO SinhVien VALUES(?,?,?,?,?,?)";
//            
//            PreparedStatement stm = con.prepareStatement(sql);
//            stm.setString(1, "SV010");
//            stm.setString(2, "Le Huy Dung");
//            stm.setString(3, "2003-10-20");
//            stm.setString(4, "Ha Noi");
//            stm.setFloat(5, 3.4f );
//            stm.setString(6, "SE17117");
//            
//            stm.execute();
            
            //Từ giờ nên dùng prepareStatement để truyền tham sô vào hơn
            //là dùng thẳng statement


            String sql1 = "SELECT * FROM SinhVien Where dia_chi = ?";
            PreparedStatement stm1 = con.prepareStatement(sql1);
            Scanner sc = new Scanner(System.in);
            String diaChi = sc.nextLine();
            stm1.setString(1, diaChi);
            ResultSet rs = stm1.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6));
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
