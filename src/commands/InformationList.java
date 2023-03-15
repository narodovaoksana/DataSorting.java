package commands;
import lb5.Students;

import java.util.List;

public class InformationList {
   public void  (InformationList<Students> students){
        System.out.println("List:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println("\t" + (i + 1) + ". " + students.get(i));
        }
    }

    private String get(int i) {
        return null;
    }

    private int size() {
        return 0;
    }

    public void InformationList(List<Students> students) {

    }
}