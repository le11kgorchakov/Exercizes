/**
 * Created by gorch on 11/8/2017.
 */
public class Lesson024 {
    public static void main(String []args){
        System.out.println("Ex 5.86");
        int summa = 0;
        int count = 0;
        for (int i = 1;i<=11;i+=2){
            summa +=i;
            count ++;
            System.out.println(count+" in power 2 " + " = " + summa);
        }
        System.out.println("summa = " + summa);

        System.out.println("Ex 5.89");

        int num = 1;
        int n = 9;
        for (int i = 1;i<=n;i++){
            num *= i;
            System.out.println("num "  + num);

        }

        System.out.println("Ex 5.90");

        n = 3;
        double sum = 1;
        double number = 1;
        for (double i = 1;i <= n;i++){
            number*=i;
            sum +=1.0/number;
            System.out.println("num " + number);
        }
        System.out.println("summa = "+sum);

        System.out.println("Ex 5.91");
        n = 5;
        double x = 2;
        num = 1;
        sum = 1;

        for (double i = 1; i <= n; i++){
            num *= i;
            sum += Math.pow(x,i)/num;
            System.out.println("sum = " +sum  + "  num = " + num);
        }
        System.out.println("summa = " +sum);

        System.out.println("Ex 5.92");

        num = 0;
        sum = 0;
        for (double i = 50;i >=1; i--){
            num +=Math.sqrt(num + Math.sqrt(i));
        }
        System.out.println("summa = " + num );

        System.out.println("Ex 5.93  A");
        sum = 0;
        num = 1;
        for (double i = 1; i <=5; i++){
            num+=Math.sin(i);
            sum+=1.0/num;
        }
        System.out.println("summa = " + sum);

        System.out.println("Ex 5.93  B");
        num =1;
        for (double i = 1; i<=5; i++){
            num += Math.sqrt(2+num);
        }
        System.out.println(" result = " + num);



    }
}
