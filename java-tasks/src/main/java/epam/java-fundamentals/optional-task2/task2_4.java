import java.util.InputMismatchException;
import java.util.Scanner;
import  java.lang.String;
import  java.util.Random;

public class task2_4 {
    public static void main(String[] args) {
        int matrixM;
        int matrixN;

        while (true)
        {
            System.out.println("Введите размер матрицы MxN: ");
            Scanner scanner = new Scanner(System.in);
            try
            {
                matrixM = scanner.nextInt();
                matrixN = scanner.nextInt();
                break;
            }
            catch (InputMismatchException e)
            {
                System.out.print("Неверный ввод " + e);
            }
        }

        Random rand = new Random();
        int[][] matrix = new int[matrixM][matrixN];
        Random rand2 = new Random();

        for (int i = 0; i < matrixM; i++)
            for (int j = 0; j < matrixN; j++)
                matrix[i][j] = rand.nextInt(199) - 99;

        System.out.println("MATRIX MxN");
        for (int i = 0; i < matrixM; i++) {
            for (int j = 0; j < matrixN; j++)
                System.out.print(matrix[i][j] + "  ");
            System.out.println("");
        }
        System.out.println();

        int[] max = new int[matrixM];
        int maximum = 1;
        System.out.println("MAX ELEM IN ROW");

        for (int i = 0; i < matrixM; i++) {
            max[i] = matrix[i][0];
            for (int j = 1; j < matrixN; j++) {
                if (matrix[i][j] > max[i]) {
                    max[i] = matrix[i][j];
                }
            }
            System.out.print(max[i] + " \n");
        }

        for (int value : max) {
            if (value > maximum) {
                maximum = value;
            }
        }
        System.out.println("\n\nMAX ELEM IN MATRIX\n" + maximum);
        System.out.println("\nDELETED MAX ELEM FROM MATRIX");

        for (int i = 0; i < matrixM; i++) {
            for (int j = 1; j < matrixN; j++) {
                if (matrix[i][j] == maximum) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < matrixM; i++) {
            for (int j = 0; j < matrixN; j++)
                System.out.print(matrix[i][j] + "  ");
            System.out.println("");
        }
    }
}