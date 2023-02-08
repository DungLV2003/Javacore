package String;


import java.util.Scanner;

public class Bai11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        int count = 0, fromIndex = 0;
        while ((fromIndex = s.indexOf(t, fromIndex)) != -1) {
            count++;
            fromIndex++;
        }
        System.out.println(count);
    }
}
