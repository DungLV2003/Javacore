
import java.util.Arrays;
import java.util.Scanner;


public class Lab1_Bai4 {
    static String f4(String str)
    {
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int k = i;
            while (i < ch.length && ch[i] != ' ')
                i++;
 
           
            ch[k] = (char)(ch[k] >= 'a' && ch[k] <= 'z'
                               ? ((int)ch[k] - 32)
                               : (int)ch[k]);
            ch[i - 1] = (char)(ch[i - 1] >= 'a' && ch[i - 1] <= 'z'
                                   ? ((int)ch[i - 1] - 32)
                                   : (int)ch[i - 1]);
        }
 
        return new String(ch);
    }
 
    // Driver code
    public static void main(String args[])
    {
        String str = "Geeks for Geeks";
        System.out.println(str);
        System.out.println(f4(str));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split("\\s+");
        for(String x : arr){
            System.out.print(x + " ");
        }
        System.out.println("");
    }
}
