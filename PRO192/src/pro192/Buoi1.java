
package pro192;

import java.util.Scanner;


//Tools - Option - Editor - Code Templates

public class Buoi1 {
    
    // if, if else, switch 
    // doc slide 2B va thuc hanh 
    
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
             a[i] =sc.nextInt();
        }
        for(int i =0 ; i < n; i++){
            System.out.println(a[i] + " ");
        }
        
                
    }
    
}
