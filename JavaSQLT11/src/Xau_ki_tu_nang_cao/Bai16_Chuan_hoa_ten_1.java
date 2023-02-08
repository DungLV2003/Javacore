
package Xau_ki_tu_nang_cao;

import java.util.Scanner;

public class Bai16_Chuan_hoa_ten_1 {
    
    public static String chuanHoaTen(String s){
        String[] arr = s.split("\\s+");
        String name = "";
        for(String x : arr){
            name += Character.toUpperCase(x.charAt(0));
            for(int j = 1; j < x.length(); j++){
                name += Character.toLowerCase(x.charAt(j));
            }
            name += " ";
        }
        return name.substring(0, name.length() - 1); // xoa dau enter cuoi cung
    }
    
    public static String chuanHoaNS(String s){
        StringBuilder sb = new StringBuilder(s);
        if(sb.charAt(1) == '/') sb.insert(0, "0");
        if(sb.charAt(4) == '/') sb.insert(3, "0");
        return sb.toString();
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(chuanHoaTen(s));
        System.out.println(chuanHoaNS(t));
    }
}
