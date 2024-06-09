import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(6) + 1;
        double y = random.nextDouble();
        System.out.println(y);
        String [] cars = new String[7];
        String name = "Bro";
        System.out.println(name.indexOf("b"));
        cars[2] = name;
        System.out.println(cars[2]);
    }
}