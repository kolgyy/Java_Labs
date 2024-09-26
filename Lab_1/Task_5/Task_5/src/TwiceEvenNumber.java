import java.util.Scanner;

public class TwiceEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Создаем объект Scanner для ввода с клавиатуры

        // Шаг 1: Вводим положительное трёхзначное число
        System.out.print("Введите трёхзначное число: ");
        int number = scanner.nextInt();

        // Шаг 2: Проверяем, что число является трёхзначным
        if (number < 100 || number > 999) {
            System.out.println("Ошибка: необходимо ввести положительное трёхзначное число.");
            return;  // Завершаем программу, если число не трёхзначное
        }

        // Шаг 3: Извлекаем цифры числа
        int hundreds = number / 100;         // Цифра сотен
        int tens = (number / 10) % 10;       // Цифра десятков
        int units = number % 10;             // Цифра единиц

        // Шаг 4: Вычисляем сумму и произведение цифр
        int sum = hundreds + tens + units;   // Сумма цифр
        int product = hundreds * tens * units;  // Произведение цифр

        // Шаг 5: Проверяем, являются ли сумма и произведение четными
        if (sum % 2 == 0 && product % 2 == 0) {
            System.out.println("Число является дважды чётным.");
        } else {
            System.out.println("Число НЕ является дважды чётным.");
        }

        scanner.close();  // Закрываем сканер
    }
}
