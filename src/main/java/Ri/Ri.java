package Ri;

public class Ri {

    private double carbohydrates;
    private double protein;
    private double fat;
    private double calories;
    private double sugar;

    public Ri(double carbohydrates, double protein, double fat, double calories, double sugar) {
        this.carbohydrates = carbohydrates;
        this.protein = protein;
        this.fat = fat;
        this.calories = calories;
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return "%Ri{" +
                "carbohydrates=" + carbohydrates +
                ", protein=" + protein +
                ", fat=" + fat +
                ", calories=" + calories +
                ", sugar=" + sugar +
                '}';
    }
}
