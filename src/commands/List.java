package commands;

import lb5.Students;

public class List {
    public void List (java.util.List<Students> students) {
        System.out.println("My ContactList:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println("\t" + (i + 1) + ". " + students.get(i));
        }
    }
}
