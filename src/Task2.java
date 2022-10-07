import java.util.Scanner;

public class Task2
//Дано число 𝑛. Создайте массив A[n][n] и заполните его змейкой
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = 0;
        int[][] a = new int[n][m];
        for (int i = 0; i < a.length; i++) {
            if (i%2 == 0){
                for (int j = 0; j < a[i].length ; j++) {
                    a[i][j] = k;
                    k++;
                }
            }
            else{
                for (int j = a[i].length - 1; j >=0 ; j--) {
                a[i][j] = k;
                k++;
            }

            }

        }
        Task1.printArr(a);
    }
}
