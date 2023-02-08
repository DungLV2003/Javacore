
package String;

import java.util.Scanner;


public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int num = 0, res = 0;
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i)))
                num = num * 10 +(s.charAt(i) - '0');
            else{
                res = Math.max(res, num);
                num = 0; //Reset the number
            }
        }
        System.out.println(Math.max(res, num));
    }
}
