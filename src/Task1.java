import java.util.Arrays;
import java.util.Scanner;
//Таблица умножения
public class Task1 {
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
        int[][] a = new int[n][m];
        for(int i=0;i<n*m;++i) {
            a[i / n][i % m] = (i / n) * (i % m);
        }
        Task1.printArr(a);
    }

};