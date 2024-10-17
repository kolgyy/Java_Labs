public class Task_8 {

    // Метод для поворота двумерного массива на 90 градусов против часовой стрелки
    public static int[][] rotateMatrixCounterClockwise(int[][] matrix) {
        int rows = matrix.length;        // Количество строк в исходной матрице
        int cols = matrix[0].length;     // Количество столбцов в исходной матрице

        // Создаём новый массив для повёрнутой матрицы
        int[][] rotatedMatrix = new int[cols][rows];

        // Переносим элементы с учётом поворота на 90 градусов против часовой стрелки
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rotatedMatrix[cols - 1 - j][i] = matrix[i][j];
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

        // Поворачиваем матрицу на 90 градусов против часовой стрелки
        int[][] rotatedMatrix = rotateMatrixCounterClockwise(matrix);

        System.out.println("Матрица после поворота на 90 градусов против часовой стрелки:");
        printMatrix(rotatedMatrix);
    }
}
