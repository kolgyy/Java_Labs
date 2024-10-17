
public class Task_1 {
    public static String findLongestSubstring(String s) {
        // Массив для отслеживания вхождений символов (ASCII размерностью 256)
        int[] charCount = new int[256];

        int left = 0, right = 0;
        int maxLength = 0;
        int start = 0; // Для хранения начала наибольшей подстроки

        while (right < s.length()) {
            char currentChar = s.charAt(right);
            // Увеличиваем счётчик для текущего символа
            charCount[currentChar]++;

            // Пока есть повторяющийся символ
            while (charCount[currentChar] > 1) {
                // Уменьшаем счётчик символа на позиции left и двигаем левый указатель
                charCount[s.charAt(left)]--;
                left++;
            }

            // Обновляем длину максимальной подстроки и запоминаем её начало
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                start = left;
            }

            // Двигаем правый указатель дальше
            right++;
        }

        // Возвращаем наибольшую подстроку
        return s.substring(start, start + maxLength);
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println("Наибольшая подстрока без повторяющихся символов: " + findLongestSubstring(input));
    }
}
