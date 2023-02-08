
package Xau_ki_tu_co_ban;

import java.util.Scanner;

public class Bai13_Liet_ke_tu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = "";
        for(char x : s.toCharArray()){
            if(x == '.' || x == '!' || x == ',' || x =='?'){
                t += " ";
            }
            else{
                t += x;
            }
        }
        String[] arr = s.split("\\s+");
        int dem = 0;
        for(String x : arr){
            System.out.println( x + " ");
        }
    }
}
