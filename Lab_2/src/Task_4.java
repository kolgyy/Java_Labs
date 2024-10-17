public class Task_4 {

    // Метод для поворота матрицы на 90 градусов по часовой стрелке
    public static int[][] rotateMatrix(int[][] matrix) {
        int rows = matrix.length;        // Количество строк в исходной матрице
        int cols = matrix[0].length;     // Количество столбцов в исходной матрице

        // Создаём новый массив для повёрнутой матрицы
        int[][] rotatedMatrix = new int[cols][rows];

        // Переносим элементы с учётом поворота
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rotatedMatrix[j][rows - 1 - i] = matrix[i][j];
            }
        }

        return rotatedMatrix;
    }

    // Метод для вывода матрицы
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Исходная матрица:");
        printMatrix(matrix);

        // Поворачиваем матрицу на 90 градусов
        int[][] rotatedMatrix = rotateMatrix(matrix);

        System.out.println("Матрица после поворота на 90 градусов:");
        printMatrix(rotatedMatrix);
    }
}
