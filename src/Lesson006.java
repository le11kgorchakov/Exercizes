/**
 * Created by gorch on 4/18/2017.
 */
public class Lesson006 {
    public static void main (String []args) {
        System.out.println("ex 4.1");
        double x = 3;
        double y = 0;
        if (x > 0) {
            // когда выражение ИСТИННО
            System.out.println("True");
            y = Math.sin(x) * Math.sin(x);
        } else {
            System.out.println("Fales");
            y = 1 - 2 * Math.sin(x * x);
        }
        System.out.println("result y = " + y);

        System.out.println("ex 4.2");
        x = -3;
        y = 0;
        if (x > 0) {
            y = Math.sin(x * x);
            System.out.println("True");

        } else {
            y = 1 + 2 * (Math.sin(x) * Math.sin(x));

        }
        System.out.println("result y = " + y);

        System.out.println("ex 4.3");
        x = 4;
        if (x > 4) {
            System.out.println("2 oblast");
        } else if (x < 4) {
            System.out.println("1 oblast");
        } else {
            System.out.println("Line EQUAL");
        }

        System.out.println("ex 4.5");
        x = 5;
        if (x >= 2) {
            System.out.println("y = 2");
        } else {
            y = x;
            System.out.println("y equal x");
        }
        System.out.println("ex 4.5 b");
        x = 2;
        if (x >= 3) {
            System.out.println("y = -3");
        } else {
            y = -x;
            System.out.println("y equal -x   " + (int) y);
        }

        System.out.println("4.20");
        int m = 8;
        int n = 5;
        if (m % n == 0) {
            int res = m / n;
            System.out.println("result = " + res);
        } else {
            System.out.println("m na n nacelo ne delitsya");
        }
        System.out.println("ex 4.22");
        n = 10;
        if (n % 2 == 0) {
            System.out.println(" n chetnoe");
        } else {
            System.out.println(" n ne chetnoe");
        }

        System.out.println("ex 4.22 b");
        n = 18;
        if (n % 10 == 7) {
            System.out.println("n okanchivaetsya na 7");
        } else {
            System.out.println("n ne okanchivaetsya na 7");
        }

        System.out.println("ex 4.23");
        n = 23;
        int a2 = n % 10;
        int a1 = n / 10;
        if (a1 > a2){
            System.out.println("pervaya cifra bolshe");
        }else if (a2 > a1){
            System.out.println("voraya cifrar bolshe");
        }else {
            System.out.println("cifry odinakovy");
        }
        System.out.println("ex 4.28");
        n = 328;
        a1 = n / 100;
        int a3 = n / 10;
        a2 = n % 100 / 10;
        if (a1 > a3) {
            System.out.println("pervaya cifra bolshe");
        }else if (a3 > a1){
            System.out.println("tretia cifra bolshe");
        }else if (a1 > a2){
            System.out.println("pervaya cifra bolshe");
        }else if (a2 > a1){
            System.out.println("vtoraya cifra bolshe");
        }else if (a2 > a3){
            System.out.println("vtoraya cifra bolshe");
        }else if (a3 > a2){
            System.out.println("treria cifra bolshe");
        }

        System.out.println("ex 4.37");
        n = 5;

        if (n > -3 && n< 5){
            System.out.println("Принадлежит");
        }else{
            System.out.println("Не принадлежит");
        }
        System.out.println("ex 4.42");
        int a,b,c;
        a = 4;
        b = 3;
        c = 6;
        if (a < b && b < c){
            System.out.println("neravenstvo A vypolnyaetsya");
        }else if (b > a && a > c){
            System.out.println("neravenstvo B vypolnyaetsya");
        }else{
            System.out.println("neravenstvo ne vypolnyaetsya");
        }
        System.out.println("ex 4.39");
        n = 3;
        if (n <= -1){
            System.out.println("oblast 3");
        }else if (n > -1 && n < 5){
            System.out.println("oblast 2");
        }else if (n >= 5){
            System.out.println("oblst 3");
        }
        System.out.println("ex 4.43");
        if (a % b == 0 && b % a == 0) {
            System.out.println("da odno iz chisel yavlyaetsya delitelem");
        }else {
            System.out.println(" net ni odno iz chisel ne yavlyaetsya delitelem");
        }
        System.out.println("ex 4.44");
        a = 4;
        b = 6;
        c = 10;
        int d = 11;
        if (a % b == c || a % b == d){
            System.out.println(" da ostatok raven odnomu iz zadanyx chisel");
        }else{
            System.out.println("net ostatok ne raven ni odnomu iz chisel C i D");
        }
    }

}
