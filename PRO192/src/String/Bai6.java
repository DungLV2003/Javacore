
package String;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int digit = 0;
        for(char x : s.toCharArray()){
            if(Character.isDigit(x))
                ++digit;
        }
        System.out.println(digit);
    }
}
