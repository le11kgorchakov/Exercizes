/**
 * Created by gorch on 4/10/2017.
 */
public class Lesson005 {
    public static void main(String []args){

       System.out.println("ex 4.12");
       int i = 220;
       int r1 = 10;
       int r2 = 20;
       int u1 = i * r1;
       int u2 = i * r2;
       if (u1 > u2){
           System.out.println("U1 bolshe chem U2 " + u1);
       }else {
           System.out.println("U2 bolshe chem U1 " + u2);
       }
       System.out.println("4.13");
       int a = 23;
       int b = 45;
       int c = 12;
       //int x = - b
        if (a == 0) {
            System.out.println("urovnenie ne imeet vechestvennyx kornei");
        } else {
            System.out.println("urovnenie koren'");
        }
        System.out.println("4.14");
        if (a != 0){
            double x1 = -b - Math.sqrt(b * b - (4 * a * c)) / (2 * a);
            double x2 = -b + Math.sqrt(b * b - (4 * a * c)) / (2 * a);
            System.out.println(" x1 = "+ x1 + "; x2 = " + x2);
        }else {
            System.out.println("kornei net");
        }

        System.out.println("ex 4.15");

        int yb = 1985;
        int mb = 1;
        int y = 2017;
        int m = 4;

        if (mb <= m){
            int vozrast = y - yb;

            System.out.println("vozrast = " + vozrast);
        } else {
            int vozrast = y - yb;
            vozrast --;
            System.out.println("vozrast = " + vozrast);
        }
        System.out.println("ex 4.16");
        double PlKv = 25;
        double PlKr = 113.04;
        double StKv = Math.sqrt(PlKr);
        double RaKr = PlKr/Math.PI;
        RaKr = Math.sqrt( RaKr);
        double DlKr = RaKr * 2;
        if (DlKr < StKv){
            System.out.println("Krug vlezet v kvadrat");
        }else if (StKv < DlKr){
            System.out.println("kvadrat vlezet v krug");
        }else{// ==
            System.out.println("usloviya ne sootvetstvuet");
        }

    }


}
