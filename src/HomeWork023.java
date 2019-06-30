import java.net.NetworkInterface;

/**
 * Created by gorch on 11/3/2017.
 */
public class HomeWork023 {
    public static void main(String[] args) {
        double dist = 1;
        double n = 2;
        double i = 0;
        double sum = 0;

        while (i <= 50) {
            boolean sign = true;
            if (sign == true) {
                dist -= 1 / n;
                n++;
                i++;
                sum += dist;
            }
            sign = false;
            dist += 1 / n;
            n++;
            sum += dist;
        }
        /*
        int sign = -1;
        dist = dist * sign + 1 /n;
        sign = sign * -1;
        */
        System.out.println(" a;   distance = " + dist);
        System.out.println(" b;    sum = " + sum);


        System.out.println("Ex 5.37");

        System.out.println("Ex 5.32");
        double res = 0;
        n = 1;
        for (int j = 1; j <= 9; j++) {
            double b = n / j;
            res += b;
        }
        System.out.println(res);

        System.out.println("Ex 5.33");

        sum = 0;
        double b = 0;
        for (double j =1;j<=10;j++){
            b=((j+1)/(j+2));
            sum+=b;
        }
        System.out.println("sum = " + sum);

        System.out.println("Ex 5.34");

        sum =0;
        b =1;
        n = 3;
        for (i =1;i<=8;i++) {
            b += b / Math.pow(n, i);
            sum += b;
        }
        System.out.println(sum);

        System.out.println("Ex 5.36");
        double x =2;
        sum = 0;
        for (i=3;i<=11;i+=2){
            x +=Math.pow(x,i)/i;
            sum+=x;
        }
        System.out.println(sum);

        System.out.println("Ex 5.37");
        x = 2;
        sum = 0;
        res = 0;
        b = 1;
        double sign = -1;
        for (i = 1;i <= 10; i++){
            res = sign* ((i+1)/(i+2)) * Math.pow(x,i);
            sign*=-1;
            sum+=res;
        }
        System.out.println("sum = " + sum);

        System.out.println("Ex 5.39");

        int a[]= {2,4,4,5,6,8,9,7,3,56};
        sum = 0;
        for (int j=0;j<a.length;j++) {
            sum+=a[j];
            System.out.println(a[j]);
        }
        System.out.println("sum = " + sum);

        System.out.println("Ex 5.40");
        int n1 = 5;
        int a1[]= new int [n1];
        a1[0]=15;
        a1[1]=2;
        a1[2]=8;
        a1[3]=5;
        a1[4]=9;
        sum=0;
        for (int j = 0;j<a1.length;j++){
            sum+=a1[j];
            System.out.println(a1[j]);
        }
        System.out.println("sum = " + sum);

        System.out.println("Ex 5.41");
        a = new int[]{76,99,8,77,86,4,23,11,98};
        sum =0;
        for (int j = 0; j< a.length; j++){
            sum+=a[j];

        }
        System.out.println("sum = " + sum);

        System.out.println("Ex 5.81");

        System.out.println("6.28");
        int number = 765123;
        int devider = 1;
        int result = number;
        int count = 0;
        int resultT = 0;
        int e = 0;
        while (result > 0){
            result /= 10;
            count ++;
        }
        System.out.println("count = " + count);
        int array[] = new int [count];
        while (devider < 1000000){
            resultT = number / devider;
            resultT %= 10;
            devider *= 10;
            System.out.println("resultT = " + resultT + "   devider = " + devider);
            array[e] = resultT;
            e++;
        }
        e = 0;
        int MaxNumber = 0;
        int MinNumber = 10;
        while(e < array.length){

            if (array[e] < MinNumber){
                MinNumber = array[e];
            }

            if (array[e] > MaxNumber){
                MaxNumber = array[e];
            }
            System.out.println(array[e]);
            e++;
        }
        System.out.println("Max Number = " + MaxNumber);
        System.out.println("Min Number = " + MinNumber);

        System.out.println("Ex 6.29");

        number = 987654;
        devider = 1;
        result = number;
        resultT = 0;
        count = 0;
        e = 0;
        while (result > 0){
            result /= 10;
            count++;
        }
        int ar[] = new int[count];
        while (devider < 1000000){
            resultT = number / devider;
            resultT %=10;
            devider *=10;
            ar[e] = resultT;
            e++;
        }
        MaxNumber =0;
        MinNumber =10;

        e = 0;
        while (e < ar.length){
            if (ar[e] > MaxNumber){
                MaxNumber = ar[e];
            }
            if (ar[e] < MinNumber){
                MinNumber = ar[e];
            }

            System.out.println("array = " + ar[e]);
            e++;
        }
        System.out.println(" Max Number = " + MaxNumber);
        System.out.println(" Min Number = " + MinNumber);


    }
}
