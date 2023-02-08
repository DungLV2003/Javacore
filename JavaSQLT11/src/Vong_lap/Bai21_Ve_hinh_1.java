
package Vong_lap;

import java.util.Scanner;

public class Bai21_Ve_hinh_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
		for(int j =1; j <= n; j++) {
			                 System.out.print("*");
		}
		          System.out.print("\n");
	}
	       System.out.print("\n");
	
	for(int i = 1; i <= n; i++) {
		for (int j =1; j <= n; j++){
			if(j == 1 || j == n || i == 1 || i == n) 
				                    System.out.print("*");
			else System.out.print(" ");
		}
			         System.out.print("\n");
	}
	       System.out.print("\n");
	
	for(int i = 1; i <= n; i++) {
		for (int j =1; j <= n; j++){
			if(i == 1 || i == n || j == 1 || j == n) 
				                System.out.print("*");
			else System.out.print("#");
		}
			         System.out.print("\n");
	}
	       System.out.print("\n");
	
	for(int i = 1; i <= n; i++) {
		for (int j =1; j <= n; j++){
			if(i == 1 || i == n || j == 1 || j == n) 
                          System.out.print(i + " ");
			else System.out.print("  ");
		}
			         System.out.print("\n");
	}
	       System.out.print("\n");
    }
}
