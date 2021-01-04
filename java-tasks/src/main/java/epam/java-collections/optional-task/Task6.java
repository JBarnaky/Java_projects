import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("input.txt"));
        ArrayList<String> arrStr = new ArrayList<>();

        while (scan.hasNext()) {
            arrStr.add(scan.nextLine());
        }
        scan.close();
        Collections.sort(arrStr);

        for (String anArrStr : arrStr) {
            System.out.println(anArrStr);
        }
    }
}