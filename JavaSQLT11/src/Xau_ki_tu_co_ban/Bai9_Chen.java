
package Xau_ki_tu_co_ban;

import java.util.Scanner;

public class Bai9_Chen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        StringBuilder sb = new StringBuilder(s);
        sb = sb.insert(k, "28tech");
        System.out.println(sb.toString());
    }
}
