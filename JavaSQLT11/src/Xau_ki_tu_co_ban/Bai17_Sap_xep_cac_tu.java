package Xau_ki_tu_co_ban;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Bai17_Sap_xep_cac_tu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split("\\s+");

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        for(String x : arr){
            System.out.print(x + " ");
        }
        System.out.println("");
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
