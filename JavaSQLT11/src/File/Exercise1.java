package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("number.txt"));
        while (sc.hasNext()) {
            String line = sc.nextLine();
            System.out.println(line);
        }

    }
}
