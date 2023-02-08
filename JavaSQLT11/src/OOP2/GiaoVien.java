package OOP2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

class Person2 {

    private String ma, ten, ngaySinh, diaChi;

    public Person2(String ma, String ten, String ngaySinh, String diaChi) {
        this.ma = ma;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
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

class Student2 extends Person2 {

    private String lop;
    private double gpa;

    public Student2(String lop, double gpa, String ma, String ten, String ngaySinh, String diaChi) {
        super(ma, ten, ngaySinh, diaChi);
        this.lop = lop;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.lop + " " + String.format("%.2f", this.gpa);
    }

}

class Lecturer extends Person2 {

    private String khoa;
    private int luong;

    public Lecturer(String khoa, int luong, String ma, String ten, String ngaySinh, String diaChi) {
        super(ma, ten, ngaySinh, diaChi);
        this.khoa = khoa;
        this.luong = luong;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.khoa + " " + this.luong;
    }

}

public class GiaoVien {
    public static void main(String[] args) {
        ArrayList<Student2> arr1 = new ArrayList<>();
        ArrayList<Lecturer> arr2 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            sc.nextLine();
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String ngaySinh = sc.nextLine();
            String diaChi = sc.nextLine();
            if(ma.substring(0, 2).equals("GV")){
                String khoa = sc.nextLine();
                int luong = sc.nextInt();
                Lecturer lec = new Lecturer(khoa, luong, ma, ten, ngaySinh, diaChi);
                lec.chuanHoa();
                arr2.add(lec);
            }
            else{
                String lop = sc.nextLine();
                double gpa = sc.nextDouble();
                Student2 student = new Student2(lop, gpa, ma, ten, ngaySinh, diaChi);
                student.chuanHoa();
                arr1.add(student);
            }
        }
        System.out.println("DANH SACH GIAO VIEN :");
        for(Lecturer x : arr2){
            System.out.println(x);
        }
        System.out.println("DANH SACH SINH VIEN :");
        for(Student2 x : arr1){
            System.out.println(x);
        }
    }
}
