package Garage;

import Garage.Engine.Engine;

/**
 * Created by gorch on 8/25/2017.
 */
public class Cars {
    String make;
    String color;
    int price;
    int yearMade;
    Engine engine;
    // methods
    public String toString(){
        return "Make - " + this.make+";" + "   color - " + this.color+";" + "   price - " + this.price+";" + "  year made - " + this.yearMade+";";
    }
}
