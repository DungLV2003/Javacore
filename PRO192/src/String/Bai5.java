package String;

import java.util.Scanner;

public class Bai5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] cnt = new int[256];
        for (char x : s.toCharArray()) {
            if (Character.isAlphabetic(x)) {
                cnt[x]++;
            }
        }
        for (int i = 0; i < 256; i++) {
            if (cnt[i] != 0) {
                System.out.println((char) i + " " + cnt[i]);
            }
        }

    }
}
