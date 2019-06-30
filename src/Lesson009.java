import java.util.Scanner;

/**
 * Created by gorch on 5/13/2017.
 */
public class Lesson009 {
    public static void main (String []args){
        System.out.println("ex 5.30");
        int sum = 0;
        for (int i = 20; i <= 40; i++){
            sum += i * i * i;
            //Math.pow(i,3)

        }
        System.out.println(sum);

        System.out.println("ex 5.30 b");
        Scanner sc= new Scanner(System.in);
        double s = 0;
        int a = sc.nextInt();
        for (;a<=50; a++){
           s += Math.pow(a,3);
        }
        System.out.println(s);

        System.out.println("ex 5.32");
        s = 0;
        for (int i = 1; i <= 9; i++){
            double j=1/i;
            s = s +j;
            System.out.println(j);
        }
        System.out.println(sum);

        System.out.println("5.33");
        s = 0;
        for (int i = 2; i <= 10; i ++){
            double j = i / i+1;
            s = s + j;
        }
        System.out.println(s);

        System.out.println("ex 5.34");
        s = 0;
        for (int i = 0; i <= 8; i++){
            double j = 1/ Math.pow(3,i);
            s = s + j;
        }
        System.out.println(s);


        System.out.println("5.35");
        s = 0;
        int sign = -1;
        double j = 1.0;
        for (int i = 1; i <= 9; i++){
            s = j + (1/i*sign);
            sign = sign * -1;
        }

        int array[] = new int[4];
        array[0] = 10;
        array[1] = 5;
        array[2] = -8;
        array[3] = 0;

        System.out.println(array);
        for(int i = 0; i < array.length; i++){
            System.out.println("array["+i+"] = "+ array[i]);
        }
        int u = 0;
        while(u < array.length){
            System.out.println("array["+u+"] = "+ array[u]);
            u++;
        }
        u = 0;
        while(array[u] != 0){
            System.out.println("array["+u+"] = "+ array[u]);
            u++;
        }
        int arr[] = {1,2,3,4,2,3,0};
    }
}
