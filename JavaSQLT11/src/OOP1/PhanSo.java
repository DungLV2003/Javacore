
package OOP1;

import java.util.Scanner;

public class PhanSo {
    private long x,y;
    
    //constructor k tham so
    public PhanSo(){        
    }
    //constructor co tham so
    public PhanSo(long x, long y) {
        this.x = x;
        this.y = y;
    }
    public PhanSo Cong(PhanSo b){
        long ts,ms;
        ms = this.y*b.y;
        ts = this.x*b.y +b.x*this.y;
        PhanSo c = new PhanSo(ts*ts,ms*ms);
        return c;
    }
    
    public PhanSo Nhan(PhanSo b, PhanSo c){
        long ts = this.x*b.x*c.x;
        long ms = this.y*b.y*c.y;
        PhanSo d = new PhanSo(ts, ms);
        return d;
    }
    public void RutGon(){
        long a = this.x, b = this.y;
        if(a < b){
            long tg = a;
            a = b; 
            b = tg;
        }
        while(b != 0){
            long tg = a%b;
            a = b;
            b =tg;
        }
        this.x = this.x/a;
        this.y = this.y/a;
    }

    @Override
    public String toString() {
        return x + "/" + y;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            PhanSo a = new PhanSo(sc.nextLong(),sc.nextLong());
            PhanSo b = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo c = a.Cong(b);
            PhanSo d = a.Nhan(b, c);
            c.RutGon();
            d.RutGon();
            System.out.println(c + " " + d);
        }
    }

}
