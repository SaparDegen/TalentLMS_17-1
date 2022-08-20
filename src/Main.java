import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Farm farm1 = new Farm("Maksat Turdiev", "Bishkek");
        Farm farm2 = new Farm("Jumgalbek Asanov", "Kant");

        Sheep[] sheeps1 = {
                new Sheep("Sheep1", 20, 3, "Female"),
                new Sheep("Sheep2", 22, 4, "Female"),
                new Sheep("Sheep3", 23, 5, "Male"),
        };
        Cow[] cows1 = {
                new Cow("Cow1", 50, 3, "Female"),
                new Cow("Cow2", 55, 4, "Male"),
                new Cow("Cow3", 60, 5, "Female"),
                new Cow("Cow4", 65, 6, "Male"),
                new Cow("Cow5", 70, 7, "Female"),
        };
        Horse[] horses1 = {
            new Horse("Horse1", 70, 5, "Female", "Grey"),
            new Horse("Horse2", 90, 10, "Male", "White"),
        };
        farm1.setSheeps(sheeps1);
        farm1.setCows(cows1);
        farm1.setHorses(horses1);

        Sheep[] sheeps2 = {
                new Sheep("Sheep1", 20, 3, "Female"),
        };
        Cow[] cows2 = {
                new Cow("Cow1", 50, 3, "Male"),
        };
        Horse[] horses2 = {
                new Horse("Horse1", 70, 5, "Female", "Brown"),
        };
        farm2.setSheeps(sheeps2);
        farm2.setCows(cows2);
        farm2.setHorses(horses2);

        System.out.println(farm1.toString());
        System.out.println(farm2.toString());
    }
}