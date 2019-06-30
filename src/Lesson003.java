/**
 * Created by gorch on 3/19/2017.
 */
public class Lesson003 {
    public static void main(String[] args) {
        System.out.println("ex 1.59");
        int a = 5, b = 10;
        System.out.println("a = " + a + " b = " + b);
        int temp = a;
        a = b;
        b = temp;

        System.out.println("result a = " + a + " b = " + b);
        System.out.println("ex2.1");
        a = 567;
        b = a / 100;
        System.out.println("в " + a + " см. " + b + " полных метров");


        System.out.println("ex 2.2");
        a = 678;
        b = a / 100;
        System.out.println("in " + a + " kg " + b + " centnerov");

        System.out.println("ex 2.5");
        a = 234;
        b = a / 7;
        System.out.println(b + " polnyx nedel");

        System.out.println(System.currentTimeMillis());

        System.out.println("ex 2.6");
        int time = 28665;
        int hour = 3600;
        int fullHour = time / hour;
        System.out.println("full hours " + fullHour);
        int ostSek = time - ((time / hour) * hour);
        System.out.println("ostatok sek =  " + ostSek);
        ostSek = time % hour;
        System.out.println("ostatok sek =  " + ostSek);
        int fullMin = ostSek / 60;
        System.out.println("full min " + fullMin);
        int fullSek = ostSek % 60;
        System.out.println(fullHour + " chasov proshlo " + " polnyx minut proshlo " + fullMin + " polnyx sek " + fullSek);

        System.out.println("ex 2.7 ");
        a = 130;
        b = 543;
        int PolnKv = b / a;
        System.out.println("polnyx kvadratov " + PolnKv);

        System.out.println("ex 2.8a");
        a = 8;
        b = a % 7;
        System.out.println("den nedeli " + b);

        System.out.println("ex 2.8b");
        b = (a % 7) + 1;
        System.out.println("den nedeli " + b);
        System.out.println("ex 2.8c");
        int d = 1;
        b = (a % 7) + d - 8;
        System.out.println("den nedeli " + b);

        System.out.println("ex 2.10");
        int des, eden, num;
        num = 342;
        des = num / 10; //34
        System.out.println("kolichestvo des " + des);
        int ed = num % 10; //2
        System.out.println("Chislo edenic " + ed);
        int summa = des+ ed;
        System.out.println("Summa chisel " + summa);
        int pr = des * ed;
        System.out.println("proizvedenie " + pr);





    }
}


