/**
 * Created by gorch on 4/20/2017.
 */
public class HomeWork006 {
    public static void main(String []args){

        System.out.println("ex 3.11");
        // x*x + y*y >=4
        //x=1,y=-1

        System.out.println("ex 4.45");
        int a,b,c;
        a = 12;
        b = 16;
        c = 13;
        if (a == b || b == c || a == c){
            System.out.println("two or more numbers has a equal pair");
        }else{
            System.out.println("no numbers has a pair");
        }

        System.out.println("4.46");
        //triangle a,b,c
        a = 22;
        b = 22;
        c = 22;
        if (a == b && b == c && a == c){
            System.out.println("triangle has equal sides");
        }else{
            System.out.println("triangle doesn't have equal sides");
        }

        System.out.println("ex 4.47");
        a = 24;
        b = 32;
        c = 24;
        if (a == b || b == c || a == c){
            System.out.println("two sides of triangle is equal");
        }else {
            System.out.println("NO sides of triangle is equal");
        }
        System.out.println("ex 4.48");
        // height p1,p2,p3
        double p1, p2, p3;
        p1 = 5.7;
        p2 = 6.4;
        p3 = 5.6;
        if (p1 == p2 && p2 == p3){
            System.out.println("height of people is equal");
        }else{
            System.out.println("no one height is equal");
        }

    }
}
