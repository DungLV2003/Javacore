
package OOP1;

import java.util.Scanner;


public class TuyenSinh {
    
    private String maThiSinh, hoTen;
    private double toan, ly, hoa;

    public TuyenSinh(String maThiSinh, String hoTen, double toan, double ly, double hoa) {
        this.maThiSinh = maThiSinh;
        this.hoTen = hoTen;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    
    public double getTongDiem(){
        String khuVuc = this.maThiSinh.substring(0, 3);
        double tong = toan + ly + hoa;
        if(khuVuc.equals("KV1")) tong += 0.5;
        else if(khuVuc.equals("KV2")) tong += 1;
        else tong += 2.5;
        return tong;
    }
    

    @Override
    public String toString() {
        String res = this.maThiSinh + " " + this.hoTen + " " + this.maThiSinh.charAt(2) + " ";
        double tongDiem = this.getTongDiem();
        if(tongDiem == (int)tongDiem) res+= String.format("%.0f", tongDiem);
        else res += String.format("%.1f", tongDiem);
        if(tongDiem >= 24) res = res + " " + "TRUNG TUYEN";
        else res = res + " " + "TRUOT";
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String maThiSinh = sc.nextLine(), hoTen = sc.nextLine();
        double toan = sc.nextDouble(),ly = sc.nextDouble(),hoa = sc.nextDouble();
        TuyenSinh s = new TuyenSinh(maThiSinh, hoTen, toan, ly, hoa);
        System.out.println(s);
    }
}
