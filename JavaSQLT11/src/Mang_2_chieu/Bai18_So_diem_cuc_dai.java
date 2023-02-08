
package Mang_2_chieu;

import java.util.Scanner;


public class Bai18_So_diem_cuc_dai {
    
    public static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    public static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
    public static int[][] a = new int[100][100];
    public static int n, m;
    

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                boolean check = true;
                for(int k = 0; k < 8; k++){
                    int i1 = i + dx[k], j1 = j + dy[k];
                    if(i1 >= 0 && i1 < n && j1 >= 0 && j1 < m && a[i1][j1] >= a[i][j] ){
                        check = false;
                        break;
                    }
                }
                if(check) ++cnt;
            }
        }
        System.out.println(cnt);
    }
}
