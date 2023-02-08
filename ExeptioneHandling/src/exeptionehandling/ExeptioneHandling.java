package exeptionehandling;

import java.util.Scanner;

public class ExeptioneHandling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int[] a = new int[10];
        boolean error = false;
        do {
            error = false;
            try {
                System.out.print("Enter the number of integers, n = ");
                n = Integer.parseInt(sc.nextLine());
                if (n <= 0) {
                    System.out.println("n must be > 0");
                    error = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("n must be a number");
                error = true;
            }
        } while (error);

        for (int i = 0; i < n; i++) {
            do {
                error = false;
                try {
                    System.out.print("Enter a[" + i + "] = ");
                    a[i] = Integer.parseInt(sc.nextLine());
                    if (a[i] < 6 || a[i] > 18) {
                        System.out.println("The number must be >=6 and <=18");
                        error = true;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("The number must be >=6 and <=18");
                    error = true;
                }
            } while (error);
        }

        System.out.print("The array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
