public class Task_6 {

    // Метод для нахождения суммы всех элементов двумерного массива
    public static int sumOfMatrix(int[][] matrix) {
        int sum = 0;  // Переменная для хранения суммы

        // Проходим по строкам и столбцам массива
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];  // Добавляем текущий элемент к сумме
            }
        }

        return sum;  // Возвращаем общую сумму
    }

    public static void main(String[] args) {
        // Пример двумерного массива
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Нахождение суммы всех элементов
        int totalSum = sumOfMatrix(matrix);

        // Вывод результата
        System.out.println("Сумма всех элементов матрицы: " + totalSum);
    }
}
