import java.util.Scanner;
//Дано число 𝑛. Создайте массив A[n][n] и заполните его спиралью 
public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int s = 1;
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            arr[0][i] = s;
            s++;
        }
        for (int j = 1; j < m; j++) {
            arr[j][n - 1] = s;
            s++;
        }
        for (int i = n - 2; i >= 0; i--) {
            arr[m - 1][i] = s;
            s++;
        }
        for (int j = m - 2; j > 0; j--) {
            arr[j][0] = s;
            s++;
        }
        
        int indexI = 1;
        int indexJ = 1;

        while (s < m * n) {

            while (arr[indexI][indexJ + 1] == 0) {
                arr[indexI][indexJ] = s;
                s++;
                indexJ++;
            }

            while (arr[indexI + 1][indexJ] == 0) {
                arr[indexI][indexJ] = s;
                s++;
                indexI++;
            }

            while (arr[indexI][indexJ - 1] == 0) {
                arr[indexI][indexJ] = s;
                s++;
                indexJ--;
            }
            
            while (arr[indexI - 1][indexJ] == 0) {
                arr[indexI][indexJ] = s;
                s++;
                indexI--;
            }
        }

        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                if (arr[j][i] == 0) {
                    arr[j][i] = s;
                }
            }
        }
    Task1.printArr(arr);
    }
}
