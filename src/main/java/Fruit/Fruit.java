package Fruit;

import Ri.Ri;

import java.security.InvalidParameterException;

public class Fruit {

    private String name;
    private Nutritions nutritions;

    public Fruit() {
        this.name = name;
        this.nutritions = nutritions;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", nutritions=" + nutritions +
                '}';
    }

    public String getRi(double mass){

        if(mass < 0){
            throw new InvalidParameterException("Masa nie może byc mniejsza niż 0");
        }

        double carbo = Math.round((nutritions.getCarbohydrates() * mass) / 260 * 10)/ 10.0;
        double prot = Math.round((nutritions.getProtein() * mass) / 50 * 10) / 10.0;
        double fat = Math.round((nutritions.getFat() * mass) / 70 * 10) / 10.0;
        double cal = Math.round((nutritions.getCalories() * mass) / 2000 * 10) / 10.0;
        double sug = Math.round((nutritions.getSugar() * mass) / 90 * 10) / 10.0;

        Ri ri = new Ri(carbo, prot, fat, cal, sug);
        return ri.toString();
    }

}







