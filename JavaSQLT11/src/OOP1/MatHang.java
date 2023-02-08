package OOP1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MatHang {

    private String maMatHang, tenMatHang, donViTinh;
    private int giaMua, giaBan;

    public MatHang(int maMatHang, String tenMatHang, String donViTinh, int giaMua, int giaBan) {
        this.maMatHang = "MH" + String.format("%04d", maMatHang);
        this.tenMatHang = tenMatHang;
        this.donViTinh = donViTinh;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public int getLoiNhuan() {
        return this.giaBan - this.giaMua;
    }

    public String getMatHang() {
        return this.maMatHang;
    }

    @Override
    public String toString() {
        return this.maMatHang + " " + this.tenMatHang + " " + this.donViTinh + " " + this.giaMua + " " + this.giaBan + " " + this.getLoiNhuan();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<MatHang> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String tenMaHang = sc.nextLine();
            String donVi = sc.nextLine();
            int mua = sc.nextInt(), ban = sc.nextInt();
            arr.add(new MatHang((int)(i + 1), tenMaHang, donVi, mua, ban));
        }
        Collections.sort(arr, new Comparator<MatHang>() {
            @Override
            public int compare(MatHang a, MatHang b) {
                if (a.getLoiNhuan() != b.getLoiNhuan()) {
                    return b.getLoiNhuan() - a.getLoiNhuan();
                } else {
                    return a.getMatHang().compareTo(b.getMatHang());
                }
            }

        });
        for (MatHang x : arr) {
            System.out.println(x);
        }
    }

}
