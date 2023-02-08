package OOP1;

import com.sun.javafx.scene.shape.PathUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Time {

    private int gio, phut, giay;

    public Time(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    public int getGiay() {
        return this.gio * 3600 + this.phut * 60 + this.giay;
    }

    @Override
    public String toString() {
        return this.gio + " " + this.phut + " " + this.giay;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new Time(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(arr,new Comparator<Time>() {
            @Override
            public int compare(Time a, Time b) {
                return a.getGiay() - b.getGiay();
            }
        });

        for (Time x : arr) {
            System.out.println(x);
        }
    }
}
