import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Создаем объект Scanner для ввода

        // Шаг 1: Ввод координат клада
        System.out.print("Введите координаты клада (x, y): ");
        int treasureX = scanner.nextInt();  // Координата клада по оси X
        int treasureY = scanner.nextInt();  // Координата клада по оси Y

        int currentX = 0;  // Текущая координата по оси X
        int currentY = 0;  // Текущая координата по оси Y

        int steps = 0;  // Счетчик шагов/команд карты

        // Шаг 2: Считывание команд карты до встречи с "стоп" или пока не найдем клад
        while (true) {
            System.out.print("Введите направление движения (северг, юг, запад, восток или стоп): ");
            String direction = scanner.next();  // Считываем направление (север, юг, запад, восток или стоп)
            // Если команда "стоп", прерываем цикл
            if (direction.equals("стоп")) {
                break;
            }
            System.out.print("Введите кол-во шагов в этом направлении: ");
            int distance = scanner.nextInt();  // Считываем количество шагов
            // Шаг 3: Обрабатываем направление и обновляем текущие координаты
            switch (direction) {
                case "север":
                    currentY += distance;  // Движемся на север, увеличиваем Y
                    break;
                case "юг":
                    currentY -= distance;  // Движемся на юг, уменьшаем Y
                    break;
                case "восток":
                    currentX += distance;  // Движемся на восток, увеличиваем X
                    break;
                case "запад":
                    currentX -= distance;  // Движемся на запад, уменьшаем X
                    break;
            }
            // Увеличиваем количество шагов (выполненных команд карты)
            steps++;

            // Шаг 4: Проверяем, достигли ли мы координат клада
            if (currentX == treasureX && currentY == treasureY) {
                break;  // Если координаты совпадают с координатами клада, прерываем цикл
            }
        }
        // Шаг 5: Выводим минимальное количество шагов, которое нужно выполнить
        System.out.println(steps);

        scanner.close();  // Закрываем сканер
    }
}