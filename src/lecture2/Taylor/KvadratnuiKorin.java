package lecture2.Taylor;


public class KvadratnuiKorin {

    private static long fact(int x) {
        if (x < 2) {
            return 1;
        } else {
            long fact = 2;
            for (int i = 3; i <= x; i++) {
                fact = fact * i;
            }
            return fact;
        }
    }

    public static void main(String[] args) {
        double x = 8;
        int i;
        double result = 1;
        double nominator = 1;

        for (i = 2; i < 5; i++) {
            nominator = Math.pow(x, i) * fact(2 * i) * (i % 2 == 0 ? -1 : 1);
            long factI = fact(i);
            result = result + nominator / (1 - 2 * i) / factI / factI / Math.pow(4, i);

        }
        System.out.println(result);
    }
}
