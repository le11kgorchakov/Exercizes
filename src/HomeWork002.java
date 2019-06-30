/**
 * Created by gorch on 3/14/2017.
 */
public class HomeWork002 {
    public static void main(String[] args){
        System.out.println("ex 1.31a");
        double x = 6;
        double y = 9;
        double ans = (x + y) / 2;
        System.out.println("answear = " + ans);

        System.out.println("ex 1.31b");
        ans = Math.sqrt(x * y);
        System.out.println("answear = " + ans);

        System.out.println("ex 1.32");
        double m,o,p;
        m = 160;
        o = 157;
        p = m / o;
        System.out.println("density = " + p);

        System.out.println("ex 1.33");
        double nas = 318_000_000;
        double ter = 9_833_520;
        double plnas = nas/ter;
        System.out.println("plotnost nas USA = " + plnas);

        System.out.println("ex 1.34");
        System.out.println("a * x + b = 0 * (a == 0)");
        double a,b;
        a = 12;
        b = 14;
        x = (-b / a);
        System.out.println("result = " + x);

        System.out.println("ex 1.35 ");
        a = 7;
        b = 7;
        x = Math.sqrt(a * a) + Math.sqrt(b * b);
        System.out.println("result = " + x);

        System.out.println("ex 1.36");

        System.out.println("ex 1.37");
        p = a + b + x;
        System.out.println("result = " + p);

        System.out.println("ex 1.38");
        a = 5;
        b = 5;
        double c = 3;
        p = a + b + 2 * c;
        System.out.println("result = " + p);
        System.out.println();

        System.out.println("ex 1.39  a");
        x = 3;
        y = 5;
        double yTmp;
        double z = ((x + 2 + y) /  (x * x)) / (y + 1) / (( (Math.sqrt(x * x) + Math.sqrt(10))));
        System.out.println("result z = " + z);
        System.out.println("ex 1.39  b");
        double q = 2.8 * Math.sin(x) + Math.abs(y);
        System.out.println("result q = " + q);

        System.out.println("ex 1.40a");
        a = 3.5;
        b = 4.6;
        x = ((2 + b) / ((a + 5)*(a - 5) + 1)) / ((Math.sqrt(b) + a + b) / 3);
        System.out.println("result x = " + x);

        System.out.println("ex 1.40b");
        y = (Math.abs(a) + 2*Math.sin(b)) / (5.5 * a);
        System.out.println("result y = " +y);

        System.out.println("ex 1.41a");
        double e,f,g,h;
        e = 3.7;
        f = 8.3;
        g = 7.1;
        h = 5.5;

        a = Math.sqrt(Math.abs((e - 3) / (1 - f) * (e - 3) / (1 - f) * (e - 3) / (1 - f)) +g);
        System.out.println("result a = " + a);

        System.out.println("ex 1.41 b");
        b = Math.sin(e) + (Math.cos (h) * Math.cos(h));
        System.out.println("result b = " + b);

        System.out.println("ex 1.41c");
        c = (33*g) / ((e * f) - 3);
        System.out.println("result c = " +c);

        //System.out.pr








    }
}
