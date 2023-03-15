package commands;

import lb5.Students;

import java.util.List;
import java.util.Scanner;

public class Delete {
    public void Delete(List<Students> students , Scanner Scan) {
        for ( int i=0; i< students.size(); i++){
            System.out.println("\t" +(i+1)+ "." + students.get(i));
        }
        System.out.println("Choose the person you want to delete: ");
        int Person= Scan.nextInt();
        students.remove(Person -1);
        System.out.println("Person deleted");
    }
}
