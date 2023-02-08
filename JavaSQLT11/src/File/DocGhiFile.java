package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

//Doc file: Có thể dùng Scanner(nên dùng) hoặc FileRead (k nên dùng vì nó đọc từng byte)
//Ghi file: PrintWriter (nên dùng), FileWriter(k nên dùng vì nó ghi theo byte)

public class DocGhiFile {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("input.txt"));
            while (sc.hasNext()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            PrintWriter out = new PrintWriter(new File("output.txt"));
            out.println("Nguyen Van A\n");
            out.println(100);
            out.close();
        } catch (Exception ex) {
            System.out.println("File not found !");
        }
    }
}
