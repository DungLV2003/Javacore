package OOP2;

import java.util.ArrayList;
import java.util.Scanner;

class Vehicle {

    private String ma, ten, hang, mauSac;
    private int giaBan;

    public Vehicle(String ma, String ten, String hang, String mauSac, int giaBan) {
        this.ma = ma;
        this.ten = ten;
        this.hang = hang;
        this.mauSac = mauSac;
        this.giaBan = giaBan;
    }

    public String getHang() {
        return hang;
    }

    public int getGiaBan() {
        return giaBan;
    }

    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + this.hang + " " + this.mauSac;
    }
}

class Oto extends Vehicle {

    private int maLuc;

    public Oto(int maLuc, String ma, String ten, String hang, String mauSac, int giaBan) {
        super(ma, ten, hang, mauSac, giaBan);
        this.maLuc = maLuc;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.maLuc + " " + super.getGiaBan();
    }

}

class XeMay extends Vehicle {

    private int tocDo;

    public XeMay(int tocDo, String ma, String ten, String hang, String mauSac, int giaBan) {
        super(ma, ten, hang, mauSac, giaBan);
        this.tocDo = tocDo;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.tocDo + " " + super.getGiaBan();
    }

}

public class Bai7_Vehicle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Vehicle> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String hang = sc.nextLine();
            String mau = sc.nextLine();
            int tmp = Integer.parseInt(sc.nextLine());
            int gia = Integer.parseInt(sc.nextLine());
            if (ma.substring(0, 2).equals("XM")) {
                XeMay xeMay = new XeMay(tmp, ma, ten, hang, mau, gia);
                arr.add(xeMay);
            } else {
                Oto oto = new Oto(tmp, ma, ten, hang, mau, gia);
                arr.add(oto);
            }
        }

        String hangXe = sc.nextLine();
        System.out.println("DANH SACH XE HANG " + hangXe + " :");
        for (Vehicle x : arr) {
            if ((x instanceof Oto) && x.getHang().equals(hangXe)) {
                System.out.println(x);
            }
        }

        for (Vehicle x : arr) {
            if ((x instanceof XeMay) && x.getHang().equals(hangXe)) {
                System.out.println(x);
            }

        }
    }
}
