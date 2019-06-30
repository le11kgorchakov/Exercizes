/**
 * Created by gorch on 3/26/2017.
 */
public class Lesson004 {
    public static void main(String[] args) {
        System.out.println("ex 4.1");
        int x = 10;
        double y;
        if (x > 0) {
            y = Math.sin(x) * Math.sin(x);
        } else {
            y = 1 - 2 * Math.sin(x * x);
        }

        if (x > 0) {
            y = Math.sin(x) * Math.sin(x);
        } else if (x < 0) {
            y = 1 - 2 * Math.sin(x * x);
        } else if (x == 0) {
            y = 1 - 2 * Math.sin(x * x);
        }

        if (x > 0) {
            y = Math.sin(x) * Math.sin(x);
        }

        if (x < 0) {
            y = 1 - 2 * Math.sin(x * x);
        }

        if (x == 0) {
            y = 1 - 2 * Math.sin(x * x);

        }
        System.out.println("y = " + y);

        System.out.println("ex 4.2");

        x = 74;
        if (x > 0) {
            y = Math.sin(x * x);
        } else {
            y = 1 + 2 * Math.sin(x) * Math.sin(x);
        }
        System.out.println("y = " + y);

        System.out.println("ex 4.3");
        x = 15;
        if (x > 4) {
            System.out.println("zone 2");
        } else {
            System.out.println("zone 1");
        }

        System.out.println("ex 4.5");
        x = 1;
        if (x <= 2) {
            y = x;
        } else {
            y = 2;
        }
        System.out.println(" y = " + y);

        System.out.println("ex 4.5 b");
        x = 2;
        if (x <= 3){
            y = x;
        }else {
            y = -3;
        }
        System.out.println(" y = " + y);

        System.out.println("ex 4.6");
        x = 6;
        y = 26;
        if (x < y){
            System.out.println("x < y");
        }else  if (x > y ){
            System.out.println("x > y");
        }

        System.out.println("ex 4.8");
        double km = 7;
        double ft = 17800 * 0.305 / 1000;
        System.out.println("km = " + km + " ft " + ft);
        if (km > ft){
            System.out.println("dlinee v km");
        }else if (ft > km){
            System.out.println("dlinee v ft");

        }

        System.out.println("ex 4.9");
        double mS = 180;
        mS = mS / 1000 * 3600;
        double kmH = 350;
        System.out.println("skorost 1 = " + mS + " skorost 2 = " + kmH);
        if (mS > kmH){
            System.out.println("skorost 1 > skorost 2");
        }else if (mS < kmH){
            System.out.println("skorost 1 < skorost 2");

        }
        System.out.println("ex 4.10");
        double r = 12;
        double kv = 6;
        double rK = 2 * Math.PI * r * r;
        double Pkv = kv * kv;
        System.out.println("ploshad kruga = " + rK + " ploshad kvadrata = " + Pkv);
        if (rK > Pkv){
            System.out.println("ploshad kruga > ploshad kvadrata");
        }else if (rK < Pkv){
            System.out.println("ploshad kruga < ploshad kvadrata");
        }

        System.out.println("ex 4.11");
        double obS = 12;
        mS = 3;
        double obT = 0.14;
        double mT = 0.56;
        double  pS = mS / obS;
        double pT = mT / obT;
        System.out.println("plotnost S = " + pS + " plotnost T = " + pT);
        if (pS > pT){
            System.out.println("plotnost S > plotnost T");
        }else if (pS < pT){
            System.out.println("plotnost S < plotnost T");
        }
    }

}
