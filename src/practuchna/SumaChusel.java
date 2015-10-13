package practuchna;

/**
 * Created by admin on 12.10.2015.
 */
public class SumaChusel {
    public static void main(String[] args) {
        int a = 1;
        int b = 9;
        int sum = 0;

        for (int i = a; i <= b; i++) {
            sum = sum + i;
            System.out.println(i);
        }
        System.out.println(sum);
    }
}
