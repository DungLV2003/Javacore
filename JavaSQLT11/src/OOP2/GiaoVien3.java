package OOP2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Person4 {

    private String ma, ten, ngaySinh, diaChi;

    public Person4(String ma, String ten, String ngaySinh, String diaChi) {
        this.ma = ma;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getMa() {
        return ma;
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

class Student4 extends Person4 {

    private String lop;
    private double gpa;

    public Student4(String lop, double gpa, String ma, String ten, String ngaySinh, String diaChi) {
        super(ma, ten, ngaySinh, diaChi);
        this.lop = lop;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.lop + " " + String.format("%.2f", this.gpa);
    }

}

class Lecturer2 extends Person4 {

    private String khoa;
    private int luong;

    public Lecturer2(String khoa, int luong, String ma, String ten, String ngaySinh, String diaChi) {
        super(ma, ten, ngaySinh, diaChi);
        this.khoa = khoa;
        this.luong = luong;

    }

    public int getLuong() {
        return luong;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.khoa + " " + this.luong;
    }

}

public class GiaoVien3 {

    public static void main(String[] args) {
        ArrayList<Student4> arr1 = new ArrayList<>();
        ArrayList<Lecturer2> arr2 = new ArrayList<>();
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
                Lecturer2 lec = new Lecturer2(khoa, luong, ma, ten, ngaySinh, diaChi);
                lec.chuanHoa();
                arr2.add(lec);
            } else {
                String lop = sc.nextLine();
                double gpa = Double.parseDouble(sc.nextLine());
                Student4 student = new Student4(lop, gpa, ma, ten, ngaySinh, diaChi);
                student.chuanHoa();
                arr1.add(student);
            }
        }
        
        Collections.sort(arr2, new Comparator<Lecturer2>() {
            @Override
            public int compare(Lecturer2 o1, Lecturer2 o2) {
                if (o1.getLuong() != o2.getLuong()) {
                    return o2.getLuong() - o1.getLuong();
                } else {
                    return o1.getMa().compareTo(o2.getMa());
                }
            }

        });
        System.out.println("DANH SACH GIAO VIEN :");
        for (Lecturer2 x : arr2) {
            System.out.println(x);
        }
        Collections.sort(arr1, new Comparator<Student4>() {
            @Override
            public int compare(Student4 o1, Student4 o2) {
                if (o1.getGpa() != o2.getGpa()) {
                    if (o1.getGpa() > o2.getGpa()) {
                        return -1;
                    }
                    return 1;
                } else {
                    return o1.getMa().compareTo(o2.getMa());
                }
            }

        });
        System.out.println("DANH SACH SINH VIEN :");
        for (Student4 x : arr1) {
            System.out.println(x);
        }
    }
}
