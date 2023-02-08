package OOP1;

import java.util.Scanner;

public class NhanVien1 {

    private String maNhanVien;
    private String hoTen;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private String maSoThue;
    private String ngayKiHopDong;

    public NhanVien1(String maNhanVien, String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String ngayKiHopDong) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.ngayKiHopDong = ngayKiHopDong;
    }

    public void chuanHoa1() {
        StringBuilder sb = new StringBuilder(this.ngaySinh);
        if (sb.charAt(1) == '/') {
            sb.insert(0, "0");
        }
        if (sb.charAt(4) == '/') {
            sb.insert(3, "0");
        }
        this.ngaySinh = sb.toString();
        
    }
    
     public void chuanHoa2() {
        StringBuilder sb = new StringBuilder(this.ngayKiHopDong);
        if (sb.charAt(1) == '/') {
            sb.insert(0, "0");
        }
        if (sb.charAt(4) == '/') {
            sb.insert(3, "0");
        }
        this.ngayKiHopDong = sb.toString();
        
    }


    @Override
    public String toString() {
        return this.maNhanVien + " " + this.hoTen + " " + this.gioiTinh + " "
                + this.ngaySinh + " " + this.diaChi + " "
                + this.maSoThue + " " + this.ngayKiHopDong;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien1 s = new NhanVien1("00001", sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        s.chuanHoa1();
        s.chuanHoa2();
        System.out.println(s);
    }

}
