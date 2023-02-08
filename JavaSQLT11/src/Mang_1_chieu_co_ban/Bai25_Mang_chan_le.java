
package Mang_1_chieu_co_ban;

import java.util.Scanner;

public class Bai25_Mang_chan_le {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int[] a = new int[10000];
        int chan = 0, le = 0;
        while(sc.hasNext()){
            int tmp =sc.nextInt();
            if(tmp % 2 == 0){
                ++chan;
            }
            else{
                ++le;
            }
        }
        if(chan < le) System.out.println("LE");
        else if (le < chan) System.out.println("CHAN");
        else System.out.println("CHANLE");
    }
}
