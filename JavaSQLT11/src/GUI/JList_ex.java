package GUI;

import java.util.ArrayList;

public class JList_ex {

    public static void main(String[] args) {

        ArrayList<Account> list = new ArrayList<>();
        list.add(new Account("abc", "abc"));
        list.add(new Account("abcd", "abcd"));
        new LoginForm(list);
    }

}
