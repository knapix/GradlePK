import java.util.Random;

public class RandomQuickTask {
    public static void main(String[] args) {

        Random random = new Random();

        double number = random.nextDouble() * 1000;
        String string = Double.toString(number);
        String whole = string.substring(0, string.indexOf('.'));
        String frac = string.substring(string.indexOf('.') + 1);
        //System.out.println(string);
        System.out.println(number);

        System.out.println(String.format("whole: %s, frac: %s", whole, frac));


    }
}
