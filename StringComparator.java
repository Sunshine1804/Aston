import java.util.Scanner;

public class StringComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод двух строк
        System.out.print("Input first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Input second string: ");
        String str2 = scanner.nextLine();

        // Сравнение строк
        if (str1.equals(str2)) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }

        // Закрытие Scanner
        scanner.close();
    }
}