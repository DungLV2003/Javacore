
package Xau_ki_tu_co_ban;

import java.util.Scanner;

public class Bai5_Chen_dau_phay {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = "";
        int dem = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            ++dem;
            res += s.charAt(i);
            if(dem % 3 == 0 && i != 0) res += ",";
        }
        for(int i = res.length() - 1; i >= 0; i--){
            System.out.print(res.charAt(i));
        }
    }
}
