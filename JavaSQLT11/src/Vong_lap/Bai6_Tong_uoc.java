package Vong_lap;

import java.util.Scanner;

public class Bai6_Tong_uoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n  = sc.nextLong();
        long sum = 0;
        for(int i = 1; i  <= Math.sqrt(n); i++){
            if(n % i == 0){
                sum += i;
                if(i != n / i) // tru truong hop so chinh phuong
                    sum += n / i;  // uoc con lai
            }
        }
        System.out.println(sum);
    }
}
