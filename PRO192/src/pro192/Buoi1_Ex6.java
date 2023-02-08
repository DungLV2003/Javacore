package pro192;


import java.util.ArrayList;
import java.util.List;

//Hoac la cho het vao mang roi in ra

public class Buoi1_Ex6 {

    public static void main(String[] args) {
        // Java Program to Concatenate Two List
// using addAll() method

        // given list 1
        List<String> list1 = new ArrayList<String>();
        list1.add("a");
        list1.add("b");
        list1.add("c");

        // given list 2
        List<String> list2 = new ArrayList<String>();
        list2.add("1");
        list2.add("2");
        list2.add("3");

        // creating new empty list
        List<String> concatenated_list = new ArrayList<String>();

        // using addAll( ) method to concatenate the lists
        concatenated_list.addAll(list1);
        concatenated_list.addAll(list2);

        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println("Concatenated list: "
                + concatenated_list);
    }
}
