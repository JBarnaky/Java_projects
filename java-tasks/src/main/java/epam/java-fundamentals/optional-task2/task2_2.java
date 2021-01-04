import java.util.InputMismatchException;
import java.util.Scanner;
import  java.lang.String;
import  java.util.Random;

public class task2_2 {
    public static void main(String[] args) {
        int matrixM;
        int matrixN;

        while (true) {
            System.out.println("Введите размер матрицы MxN: ");
            Scanner scanner = new Scanner(System.in);
            try {
                matrixM = scanner.nextInt();
                matrixN = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.print("Неверный ввод " + e);
            }
        }

        Random rand = new Random();
        int[][] matrix = new int[matrixM][matrixN];
        Random rand2 = new Random();

        for (int i = 0; i < matrixM; i++)
            for (int j = 0; j < matrixN; j++)
                matrix[i][j] = rand.nextInt(100) - 10;

        System.out.println("MATRIX MxN");
        for (int i = 0; i < matrixM; i++) {
            for (int j = 0; j < matrixN; j++)
                System.out.print(matrix[i][j] + "  ");
            System.out.println("");
        }
        System.out.println();

        int sum = 0;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(count == 0 && matrix[i][j] > 0){
                    sum += matrix[i][j];
                }
                if(matrix[i][j] < 0){
                    count++;
                }
            }
            System.out.println(sum);
            sum = 0;
            count = 0;
        }
    }
}