import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class DataSorting {

    public static void main(String[] args) {

        String fileName = "data.txt"; // ім'я файлу з даними

        String[] data = readDataFromFile(fileName); // читання даних з файлу і зберігання їх у масиві
        System.out.println("Початкові дані: " + Arrays.toString(data));

        sortAlphabetically(data); // сортування за алфавітом
        System.out.println("Відсортовані за алфавітом: " + Arrays.toString(data));

        sortNumerically(data); // сортування за числовим параметром
        System.out.println("Відсортовані за числовим параметром: " + Arrays.toString(data));
    }

    // метод для читання даних з файлу і зберігання їх у масиві
    public static String[] readDataFromFile(String fileName) {

        String[] data = null;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int count = 0;
            while ((line = br.readLine()) != null) {
                count++;
            }
            data = new String[count];
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                data[i] = line;
                i++;
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }

    // метод для сортування масиву за алфавітом
    public static void sortAlphabetically(String[] data) {
        Arrays.sort(data);
    }

    // метод для сортування масиву за числовим параметром
    public static void sortNumerically(String[] data) {
        Arrays.sort(data, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String[] s1Arr = s1.split(" ");
                String[] s2Arr = s2.split(" ");
                int num1 = Integer.parseInt(s1Arr[1]);
                int num2 = Integer.parseInt(s2Arr[1]);
                return Integer.compare(num1, num2);
            }
        });
    }
}
