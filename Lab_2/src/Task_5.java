public class Task_5 {

    // Метод для поиска пары элементов, сумма которых равна target
    public static int[] findPairWithSum(int[] nums, int target) {
        // Проходим по массиву двумя вложенными циклами
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // Проверяем, равна ли сумма пары заданному числу target
                if (nums[i] + nums[j] == target) {
                    return new int[] {nums[i], nums[j]};
                }
            }
        }
        // Если пару не нашли, возвращаем null
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Ищем пару с суммой, равной target
        int[] result = findPairWithSum(nums, target);

        // Вывод результата
        if (result != null) {
            System.out.println("Пара с суммой " + target + ": " + result[0] + " и " + result[1]);
        } else {
            System.out.println("Пара с суммой " + target + " не найдена.");
        }
    }
}
