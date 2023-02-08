
package String;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split("[^0-9]+");
        int[] num = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
            num[i] = Integer.parseInt(arr[i]);
        }
        System.out.println(arr.length);
    }
}
