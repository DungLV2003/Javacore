
import java.util.Arrays;
import java.util.Scanner;

public class Lab1_Bai5 {
    
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
        
    }

    

    public static void sao() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap m: ");
        int m = sc.nextInt();
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void f5(int arr[], int n) {
        Scanner sc = new Scanner(System.in);
        Arrays.sort(arr);
        int[] a = new int[n];
        int ArrIndex = 0;
        for (int i = 0, j = n - 1; i <= n / 2 || j > n / 2; i++, j--) {
            if (ArrIndex < n) {
                a[ArrIndex] = arr[i];
                ArrIndex++;
            }
            if (ArrIndex < n) {
                a[ArrIndex] = arr[j];
                ArrIndex++;
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = a[i];
        }
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

    }

    public static void main(String args[]) {
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
        
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        f5(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        sao();
    }
}
