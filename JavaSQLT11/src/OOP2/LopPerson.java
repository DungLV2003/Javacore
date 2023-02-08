
package OOP2;

import java.util.Scanner;

 class Person {
    private String ten, ngaySinh, diaChi;
    
    public Person(){
        ten = ngaySinh = diaChi = "";
    }

    public Person(String ten, String ngaySinh, String diaChi) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }
    
    public void chuanHoa(){
        String[] arr = this.ten.split("\\s+");
        String res = "";
        for(String x : arr){
            res += Character.toUpperCase(x.charAt(0));
            for(int j = 1;  j < x.length(); j++){
                res += Character.toLowerCase(x.charAt(j));
            }
            res += " ";
        }
        this.ten = res.substring(0, res.length() -1);
        StringBuilder sb = new StringBuilder(this.ngaySinh);
        if(sb.charAt(1) == '/') sb.insert(0, "0");
        if(sb.charAt(4) == '/') sb.insert(3, "0");
        this.ngaySinh = sb.toString();
    }
    
    @Override
    public String toString(){
        return this.ten + " " + this.ngaySinh + " " + this.diaChi;
    }
}


class Student extends Person{
    private String maSinhVien,lop;
    private double gpa;

    public Student(int maSinhVien, String lop, double gpa, String ten, String ngaySinh, String diaChi) {
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

public class LopPerson{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i< n; i++){
            sc.nextLine();
            String ten = sc.nextLine();
            String s = sc.nextLine();
            String lop = sc.nextLine();
            double diem = sc.nextDouble();
            String ngaySinh = "", diaChi = "";
            for(char x : s.toCharArray()){
                if(Character.isDigit(x) || x == '/'){
                    ngaySinh += x;
                }
                else diaChi += x;
            }
            Student sinhVien = new Student(i + 1, lop, diem, ten, ngaySinh, diaChi);
            sinhVien.chuanHoa();
            System.out.println(sinhVien);
        }
    }
}
