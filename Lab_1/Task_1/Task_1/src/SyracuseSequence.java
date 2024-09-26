import java.util.Scanner;

public class SyracuseSequence {
    // Метод для вычисления количества шагов последовательности Коллатца
    public static int collatzSteps(int n) {
        int steps = 0;  // Переменная для подсчета шагов
        while (n != 1) {  // Цикл продолжается, пока n не станет равно 1
            if (n % 2 == 0) {
                // Если число четное, делим его на 2
                n = n / 2;
            } else {
                // Если число нечетное, применяем формулу 3n + 1
                n = 3 * n + 1;
            }
            steps++;  // Увеличиваем количество шагов
        }
        return steps;  // Возвращаем общее количество шагов
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Создаем объект для ввода данных
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();  // Читаем введенное число
        int steps = collatzSteps(n);  // Вызываем метод для вычисления шагов
        System.out.println("The number of steps: " + steps);  // Выводим результат
        scanner.close();  // Закрываем сканер
    }
}
