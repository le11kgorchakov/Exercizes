/**
 * Created by gorch on 7/13/2017.
 */
public class Lesson014 {
    public static void main(String []args){
        for(int i=0;i<5;i++){
            for(int j = 0;j <10;j++){
                System.out.print("5 ");
            }
            System.out.println();
        }
        System.out.println("Ex 8.1b");

        for (int i = 0; i < 5; i++){
            for (int j = 1; j<11; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("Ex 8.1c");

        int a = 41;
        for (int i =0; i<5; i++){

            for (int j = 0; j < 10;j++){
                a++;
                System.out.print(a + " ");
            }
            System.out.println();


        }

        System.out.println("Ex 8.2");

        for (int i =0; i <5; i++){
            for (int j =0; j<=i;j++){
                System.out.print("5 ");
            }
            System.out.println();
        }

        System.out.println("Ex 8.2b");

        for (int i = 5; i>0; i--){
            for (int j = 0; j<i; j++){
                System.out.print("1 ");
            }
            System.out.println();
        }

        System.out.println("Ex 8.3a");


        for (int i=0;i<6; i++){
            for (int j =0; j<i; j++){
               System.out.print(i +" ");
            }
            System.out.println();
        }

        System.out.println("Ex 8.3b");

        for (int i=5;i>0; i--){
            for (int j =0; j<i; j++){
                System.out.print(i +" ");
            }
            System.out.println();
        }

        System.out.println("Ex 8.3c");
        int num = 10;
        for (int i=0;i<5; i++){
            for (int j =0; j<=i; j++){
                System.out.print(num +" ");
            }
            num +=10;
            System.out.println();
        }

        System.out.println("Ex 8.3d");

        num = 5;
        for (int i = 5; i>0;i--){
            for (int j = 1; j<=i; j++){
                System.out.print(num + " ");
            }
            num++;
            System.out.println();
        }

        System.out.println("Ex 8.3g");

        num = 5;
        for (int i = 5; i>0;i--){
            for (int j = 1; j<=i; j++){
                System.out.print(num + " ");
            }
            num +=5;
            System.out.println();
        }

        System.out.println("Ex 8.4a");

        for (int i =0;i<5;i++){
            for (int j = i; j>=0;j--){
                System.out.print(j + " ");
            }

            System.out.println();

        }

        System.out.println("Ex 8.4b");

        for (int i =30;i>26;i--){
            for (int j = i; j<=30;j++){
                System.out.print(j + " ");
            }

            System.out.println();

        }

    }
}
