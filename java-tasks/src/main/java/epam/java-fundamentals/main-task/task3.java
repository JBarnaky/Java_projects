public class task3 {

    public static void main(String[] args) {
        int[] nums = new  int[5];
        int a = 1;
        int b = 10;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = a + (int)(Math.random() * b);
        }
        for (int i : nums) {
            System.out.println(i);
            System.out.print(i);
        }
    }
}