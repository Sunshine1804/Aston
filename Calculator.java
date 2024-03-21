import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод двух целых чисел
        System.out.print("input first number: ");
        int num1 = scanner.nextInt();

        System.out.print("input second number: ");
        int num2 = scanner.nextInt();

        // Сравнение чисел
        if (num1 == num2) {
            System.out.println("Number are equal.");
        } else if (num1 > num2) {
            System.out.println("First number more than second number.");
        } else {
            System.out.println("Second number more than first number.");
        }

        // Операции
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double quotient = (double) num1 / num2; // деление с плавающей точкой

        // Вывод результатов
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
       

        // Закрытие Scanner
        scanner.close();
    }
}