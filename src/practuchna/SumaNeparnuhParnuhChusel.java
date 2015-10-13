package practuchna;

/**
 * Created by admin on 12.10.2015.
 */
public class SumaNeparnuhParnuhChusel {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        int i;
        int sum1 = 0;
        int sum2 = 0;
        for (i = a; i <= b; i++) ;
        {
            if (i % 2 == 0) ;
            {

                sum1 = sum1 + i;
            }
            {
                sum2 = sum2 + i;
            }

        }
        System.out.println(sum1);
        System.out.println(sum2);


    }
}





