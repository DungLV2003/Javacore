
package OOP2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Vehicle1 {

    private String ma, ten, hang, mauSac;
    private int giaBan;

    public Vehicle1(String ma, String ten, String hang, String mauSac, int giaBan) {
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

    public String getMa() {
        return ma;
    }
    
    

    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + this.hang + " " + this.mauSac;
    }
}

class Oto1 extends Vehicle1 {

    private int maLuc;

    public Oto1(int maLuc, String ma, String ten, String hang, String mauSac, int giaBan) {
        super(ma, ten, hang, mauSac, giaBan);
        this.maLuc = maLuc;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.maLuc + " " + super.getGiaBan();
    }

}

class XeMay1 extends Vehicle1 {

    private int tocDo;

    public XeMay1(int tocDo, String ma, String ten, String hang, String mauSac, int giaBan) {
        super(ma, ten, hang, mauSac, giaBan);
        this.tocDo = tocDo;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.tocDo + " " + super.getGiaBan();
    }

}

class SortXeMayByGia implements Comparator<XeMay1>{

    @Override
    public int compare(XeMay1 o1, XeMay1 o2) {
        if(o1.getGiaBan() != o2.getGiaBan())
            return o2.getGiaBan() - o1.getGiaBan();
        else 
            return o1.getMa().compareTo(o2.getMa());
    }
}

class SortOtoByGia implements Comparator<Oto1>{

    @Override
    public int compare(Oto1 o1, Oto1 o2) {
        if(o1.getGiaBan() != o2.getGiaBan())
            return o2.getGiaBan() - o1.getGiaBan();
        else 
            return o1.getMa().compareTo(o2.getMa());
    }
}

public class Bai8_Vehicle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<XeMay1> arr3 = new ArrayList<>();
        ArrayList<Oto1> arr4 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String hang = sc.nextLine();
            String mau = sc.nextLine();
            int tmp = Integer.parseInt(sc.nextLine());
            int gia = Integer.parseInt(sc.nextLine());
            if (ma.substring(0, 2).equals("XM")) {
                XeMay1 xeMay = new XeMay1(tmp, ma, ten, hang, mau, gia);
                arr3.add(xeMay);
            } else {
                Oto1 oto = new Oto1(tmp, ma, ten, hang, mau, gia);
                arr4.add(oto);
            }
        }
        Collections.sort(arr3, new SortXeMayByGia());
        Collections.sort(arr4, new SortOtoByGia());
        System.out.println("DANH SACH OTO :");
        for(Oto1 x : arr4){
            System.out.println(x);
        }
        System.out.println("DANH SACH XE MAY :");
        for(XeMay1 x : arr3){
            System.out.println(x);
        }
    }
}
