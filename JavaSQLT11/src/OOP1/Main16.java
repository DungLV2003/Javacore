package OOP1;

import java.util.Scanner;
import java.util.TreeSet;

class IntSet1{
    private TreeSet<Integer> set;

    public IntSet1(TreeSet<Integer> set) {
        this.set = set;
    }

    public IntSet1(int[] a) {
        this.set = new TreeSet<>();
        for (int x : a) {
            set.add(x);
        }
    }


    public IntSet1 union(IntSet1 b) {
        for (int x : b.set) {
            this.set.add(x);
        }
        return new IntSet1(this.set);
    }

   

    public String toString() {
        String res = "";
        for (int x : this.set) {
            res += x + " ";
        }
        return res;
    }
}

public class Main16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        IntSet1 s1 = new IntSet1(a);
        IntSet1 s2 = new IntSet1(b);
        IntSet1 s3 = s1.union(s2);
        System.out.println(s3);
    }
}
