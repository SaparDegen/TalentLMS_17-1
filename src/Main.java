import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Farm farm1 = new Farm("Maksat Turdiev", "Bishkek");
        Farm farm2 = new Farm("Jumgalbek Asanov", "Kant");

        DomesticAnimal[] animals1 = {
            new Sheep("Sheep1", 20, 3, "Female"),
            new Sheep("Sheep2", 22, 4, "Female"),
            new Sheep("Sheep3", 23, 5, "Male"),
            new Cow("Cow1", 50, 3, "Female"),
            new Cow("Cow2", 55, 4, "Male"),
            new Cow("Cow3", 60, 5, "Female"),
            new Cow("Cow4", 65, 6, "Male"),
            new Cow("Cow5", 70, 7, "Female"),
            new Horse("Horse1", 70, 5, "Female", "Grey"),
            new Horse("Horse2", 90, 10, "Male", "White"),
        };
        farm1.setAnimals(animals1);

        DomesticAnimal[] animals2 = {
                new Sheep("Sheep1", 20, 3, "Female"),
                new Cow("Cow1", 50, 3, "Male"),
                new Horse("Horse1", 70, 5, "Female", "Brown"),
        };
        farm2.setAnimals(animals2);

        System.out.println(farm1.toString());
        System.out.println(farm2.toString());
    }
}