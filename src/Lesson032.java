public class Lesson032 {
    public static void main (String args[]){
        System.out.println("Ex 4.36. Работа светофора для пешеходов запрограммирована следующим образом: в начале каждого часа" +
                " в течение трех минут горит зеленый сигнал, затем в течение двух минут — красный, в течение трех минут — опять" +
                " зеленый и т. д. Дано вещественное число t, означающее время в минутах, прошедшее с начала очередного часа." +
                " Определить, сигнал какого цвета горит для пешеходов в этот момент. ");

        int time = 6;
        int t = time % 5;
        if (t>0 && t<=3){
            System.out.println(" green ");
        }else{
            System.out.println(" red ");
        }

        time = 12;
        t = time % 6;
        if (t>0 && t<=3){
            System.out.println(" green ");
        }else if (t == 4){
            System.out.println( " yellow ");
        }else{
            System.out.println(" red ");
        }


        System.out.println("Даны три вещественных числа a, b, c. Определить, " +
                "имеется ли среди них хотя бы одна пара равных между собой чисел. ");

        int a,b,c;
        a = 22;
        b = 13;
        c = 22;
        if (a == b || a == c || b == c){
            System.out.println(" imeutsya pary chisel ");
        }else{
            System.out.println(" ne imeutsya");
        }

        System.out.println(" Ex 5.71 5.71. Гражданин 1 марта открыл счет в банке, вложив 1000 руб." +
                " Через каждый месяц размер вклада увеличивается на 2% от имеющейся суммы. Определить: " +
                "а) прирост суммы вклада за первый, второй, ..., десятый месяц;" +
                " б) сумму вклада через три, четыре, ..., двенадцать месяцев. ");
        double vklad = 1000;
        for (int i = 0; i < 12; i++){
            double procent = vklad /100 *2;
            vklad+=procent;
            System.out.println(procent);
        }

        System.out.println(" anuitetnyi plateg ");
        double summaKredita = 320000;
        //K=i*(1+i)n/((1+i)n-1),
        double srokKredita = 360;
        double procent = 3;
        double procMonthly = procent/12;
        double Monthly = summaKredita/srokKredita;
        double summaProcentov = 0;
        for (int i = 0; i < 360; i++){
            double sumMonthlyProc =  summaKredita / 100 * procMonthly;
            sumMonthlyProc +=Monthly;
            summaKredita-=Monthly;
            summaProcentov+= sumMonthlyProc;
            System.out.println(" sumMonthlyProc " + sumMonthlyProc+ "\tostato po Kreditu " + summaKredita);

        }

        System.out.println(" summa proc = " + summaProcentov );
        summaProcentov/=srokKredita;
        System.out.println(" monthly procent  = " + summaProcentov );

    }
}
