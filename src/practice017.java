/**
 * Created by gorch on 8/23/2017.
 */
public class practice017
{
    public static void main (String []args)
    {
        System.out.println("Ex 8.37");
        int max = 0;
        int i =0;
        int j =0;
        for (i = 1; i <= 100; i++)
        {

            int sum = 0;
            for (j =1; j<= i; j++)
            {
                if (i%j==0)
                {
                    sum += j;
                }
            }
            if (max < sum)
            {
                max = sum;
            }
            //System.out.println("num = "+ i + "  div sum = " + sum);
        }
        System.out.println("max = " + max);

        System.out.println("Ex 8.37  while");
        i = 0;
        max = 0;
        while(i <= 100)
        {
            int sum = 0;
            i++;
            j = 0;
            while(j<=i)
            {
                j++;
                if (i%j==0)
                {
                    sum +=j;
                }
            }
            if (max < sum)
            {
                max = sum;
            }
        }
        System.out.println("max = " + max);

        System.out.println("Ex 8.38");
        for (i = 1; i<= 100000; i++)
        {
            int sum =0;
            for (j = 1; j <= i; j++)
            {
                if (i % j ==0)
                {
                    sum += j;
                }

            }

            int sum2=0;
            for (j = 1; j <= sum; j++)
            {
                if (i % j ==0)
                {
                    sum2 += j;
                }

            }


            if (i == sum2) {
                System.out.println("sum = " + sum + " sum2 = " + sum2 + " i = " + i);
            }
        }

        System.out.println("Ex 8.38 while");

        i = 0;
        while(i<= 50000)
        {
            i++;
            j=0;
            int sum =0;
            while(j<=i)
            {
                j++;
                if (i%j==0)
                {
                    sum += j;
                }
            }
            i = sum;
            System.out.println("num = " + i + " div = " + sum);
        }

    }
}
