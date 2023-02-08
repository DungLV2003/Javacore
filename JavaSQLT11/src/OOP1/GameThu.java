/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class GameThu {

    private String username;
    private String password, hoTen, gioVao, gioRa;

    public GameThu(String username, String password, String hoTen, String gioVao, String gioRa) {
        this.username = username;
        this.password = password;
        this.hoTen = hoTen;
        this.gioVao = gioVao;
        this.gioRa = gioRa;
    }

    public int getHour(String time) {
        int gio = (time.charAt(0) - '0') * 10 + (time.charAt(1) - '0');
        return gio;
    }

    public int getMinute(String time) {
        int phut = (time.charAt(3) - '0') * 10 + (time.charAt(4) - '0');
        return phut;
    }

    public int getTime() {
        int res = getHour(this.gioRa) * 60 + getMinute(this.gioRa) - getHour(this.gioVao) * 60 - getMinute(this.gioVao);
        return res;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        int gVao = getHour(this.gioVao);
        int gRa = getHour(this.gioRa);
        int pVao = getMinute(this.gioVao);
        int pRa = getMinute(this.gioRa);
        int h = 0, p = 0;
        if (pRa >= pVao) {
            p = pRa - pVao;
            h = gRa - gVao;
        } else {
            h = gRa - gVao - 1;
            p = pRa + 60 - pVao;
        }
        return this.username + " " + this.password + " " + this.hoTen + " " + h + " gio " + p + " phut";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<GameThu> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String username = sc.nextLine();
            String pass = sc.nextLine();
            String hoTen = sc.nextLine();
            String vao = sc.nextLine();
            String ra = sc.nextLine();
            arr.add(new GameThu(username, pass, hoTen, vao, ra));
        }
        Collections.sort(arr, new Comparator<GameThu>(){
            @Override
            public int compare(GameThu a, GameThu b) {
                int time1 = a.getTime();
                int time2 = b.getTime();
                if(time1 != time2) return time2 - time1;
                else return a.getUsername().compareTo(b.getUsername());
            }
            
        });
        for(GameThu x : arr){
            System.out.println(x);
        }
    }

}
