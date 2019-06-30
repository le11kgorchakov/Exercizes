/**
 * Created by gorch on 9/22/2017.
 */
public class Lesson019 {
    public static void main(String []args){
        System.out.println("Ex 4.91");
        double x = - 3.5;
        double y = 0;

        if (x>=0){
            y=1;
            System.out.println("true 1");
        }else if (x == -1 && x < 0){
            y = x;
            System.out.println("ture 2");
        }else{/* if (x <= -1){*/
            y = 0;
            System.out.println("true 3");
        }

        System.out.println("Ex 4.94");
        int z = 3;

        if (z == 3){
            System.out.println("team win");
        }

        if (z == 2){
            System.out.println("team even");
        }

        if (z == 0){
            System.out.println("tem lose");
        }

        System.out.println("Ex 4.119");

        int a = 5;
        int b = 4;
        int c = 5;
        int d = 6;
        System.out.println("a = " +a+" b = " +b+ " c = " +c +" d = "+ d);

        System.out.println("a  ladia");
        if (a == c || b == d){
            System.out.println("ugrogaet");
        }else{
            System.out.println("ne ugrogaet");
        }
        System.out.println("b  slon");
        if (b - a == d - c){
            System.out.println("urogaet");
        }else{
            System.out.println("ne ugrogaet");
        }
        System.out.println("c   korol");
        if (a+1==c ||a-1==c ||b+1==d || b-1==d){
            System.out.println("ugrogaet");
        }else{
            System.out.println("ne ugragaet");
        }
        System.out.println("d  ferz'");
        if (a==c || b==d || a+b==c+d){
            System.out.println("ugrogaet");
        }else{
            System.out.println("ne ugrogaet");
        }
        System.out.println("e bel peshka");
        if (a+1==c&&b-1==d || a-1==c&&b-1==d){
            System.out.println("ugrogaet");
        }else{
            System.out.println("ne ugrogaet");
        }
        System.out.println("f cher peshka");
        if (a+1==c&&b+1==d || a-1==c&&b+1==d){
            System.out.println("ugrogaet");
        }else{
            System.out.println("ne ugrogaet");
        }
        System.out.println("g KON'");
        if (a-1==c&&b-2==d||a-1==c&&b+2==d||a+1==c&&b-2==d||a+1==c&&b+2==d||a-2==c&&b-1==d||a-2==c&&b+1==d||a+2==c&&b-1==d||a+2==c&&b+1==d){
            System.out.println("ugrogaet");
        }else{
            System.out.println("ne ugrogaet");
        }

        System.out.println("Ex 4.120");
        a = 2;
        b = 2;

        c = 6;
        d = 5;

        int e = 2;
        int f = 5;
        System.out.println("a) ladia vs ladia");
        if (c==e || d==f){
            System.out.println("belaya pod udarom");
        }else{
            System.out.println("xod svobodnyi");
        }
        System.out.println("b) ladia vs ferz'");
        if (c==e || d==f || c-d==e-f){
            System.out.println("belaya pod udarom");
        }else{
            System.out.println("xod svobodnyi");
        }
        System.out.println("c) ladia vs kon'");
        if (c+2==e&&d+1==f||c+2==e&&d-1==f||c-2==e&&d+1==f||c-2==e&&d-1==f||c+1==e&&d-2==f||c-1==e&&d-2==f||c+1==e&&d+2==f||c-1==e&&d+2==f){
            System.out.println("belaya pod udarom");
        }else{
            System.out.println("xod svobodnyi");
        }

    }
}
