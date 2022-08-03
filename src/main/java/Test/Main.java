package Test;

import Fruit.Fruit;
import Fruit.HttpRequest;
import java.security.InvalidParameterException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String fruitString = scanner.nextLine();
        double grams = scanner.nextDouble();
        scanner.close();

        try {
            Fruit fruit = HttpRequest.getFruit(fruitString);
            System.out.println(fruit.getRi(grams));
        }
        catch (InvalidParameterException e){
            System.out.println("Masa nie może być ujemna");
        }
        catch (Exception e){
            System.out.println("Nie znaleziono owocu o podanej nazwie");
        }

    }

}
