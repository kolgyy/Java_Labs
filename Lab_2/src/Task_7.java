public class Task_7 {

    // Метод для нахождения максимального элемента в каждой строке двумерного массива
    public static int[] findMaxInRows(int[][] matrix) {
        int[] maxInRows = new int[matrix.length];  // Одномерный массив для хранения максимальных значений

        // Проходим по каждой строке массива
        for (int i = 0; i < matrix.length; i++) {
            int max = matrix[i][0];  // Инициализируем максимум первым элементом строки

            // Проходим по всем элементам строки
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];  // Обновляем максимум, если нашли большее значение
                }
            }

            maxInRows[i] = max;  // Сохраняем максимальное значение для текущей строки
        }

        return maxInRows;
    }

    public static void main(String[] args) {
        // Пример двумерного массива
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Нахождение максимального элемента в каждой строке
        int[] maxElements = findMaxInRows(matrix);

        // Вывод результата
        System.out.println("Максимальные элементы в каждой строке:");
        for (int max : maxElements) {
            System.out.println(max);
        }
    }
}
