import java.util.Scanner;
public class task1_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String longWord = "", shortWord = line;

        for (String str : line.split(" ")) {
            if (str.length() > longWord.length()) longWord = str;
            if (str.length() < shortWord.length()) shortWord = str;
        }
        try {
            int lWord = Integer.parseInt(longWord);
            int sWord = Integer.parseInt(shortWord);

            System.out.println("Самое длинное число: '" + lWord + "'");
            System.out.println("Длина: " + longWord.length());
            System.out.println("Самое короткое число: '" + sWord + "'");
            System.out.println("Длина: " + shortWord.length());
            }
            catch (Exception e){
                System.out.println("Не целое число");
            }
        }
}