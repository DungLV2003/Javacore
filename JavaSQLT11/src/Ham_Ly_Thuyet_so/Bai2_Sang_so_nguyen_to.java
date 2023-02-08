// Ðieu kien: n < 10^7, can phai co 1 mang danh dau co co la n + 1
// prime[i]: 1 ? 0
// Buoc 1: Coi tat ca cac so tu 0 toi n deu la so nguyen to =>> n primr[i] =1
// Buoc 2: sang, tat ca nhung so la boi cua so nguyen to se khong la so nguyen to
package Ham_Ly_Thuyet_so;

import java.util.Scanner;

public class Bai2_Sang_so_nguyen_to {
    //Kiem tra, liet ke cac so nguyen to tu 1 => 10^6
    //Sang so nguyen to eratosthenes
    public static boolean[] prime = new boolean[1000001];
    //p[i] : true => i la snt
    public static void sang() {
        //Ban dau coi tat ca cac so tu 0 => 10^6 deu la snt
        for (int i = 0; i <= 1000000; i++) {
            prime[i] = true; //ban dau coi tat ca cac so tu 0 toi n deu la so nguyen to
        }
        prime[0] = prime[1] = false;
        for (int i = 2; i <= Math.sqrt(1000000); i++) {
            //Neu i la so nguyen to ==> loại bỏ các bội của i <= n
            if (prime[i]) {
                //Duyet cac boi cua i : i * i
                for (int j = i * i; j <= 1000000; j += i) {
                    prime[j] = false;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sang();
        for (int i = 0; i <= 13; i++) {
            if (prime[i]) { //O(1)
                System.out.println(i + " ");
            }
        }
    }

}
