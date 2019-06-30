/**
 * Created by gorch on 5/14/2017.
 */
public class HomeWork009 {
    public static void main (String []args){


        System.out.println("ex 5.32");
        double k = 1;
        double summa = 0;
        for (int i = 1; i <= 9; i++) {
            double j = k / i;
            summa = summa + j;

        }
        System.out.println("summa = " + summa);

        System.out.println("ex 5.36");
        double x = 2;
        summa = 0;
        for (int kon = 1; kon <= 11; kon += 2 ){
            double j = x / kon;
            double xst = Math.pow(x,kon);

            summa = summa + j;

        }
        System.out.println("summa = " + summa);

        System.out.println("ex 5.37");
        double xs = 2;
        int sign = -1;
        summa = 0;
        for ( double i = 1; i <= 10; i++){
             double j = sign * ((i+1)/(i+2) * Math.pow(xs,i));
             sign = sign * -1;
             summa = j + 1;
             //System.out.println("j=  " + j);
             //System.out.println("i=  " + i);
        }
        System.out.println("summa=  " + summa);

        System.out.println("ex 6.2");
        int a[] = new int[11];
        a[0] = 120;
        a[1] = 180;
        a[2] = 762;
        a[3] = 3;
        a[4] = 4;
        a[5] = -5;
        a[6] = 6;
        a[7] = 7;
        a[8] = 8;
        a[9] = 9;
        a[10] = -9;
        summa = 0;
        for (int i =0; i<a.length; i++){
            summa = summa + a[i];

            System.out.println("array ["+i+"] ="+a[i]);
            System.out.println("summa = " + summa);
        }
        double res = summa / 11;
        System.out.println("srednee orifmeticheskoe  = " + res);

       System.out.println("ex 6.3");
       int sum = 0;
       int n[] = {45,77,15,22,44,66};
       for (int i = 0; i < n.length; i++){
           System.out.println(n[i]);
           if (n[i] % 2 == 0){
               sum = sum + n[i];
           }
       }
        System.out.println("sum = " + sum);


        System.out.println("ex 6.4");
        sum =0;
        int n2[] = {-11,-15,22,-76,98,-15,-8,667,-8789};
        for (int i =0; i < n.length; i++){
            if (n2[i] < 0){

                sum = sum + n2[i];
               System.out.println("i= " + n2[i]);
            }
        }
        System.out.println("quantity negative numbers = " + sum);

    }
}
