package jdbctutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTutorial {

    public static void main(String[] args) {
        
        
        try {
            String url = "jdbc:sqlserver://LAPTOP-SQBHH25B\\MSSQLSERVER;databaseName=SQL_Basic;encrypt=true;trustServerCertificate=true";
            String username = "sa";
            String password = "0325325380";

            Connection con = DriverManager.getConnection(url, username, password);
            
            Statement stm = con.createStatement();
            String sql = "INSERT INTO SinhVien VALUES('SV009', 'Luong Thanh Huy','1999-02-12','Hai Phong',2.9, 'CNTT2')";
            
            //Thêm sửa xóa thì dùng excuteUpdate
//            int res = stm.executeUpdate(sql);
//            if(res > 0){
//                System.out.println("Insert successfully !");
//            }
//            else{
//                System.out.println("Error");
//            }
            
//            Muốn Select thì udngf executeQuery
//            String sql1 = "SELECT * FROM SinhVien";
            String sql1 = "SELECT * FROM SinhVien WHERE dia_chi = 'Hai Duong'";
            ResultSet rs = stm.executeQuery(sql1);
            while(rs.next()){
                System.out.println(rs.getString("ma_sinh_vien") + " " + rs.getString("ho_ten") + " " + rs.getString(3) + " " + rs.getString(4));
            }
            
            
            if (con != null) {
                System.out.println("Connect successfully !");
            } else {
                System.out.println("Connect failed !");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
