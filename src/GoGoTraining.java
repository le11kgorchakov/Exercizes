/**
 * Created by gorch on 1/16/2018.
 */
public class GoGoTraining {
    public static void main (String args[]){
        System.out.println(" Termometr");
        //variables
        double c = 17; //celsius
        double f = c * 1.8 +32;//fahrenheit
        double k = c+273;//kelvin
        System.out.println("c = "+c+" f = "+f+" k = "+k);
        String formatted = String.format("%.2f in celsius %.2f in fahrenheit %.2f in kelvin ",c,f,k);
        System.out.println(formatted);
        //f to c = (f -32)/1.8
        System.out.println(" score and if statement");
        int score = 100;
        if (score >= 90 && score < 100){
            System.out.println(" grade A");
        }else if (score >= 80 && score <=89){
            System.out.println(" grade B");
        }else if (score >= 70 && score <=79){
            System.out.println(" grade C");
        }else if (score >=60 && score <= 69){
            System.out.println(" grade D");
        }else if (score <60 && score > 1){
            System.out.println(" grade F");
        }else{
            System.out.println(" score is not real ");
        }
        System.out.println(" score and switch statement ");
        switch (score/10){
            case 9:
                System.out.println("switch statement grade A");
                break;
            case 8:
                System.out.println("switch statement grade B");
                break;
            case 7:
                System.out.println("switch statement grade D");
                break;
            case 6:
                System.out.println("switch statement grade C");
                break;
            default:
                System.out.println("switch statement grade F");
                break;
        }

    }
}
