package Vong_lap;

import java.util.Scanner;

public class Bai10_Kiem_tra_so_2022 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int check = 0;
        for (int i = 1; i <= n; i++) {
            int tmp = sc.nextInt();
            if (tmp == 2022) {
                check = 1;
            }
        }
        if (check == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
