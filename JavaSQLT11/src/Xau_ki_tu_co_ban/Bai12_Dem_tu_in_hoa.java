package Xau_ki_tu_co_ban;

import java.util.Scanner;

public class Bai12_Dem_tu_in_hoa {

    public static boolean inHoa(String s) {
        String t = s.toUpperCase();
        return s.equals(t);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split("\\s+");
        int dem = 0;
        for (String x : arr) {
            if(inHoa(x)) {
                ++dem;
            }
        }
        System.out.print(dem);
    }
}
