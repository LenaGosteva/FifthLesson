import java.util.Scanner;

public class Arrays {
    static void printArr(int[][] a){
        for (int[] ints: a) {
            for (int anInt: ints) {
                System.out.print(anInt +"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = new int[10][10];
    }
//
//    public static void main(String[] args) {
//        int[][] a = new int[10][10];
//
//        // отражаем
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.print(a[j][i] + " ");
//            }System.out.println();
//        }
//        //в обратную сторону
//        for (int i = a.length; i >= 0; i--) {
//            for (int j = a[i].length - 1;j >= 0 ; j--) {
//                System.out.print(a[j][i] + " ");
//            }
//            System.out.println();
//        }
//        //побочная диагональ
//        for (int i = a.length; i >= 0; i--) {
//            for (int j = a[i].length - 1;j >= 0 ; j--) {
//                if (i == a.length - 1 - j) System.out.print(a[i][j] + " ");
//                System.out.println(a[j][i] + " ");
//            }
//            System.out.println();
//        }
//        //поворот по часовой на 90
//        int[][] arr = new int[][];
//
//        for (int i = 0; i < a.length; i++ ){
//
//            for (int j = 0; j < a.length; j++){
//
//                arr[i][j] = a[j][i];
//            }
//        }
//

    public static int getRint(int min, int max){
       return (int)(Math.random() * (max - min)+min);
    }
}
