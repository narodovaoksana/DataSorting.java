package commands;
import lb5.Students;

import java.util.List;
import java.util.Scanner;

public class Search {
    void Looping (List<Students> students, String SearchRequest) {
        for (Object item : students) {
            if (item.toString().contains(SearchRequest)) {
                System.out.println(item);
            }
        }
    }
    public void Search (List<Students> students, Scanner Scan) {
        System.out.println("Type the person you want to find");
        String Word = Scan.next();
        if (students.isEmpty()){
            System.out.println("You have not added anyone yet");
        }
        else {
            System.out.println("Here is everything I found");
            Looping(students, Word);
        }
    }
}

