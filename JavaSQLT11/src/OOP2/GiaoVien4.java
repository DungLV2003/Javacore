
package OOP2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Person5 {

    private String ten, ngaySinh, diaChi;

    public Person5( String ten, String ngaySinh, String diaChi) {
        
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
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

    public String getTen() {
        return ten;
    }

    @Override
    public String toString() {
        return  this.ten + " " + this.ngaySinh + " " + this.diaChi;
    }
}

class Student5 extends Person5 {

    private String maSinhVien, lop;
    private double gpa;

    public Student5(String maSinhVien, String lop, double gpa, String ten, String ngaySinh, String diaChi) {
        super(ten, ngaySinh, diaChi);
        this.maSinhVien = maSinhVien;
        this.lop = lop;
        this.gpa = gpa;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public String getLop() {
        return lop;
    }


    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return this.maSinhVien + " " + super.toString() + " " + this.lop + " " + String.format("%.2f", this.gpa);
    }

}

class Lecturer3 extends Person5 {

    private String maGiangVien, khoa, lop;
    private int luong;

    public Lecturer3(String maGiangVien, String khoa, String lop, int luong, String ten, String ngaySinh, String diaChi) {
        super(ten, ngaySinh, diaChi);
        this.maGiangVien = maGiangVien;
        this.khoa = khoa;
        this.lop = lop;
        this.luong = luong;
    }

    public String getMaGiangVien() {
        return maGiangVien;
    }

    public String getLop() {
        return lop;
    }


    public int getLuong() {
        return luong;
    }

    @Override
    public String toString() {
        return this.maGiangVien + " " + super.toString() + " " + this.khoa + " " + this.luong + " " + this.lop;
        
    }
}


public class GiaoVien4 {
    public static void main(String[] args) {
        ArrayList<Student5> arr1 = new ArrayList<>();
        ArrayList<Lecturer3> arr2 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine();
            if (ma.substring(0, 2).equals("GV")) {
                String ten = sc.nextLine();
                String ngaySinh = sc.nextLine();
                String diaChi = sc.nextLine();
                String khoa = sc.nextLine();
                int luong = Integer.parseInt(sc.nextLine());
                String lop = sc.nextLine();
                Lecturer3 lec = new Lecturer3(ma, khoa, lop ,luong, ten, ngaySinh, diaChi);
                lec.chuanHoa();
                arr2.add(lec);
            } else {
                String ten = sc.nextLine();
                String ngaySinh = sc.nextLine();
                String diaChi = sc.nextLine();
                String lop = sc.nextLine();
                double gpa = Double.parseDouble(sc.nextLine());
                Student5 student = new Student5(ma, lop, gpa,ten, ngaySinh, diaChi);
                student.chuanHoa();
                arr1.add(student);
            }
        }
        
        String lop = sc.nextLine();
        System.out.println("DANH SACH GIAO VIEN PHU TRACH LOP " + lop + " :");
        for (Lecturer3 x : arr2) {
            if(x.getLop().equals(lop))
                System.out.println(x);
        }
        System.out.println("DANH SACH SINH VIEN LOP " + lop + " :");
        for (Student5 x : arr1) {
            if(x.getLop().equals(lop))
            System.out.println(x);
        }
    }
}
