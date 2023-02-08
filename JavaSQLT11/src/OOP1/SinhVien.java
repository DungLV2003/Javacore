package OOP1;

import java.util.Scanner;

public class SinhVien {

    private String hoTen;
    private String ngaySinh;
    private double mon1, mon2, mon3;

    public SinhVien(String hoTen, String ngaySinh, double mon1, double mon2, double mon3) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
    }

    @Override
    public String toString() {
        return this.hoTen + " " + this.ngaySinh + " " + String.format("%.1f", this.mon1 + this.mon2 + this.mon3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien s = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println(s);
    }
}
