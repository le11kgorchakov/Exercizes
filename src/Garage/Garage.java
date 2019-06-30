package Garage;

import Garage.Body.Sedan;
import Garage.Engine.Engine;
import Garage.Engine.Gasoline;

/**
 * Created by gorch on 8/25/2017.
 */
public class Garage {
    public static void main(String []args){
        Gasoline mc12346 = new Gasoline();
        mc12346.weight = 120;
        mc12346.size = 4500;


        Cars mercedes = new Cars();

        mercedes.yearMade = 2015;
        mercedes.color = "white ";
        mercedes.make = "mercedes cls 500 ";
        mercedes.price = 44500;
        mercedes.engine = mc12346;

        System.out.println(mercedes);


    }
}
