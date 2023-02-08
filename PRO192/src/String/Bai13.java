
package String;

import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reverseS = "";
        for(int i = s.length()/2; i >= 0; i--){
            reverseS = reverseS + s.charAt(i);
        }
        System.out.println(reverseS);
    }
}
