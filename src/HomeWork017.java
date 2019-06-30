/**
 * Created by gorch on 8/16/2017.
 */
public class HomeWork017 {
    public static void main(String[] args) {
        System.out.println("Ex 8.33");
        int sumdev = 0;
        for (int i = 50; i <= 70; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            System.out.println(count);
            sumdev += count;
        }
        System.out.println("sum of dev = " + sumdev);

        System.out.println("Ex 8.33 while method");

        sumdev = 0;
        int i = 49;
        while (i < 70) {
            i++;
            int j = 0;
            int count = 0;
            while (j <= i) {
                j++;
                if (i % j == 0) {
                    count++;
                }
            }
            // System.out.println(count);
            sumdev += count;
        }
        System.out.println("sum of dev2 = " + sumdev);

        System.out.println("Ex 8.34");


        int j = 1;
        int cond = 12;
        for (i = 0; i <= 30; i++) {
            int sum = 0;
            int count = 0;
            for (j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                    sum += j;
                }
            }
            //System.out.println("count = " + count);
            //
            if (sum == cond) {

                System.out.println(i);
            }
        }

        System.out.println("Ex 8.34 while ");
        i = 99;
        while (i < 300) {
            j = 0;
            int count = 0;
            int sum = 0;
            i++;
            while (j <= i) {
                j++;
                if (i % j == 0) {
                    count++;
                    sum += j;
                }
            }
            //System.out.println("count = " + count);
            //System.out.println("sum = " + sum);
            if (sum == 600) {

                System.out.println(j);
            }
        }

        System.out.println("Ex 8.35");
        for (i = 300; i <= 600; i++)//first cycle
        {

            int count = 0;
            for (j = 1; j <= i; j++)//second cycle
            {
                if (i % j == 0)// dividers count
                {
                    count++;
                }
            }
            //System.out.println("count = "+ count);
            int num = 0;
            if (count % 10 == 0) {
                num++;
                num = i;
                System.out.println("res = " + i);
            }
        }

        System.out.println("Ex 8.35 while ");

        i = 299;
        while (i <= 600) {
            int count = 0;
            i++;
            j = 0;
            while (j <= i) {
                j++;
                if (i % j == 0) {
                    count++;
                }
            }

            int num = 0;
            if (count % 10 == 0) {
                num++;
                num = i;
                System.out.println("res = " + i);
            }

        }

        System.out.println("Ex 8.36");

        for (i = 1; i <= 100000; i++) {
            int sum = 0;
            for (j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sum = sum + j;

                }
            }
            sum -= i;
            if (i == sum) {
                System.out.println("num = " + i + ";" + "sum " + sum + " ");
            }

            //System.out.println();
        }

        System.out.println("Ex 8.36 while ");

        i = 0;// i will start from 1
        while (i <= 100000)  //f cycle
        {
            i++;
            int sum = 0;
            j = 0;
            while (j <= i)   // s cycle
            {
                j++;
                if (i % j == 0) {
                    sum += j;  // get a sum of div
                }

            }
            sum -= i;  // remove i
            if (sum == i) {
                System.out.println("num = " + i + ";" + "sum " + sum + " ");
            }
        }


    }
}
