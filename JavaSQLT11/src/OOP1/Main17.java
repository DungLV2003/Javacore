package OOP1;

import java.util.Scanner;
import java.util.TreeSet;

class WordSet {

    private TreeSet<String> set;

    public WordSet(String s) {
        this.set = new TreeSet<>();
        String[] arr = s.split("\\s+");
        for (String x : arr) {
            this.set.add(x);
        }
    }

    WordSet(TreeSet<String> set) {
        this.set = set;
    }

    public WordSet union(WordSet b) {
        TreeSet<String> hop = new TreeSet<>();
        for (String x : b.set) {
            hop.add(x);
        }
        for (String x : this.set) {
            hop.add(x);
        }
        return new WordSet(hop);
    }

    public WordSet intersection(WordSet b) {
        TreeSet<String> giao = new TreeSet<>();
        for (String x : b.set) {
            if (this.set.contains(x)) {
                giao.add(x);
            }
        }

        return new WordSet(giao);
    }

    @Override
    public String toString() {
        String res = "";
        for (String x : this.set) {
            res += x + " ";
        }
        return res;
    }
}

public class Main17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WordSet s1 = new WordSet(sc.nextLine());
        WordSet s2 = new WordSet(sc.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
