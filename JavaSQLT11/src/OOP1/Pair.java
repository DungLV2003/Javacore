
package OOP1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Pair {
    private int first, second;
    
    public Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
      



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Pair> arr = new ArrayList<>();
        for(int i = 0 ; i < n; i++){
            int x = sc.nextInt(), y = sc.nextInt();
            arr.add(new Pair(x, y));
        }
        Collections.sort(arr, new Comparator<Pair>(){
            @Override
            public int compare(Pair a, Pair b) {
                return a.second - b.second;
            }
        });
        int ans = 1, endTime = arr.get(0).second;
        for(int i = 1; i < n; i++){
            if(endTime < arr.get(i).first){
                ++ans;
                endTime = arr.get(i).second;
            }
        }
        System.out.println(ans);
    }
}
