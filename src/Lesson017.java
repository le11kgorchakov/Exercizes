/**
 * Created by gorch on 8/15/2017.
 */
public class Lesson017 {
    public static void main(String []args){
        System.out.println("Ex 8.26");


        for ( int i = 1; i<= 12; i++){
            System.out.print(i);
            for (int j = 1; j<= i; j++){
                if (i % j == 0){
                    System.out.print("+");
                }
            }
            System.out.println();
        }

        System.out.println("8.27");

        for (int i = 1; i<300; i++){
            int count =0;
            for (int j =1; j<=i; j++){
                if (i % j == 0){
                    count++;
                }
            }
            if (count == 5){
                System.out.println(i);
            }

            //System.out.println();
        }

        System.out.println("8.30a");
        int max = 0;
        for (int i = 1; i<= 12;i++){
            int count = 0;
            for (int j = 1; j<= i; j++){
                if (i%j==0){
                    count++;
                }
            }
            if (count > max){
                max = count;
            }
        }
        System.out.println("max dividers  = " + max);

        System.out.println("Ex 8.30b");
        int min = 30;
        for (int i = 1; i<= 30; i++){
            int count =0;
            for (int j = 1; j<= i; j++){
                if (i % j == 0){
                    count++;
                }
            }
            if (min > count){
                min = count;

            }
        }

        System.out.println("min = "  + min);

        System.out.println("Ex 8.31");
        for (int i = 100; i <= 1000; i++){
            int count =0;
            for (int j = 1; j <= i; j++){
                if (i % j == 0){
                    count++;
                }
            }
            if (count == 2){
                System.out.println("i = " + i);
            }

        }

        System.out.println("Ex 8.31");
        int i = 0;
        int countOfSimpleNumber = 0;
        while(countOfSimpleNumber < 100){
            i++;
            int count = 0;
            for(int j=1;j<=i;j++){
                if (i % j ==0){
                    count++;
                }
            }
            if(count == 2){
                System.out.println("chislo = " + i);
                countOfSimpleNumber++;
            }
        }

        i=0;
        for (int cosn = 0;cosn < 100; ){
            int count =0;
            i++;
            for (int j =0; j<=i; j++){
                if (i % j == 0){
                    count++;
                }
            }
            if (count == 2){
                System.out.println("num = " + i);
                cosn++;
            }

        }
    }
}
