public class Task_2 {

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        // Результирующий массив, размер которого равен сумме длин двух исходных массивов
        int[] result = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0; // i - для arr1, j - для arr2, k - для result

        // Сливаем массивы пока в обоих массивах есть элементы
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }

        // Добавляем оставшиеся элементы из arr1, если такие есть
        while (i < arr1.length) {
            result[k] = arr1[i];
            i++;
            k++;
        }

        // Добавляем оставшиеся элементы из arr2, если такие есть
        while (j < arr2.length) {
            result[k] = arr2[j];
            j++;
            k++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        int[] mergedArray = mergeSortedArrays(arr1, arr2);

        System.out.print("Объединённый массив: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }
}
