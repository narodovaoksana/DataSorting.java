package commands;

import lb5.Students;

import java.time.Period;
import java.util.List;
import java.util.Scanner;

public class Update {
    public void Update (List<Students> students, Scanner Scan) {
        System.out.println("Show My ContactList");
        for (int i = 0; i < students.size(); i++) {
            System.out.println("\t" + (i + 1) + ". " + students.get(i));
        }
        System.out.println("Choose the person you want to update");
        int Person = Scan.nextInt();
        if (Person == 0 || Person >= students.size()) {
            System.out.println("You entered the wrong command :(" + "Choose the person you want to update");
            // Person = Scan.nextInt();
            Update (students, Scan);
        }
        else {
            System.out.println("Please type your name");
            String Name = Scan.next();
            System.out.println("Please type your surname");
            String Surname = Scan.next();
            System.out.println("Please type your phone number in the format +38*********");
            String Number = Scan.next();
            System.out.println("Please type your e-mail");
            String Email = Scan.next();
            System.out.println("Please type your date of birth in the format day/month/year");
            String Dateofbirth = Scan.next();
            System.out.println("Please type your home address in the format settlement/street/house number");
            String Address = Scan.next();
            System.out.println("Thanks, we are friends now. To see information about yourself type 2");
            students.get(Person - 1).setName(Name);
            students.get(Person - 1).setSurname(Surname);
            students.get(Person - 1).setNumber(Number);
            students.get(Person-1).setEmail(Email);
            students.get(Person - 1).setDateofbirth(Dateofbirth);
            students.get(Person - 1).setAddress(Address);

        }
    }
}
