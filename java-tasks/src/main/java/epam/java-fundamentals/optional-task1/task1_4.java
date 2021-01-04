public class task1_4 {
    public static void main(String[] args) {
        int[] array = {1, 21, 33, 44, 55, 56, 57, 67};
        differentDigits(array);
    }

    private static void differentDigits(int[] array) {
        for (int element : array) {
            boolean isDistinct = true;
            char[] chars = String.valueOf(Math.abs(element)).toCharArray();
            for (int i = 0; i < chars.length - 1; i++) {
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        isDistinct = false;
                        break;
                    }
                }
                if (isDistinct) {
                    break;
                } else if (i == chars.length - 2) {
                    System.out.println("Первое число, в котором количество различных цифр минимально: " + element);
                    return;
                }
            }
        }
        System.out.println("Таких чисел нет!");
    }
}
