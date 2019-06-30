/**
 * Created by gorch on 3/28/2017.
 */
public class HomeWork004 {
    public static void main(String []args)
    {
        System.out.println("ex 2.21");
        int n = 45;
        if (n > 9) {
            int des = n / 10; // 1
            int ed = n % 10; // 6
            System.out.println("number " + n + " has des = " + des + " and edenic = " + ed);
        }else{
            System.out.println("n < 9");
           }

        System.out.println("ex 2.22");
        n = 115;
        if (n > 99) {
            int sot = n / 100; // 1
            int des = n % 100 / 10; // 1
            System.out.println("number " + n + " has sot = " + sot + " and des = " + des);

        }else{
            System.out.println("n < 99");
        }

        System.out.println("ex 2.23");
        n = 1678;
        if (n > 999) {
            int tys = n / 1000; // 1
            int sot = n % 1000 / 100; // 6
            System.out.println("number " + n + " has tysyach = " + tys + " and soten " + sot);
                    } else {
            System.out.println("n < 999");
        }
        System.out.println("ex 2.24");
        n = 237;
        int sot = n / 100; // 2
        int des = n % 100 / 10; // 3
        int ed = n % 10; // 7
        int d1 = n % 100;
        int d2 = n / 100;

        int x = d2 * 100 + d1;
        System.out.println("x = " + x );

        System.out.println("ex 2.25");
        x = 354;
        if (10 <= n && n <= 999){
            d1 = x / 10;
            d2 = x % 10;
            n = d2 * 100 + d1;
            System.out.println("n = " + n);
        }else{
            System.out.println("usloviya ne vernoe");
        }
        System.out.println("ex 2.26");
        n = 564; // naiti x
        d1 = n / 10;
        d2 = n % 10;
        x = d2 * 100 + d1;
        System.out.println("x = " + x);

        System.out.println("2.27");
        x = 537;
        d1 = x / 10;
        d2 = x % 10;

        if (1 <= n && n <= 999){
            n = d2 * 100 + d1;
            System.out.println("n = " + n);
        }else {
            System.out.println("uslovie ne vypolneno");
        }


        System.out.println("ex 2.28");
        n = 546; // find x
        sot = n / 100;
        des = n % 100 / 10;
        ed = n % 10;
        x = des * 100 + sot * 10 + ed;
        d1 = n % 100;
        d2 = n /100;
        int d3 = d1 / 10;
        int d4 = d1 % 10;
        System.out.println(d1+" "+d2+" " +d3+" " +d4);

        System.out.println("x = " + x);

        System.out.println("2.29");

    }

}
