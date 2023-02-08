
package practiceexception;

import java.util.Scanner;

public class Part2_Task2 {
    
    public String inputString() throws Exception {
        String pattern = "";
        String s = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("input the string: ");
        s = sc.nextLine();
        if(!s.matches(pattern)) throw new Exception();
        return s;
    }
    
    public static void main(String[] args) {
        Part2_Task2 obj = new Part2_Task2();
        boolean cnt = false;
        do{
            try{
                String s = obj.inputString();
                System.out.println("The string is " + s);
                cnt = false;
            }catch(Exception e){
                System.out.println("The string is invalid");
                cnt = true;
            }
        }while(cnt);
    }
}
