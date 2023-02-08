package String;

import java.util.Scanner;

public class Bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for(char x : s.toCharArray()){
            if(Character.isDigit(x)){
                int a = Integer.parseInt(String.valueOf(x));
                sum += a;
            }
        }
        System.out.println(sum);
    }
}
