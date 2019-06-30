import java.util.Random;

/**
 * Created by gorch on 11/16/2017.
 */
public class HomeWork025 {
    public static void main (String []args){
        System.out.println("Ex 11.8");
        int array [] = new int [8];
        int step = 8;
        //for(int j=8; j>=1; j-- )
        for (int i=0;i<array.length;i++){
            array[i] = step;
            step--;
            System.out.print(array[i]);
        }
        System.out.println();
        for (int i = 0;i <array.length;i++){
            array[i]=i;
            System.out.print(array[i]);
        }

        System.out.println();
        System.out.println("Ex 11.9");
        array = new int [10];
       //a1, a2=a1+p,a3=a2+p
        int a = -20;
        int p = 3;

        for (int i = 0;i < array.length;i++){
            a = a + p;
            array[i] = a;
            System.out.print("  " + array[i]);
        }


        System.out.println();
        System.out.println("Ex 11.9 B");
        array = new int[20];
        a = 2;
        int z = 2;

        for (int i = 0;i < array.length; i++){
            System.out.print("  " + a);
            a = a * z;
            array[i] = a;

        }
        System.out.println();
        System.out.println("Ex 11.9 C");

        array = new int [20];
        a = 1;
        int b = 0;


        for (int i = 0; i < array.length; i++){
            //System.out.println(array[i]);
            int c = a + b;
            a = b;
            b = c;
            array[i] = c;
            System.out.print(" " + array[i]);
        }

        System.out.println();
        System.out.println("Ex 11.10");
        array = new int [50];
        int n = 40;
        int count = 0;
        for (int i = n;i >=0; i--){
            array[count] = i;
            count ++;
        }
        for (int i = 0;i < array.length;i++){
            System.out.print(" " + array[i]);
        }

        System.out.println();
        System.out.println("Ex 11.11");
        array = new int[20];
        Random rnd = new Random();
        for (int i = 0; i <array.length; i++){
            int num = rnd.nextInt(21);
            array[i] = num;
            System.out.print(" " + array[i]);
        }

        System.out.println();
        System.out.println("Ex 11.14");

        array = new int [10];
        count = 0;
        for (int i = 9; i >=0 ; i--){
            array[count]=i+1;
            count++;

        }

        for(int i = 0; i< array.length; i++){
            System.out.print(" " + array[i]);
        }

        System.out.println();
        System.out.println("Ex 11.13");
        array = new int[]{4,5,6,7,8,11,234,5};

        for (int i = 0; i<array.length;i++){

            System.out.print(" index = " + i + " array = " + array[i]);
        }
        System.out.println();
        System.out.println(array[3]);

        System.out.println("Ex 11.12");
        array = new int[5000];
        count =1;
        for (int i = 300;i <array.length;i++){
            array[i] = i;
            if (i % 13 == 0 || i % 17 == 0){
                System.out.print("  count   "+count);
                System.out.print("   " +array[i]);
                count++;
                if (count == 21){
                    break;
                }
            }

        }

        System.out.println();
        System.out.println("EX 11.15");
        double temp = 0;
        double res = 0;
        n = 9;
        array = new int [n];
        count = 0;
        for (int i = n-1; i >= 0; i--){
            array [count] = i +1;
            count ++;
        }
        for (int i = 0; i <array.length; i++){
            temp = array[0];

        }
        res = Math.sqrt(temp);
        System.out.println(res);

        System.out.println("Ex 8.3");
        for (int i = 1; i<=5;i++){
            for (int j = 1;j<=i;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("Ex 8.3 b");
        n = 0;
        for (int i =1;i<=5;i++){
            n+=10;
            for (int j = 1;j<=i;j++){
                System.out.print(n+" ");
            }
            System.out.println();
        }
        System.out.println("Ex 8.3 c");
        n = 4;
        for (int i = 5; i > 0; i--){
           n++;
           for (int j = 0; j < i; j++){
               System.out.print(n + " ");
           }
           System.out.println();
       }
        System.out.println("Ex  8.3 d");
        n = 0;
        for (int i = 5; i > 0; i --){
            n +=5;
            for (int j = 0; j < i; j++){
                System.out.print(n + " ");
            }
            System.out.println();
        }


        System.out.println("Povtor");
        n = 0;
        for (int i=1;i<=5;i++){
            n+=100;
            for (int j = 1;j<=i;j++){
                System.out.print(n + " ");
            }
            System.out.println();
        }
        System.out.println("naoborot");
        n=0;
        for (int i = 1;i<=5;i++){
            n+=100;
            for (int j = 5;j>=i;j--){
                System.out.print(n+" ");

            }
            System.out.println();
        }

        System.out.println("Ex 8.9");
        int Darray [] [] = new int[][]{
                {1,2,3},
                {2,3,5},
                {4,5,6},
                {7,6,5},
                {1,3,9}
        };

        int min = 10;
        int max = 0;
        for (int i =0;i<3;i++){
            for (int j = 0;j <Darray.length;j++){
                System.out.print(Darray[j][i]+" ");
                if (min > Darray[j][i]){
                    min = Darray[j][i];
                }
                if (max < Darray[j][i]){
                    max = Darray[j][i];
                }
            }
            System.out.println();
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);

        System.out.println("RANDOM");
        Random rn = new Random();
        n = rn.nextInt(9);
        for (int i = 0; i<=n;i++){
            for (int j = 0; j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("n = "+n);

        System.out.println("Ex 8.26");

        count = 0;
        for (int i = 1;i <=n; i++){
            count++;
            System.out.print(count);
            for (int j = 1;j <=i; j++){
                if (i % j ==0){
                    System.out.print("+");
                }
            }
            System.out.println();
        }

        System.out.println("Ex 2.3");
        int kg = 16567;
        int tn = 0;
        tn = kg / 1000;
        System.out.println(tn +" ton");


        System.out.println("Ex 3.1");

    }
}
