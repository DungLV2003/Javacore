
import java.util.Scanner;


public class Lab1_Bai1 {

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int n = sc.nextInt();
        
        int tmp = 0;
        for(int i = 2; i <= n/2; ++i){
            if(isPrime(i)){
                if(isPrime(n - i)){
                    System.out.println(i + " " + (n-i));
                    tmp = 1;
                }
            }
        }
        if(tmp == 0){
            System.out.println(n + " cannot be expressed as the sum of two prime numbers");
        }
    }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int n = sc.nextInt();
        
        int tmp = 0;
        for(int i = 2; i <= n/2; ++i){
            if(isPrime(i)){
                if(isPrime(n - i)){
                    System.out.println(i + " " + (n-i));
                    tmp = 1;
                }
            }
        }
        if(tmp == 0){
            System.out.println(n + " cannot be expressed as the sum of two prime numbers");
        }
    }
}
