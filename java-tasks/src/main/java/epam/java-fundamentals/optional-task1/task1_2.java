import java.util.InputMismatchException;
import java.util.Scanner;
public class task1_2 {
    public static void main(String[] args) {
        int number;
        while (true)
        {
            System.out.println("Введите количество строк:");
            Scanner scanner = new Scanner(System.in);
            try
            {
                number = scanner.nextInt();
                break;
            }
            catch (InputMismatchException e)
            {
                System.out.print("Неверный ввод " + e);
            }
        }

        String[] strings = new String[number];
        Scanner scanner = new Scanner(System.in);
        try {
            for (int i = 0; i < number; i++)
            {
                System.out.println("Введите строку №" + (i + 1));
                strings[i] = scanner.nextLine();
                Integer.parseInt(strings[i]);
            }
        }
        catch (Exception e)
        {
            System.out.print("Не целое число " + e);
            return;
        }

        for (int i = 0; i < number; i++)
        {
            for (int j = 0; j < number-1; j++)
            {
                if (strings[j].length() == strings[j+1].length())
                {
                    int first_counter = 0;
                    int second_counter = 0;
                    for (int k = 0; k < strings[j].length()-1; k++)
                    {
                        if (Character.isDigit(strings[j].charAt(k))) first_counter++;
                        if (Character.isDigit(strings[j+1].charAt(k))) second_counter++;
                    }
                    if (first_counter > second_counter)
                    {
                        String temp = strings[j];
                        strings[j] = strings[j+1];
                        strings[j+1] = temp;
                    }
                }
                else
                if (strings[j].length() > strings[j+1].length())
                {
                    String temp = strings[j];
                    strings[j] = strings[j+1];
                    strings[j+1] = temp;
                }
            }
        }
        int maxLength = strings[number-1].length();
        System.out.println("Строки в порядке возврастания длины: ");
        for (int i = 0; i < number; i++)
        {
            System.out.print(strings[i]);
            for (int j = strings[i].length(); j < maxLength + 2; j++) System.out.print(".");
            System.out.println("Длина = " + strings[i].length());
        }
    }
}