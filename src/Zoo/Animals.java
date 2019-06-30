package Zoo;

/**
 * Created by gorch on 8/24/2017.
 */
public class Animals {
    String name;
    int age;
    String sound;
    String food = "some food";

    void eat(){
        System.out.println("Animal " + this.name + " food is " + this.food);
    }

    void voice(){
        System.out.println("Animal " + this.name + " sound " + this.sound);
    }
}
