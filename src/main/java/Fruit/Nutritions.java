package Fruit;

class Nutritions extends Fruit {
    public double carbohydrates;
    public double protein;
    public double fat;
    public double calories;
    public double sugar;

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public double getProtein() {
        return protein;
    }

    public double getFat() {
        return fat;
    }

    public double getCalories() {
        return calories;
    }

    public double getSugar() {
        return sugar;
    }

    public Nutritions(double carbohydrates, double protein, double fat, double calories, double sugar) {
        this.carbohydrates = carbohydrates;
        this.protein = protein;
        this.fat = fat;
        this.calories = calories;
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        String oldPart = super.toString();
        oldPart = oldPart.substring(0, oldPart.length() - 1);
        String newPart = "Nutritions{" +
                "carbohydrates=" + carbohydrates +
                ", protein=" + protein +
                ", fat=" + fat +
                ", calories=" + calories +
                ", sugar=" + sugar +
                '}';
        return oldPart.concat(newPart);
    }

}
