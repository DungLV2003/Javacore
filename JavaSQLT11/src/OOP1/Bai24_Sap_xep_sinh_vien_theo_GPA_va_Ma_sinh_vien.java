package OOP1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Bai24_Sap_xep_sinh_vien_theo_GPA_va_Ma_sinh_vien {

    private String maSinhVien, hoTen, ngaySinh, lop;
    private float gpa;

    public Bai24_Sap_xep_sinh_vien_theo_GPA_va_Ma_sinh_vien(int maSinhVien, String hoTen, String lop, String ngaySinh, float gpa) {
        this.maSinhVien = String.format("%03d", maSinhVien);
        this.maSinhVien = "SV" + this.maSinhVien;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.lop = lop;
        this.gpa = gpa;
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

        String[] arr = this.hoTen.split("\\s+");
        String res = "";
        for (String x : arr) {
            res += Character.toUpperCase(x.charAt(0));
            for (int j = 1; j < x.length(); j++) {
                res += Character.toLowerCase(x.charAt(j));
            }
            res += " ";
        }
        res = res.substring(0, res.length() - 1);
        this.hoTen = res;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return this.maSinhVien + " " + this.hoTen + " " + this.lop + " " + this.ngaySinh + " " + String.format("%.2f", gpa);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Bai24_Sap_xep_sinh_vien_theo_GPA_va_Ma_sinh_vien[] arr = new Bai24_Sap_xep_sinh_vien_theo_GPA_va_Ma_sinh_vien[n];
        for (int i = 0; i < n; i++) {
            sc.nextLine(); //tranh troi lenh
            arr[i] = new Bai24_Sap_xep_sinh_vien_theo_GPA_va_Ma_sinh_vien(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextFloat());
            arr[i].chuanHoa1();
        }
        Arrays.sort(arr, new Comparator<Bai24_Sap_xep_sinh_vien_theo_GPA_va_Ma_sinh_vien>() {
            @Override
            public int compare(Bai24_Sap_xep_sinh_vien_theo_GPA_va_Ma_sinh_vien o1, Bai24_Sap_xep_sinh_vien_theo_GPA_va_Ma_sinh_vien o2) {
                if (o1.getGpa() != o2.getGpa()) {
                    if (o1.getGpa() > o2.getGpa()) {
                        return -1;
                    } else {
                        return 1;
                    }
                } else {
                    return o1.getMaSinhVien().compareTo(o2.getMaSinhVien());
                }

            }

        });
        for (Bai24_Sap_xep_sinh_vien_theo_GPA_va_Ma_sinh_vien x : arr) {
            System.out.println(x);
        }
    }

}
