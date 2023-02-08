
package Xau_ki_tu_co_ban;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Bai20_Cac_tu_thuan_nghich {
    
    public static boolean check(String s){
        StringBuilder sb = new StringBuilder(s);
        return s.equals(sb.reverse().toString()); 
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<String> a = new ArrayList<>();
        String[] arr = s.split("\\s+");
        for(String x : arr){
            if(check(x)){
                a.add(x);
            }
        }
        Collections.sort(a);
        for(String x : a){
            System.out.print(x + " ");
        }
    }
}
