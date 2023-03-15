package commands;
import java.util.Scanner;
import java.util.List;
import lb5.Students;
public class AddInformation {
    public void AddInformation(List<Students> students, Scanner Scan) {
        System.out.println("Please type your name");
        String Name = Scan.next();
        System.out.println("Please type your surname");
        String Surname = Scan.next();
        System.out.println("Please type your po_batkovi");
        String Po_batkovi = Scan.next();
        System.out.println("Please type your faculty");
        String Faculty = Scan.next();
        System.out.println("Please type your  date of birth in the format day/month/year");
        String Dateofbirth = Scan.next();
        System.out.println("Please type your phone number in format the format +38**********");
        String Number = Scan.next();
        System.out.println("Please type your home address in the format settlement/street/house number ");
        String Address = Scan.next();
        System.out.println("Please type your  bursary");
        double Bursary = Scan.nextDouble();
        System.out.println("Please type your number of membership");
        int Number_of_membership = Scan.nextInt();
      Students Students = new Students (Name, Surname,Po_batkovi,  Faculty, Dateofbirth,Number, Address,Bursary,Number_of_membership);
        students.add(Students);
        System.out.println("Thanks. To see information type 2. If you want to correct information type 3");
    }
}
