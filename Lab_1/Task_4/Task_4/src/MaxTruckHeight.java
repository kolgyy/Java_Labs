import java.util.Scanner;

public class MaxTruckHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Создаем объект Scanner для ввода с клавиатуры

        // Шаг 1: Ввод количества дорог
        System.out.print("Введите количество дорог: ");
        int roadCount = scanner.nextInt();  // Читаем количество дорог

        int bestRoad = 0;  // Переменная для хранения номера лучшей дороги
        int maxHeight = 0; // Переменная для хранения максимальной высоты, которую может иметь грузовик

        // Шаг 2: Обрабатываем каждую дорогу
        for (int roadNumber = 1; roadNumber <= roadCount; roadNumber++) {
            // Читаем количество туннелей для текущей дороги
            System.out.print("Введите количество туннелей на дороге " + roadNumber + ": ");
            int tunnelCount = scanner.nextInt();

            int minHeight = Integer.MAX_VALUE;  // Начинаем с максимально возможного значения для поиска минимума

            // Шаг 3: Читаем высоты туннелей и находим минимальную высоту на данной дороге
            for (int i = 0; i < tunnelCount; i++) {
                System.out.print("Введите высоту туннеля: ");
                int tunnelHeight = scanner.nextInt();  // Читаем высоту туннеля
                // Обновляем минимальную высоту на данной дороге
                if (tunnelHeight < minHeight) {
                    minHeight = tunnelHeight;
                }
            }
            // Шаг 4: Сравниваем текущую минимальную высоту с максимальной высотой среди дорог
            if (minHeight > maxHeight) {
                maxHeight = minHeight;  // Обновляем максимальную возможную высоту грузовика
                bestRoad = roadNumber;  // Запоминаем номер этой дороги
            }
        }
        // Шаг 5: Выводим номер дороги и максимальную высоту
        System.out.println(bestRoad + " " + maxHeight);
        scanner.close();  // Закрываем сканер
    }
}