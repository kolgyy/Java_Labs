public class Task_3 {

    public static int maxSubArraySum(int[] nums) {
        // Инициализируем переменные для хранения текущей и максимальной суммы
        int maxSum = nums[0];  // Максимальная сумма
        int currentSum = nums[0];  // Текущая сумма

        // Проходим по массиву начиная со второго элемента
        for (int i = 1; i < nums.length; i++) {
            // Либо продолжаем существующий подмассив, либо начинаем новый с текущего элемента
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Обновляем максимальную сумму, если текущая больше
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = maxSubArraySum(nums);

        System.out.println("Максимальная сумма подмассива: " + result);
    }
}
