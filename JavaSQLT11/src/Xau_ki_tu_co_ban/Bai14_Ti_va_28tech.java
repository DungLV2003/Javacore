package Xau_ki_tu_co_ban;

import java.util.Scanner;

public class Bai14_Ti_va_28tech {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        String[] arr = s.split("\\s+");
        int cnt = 0;
        for (String x : arr) {
            if (x.equals("28tech")) {
                ++cnt;
            }
        }
        System.out.println(cnt);
    }

}
