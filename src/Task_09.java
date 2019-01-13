import java.util.Scanner;

public class Task_09 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Задайте количество строк матрицы целым положительным числом: ");
        int a = in.nextInt();
        System.out.print("Задайте количество столбцов матрицы целым положительным числом: ");
        int b = in.nextInt();
        int[][] c = new int[a][b];

        for (int m = 0 ; m < a ; m++ ) {
            for (int n = 0 ; n < b ; n++ ){
                System.out.print("Элемент[" + m + "," + n + "]: ");
                c[m][n] = in.nextInt();
            }
        }
        for (int n = 0 ; n < a ; n++ ) {
            System.out.print("Элемент[" + n + ",0], умноженный на 3: " + c[n][0]*3 + "\n");
        }
    }
}