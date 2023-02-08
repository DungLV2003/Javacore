package OOP1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class NhanVien {

    private String ma, ten, gioiTinh, ngaySinh, diaChi, maSoThue, hopDong;

    public NhanVien(int ma, String ten, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String hopDong) {
        this.ma = String.format("%05d", ma);
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.hopDong = hopDong;
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

        StringBuilder sb2 = new StringBuilder(this.hopDong);
        if (sb2.charAt(1) == '/') {
            sb2.insert(0, "0");
        }
        if (sb2.charAt(4) == '/') {
            sb2.insert(3, "0");
        }
        this.hopDong = sb2.toString();

    }

    public void chuanHoa2() {
        String[] arr = this.ten.split("\\s+");
        StringBuilder sb = new StringBuilder("");
        for (String x : arr) {
            sb.append(Character.toUpperCase(x.charAt(0)));
            for (int j = 1; j < x.length(); j++) {
                sb.append(Character.toLowerCase(x.charAt(j)));
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        this.ten = sb.toString();
    }

    public String getNgaySinh() {
        return this.ngaySinh;
    }

    public String getMa() {
        return this.ma;
    }

    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + this.gioiTinh + " " + this.ngaySinh + " " + this.diaChi + " " + this.maSoThue + " " + this.hopDong;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<NhanVien> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ten = sc.nextLine();
            String gioiTinh = sc.nextLine();
            String ngaySinh = sc.nextLine();
            String diaChi = sc.nextLine();
            String maSoThue = sc.nextLine();
            String hopDong = sc.nextLine();
            NhanVien v = new NhanVien(i + 1, ten, gioiTinh, ngaySinh, diaChi, maSoThue, hopDong);
            v.chuanHoa1();
            arr.add(v);
        }
        Collections.sort(arr, new Comparator<NhanVien>() {
            public int compare(NhanVien a, NhanVien b) {
                String[] arr1 = a.getNgaySinh().split("/");
                String[] arr2 = b.getNgaySinh().split("/");
                String tmp1 = arr1[2] + arr1[1] + arr1[0];
                String tmp2 = arr2[2] + arr2[1] + arr2[0];
                if(!tmp1.equals(tmp2)){
                    return tmp1.compareTo(tmp2);
                }
                else return a.getMa().compareTo(b.getMa());
            }

        });
        for(NhanVien x : arr){
            System.out.println(x);
        }
    }

}
