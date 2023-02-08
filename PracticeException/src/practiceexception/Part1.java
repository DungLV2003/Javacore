package practiceexception;

import java.util.Scanner;

public class Part1 {

    public static void main(String[] args) throws Exception {
        boolean cnt = false;
        do {
            try {
                int num;
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the number: ");
                num = sc.nextInt();
                if (num < 1) {
                    throw new Exception();
                }
                System.out.println("The number is " + num);
                cnt = false;
            } catch (Exception e) {
                System.out.println("The number is invalid");
                cnt = true;
            }
        } while (cnt);
    }
}
