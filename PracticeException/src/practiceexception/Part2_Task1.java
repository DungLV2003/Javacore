
package practiceexception;

import java.util.Scanner;

public class Part2_Task1 {
    public static void main(String[] args) {
        boolean cnt = false;
        do{
            try {
                String s = "";
                String patter ="^[0-9]+$";
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the string:");
                s = sc.nextLine();
                if(! s.matches(patter)) throw new Exception();
                System.out.println("The string is " + s);
                cnt = false;
            } catch (Exception e) {
                System.out.println("The string is invalid");
                cnt = true;
            }
        }while(cnt);
    }
}
