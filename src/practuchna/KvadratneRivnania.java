package practuchna;

/**
 * Created by admin on 12.10.2015.
 */
public class KvadratneRivnania {
    public static void main(String[] args) {
        double a = 1;
        double b = 5;
        double c = 4;
        double d = b * b - 4 * a * c;
        double x1 = (-b - Math.sqrt(d)) / (2 * a);
        double x2 = (-b + Math.sqrt(d)) / (2 * a);
        System.out.println(x1);
        System.out.println(x2);
    }
}
