public class EvenNumbers {
    public static void main(String[] args) {
        // Задание массива от 1 до 10
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Вывод четных чисел
        System.out.println("Even numbers:");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}
