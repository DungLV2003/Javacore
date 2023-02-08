package Mang_1_chieu_nang_cao;

// Bài này chỉ cần 2 trường hợp là so sánh trị tuyệt đối của
// 2 số lớn nhất với 2 số nhỏ nhất.

//Cách này chưa hay 

import java.util.Arrays;
import java.util.Scanner;

public class Bai31_Maximum_pair {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer []a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int res = -1000000001;
        for(int i = 1; i< n; i++){
            int tmp = Math.abs(a[i] + a[i - 1]);
            if(res < tmp){
                res = tmp;
            }
        }
        System.out.println(res);
    }
}
