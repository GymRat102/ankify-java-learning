import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        // instantiate an array
        int[] a;
        int[] b = new int[100];

        int[] c = {2, 3, 5, 7, 11, 13,};

        System.out.println(Arrays.toString(new int[]{12, 35, 34}));

        // use for loop to assign value to b
        // for (int i = 0; i < 100; i++) {
        for (int i = 0; i < b.length; i++) {
            b[i] = i;
        }
        System.out.println(Arrays.toString(b));

        // for-each loop
        for (int x : b) {
            System.out.println(x);
        }
    }
}
