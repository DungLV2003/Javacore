
package OOP1;

import java.util.Scanner;

public class sinhVien1 {
    
    private String maSinhVien;
    private String hoTen;
    private String lop;
    private String ngaySinh;
    private float gpa;

    public sinhVien1(String maSinhVien, String hoTen, String lop, String ngaySinh, float gpa) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.gpa = gpa;
    }
    
    public void chuanHoa(){
        StringBuilder sb = new StringBuilder(this.ngaySinh);
        if(sb.charAt(1) == '/') sb.insert(0, "0");
        if(sb.charAt(4) == '/') sb.insert(3, "0");
        this.ngaySinh = sb.toString();
    }

    @Override
    public String toString() {
        return this.maSinhVien + " " + this.hoTen + " " + this.lop + " " + this.ngaySinh + " " + String.format("%.1f", gpa);
    }
    
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sinhVien1 s = new sinhVien1("SV001", sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextFloat());
        s.chuanHoa();
        System.out.println(s);
    }
    
}
