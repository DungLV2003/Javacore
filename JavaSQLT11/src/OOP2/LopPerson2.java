package OOP2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Person1 {

    private String ten, ngaySinh, diaChi;

    public Person1() {
        ten = ngaySinh = diaChi = "";
    }

    public Person1(String ten, String ngaySinh, String diaChi) {
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

    public String getSortedName() {
        String[] arr = this.ten.split("\\s+");
        String res = arr[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            res += arr[i] + " ";
        }
        return res;
    }

    @Override
    public String toString() {
        return this.ten + " " + this.ngaySinh + " " + this.diaChi;
    }
}

class Student1 extends Person1 {

    private String maSinhVien, lop;
    private double gpa;

    public Student1(int maSinhVien, String lop, double gpa, String ten, String ngaySinh, String diaChi) {
        super(ten, ngaySinh, diaChi);
        this.maSinhVien = String.format("%04d", maSinhVien);
        this.lop = lop;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return this.maSinhVien + " " + super.toString() + " " + this.lop + " " + String.format("%.2f", this.gpa);
    }
}

public class LopPerson2 {

    public static void main(String[] args) {
        ArrayList<Student1> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String ten = sc.nextLine();
            String ngaySinh = sc.nextLine();
            String diaChi = sc.nextLine();
            String lop = sc.nextLine();
            double diem = sc.nextDouble();

            Student1 sinhVien = new Student1(i + 1, lop, diem, ten, ngaySinh, diaChi);
            sinhVien.chuanHoa();
            arr.add(sinhVien);
        }
        Collections.sort(arr, new Comparator<Student1>() {
            @Override
            public int compare(Student1 o1, Student1 o2) {
                return o1.getSortedName().compareTo(o2.getSortedName());
            }

        });
        for (Student1 x : arr) {
            System.out.println(x);
        }
    }
}
