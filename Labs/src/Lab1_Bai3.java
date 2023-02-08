
import java.util.Scanner;


public class Lab1_Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap m: ");
        int m = sc.nextInt();
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        for(int i = 1; i <= m ; i++){
            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
