import java.util.Map;

/**
 * Created by gorch on 3/13/2017.
 */
public class Lesson002 {
    public static void main(String[] args){
        int xxxx = 2_100_000_000;
        double yyyy = xxxx;
        xxxx =(int)yyyy;
        byte byt=127;
        short sh = 32500;
        int in = 2_100_000_000;
        long lg = 2000000000000000000L;

        float fl = 3.14f;
        double db = 2.4;

        char ch = 't';

        boolean bl = true;
        bl = false;

        lg = (long)byt;
        byt =(byte) lg;

        String str = "2+2";
        int i = 2 + 3;
        Lesson002 lsn = new Lesson002();
        System.out.println(lsn);
        xxxx = xxxx / byt;
        System.out.println(xxxx);
        xxxx = xxxx % byt;
        xxxx = 5 % 2;
        System.out.println(xxxx);

        System.out.println("ex 1.27");
        System.out.println("part a");
        int x = 5;
        int y = (7 * (x * x)) - (3 * x) - 6;
        System.out.println("res = " + y);

        System.out.println("ex 1.27");
        System.out.println("part b");
        int a = 5;
        x = (12 * (a * a)) + (7 * a) - 16;
        System.out.println("res = " + x);
        double s = Math.sqrt(4.0);
        System.out.println(s);

        System.out.println("ex 1.23");
        double aa = 5;
        double yy = ((a * a) + 10) / Math.sqrt((a * a) + 1);
        System.out.println("yy =  " + yy);

        System.out.println("ex 1.24a");
        aa = 5;
        yy = Math.sqrt(((2 * a) + Math.sin(3 * a)) / 3.56);
        System.out.println("yy = " + yy);

        System.out.println("ex 1.24b");
        x = 5;
        yy = Math.sin((3.2 + Math.sqrt(1 + x)) / 5 * x);
        System.out.println("yy = " + yy);

        System.out.println("ex 1.25");
        a = 5;
        x = a * 4;
        System.out.println("x = " + x);
        double r = 6;
        aa = 2 * Math.PI * r;
        System.out.println("aa =" + aa);

        System.out.println("ex 1.28");
        a = 2;

        aa = a * a * a;
        yy = a * a;
        System.out.println("volume = " + aa);
        System.out.println("square = " + yy);

        System.out.println("ex 1.29");
        r = 12;
        aa = 2 * Math.PI * r;
        yy = (aa * r) / 2;
        System.out.println("aa = " + aa);
        System.out.println("yy = " + yy);

        System.out.println("ex 1.30a");
        x = 5;
        y = 7;
        double z = ((x * x * x) - (2.5 * x * y) + (1.78 * x * x) - 2.5 * y + 1);
        System.out.println("z = " + z);

        System.out.println("ex 1.30b");
        a = 4;
        double b = 3;
        double res = (3.56 * a + b * b * b) - (5.8 * b * b) + 3.8 * a - 1.5;
        System.out.println("x = " + res);

















    }
}
