import java.util.Arrays;

import static java.util.Arrays.compare;

public class Main {
    public static void main(String[] args) {
        int[] a = {2, -56, 465, 8, 1};
        int[] b = {2, -56, 465, 1, 8};
        int[] c = Arrays.copyOf(b, 7);
        System.out.println(Arrays.toString(c));
        Arrays.fill(a, 78);
        System.out.println(Arrays.toString(a));
        System.out.println(compare(a, 1,3, b,2,2) +" "+ Arrays.equals(a, b)); // a - b
    }
}

class Cat {
    int paws;
}