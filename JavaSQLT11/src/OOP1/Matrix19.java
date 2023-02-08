package OOP1;

import java.util.Scanner;

class Matrix1 {

    private int n, m;
    private int[][] a;

    public Matrix1(int n, int m) {
        this.n = n;
        this.m = m;
        a = new int[n][m];
    }

    public void nextMatrix1(Scanner sc) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                this.a[i][j] = sc.nextInt();
            }
        }
    }

    public Matrix1 mul(Matrix1 other) {
        Matrix1 res = new Matrix1(this.n, other.m);
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < other.m; j++) {
                res.a[i][j] = 0;
                for (int k = 0; k < this.m; k++) {
                    res.a[i][j] += this.a[i][k] * other.a[k][j];
                }
            }
        }
        return res;
    }

    public Matrix1 trans() {
        Matrix1 T = new Matrix1(this.m, this.n);
        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < this.n; j++) {
                T.a[i][j] = this.a[j][i];
            }
        }
        return T;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) {
                s += this.a[i][j] + " ";
            }
            s += "\n";
        }
        return s;
    }
}

public class Matrix19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        Matrix1 a = new Matrix1(n, m);
        a.nextMatrix1(sc);
        Matrix1 b = a.trans();
        System.out.println(a.mul(b));
    }

}
