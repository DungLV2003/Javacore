
package Xau_ki_tu_co_ban;

import java.util.Scanner;

public class Bai15_Tu_chan_le {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split("\\s+");
        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 0){
                System.out.print(arr[i] + " ");
            }
            else{
                StringBuilder sb = new StringBuilder(arr[i]);
                System.out.print(sb.reverse().toString() + " ");
            }
        }
    }
}
