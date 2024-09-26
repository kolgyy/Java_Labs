import java.util.Scanner;

public class AlternatingSeriesSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Создаем объект Scanner для чтения ввода с клавиатуры

        // Шаг 1: Вводим количество чисел n
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();  // Читаем значение n

        int sum = 0;  // Переменная для хранения итоговой суммы

        // Шаг 2: Считываем n чисел и вычисляем знакочередующуюся сумму
        System.out.println("Enter " + n + " numbers:");
        for (int i = 1; i <= n; i++) {  // Цикл для обработки каждого из n чисел
            int number = scanner.nextInt();  // Читаем очередное число

            // Если позиция числа нечетная (i % 2 != 0), прибавляем число, иначе вычитаем
            if (i % 2 != 0) {
                sum += number;  // Прибавляем, если позиция числа нечетная
            } else {
                sum -= number;  // Вычитаем, если позиция числа четная
            }
        }
        // Шаг 3: Выводим результат
        System.out.println("The sum of alternating series: " + sum);

        scanner.close();  // Закрываем сканер после использования
    }
}
