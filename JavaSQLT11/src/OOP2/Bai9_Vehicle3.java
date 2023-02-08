
package OOP2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Vehicle2 {

    private String ma, ten, hang, mauSac;
    private int giaBan;

    public Vehicle2(String ma, String ten, String hang, String mauSac, int giaBan) {
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

class Oto2 extends Vehicle2 {

    private int maLuc;

    public Oto2(int maLuc, String ma, String ten, String hang, String mauSac, int giaBan) {
        super(ma, ten, hang, mauSac, giaBan);
        this.maLuc = maLuc;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.maLuc + " " + super.getGiaBan();
    }

}

class XeMay2 extends Vehicle2 {

    private int tocDo;

    public XeMay2(int tocDo, String ma, String ten, String hang, String mauSac, int giaBan) {
        super(ma, ten, hang, mauSac, giaBan);
        this.tocDo = tocDo;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.tocDo + " " + super.getGiaBan();
    }

}

class SortXeMayByGia1 implements Comparator<XeMay2>{

    @Override
    public int compare(XeMay2 o1, XeMay2 o2) {
        if(o1.getGiaBan() != o2.getGiaBan())
            return o2.getGiaBan() - o1.getGiaBan();
        else 
            return o1.getMa().compareTo(o2.getMa());
    }
}

class SortOtoByGia1 implements Comparator<Oto2>{

    @Override
    public int compare(Oto2 o1, Oto2 o2) {
        if(o1.getGiaBan() != o2.getGiaBan())
            return o2.getGiaBan() - o1.getGiaBan();
        else 
            return o1.getMa().compareTo(o2.getMa());
    }
}

public class Bai9_Vehicle3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<XeMay2> arr1 = new ArrayList<>();
        ArrayList<Oto2> arr2 = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String ma = sc.nextLine();
            if(ma.substring(0, 2).equals("XM")){
                String ten = sc.nextLine();
                String hang = sc.nextLine();
                String mau = sc.nextLine();
                int tocDo = Integer.parseInt(sc.nextLine());
                int giaBan = Integer.parseInt(sc.nextLine());
                XeMay2 xemay = new XeMay2(tocDo, ma, ten, hang, mau, giaBan);
                arr1.add(xemay);
            }
            else{
                String ten = sc.nextLine();
                String hang = sc.nextLine();
                String mau = sc.nextLine();
                int maLuc = Integer.parseInt(sc.nextLine());
                int giaBan = Integer.parseInt(sc.nextLine());
                Oto2 oto = new Oto2(maLuc, ma, ten, hang, mau, giaBan);
                arr2.add(oto);
            }
        }
        int minPrice = sc.nextInt();
        int maxPrice = sc.nextInt();
        System.out.println("DANH SACH OTO :");
        for(Oto2 x : arr2){
            if(x.getGiaBan() >= minPrice && x.getGiaBan() <= maxPrice)
                System.out.println(x);
        }
        System.out.println("DANH SACH XE MAY :");
        for(XeMay2 x : arr1){
            if(x.getGiaBan() >= minPrice && x.getGiaBan() <= maxPrice)
                System.out.println(x);
        }
    }
}
