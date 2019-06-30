import java.util.Scanner;

/**
 * Created by gorch on 9/11/2017.
 */
public class HomeWorkIRMA {
    public static void main(String []args){
        System.out.println("Ex 11.1");
        int array [] = new int[]{
                37,0,50,46,34,46,0,13
        };
        for (int i = 0; i<array.length;i++){
            System.out.println(array[i]);
        }

        System.out.println("Ex 11.2");
        int array1[]=new int[1];
        Scanner input = new Scanner(System.in);

        int x =0;
        int i = 0;
       System.out.println("Enter an Array");
        while (i < array1.length){
           System.out.print("array Number is "+ x + " = ");
            int newinp = input.nextInt();
            x++;
            i++;

        }

        System.out.println("Ex 11.3 A");
        int [] myArray = new int [12];
        for (i =0; i<myArray.length;i++){
            myArray[i]= (int)(Math.random()*2);
            System.out.println(myArray[i]);
        }
        System.out.println("Ex 11.3 B");
        for (i =0; i<myArray.length;i++){
            myArray[i]= (int)(Math.random()*23);
            System.out.println(myArray[i]);
        }
        System.out.println("Ex 11.3 C");
        int[] narray;
        narray = new int[12];
        for (i = 0; i < narray.length; i++) {
            narray[i] = (int)(Math.random() * 10);
            System.out.println(narray[i]);
        }

        System.out.println("Ex 11.3 D");

        narray = new int[12];
        for (i = 0; i < narray.length; i++) {
            narray[i] = ((int)(Math.random() * 100)-50);
            System.out.println(narray[i]);
        }

        System.out.println("Ex 11.4");
        narray = new int[12];
        for (i = 0;i<narray.length;i++){
            narray[i] = ((int)(Math.random()* 28)+163);
            System.out.println(narray[i]);
        }

        System.out.println("Ex 11.5");
        narray = new int[20];
        for (i = 0; i < narray.length; i++) {
            narray[i] = ((int)(Math.random() * 51) +50);
            System.out.println(narray[i]);
        }

        System.out.println("Ex 11.6");

        narray = new int [12];
        int num =0;
        for (i = 0;i < narray.length;i++){
            num = i + 1;

            System.out.print(num+"  ");

        }
        System.out.println();

        System.out.println("Ex 11.7");

        narray = new int [20];
        for (i = 0;i < narray.length;i++){
            num =20;
            num = num - i;
            System.out.print(num+"  ");

        }
        System.out.println();

        System.out.println("Ex 11.8  A");
        narray = new int[8];
        for (i =0; i<narray.length;i++){
            num = 8;
            num -= i;
            System.out.print(num+ " ");
        }
        System.out.println();

        System.out.println("Ex 11.8  B");
        narray = new int[8];
        num = 0;
        for (i =0; i<narray.length;i++){
            num += 1;
            System.out.print(num+ " ");
        }
        System.out.println();

        System.out.println("Ex 11.15");



    }
}
