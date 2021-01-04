public class task4 {
    public static void main(String[] args) {
        int sum = 0;
        int com = 1;

        for (String arg : args) {
            int input = Integer.parseInt(arg);
            sum = sum + input;
            com = com * input;
        }
        System.out.println("SUM: " + sum);
        System.out.println("COM: " + com);
    }
}