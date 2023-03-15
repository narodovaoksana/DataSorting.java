package lb5;

import commands.*;
import commands.List;

import java.io.IOException;
import java.util.*;

public class Main {

    static java.util.List<Students> students = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the command <help> or <h> ");
        for (; ; ) {
            String command = Scan.next();
            if (command.equals("exit") || command.equals("0")) {
                Exit exit = new Exit();
                exit.Exit(students);
                System.out.println("Exiting from the programme");
                break;
            } else if (command.equals("help") || command.equals("h")) {
                String[] commands = {"exit or 0", "help or h", "AddInformation or 1", "List or 2", "Update or 3",
                        "Delete or 4", "Search or 5", "Sorting or 6"};
                for (int i = 0; i < commands.length; i++) {
                    System.out.println((i) + ". " + commands[i]);
                }
            } else if (command.equals("AddInformation") || command.equals("1")) {
                AddInformation add = new AddInformation();
                add.AddInformation(students, Scan);
            } else if (command.equals("List") || command.equals("2")) {
                InformationList  all = new InformationList();
                all.InformationList(students);
            } else if (command.equals("Update") || command.equals("3")) {
                Update up = new Update();
                up.Update(students, Scan);
            } else if (command.equals("Delete") || command.equals("4")) {
                Delete del = new Delete();
                del.Delete(students, Scan);
            } else if (command.equals("Search") || command.equals("5")) {
                Search sea = new Search();
                sea.Search(students, Scan);
            } else if (command.equals("Sorting") || command.equals("6")) {
                AlphabeticallySorting sorting = new AlphabeticallySorting();
                sorting.AlphabeticallySorting(students,Scan)
                // String fileName = "information.txt"; // ім'я файлу з даними
                // String[] data = readDataFromFile(fileName); // читання даних з файлу і зберігання їх у масиві
                //System.out.println("Початкові дані: " + Arrays.toString(data));
                // sortAlphabetically(data); // сортування за алфавітом
                // System.out.println("Відсортовані за алфавітом: " + Arrays.toString(data));
                //sortNumerically(data); // сортування за числовим параметром
                //  System.out.println("Відсортовані за числовим параметром: " + Arrays.toString(data));
            } else {
                System.out.println("You entered the wrong command :(");
            }
        }
    }
}

// метод для читання даних з файлу і з
