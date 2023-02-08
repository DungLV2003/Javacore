
package Xau_ki_tu_co_ban;

import java.util.Arrays;
import java.util.Scanner;

public class Bai6_Sap_xep_chu_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        for(int i = 0; i < arr.length;i++){
            if(arr[i] != '0' || i == arr.length - 1){
                System.out.print(arr[i]);
            }
        }
    }
}
