/**
 * Created by gorch on 4/24/2017.
 */
public class HomeWork007 {
    public static void main (String [] args){
        System.out.println("3.12");
        int x = 1;
        int y = -1;
        boolean res = x*x >= 0;
        if (x*x >= 0 && y*y >= 0){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        System.out.println("3.12b");
        x = 2;
        y = -2;
        if (x >= 2 || y*y != 4){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        System.out.println("ex 3.13 ");

        System.out.println("B = false A = true");
       boolean A = true;
       boolean B = false;
        res = !A && B;
        System.out.println("Not A and B = " + res);
        res = !A || B;
        System.out.println("Not A or B =" + res);
        res = A || !B;
        System.out.println("A or Not B = " + res);

        System.out.println("A = false B = true");
        A = false;
        B = true;

        System.out.println("Not A and B = " + res);
        res = !A || B;
        System.out.println("Not A or B =" + res);
        res = A || !B;
        System.out.println("A or Not B = " + res);


       System.out.println("ex 3.29");

       x=21;
       y=29;
       if (x % 2 > 0 && y % 2 > 0){
           System.out.println("true");
       }else {
           System.out.println("false");
       }
        System.out.println("ex 3.29 b");

       if (x < 20 || y < 20){
           System.out.println("true");
       }else {
           System.out.println("false");
       }
        System.out.println("3.29 g");
       x=-16;
       y=-123;
       int z=-665;
       if (x<0 && y<0 && z<0){
           System.out.println("true");
       }else {
           System.out.println("false");
       }
        System.out.println("3.31");
       int n = 98;
       if (n % 5 == 0 || n % 7 == 0){
           System.out.println("true");
       }else{
           System.out.println("false");
       }
        System.out.println("3.31 b");

       n = 180;
       if (n % 4 == 0){

           System.out.println("true");
       }else {
           System.out.println("false");
       }

        System.out.println("3.32a");
       x = -5;
       y = 10;
       if (x<=2 && y >=1){
           System.out.println("koordinaty prenadlegat vybranoi oblasti");
       }else {
           System.out.println("koordinaty NE prenadlegat vybranoi oblasti");
       }
        System.out.println("ex 3.32b");
       x = -14;
       y = 1;
       if (y <= 1.5 && y >= -2){
           System.out.println("koordinaty prenadlegat vybranoi oblasti");
       }else {
           System.out.println("koordinaty NE prenadlegat vybranoi oblasti");
       }

        //System.out.println("2.39");
       //int h,m,s;
       //h = 15;
       //m = 16;
       //s = 54;
        System.out.println("ex 2.38");
       //k =

        System.out.println("ex 2.43");
        int a = 8;
        int b = 4;
        if (a % b == 0 || b % a == 0){
            System.out.println("1");
        } else{
            System.out.println("2");
        }

        System.out.println("ex.3.1");
        A = true;
        B = false;
        boolean C = false;
        res = A || B;
        System.out.println("A or B = " + res);
        res = A && B;
        System.out.println("A and B = " + res);
        res = B || C;
        System.out.println("B or C = " + res);

        System.out.println("ex 3.21");
        if (A == true && B == false && C == true){
            boolean resA = (!(A || !B && C));
            boolean resB = (A && !(B || !C));
            boolean resC = (!(!A || B && C));
            System.out.println("a)= " + resA);
            System.out.println("b)= " + resB);
            System.out.println("c)= " + resC);
        }   if (A == false && B == true && C == false) {
            boolean resA = (!(A || !B && C));
            boolean resB = (A && !(B || !C));
            boolean resC = (!(!A || B && C));
            System.out.println("a)= " + resA);
            System.out.println("b)= " + resB);
            System.out.println("c)= " + resC);
        }
       }

    }

