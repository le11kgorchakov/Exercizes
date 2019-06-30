/**
 * Created by gorch on 2/1/2018.
 */
public class HomeWork031 {
    public static void main(String args[]){
        System.out.println("2.39. Даны целые числа h, m, s (0 < h ≤ 23, 0 ≤ m ≤ 59, 0 ≤ s ≤ 59), указывающие момент времени: " +
                "\"h часов, m минут, s секунд\". Определить угол (в градусах) между положением часовой стрелки в начале суток и в указанный" +
                " момент\n" + "времени.");
        double h = 1;
        double m = 30;
        double s = 0;
        double res = h * 30 + m * 0.5 + s * 0.033;
        System.out.println(res);

        System.out.println("Ex 3.34");
        int a,b,c,d;
        a = 4;
        b = 4;
        c = 5;
        d = 5;

        System.out.println("а) На поле (a, b) расположена ладья. Записать условие, при котором она угрожает полю (c, d).");
        if (a == c || b == d){
            System.out.println("ladia ugrogaet polu  c,d ");
        }else{
            System.out.println(" ne ugrogaet");
        }
        System.out.println("б) На поле (a, b) расположен слон. Записать условие, при котором он угрожает полю (c, d).");
        if (a + b == c + d || a - b == c - d){
            System.out.println("slon ugrogaet c,d ");
        }else{
            System.out.println(" ne ugrogaet");
        }
        System.out.println("в) На поле (a, b) расположен король. Записать условие, при котором он может одним ходом попасть на поле (c, d).");
        if (a == c || b == d || a + b == c + d || a - b == c - d){
            System.out.println("korol ugrogaet c ,d");
        }else{
            System.out.println("ne ugrogaet");
        }
        System.out.println("г) На поле (a, b) расположен ферзь. Записать условие, при котором он угрожает полю (c, d).");
        if ((a == c && b+1 == d)||(a == c && b-1 == d)||(a+1 == c && b == d)||(a-1 == c && b == d)
                ||(a-1 == c && b-1 == d)||(a-1 == c && b+1 == d)||(a+1 == c && b+1 == d)||(a+1 == c && b-1 == d)){
            System.out.println(" Ferz ugrogaet");
        }else{
            System.out.println("ne ugrogaet");
        }
        System.out.println("д) На поле (a, b) расположена белая пешка. Записать условие, при котором она может одним ходом попасть на поле (c, d):");
        if (a == c && b+1 == d){
            System.out.println("peshka moget proiti na c,d");
        }else if((a+1 == c && b+1 == d)||(a-1 == c && b+1 == d)){
            System.out.println("peshka b'et c,d i proxodit");
        }else{
            System.out.println("peshka ne ugrogaet");
        }
        
    }
}
