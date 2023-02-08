
package OOP1;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Scanner;

class IntSet {
    private TreeSet<Integer> set;
    
    public IntSet(TreeSet<Integer> set){
        this.set = set;
    }
    
    public IntSet(int[] a){
        this.set = new TreeSet<>();
        for(int x : a){
            set.add(x);
        }
    }
    
    public IntSet intersection(IntSet b){
        TreeSet<Integer> giao = new TreeSet<>();
        for(int x : b.set){
            if(this.set.contains(x))
                giao.add(x);
        }
        return new IntSet(giao);
    }
    
    @Override
    public String toString(){
        String res = "";
        for(int x : this.set){
            res += x + " ";
        }
        return res;
    }   
}

public class Main15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        for(int i = 0; i < m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
}