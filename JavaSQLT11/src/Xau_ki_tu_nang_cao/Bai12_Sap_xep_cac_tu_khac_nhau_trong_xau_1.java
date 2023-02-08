package Xau_ki_tu_nang_cao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class Bai12_Sap_xep_cac_tu_khac_nhau_trong_xau_1 {

    public static boolean check(String s) {
        StringBuilder sb = new StringBuilder(s);
        return s.equals(sb.reverse().toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split("\\s+");
        ArrayList<String> a = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        for (String x : arr) {
            if (check(x) && !set.contains(x)) {
                a.add(x);
                set.add(x);
            }
        }
        Collections.sort(a, new Comparator<String>() {
            public int compare(String a, String b) {
                return a.length() - b.length();
            }

        });
        for (String x : a) {
            System.out.print(x + " ");
        }

    }
}
