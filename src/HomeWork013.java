/**
 * Created by gorch on 7/5/2017.
 */
public class HomeWork013 {
    public static void main(String []args) {
        System.out.println("excercize 6.28");
        int num = 123459678;
        int dev = 100000000;
        int count = 0;
        int res1 = num;
        int res2 = 0;
        int i = 0;
        int maxN =0;
        int maxNret = 0;

        while (res1>0)
        {
            res1 /= 10;
            count++;
        }
        int a[] = new int [count];

        while (dev>0)
        {
            res2 = num / dev;
            res2 %= 10;
            dev /= 10;
            a[i] = res2;
            i++;
            System.out.println(res2);
        }
        i = 1;
        int max = a[0];
        while (i < a.length)
        {

            if (a[i] > max)
            {
            max = a[i];
            maxN = i;
            }
            i++;
        }
        maxNret = count - maxN;
        System.out.println("max num = " + max);
        System.out.println("maxN = " + maxN);
        System.out.println("maxNret = " + maxNret);



     }
}
