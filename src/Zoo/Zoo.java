package Zoo;

/**
 * Created by gorch on 8/24/2017.
 */
public class Zoo {
    public static void main (String []args){
        Animals animalSharik = new Animals();
        animalSharik.name = "Sharik";
        animalSharik.age = 2;
        animalSharik.sound = "bark";
        Horse animalSivka = new Horse();
        animalSivka .name = "Sivka";
        animalSivka .age = 5;
        animalSivka .sound = "prrr";
        Wolf volk = new Wolf();
        volk.name = "volk";
        volk.age = 12;
        volk.sound = "shas spou";

        volk.eat();
        volk.voice();
        System.out.println(animalSharik.name+" sound = " + animalSharik.sound + " food = "+ animalSharik.food);
        System.out.println(animalSivka.name+" sound = " + animalSivka.sound + " food = "+ animalSivka.food);
    }
}
