import java.util.Scanner;
//Дано число 𝑛. Создайте массив A[n][n] и заполните его спиралью 
public class Task3 {
    static void printArr(int[][] a){
        for (int[] ints: a) {
            for (int anInt: ints) {
                System.out.print(anInt +"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int x = 0;
        int y = n- 1;
        int k = 1;
        int[][] a = new int[n][n];
        while(k<n*n){
            for (int i = 0; i < a.length ; i++) {
                if (a[x][i] ==0) a[x][i] = k++;
            }
            for (int i = 0; i < a.length; i++) {
                if (a[i][y] == 0) a[i][y] = k++;  }
            for (int i =  a.length - 1; i >=0; i--) {
                    if (a[y][i] == 0) a[y][i] = k++;
            }
            for (int i =  a.length - 1; i >=0; i--) {
                if (a[i][x] == 0) a[i][x] = k++;
            }
            x++;
            y--;

            Task3.printArr(a);          }
        }

//     int[][] arr = new int[n][m];
//        int s = 1;
//        for (int i = 0; i < n; i++) {
//            arr[0][i] = s;
//            s++;
//        }
//        for (int j = 1; j < m; j++) {
//            arr[j][n - 1] = s;
//            s++;
//        }
//        for (int i = n - 2; i >= 0; i--) {
//            arr[m - 1][i] = s;
//            s++;
//        }
//        for (int j = m - 2; j > 0; j--) {
//            arr[j][0] = s;
//            s++;
//        }
//
//        int indexI = 1;
//        int indexJ = 1;
//
//        while (s < m * n) {
//
//            while (arr[indexI][indexJ + 1] == 0) {
//                arr[indexI][indexJ] = s;
//                s++;
//                indexJ++;
//            }
//
//            while (arr[indexI + 1][indexJ] == 0) {
//                arr[indexI][indexJ] = s;
//                s++;
//                indexI++;
//            }
//
//            while (arr[indexI][indexJ - 1] == 0) {
//                arr[indexI][indexJ] = s;
//                s++;
//                indexJ--;
//            }
//
//            while (arr[indexI - 1][indexJ] == 0) {
//                arr[indexI][indexJ] = s;
//                s++;
//                indexI--;
//            }
//        }
//
//        for (int j = 0; j < m; j++) {
//            for (int i = 0; i < n; i++) {
//                if (arr[j][i] == 0) {
//                    arr[j][i] = s;
//                }
//            }
//        }Task3.printArr(arr);

    }
