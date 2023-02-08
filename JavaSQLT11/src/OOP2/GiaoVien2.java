package OOP2;

import java.util.ArrayList;
import java.util.Scanner;

class Person3 {

    private String ma, ten, ngaySinh, diaChi;

    public Person3(String ma, String ten, String ngaySinh, String diaChi) {
        this.ma = ma;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + this.ngaySinh + " " + this.diaChi;

    }

    public void chuanHoa() {
        String[] arr = this.ten.split("\\s+");
        String res = "";
        for (String x : arr) {
            res += Character.toUpperCase(x.charAt(0));
            for (int j = 1; j < x.length(); j++) {
                res += Character.toLowerCase(x.charAt(j));
            }
            res += " ";
        }
        this.ten = res.substring(0, res.length() - 1);
        StringBuilder sb = new StringBuilder(this.ngaySinh);
        if (sb.charAt(1) == '/') {
            sb.insert(0, "0");
        }
        if (sb.charAt(4) == '/') {
            sb.insert(3, "0");
        }
        this.ngaySinh = sb.toString();
    }

}

class Student3 extends Person3 {

    private String lop;
    private double gpa;

    public Student3(String lop, double gpa, String ma, String ten, String ngaySinh, String diaChi) {
        super(ma, ten, ngaySinh, diaChi);
        this.lop = lop;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.lop + " " + String.format("%.2f", this.gpa);
    }

}

class Lecturer1 extends Person3 {

    private String khoa, lop;
    private int luong;

    public Lecturer1(String khoa, int luong, String lop, String ma, String ten, String ngaySinh, String diaChi) {
        super(ma, ten, ngaySinh, diaChi);
        this.khoa = khoa;
        this.luong = luong;
        this.lop = lop;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.khoa + " " + this.luong;
    }

}

public class GiaoVien2 {

    public static void main(String[] args) {
        ArrayList<Student3> arr1 = new ArrayList<>();
        ArrayList<Lecturer1> arr2 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String ngaySinh = sc.nextLine();
            String diaChi = sc.nextLine();
            if (ma.substring(0, 2).equals("GV")) {
                String khoa = sc.nextLine();
                int luong = Integer.parseInt(sc.nextLine());

                String lop = sc.nextLine();
                Lecturer1 lec = new Lecturer1(khoa, luong, lop, ma, ten, ngaySinh, diaChi);
                lec.chuanHoa();
                arr2.add(lec);
            } else {
                String lop = sc.nextLine();
                double gpa = Double.parseDouble(sc.nextLine());

                Student3 student = new Student3(lop, gpa, ma, ten, ngaySinh, diaChi);
                student.chuanHoa();
                arr1.add(student);
            }
        }

        String diaChi = sc.nextLine();
        System.out.println("DANH SACH GIAO VIEN CO DIA CHI TAI " + diaChi + " :");
        for (Lecturer1 x : arr2) {
            if (x.getDiaChi().equals(diaChi))
            System.out.println(x);
        }
        System.out.println("DANH SACH SINH VIEN CO DIA CHI TAI " + diaChi + " :");
        for (Student3 x : arr1) {
            if (x.getDiaChi().equals(diaChi))
            System.out.println(x);
        }
    }
}
